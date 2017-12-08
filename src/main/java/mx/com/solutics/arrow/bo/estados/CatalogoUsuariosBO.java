/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.bo.estados;

import mx.com.solutics.arrow.jpa.CatalogoUsuario;
import mx.com.solutics.arrow_config.jpa.Credenciales;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
public class CatalogoUsuariosBO {
    
    private CatalogoUsuario catalogoUsuario;
    private Credenciales credenciales;

    public CatalogoUsuariosBO(CatalogoUsuario catalogoUsuario) {
        this.catalogoUsuario = catalogoUsuario;
    }    

    public Credenciales getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    public CatalogoUsuario getCatalogoUsuario() {
        return catalogoUsuario;
    }

    public void setCatalogoUsuario(CatalogoUsuario catalogoUsuario) {
        this.catalogoUsuario = catalogoUsuario;
    }
    
}
