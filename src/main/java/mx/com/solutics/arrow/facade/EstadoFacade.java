/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.facade;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import mx.com.solutics.arrow.bo.estados.EstadoDTO;

/**
 *
 * @author Josafat
 */
@Stateless
public class EstadoFacade {
//    Falta agregarEntity de estado
//        extends AbstractFacade<Estado> 

    public List<EstadoDTO> obtenerEstados() {
        List<EstadoDTO> listEstadoDTOs = new ArrayList<>();
        //Cambiar metodo void a regresar Entidad o DTO
        return listEstadoDTOs;
    }

}
