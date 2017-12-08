/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.business;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.solutics.arrow.bo.estados.CatalogoUsuariosBO;
import mx.com.solutics.arrow.facade.CatalogoUsuarioFacade;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Stateless
public class CatalogoUsuarioBusiness implements Serializable {

    @Inject
    CatalogoUsuarioFacade catalogoUsuarioFacade;

    public CatalogoUsuariosBO agregarUsuario(CatalogoUsuariosBO bO) {
        return catalogoUsuarioFacade.guardarUsuario(bO);
    }

}
