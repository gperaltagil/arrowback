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
@Table(name = "existencias_producto_sucursal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExistenciasProductoSucursal.findAll", query = "SELECT e FROM ExistenciasProductoSucursal e")
    , @NamedQuery(name = "ExistenciasProductoSucursal.findById", query = "SELECT e FROM ExistenciasProductoSucursal e WHERE e.id = :id")
    , @NamedQuery(name = "ExistenciasProductoSucursal.findByTenant", query = "SELECT e FROM ExistenciasProductoSucursal e WHERE e.tenant = :tenant")
    , @NamedQuery(name = "ExistenciasProductoSucursal.findByIdProducto", query = "SELECT e FROM ExistenciasProductoSucursal e WHERE e.idProducto = :idProducto")
    , @NamedQuery(name = "ExistenciasProductoSucursal.findByIdSucursal", query = "SELECT e FROM ExistenciasProductoSucursal e WHERE e.idSucursal = :idSucursal")
    , @NamedQuery(name = "ExistenciasProductoSucursal.findByTotalAlmacen", query = "SELECT e FROM ExistenciasProductoSucursal e WHERE e.totalAlmacen = :totalAlmacen")
    , @NamedQuery(name = "ExistenciasProductoSucursal.findByTotalPiso", query = "SELECT e FROM ExistenciasProductoSucursal e WHERE e.totalPiso = :totalPiso")
    , @NamedQuery(name = "ExistenciasProductoSucursal.findByTotalBaja", query = "SELECT e FROM ExistenciasProductoSucursal e WHERE e.totalBaja = :totalBaja")
    , @NamedQuery(name = "ExistenciasProductoSucursal.findByTotalVenta", query = "SELECT e FROM ExistenciasProductoSucursal e WHERE e.totalVenta = :totalVenta")
    , @NamedQuery(name = "ExistenciasProductoSucursal.findByTotalServicio", query = "SELECT e FROM ExistenciasProductoSucursal e WHERE e.totalServicio = :totalServicio")})
public class ExistenciasProductoSucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tenant")
    private Integer tenant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_producto")
    private int idProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_sucursal")
    private int idSucursal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_almacen")
    private BigDecimal totalAlmacen;
    @Column(name = "total_piso")
    private BigDecimal totalPiso;
    @Column(name = "total_baja")
    private BigDecimal totalBaja;
    @Column(name = "total_venta")
    private BigDecimal totalVenta;
    @Column(name = "total_servicio")
    private BigDecimal totalServicio;

    public ExistenciasProductoSucursal() {
    }

    public ExistenciasProductoSucursal(Integer id) {
        this.id = id;
    }

    public ExistenciasProductoSucursal(Integer id, int idProducto, int idSucursal) {
        this.id = id;
        this.idProducto = idProducto;
        this.idSucursal = idSucursal;
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

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public BigDecimal getTotalAlmacen() {
        return totalAlmacen;
    }

    public void setTotalAlmacen(BigDecimal totalAlmacen) {
        this.totalAlmacen = totalAlmacen;
    }

    public BigDecimal getTotalPiso() {
        return totalPiso;
    }

    public void setTotalPiso(BigDecimal totalPiso) {
        this.totalPiso = totalPiso;
    }

    public BigDecimal getTotalBaja() {
        return totalBaja;
    }

    public void setTotalBaja(BigDecimal totalBaja) {
        this.totalBaja = totalBaja;
    }

    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }

    public BigDecimal getTotalServicio() {
        return totalServicio;
    }

    public void setTotalServicio(BigDecimal totalServicio) {
        this.totalServicio = totalServicio;
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
        if (!(object instanceof ExistenciasProductoSucursal)) {
            return false;
        }
        ExistenciasProductoSucursal other = (ExistenciasProductoSucursal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.ExistenciasProductoSucursal[ id=" + id + " ]";
    }
    
}
