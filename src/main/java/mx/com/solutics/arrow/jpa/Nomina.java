/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "nomina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nomina.findAll", query = "SELECT n FROM Nomina n")
    , @NamedQuery(name = "Nomina.findById", query = "SELECT n FROM Nomina n WHERE n.id = :id")
    , @NamedQuery(name = "Nomina.findByFechaPago", query = "SELECT n FROM Nomina n WHERE n.fechaPago = :fechaPago")
    , @NamedQuery(name = "Nomina.findByGananciaPagado", query = "SELECT n FROM Nomina n WHERE n.gananciaPagado = :gananciaPagado")
    , @NamedQuery(name = "Nomina.findByIdTecnica", query = "SELECT n FROM Nomina n WHERE n.idTecnica = :idTecnica")
    , @NamedQuery(name = "Nomina.findByUsuarioPago", query = "SELECT n FROM Nomina n WHERE n.usuarioPago = :usuarioPago")
    , @NamedQuery(name = "Nomina.findByTenant", query = "SELECT n FROM Nomina n WHERE n.tenant = :tenant")
    , @NamedQuery(name = "Nomina.findByTotalPagado", query = "SELECT n FROM Nomina n WHERE n.totalPagado = :totalPagado")
    , @NamedQuery(name = "Nomina.findByDescuento", query = "SELECT n FROM Nomina n WHERE n.descuento = :descuento")
    , @NamedQuery(name = "Nomina.findByFolio", query = "SELECT n FROM Nomina n WHERE n.folio = :folio")})
public class Nomina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ganancia_pagado")
    private BigDecimal gananciaPagado;
    @Column(name = "id_tecnica")
    private Integer idTecnica;
    @Column(name = "usuario_pago")
    private Integer usuarioPago;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "total_pagado")
    private BigDecimal totalPagado;
    @Column(name = "descuento")
    private BigDecimal descuento;
    @Size(max = 256)
    @Column(name = "folio")
    private String folio;

    public Nomina() {
    }

    public Nomina(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getGananciaPagado() {
        return gananciaPagado;
    }

    public void setGananciaPagado(BigDecimal gananciaPagado) {
        this.gananciaPagado = gananciaPagado;
    }

    public Integer getIdTecnica() {
        return idTecnica;
    }

    public void setIdTecnica(Integer idTecnica) {
        this.idTecnica = idTecnica;
    }

    public Integer getUsuarioPago() {
        return usuarioPago;
    }

    public void setUsuarioPago(Integer usuarioPago) {
        this.usuarioPago = usuarioPago;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public BigDecimal getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(BigDecimal totalPagado) {
        this.totalPagado = totalPagado;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
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
        if (!(object instanceof Nomina)) {
            return false;
        }
        Nomina other = (Nomina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.Nomina[ id=" + id + " ]";
    }
    
}
