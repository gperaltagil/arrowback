/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.facade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.solutics.arrow.bo.estados.CatalogoUsuariosBO;
import mx.com.solutics.arrow.jpa.CatalogoUsuario;
import mx.com.solutics.arrow.utils.PersistenciaArrow;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Stateless
public class CatalogoUsuarioFacade implements Serializable{
    
    @Inject
    PersistenciaArrow em;
    
    public CatalogoUsuariosBO guardarUsuario(CatalogoUsuario usuario, int tenant){
        usuario.setTenant(tenant);
        usuario.setEstatus(Boolean.TRUE);
        usuario.setFechaIngreso(new Date());
        if(usuario.getId() != null){
            em.getEm().merge(usuario);
        }else{
            em.getEm().persist(usuario);
        }
        em.getEm().flush();
        return new CatalogoUsuariosBO(usuario);
    }
    
    public CatalogoUsuariosBO eliminarUsuario(CatalogoUsuario usuario){
        usuario.setEstatus(Boolean.FALSE);
        em.getEm().merge(usuario);
        return new CatalogoUsuariosBO(usuario);
    }
    
    public List<CatalogoUsuariosBO> obtenerUsuariosActivos(){
        List<CatalogoUsuario> usuarios = em.getEm().createQuery("SELECT cu FROM CatalogoUsuario cu where cu.estatus = :activo")
                .setParameter("activo", true)
                .getResultList();
        return new ArrayList<>(usuarios.stream().map(x -> new CatalogoUsuariosBO(x)).collect(Collectors.toList()));
    }
    
    public CatalogoUsuariosBO obtenerUsuarioID(int id){
        CatalogoUsuario usuario = em.getEm().find(CatalogoUsuario.class, id);
        return new CatalogoUsuariosBO(usuario);
    }
}
