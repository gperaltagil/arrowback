/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.facade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.solutics.arrow.bo.estados.CatalogoProductoBo;
import mx.com.solutics.arrow.jpa.CatalogoProductos;
import mx.com.solutics.arrow.utils.PersistenciaArrow;

/**
 *
 * @author David Eliud Mendoza Gómez
 * <dmendoza at dmendoza@smartsoftamerica.com.mx>
 */
@Stateless
public class CatalogoProductoFacade implements Serializable {

    @Inject
    PersistenciaArrow em;

    public CatalogoProductoBo guardarInformacion(CatalogoProductos entity, Integer tenant) {
        if (entity.getId() != null) {
            em.getEm(tenant).merge(entity);
        } else {
            entity.setId(0);
            entity.setFechaRegistro(new Date());
            entity.setEliminado(false);
            entity.setTenant(tenant);
            em.getEm(tenant).persist(entity);
        }
        em.getEm(tenant).flush();
        return new CatalogoProductoBo(entity);
    }

    public List<CatalogoProductoBo> consultarCodigo(Integer tenant, String codigoProducto) {
        return new ArrayList<>(em.getEm(tenant)
                .createNamedQuery("SELECT c FROM CatalogoProductos c WHERE c.codigo = :codigo", CatalogoProductos.class)
                .setParameter("codigo", codigoProducto)
                .getResultList()).stream()
                .map(p -> new CatalogoProductoBo(p))
                .collect(Collectors.toList());
    }

    public List<CatalogoProductoBo> consultarNombre(Integer tenant, String nombre) {
        return new ArrayList<>(em.getEm(tenant)
                .createNamedQuery("SELECT c FROM CatalogoProductos c WHERE c.nombre LIKE :nombre", CatalogoProductos.class)
                .setParameter("nombre", '%' + nombre + '%')
                .getResultList()).stream()
                .map(p -> new CatalogoProductoBo(p))
                .collect(Collectors.toList());
    }

    public CatalogoProductoBo eliminarProducto(CatalogoProductos entity, Integer tenant) {
        entity.setEliminado(Boolean.TRUE);
        em.getEm(tenant).merge(entity);
        em.getEm(tenant).flush();
        return new CatalogoProductoBo(entity);
    }

}
