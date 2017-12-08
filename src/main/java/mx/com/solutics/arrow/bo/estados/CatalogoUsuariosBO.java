/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.bo.estados;

import mx.com.solutics.arrow.jpa.CatalogoUsuario;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
public class CatalogoUsuariosBO {

    private CatalogoUsuario catalogoUsuario;
    private CredencialesBO credenciales;

    public CatalogoUsuariosBO(CatalogoUsuario catalogoUsuario) {
        this.catalogoUsuario = catalogoUsuario;
    }

    public CredencialesBO getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(CredencialesBO credenciales) {
        this.credenciales = credenciales;
    }

    public CatalogoUsuario getCatalogoUsuario() {
        return catalogoUsuario;
    }

    public void setCatalogoUsuario(CatalogoUsuario catalogoUsuario) {
        this.catalogoUsuario = catalogoUsuario;
    }

}
