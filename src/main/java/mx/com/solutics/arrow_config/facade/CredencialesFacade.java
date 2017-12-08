/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow_config.facade;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.solutics.arrow.bo.estados.CredencialesBO;
import mx.com.solutics.arrow.jpa.CatalogoUsuario;
import mx.com.solutics.arrow.seguridad.Passwords;
import mx.com.solutics.arrow.utils.PersistenciaArrow;
import mx.com.solutics.arrow_config.jpa.Credenciales;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Stateless
public class CredencialesFacade implements Serializable {

    @Inject
    PersistenciaArrow em;

    public CredencialesBO verificarUsuario(String userName, String password) {
        List<Credenciales> lista = em.getEmConfig().createQuery("SELECT c FROM Credenciales c WHERE c.correoElectronico = :correoElectronico")
                .setParameter("correoElectronico", userName).getResultList();
        if (lista.isEmpty()) {
            return null;
        }
        return evaluarIgualdadContrasena(password, lista.get(0)) ? new CredencialesBO(lista.get(0)) : null;
    }

    private boolean evaluarIgualdadContrasena(String contrasena, Credenciales credenciales) {
        return Passwords.isExpectedPassword(contrasena.toCharArray(), credenciales.getSalContrasena(), credenciales.getContrasena());
    }

    public CredencialesBO guardarInformacion(CredencialesBO bo) {
        if (bo.getContrasenaString().length() > 0) {
            bo.setCredenciales(encriptarContrasena(bo));
        }

        if (bo.getCredenciales().getId() == 0) {
            em.getEm().persist(bo.getCredenciales());

        } else {
            em.getEm().merge(bo.getCredenciales());
        }
        em.getEm().flush();
        return new CredencialesBO(bo.getCredenciales());
    }
    
    private Credenciales encriptarContrasena(CredencialesBO bo) {
        final byte[] sal = Passwords.getNextSalt();
        bo.getCredenciales().setContrasena(Passwords.hash(bo.getContrasenaString().toCharArray(), sal));
        bo.getCredenciales().setSalContrasena(sal);
        return bo.getCredenciales();
    }
}
