/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.facade;

import java.io.Serializable;
import java.util.Date;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.solutics.arrow.bo.estados.CatalogoUsuariosBO;
import mx.com.solutics.arrow.utils.PersistenciaArrow;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Stateless
public class CatalogoUsuarioFacade implements Serializable{
    
    @Inject
    PersistenciaArrow em;
    
    public CatalogoUsuariosBO guardarUsuario(CatalogoUsuariosBO bo){
        bo.getCatalogoUsuario().setEstatus(Boolean.TRUE);
        bo.getCatalogoUsuario().setFechaIngreso(new Date());
        if(bo.getCatalogoUsuario().getId() != null){
            em.getEm().persist(bo.getCatalogoUsuario());
        }else{
            em.getEm().merge(bo.getCatalogoUsuario());
        }
        em.getEm().flush();
        return new CatalogoUsuariosBO(bo.getCatalogoUsuario());
    }
}
