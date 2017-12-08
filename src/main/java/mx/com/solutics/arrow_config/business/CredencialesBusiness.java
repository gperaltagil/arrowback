/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow_config.business;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.solutics.arrow.bo.estados.CredencialesBO;
import mx.com.solutics.arrow_config.facade.CredencialesFacade;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Stateless
public class CredencialesBusiness implements Serializable{
    
    @Inject
    CredencialesFacade credencialesFacade;
    
    public CredencialesBO verificarUsuario(String userName, String password) {
        return credencialesFacade.verificarUsuario(userName, password);
    }
    
    public CredencialesBO agregarUsuario(CredencialesBO credencialesBO) {
        return credencialesFacade.guardarInformacion(credencialesBO);
    }
}
