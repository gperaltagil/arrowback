/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.api.estados;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import mx.com.solutics.arrow.business.EstadosMunicipiosBusiness;
import mx.com.solutics.arrow.bo.estados.EstadoDTO;
import mx.com.solutics.arrow.bo.estados.MunicipioDTO;

/**
 *
 * @author ORLANDO
 */
@Stateless
@Path("estadosMunicipios")
public class EstadosMunicipiosService {

    @EJB
    EstadosMunicipiosBusiness estadosMunicipiosBusiness;

    @GET
    @Path("/obtenerEstados")
    @Produces({MediaType.APPLICATION_JSON})
    public List<EstadoDTO> obtenerEstados() {
        return estadosMunicipiosBusiness.obtenerEstados();
    }

    @POST
    @Path("/obtenerMunicipio/{idEstado}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<MunicipioDTO> obtenerMunicipios(@PathParam("idEstado") Integer idEstado) {

        return null;
    }

}
