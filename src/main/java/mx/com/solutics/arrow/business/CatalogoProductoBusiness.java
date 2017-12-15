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
import mx.com.solutics.arrow.bo.estados.CatalogoProductoBo;
import mx.com.solutics.arrow.facade.CatalogoProductoFacade;
import mx.com.solutics.arrow.jpa.CatalogoProductos;

/**
 *
 * @author David Eliud Mendoza Gómez
 * <dmendoza at dmendoza@smartsoftamerica.com.mx>
 */
@Stateless
public class CatalogoProductoBusiness implements Serializable {

    @Inject
    CatalogoProductoFacade catalogoProductoFacade;

    public CatalogoProductoBo guardarInformacion(CatalogoProductos cp, Integer tenant) {
        return catalogoProductoFacade.guardarInformacion(cp, tenant);
    }

    public List<CatalogoProductoBo> obtenerProductosNombre(String nombre, Integer tenant) {
        return catalogoProductoFacade.consultarNombre(tenant, nombre);
    }

    public List<CatalogoProductoBo> obtenerProductosCodigo(String codigo, Integer tenant) {
        return catalogoProductoFacade.consultarCodigo(tenant, codigo);
    }

    public CatalogoProductoBo eliminarProducto(CatalogoProductos catalogoProductos, Integer tenant) {
        return catalogoProductoFacade.eliminarProducto(catalogoProductos, tenant);
    }

}
