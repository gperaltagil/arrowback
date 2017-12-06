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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "totales_almacen_economico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TotalesAlmacenEconomico.findAll", query = "SELECT t FROM TotalesAlmacenEconomico t")
    , @NamedQuery(name = "TotalesAlmacenEconomico.findById", query = "SELECT t FROM TotalesAlmacenEconomico t WHERE t.id = :id")
    , @NamedQuery(name = "TotalesAlmacenEconomico.findByTotalEntradaCaja", query = "SELECT t FROM TotalesAlmacenEconomico t WHERE t.totalEntradaCaja = :totalEntradaCaja")
    , @NamedQuery(name = "TotalesAlmacenEconomico.findByTotalSalidaCaja", query = "SELECT t FROM TotalesAlmacenEconomico t WHERE t.totalSalidaCaja = :totalSalidaCaja")
    , @NamedQuery(name = "TotalesAlmacenEconomico.findByExistenciaCaja", query = "SELECT t FROM TotalesAlmacenEconomico t WHERE t.existenciaCaja = :existenciaCaja")
    , @NamedQuery(name = "TotalesAlmacenEconomico.findByTotalEntradaBanco", query = "SELECT t FROM TotalesAlmacenEconomico t WHERE t.totalEntradaBanco = :totalEntradaBanco")
    , @NamedQuery(name = "TotalesAlmacenEconomico.findByTotalSalidaBanco", query = "SELECT t FROM TotalesAlmacenEconomico t WHERE t.totalSalidaBanco = :totalSalidaBanco")
    , @NamedQuery(name = "TotalesAlmacenEconomico.findByExistenciaBanco", query = "SELECT t FROM TotalesAlmacenEconomico t WHERE t.existenciaBanco = :existenciaBanco")
    , @NamedQuery(name = "TotalesAlmacenEconomico.findBySucursal", query = "SELECT t FROM TotalesAlmacenEconomico t WHERE t.sucursal = :sucursal")
    , @NamedQuery(name = "TotalesAlmacenEconomico.findByTenant", query = "SELECT t FROM TotalesAlmacenEconomico t WHERE t.tenant = :tenant")})
public class TotalesAlmacenEconomico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_entrada_caja")
    private BigDecimal totalEntradaCaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_salida_caja")
    private BigDecimal totalSalidaCaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "existencia_caja")
    private BigDecimal existenciaCaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_entrada_banco")
    private BigDecimal totalEntradaBanco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_salida_banco")
    private BigDecimal totalSalidaBanco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "existencia_banco")
    private BigDecimal existenciaBanco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sucursal")
    private int sucursal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;

    public TotalesAlmacenEconomico() {
    }

    public TotalesAlmacenEconomico(Integer id) {
        this.id = id;
    }

    public TotalesAlmacenEconomico(Integer id, BigDecimal totalEntradaCaja, BigDecimal totalSalidaCaja, BigDecimal existenciaCaja, BigDecimal totalEntradaBanco, BigDecimal totalSalidaBanco, BigDecimal existenciaBanco, int sucursal, int tenant) {
        this.id = id;
        this.totalEntradaCaja = totalEntradaCaja;
        this.totalSalidaCaja = totalSalidaCaja;
        this.existenciaCaja = existenciaCaja;
        this.totalEntradaBanco = totalEntradaBanco;
        this.totalSalidaBanco = totalSalidaBanco;
        this.existenciaBanco = existenciaBanco;
        this.sucursal = sucursal;
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getTotalEntradaCaja() {
        return totalEntradaCaja;
    }

    public void setTotalEntradaCaja(BigDecimal totalEntradaCaja) {
        this.totalEntradaCaja = totalEntradaCaja;
    }

    public BigDecimal getTotalSalidaCaja() {
        return totalSalidaCaja;
    }

    public void setTotalSalidaCaja(BigDecimal totalSalidaCaja) {
        this.totalSalidaCaja = totalSalidaCaja;
    }

    public BigDecimal getExistenciaCaja() {
        return existenciaCaja;
    }

    public void setExistenciaCaja(BigDecimal existenciaCaja) {
        this.existenciaCaja = existenciaCaja;
    }

    public BigDecimal getTotalEntradaBanco() {
        return totalEntradaBanco;
    }

    public void setTotalEntradaBanco(BigDecimal totalEntradaBanco) {
        this.totalEntradaBanco = totalEntradaBanco;
    }

    public BigDecimal getTotalSalidaBanco() {
        return totalSalidaBanco;
    }

    public void setTotalSalidaBanco(BigDecimal totalSalidaBanco) {
        this.totalSalidaBanco = totalSalidaBanco;
    }

    public BigDecimal getExistenciaBanco() {
        return existenciaBanco;
    }

    public void setExistenciaBanco(BigDecimal existenciaBanco) {
        this.existenciaBanco = existenciaBanco;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
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
        if (!(object instanceof TotalesAlmacenEconomico)) {
            return false;
        }
        TotalesAlmacenEconomico other = (TotalesAlmacenEconomico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.TotalesAlmacenEconomico[ id=" + id + " ]";
    }
    
}
