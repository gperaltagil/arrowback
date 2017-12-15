/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.business;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.solutics.arrow.bo.estados.CatalogoUsuariosBO;
import mx.com.solutics.arrow.facade.CatalogoUsuarioFacade;
import mx.com.solutics.arrow.jpa.CatalogoUsuario;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Stateless
public class CatalogoUsuarioBusiness implements Serializable {

    @Inject
    CatalogoUsuarioFacade catalogoUsuarioFacade;

    public CatalogoUsuariosBO agregarUsuario(CatalogoUsuario usuario, int tenant) {
        return catalogoUsuarioFacade.guardarUsuario(usuario, tenant);
    }
    
    public CatalogoUsuariosBO eliminarUsuario(CatalogoUsuario usuario){
        return catalogoUsuarioFacade.eliminarUsuario(usuario);
    }

    public List<CatalogoUsuariosBO> obtenerUsuariosActivos(){
        return catalogoUsuarioFacade.obtenerUsuariosActivos();
    }
    
    public CatalogoUsuariosBO obtenerUsuarioID(int id){
        return catalogoUsuarioFacade.obtenerUsuarioID(id);
    }
}
