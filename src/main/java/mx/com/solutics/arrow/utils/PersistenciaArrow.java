/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.utils;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Stateless
public class PersistenciaArrow implements Serializable{
    
    @PersistenceContext(unitName = "mx.com.solutics_Arrow_war_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    @PersistenceContext(unitName = "mx.com.solutics_Arrow_Config_war_1.0-SNAPSHOTPU")
    private EntityManager emConfig;

    public EntityManager getEm() {
        return em;
    }
    
    public EntityManager getEm(Integer tenant) {
        em.setProperty("tenant.id", tenant);
        return em;
    }

    public EntityManager getEmConfig() {
        return emConfig;
    }
}
