/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.api;

import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import mx.com.solutics.arrow.bo.estados.CatalogoProductoBo;
import mx.com.solutics.arrow.business.CatalogoProductoBusiness;

/**
 *
 * @author David Eliud Mendoza Gómez
 * <dmendoza at dmendoza@smartsoftamerica.com.mx>
 */
@Stateless
@Path("productosService")
public class CatalogoProductosService {

    @Inject
    CatalogoProductoBusiness catalogoProductoBusiness;
    private static final Logger LOG = Logger.getLogger(CatalogoProductosService.class.getName());

    @GET
    @Path("productosNombre/{nombre}/{tenant}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CatalogoProductoBo> obtenerProductosNombre(@PathParam("nombre") String nombre,
            @PathParam("tenant") Integer tenant) {
        return catalogoProductoBusiness.obtenerProductosNombre(nombre, tenant);
    }

    @GET
    @Path("productosCodigo/{codigo}/{tenant}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CatalogoProductoBo> obtenerProductosCodigo(@PathParam("codigo") String codigo,
            @PathParam("tenant") Integer tenant) {
        return catalogoProductoBusiness.obtenerProductosNombre(codigo, tenant);
    }

    @POST
    @Path("guardarProducto/{tenant}")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public CatalogoProductoBo guardarProducto(CatalogoProductoBo bo, @PathParam("tenant") Integer tenant) {
        return catalogoProductoBusiness.guardarInformacion(bo.getCatalogoUsuario(), tenant);
    }

    @PUT
    @Path("actualizarProducto/{tenant}")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public CatalogoProductoBo actualizarProducto(CatalogoProductoBo bo, @PathParam("tenant") Integer tenant) {
        return catalogoProductoBusiness.guardarInformacion(bo.getCatalogoUsuario(), tenant);
    }

    @PUT
    @Path("eliminarProducto/{tenant}")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public CatalogoProductoBo eliminarProducto(CatalogoProductoBo bo, @PathParam("tenant") Integer tenant) {
        return catalogoProductoBusiness.eliminarProducto(bo.getCatalogoUsuario(), tenant);
    }

}
