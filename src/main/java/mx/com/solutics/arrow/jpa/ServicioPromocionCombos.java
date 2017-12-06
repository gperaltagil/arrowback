/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "servicio_promocion_combos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServicioPromocionCombos.findAll", query = "SELECT s FROM ServicioPromocionCombos s")
    , @NamedQuery(name = "ServicioPromocionCombos.findById", query = "SELECT s FROM ServicioPromocionCombos s WHERE s.id = :id")
    , @NamedQuery(name = "ServicioPromocionCombos.findByTenant", query = "SELECT s FROM ServicioPromocionCombos s WHERE s.tenant = :tenant")
    , @NamedQuery(name = "ServicioPromocionCombos.findByActivo", query = "SELECT s FROM ServicioPromocionCombos s WHERE s.activo = :activo")
    , @NamedQuery(name = "ServicioPromocionCombos.findByCantidad", query = "SELECT s FROM ServicioPromocionCombos s WHERE s.cantidad = :cantidad")})
public class ServicioPromocionCombos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "activo")
    private Boolean activo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @JoinColumn(name = "servicio", referencedColumnName = "id")
    @ManyToOne
    private CatalogoServicios servicio;
    @JoinColumn(name = "id_promocion_combos", referencedColumnName = "id")
    @ManyToOne
    private PromocionesCombos idPromocionCombos;

    public ServicioPromocionCombos() {
    }

    public ServicioPromocionCombos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public CatalogoServicios getServicio() {
        return servicio;
    }

    public void setServicio(CatalogoServicios servicio) {
        this.servicio = servicio;
    }

    public PromocionesCombos getIdPromocionCombos() {
        return idPromocionCombos;
    }

    public void setIdPromocionCombos(PromocionesCombos idPromocionCombos) {
        this.idPromocionCombos = idPromocionCombos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServicioPromocionCombos)) {
            return false;
        }
        ServicioPromocionCombos other = (ServicioPromocionCombos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.ServicioPromocionCombos[ id=" + id + " ]";
    }
    
}
