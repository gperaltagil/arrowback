/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.api;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import mx.com.solutics.arrow.bo.estados.CatalogoUsuariosBO;
import mx.com.solutics.arrow.bo.estados.CredencialesBO;
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
    
    @GET
    @Path("/obtenerCredenciales/{correo}/{contrasena}")
    @Produces({MediaType.APPLICATION_JSON})
    public CredencialesBO obtenerEstados(@PathParam("correo") String correo, @PathParam("contrasena") String contrasena) {
        return credencialesBusiness.verificarUsuario(correo, contrasena);
    }
    
    @POST
    @Path("/agregarUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void agregarUsuario(CatalogoUsuariosBO usuariosBO){
        
    }
}
