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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "codigo_entrada_masiva_almacen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CodigoEntradaMasivaAlmacen.findAll", query = "SELECT c FROM CodigoEntradaMasivaAlmacen c")
    , @NamedQuery(name = "CodigoEntradaMasivaAlmacen.findById", query = "SELECT c FROM CodigoEntradaMasivaAlmacen c WHERE c.id = :id")
    , @NamedQuery(name = "CodigoEntradaMasivaAlmacen.findByFechaRegistro", query = "SELECT c FROM CodigoEntradaMasivaAlmacen c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CodigoEntradaMasivaAlmacen.findByTenant", query = "SELECT c FROM CodigoEntradaMasivaAlmacen c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CodigoEntradaMasivaAlmacen.findByCodigoMasivo", query = "SELECT c FROM CodigoEntradaMasivaAlmacen c WHERE c.codigoMasivo = :codigoMasivo")
    , @NamedQuery(name = "CodigoEntradaMasivaAlmacen.findByIdProducto", query = "SELECT c FROM CodigoEntradaMasivaAlmacen c WHERE c.idProducto = :idProducto")
    , @NamedQuery(name = "CodigoEntradaMasivaAlmacen.findByCantidad", query = "SELECT c FROM CodigoEntradaMasivaAlmacen c WHERE c.cantidad = :cantidad")})
public class CodigoEntradaMasivaAlmacen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Size(max = 255)
    @Column(name = "codigo_masivo")
    private String codigoMasivo;
    @Column(name = "id_producto")
    private Integer idProducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;

    public CodigoEntradaMasivaAlmacen() {
    }

    public CodigoEntradaMasivaAlmacen(Integer id) {
        this.id = id;
    }

    public CodigoEntradaMasivaAlmacen(Integer id, Date fechaRegistro, int tenant) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
    }

    public String getCodigoMasivo() {
        return codigoMasivo;
    }

    public void setCodigoMasivo(String codigoMasivo) {
        this.codigoMasivo = codigoMasivo;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
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
        if (!(object instanceof CodigoEntradaMasivaAlmacen)) {
            return false;
        }
        CodigoEntradaMasivaAlmacen other = (CodigoEntradaMasivaAlmacen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CodigoEntradaMasivaAlmacen[ id=" + id + " ]";
    }
    
}
