/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.bo.estados;

import mx.com.solutics.arrow.jpa.CatalogoProductos;

/**
 *
 * @author David Eliud Mendoza Gómez
 * <dmendoza at dmendoza@smartsoftamerica.com.mx>
 */
public class CatalogoProductoBo {

    private CatalogoProductos catalogoUsuario;

    public CatalogoProductoBo() {
    }

    public CatalogoProductoBo(CatalogoProductos catalogoUsuario) {
        this.catalogoUsuario = catalogoUsuario;
    }

    public CatalogoProductos getCatalogoUsuario() {
        return catalogoUsuario;
    }

    public void setCatalogoUsuario(CatalogoProductos catalogoUsuario) {
        this.catalogoUsuario = catalogoUsuario;
    }

    @Override
    public String toString() {
        return "CatalogoProductoBo{" + "catalogoUsuario=" + catalogoUsuario + '}';
    }
}
