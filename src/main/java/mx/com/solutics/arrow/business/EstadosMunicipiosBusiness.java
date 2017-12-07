/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.business;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.com.solutics.arrow.bo.estados.EstadoDTO;
import mx.com.solutics.arrow.bo.estados.MunicipioDTO;
import mx.com.solutics.arrow.facade.EstadoFacade;

/**
 *
 * @author Josafat
 */
@Stateless
public class EstadosMunicipiosBusiness {

    @EJB
    EstadoFacade estadoFacade;

    public List<EstadoDTO> obtenerEstados() {
        List<EstadoDTO> estados = estadoFacade.obtenerEstados();
        return estados;
    }

    public List<MunicipioDTO> obtenerMunicipios(Integer idEstado) {

        return null;
    }

}
