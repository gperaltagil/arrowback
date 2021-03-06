/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.api;

import java.util.List;
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
import mx.com.solutics.arrow.bo.estados.CatalogoUsuariosBO;
import mx.com.solutics.arrow.bo.estados.CredencialesBO;
import mx.com.solutics.arrow.business.CatalogoUsuarioBusiness;
import mx.com.solutics.arrow.jpa.CatalogoUsuario;
import mx.com.solutics.arrow_config.business.CredencialesBusiness;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Stateless
@Path("credenciales")
public class CredencialesService {

    @Inject
    CredencialesBusiness credencialesBusiness;
    @Inject
    CatalogoUsuarioBusiness catalogoUsuarioBusiness;

    @GET
    @Path("/obtenerCredenciales/{correo}/{contrasena}")
    @Produces({MediaType.APPLICATION_JSON})
    public CredencialesBO verificarCredenciales(@PathParam("correo") String correo, @PathParam("contrasena") String contrasena) {
        return credencialesBusiness.verificarUsuario(correo, contrasena);
    }

    @POST
    @Path("/agregarUsuario/{tenant}")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public CatalogoUsuariosBO agregarUsuario(CatalogoUsuariosBO usuariosBO, @PathParam("tenant") Integer tenant) {
        CatalogoUsuariosBO usuario = catalogoUsuarioBusiness.agregarUsuario(usuariosBO.getCatalogoUsuario(), tenant);
        usuariosBO.getCredenciales().getCredenciales().setUsuario(usuario.getCatalogoUsuario().getId());
        credencialesBusiness.agregarUsuario(usuariosBO.getCredenciales());
        return usuario;
    }

    @PUT
    @Path("/actualizarUsuario/{tenant}")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public CatalogoUsuariosBO actualizarUsuario(CatalogoUsuariosBO usuariosBO, @PathParam("tenant") Integer tenant) {
        return catalogoUsuarioBusiness.agregarUsuario(usuariosBO.getCatalogoUsuario(), tenant);
    }

    @PUT
    @Path("/eliminarUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public CatalogoUsuariosBO eliminarUsuario(CatalogoUsuario usuario) {
        return catalogoUsuarioBusiness.eliminarUsuario(usuario);
    }
    
    @GET
    @Path("/obtenerUsuarios")
    @Produces({MediaType.APPLICATION_JSON})
    public List<CatalogoUsuariosBO> obtenerUsuariosActivos() {
        return catalogoUsuarioBusiness.obtenerUsuariosActivos();
    }
    
    @GET
    @Path("/obtenerUsuarioId/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public CatalogoUsuariosBO obtenerUsuarioId(@PathParam("id") int id) {
        return catalogoUsuarioBusiness.obtenerUsuarioID(id);
    }
}
