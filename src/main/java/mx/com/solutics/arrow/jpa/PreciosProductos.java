<<<<<<< HEAD
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "precios_productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PreciosProductos.findAll", query = "SELECT p FROM PreciosProductos p")
    , @NamedQuery(name = "PreciosProductos.findById", query = "SELECT p FROM PreciosProductos p WHERE p.id = :id")
    , @NamedQuery(name = "PreciosProductos.findByEliminado", query = "SELECT p FROM PreciosProductos p WHERE p.eliminado = :eliminado")
    , @NamedQuery(name = "PreciosProductos.findByFechaRegistro", query = "SELECT p FROM PreciosProductos p WHERE p.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "PreciosProductos.findByTenant", query = "SELECT p FROM PreciosProductos p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "PreciosProductos.findByPrecioMenudeo", query = "SELECT p FROM PreciosProductos p WHERE p.precioMenudeo = :precioMenudeo")
    , @NamedQuery(name = "PreciosProductos.findByFechaAplica", query = "SELECT p FROM PreciosProductos p WHERE p.fechaAplica = :fechaAplica")
    , @NamedQuery(name = "PreciosProductos.findByPrecioMayoreo", query = "SELECT p FROM PreciosProductos p WHERE p.precioMayoreo = :precioMayoreo")
    , @NamedQuery(name = "PreciosProductos.findByNumeroProductosMinimoMayoreo", query = "SELECT p FROM PreciosProductos p WHERE p.numeroProductosMinimoMayoreo = :numeroProductosMinimoMayoreo")
    , @NamedQuery(name = "PreciosProductos.findByProducto", query = "SELECT p FROM PreciosProductos p WHERE p.producto = :producto")})
public class PreciosProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "tenant")
    private Integer tenant;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_menudeo")
    private BigDecimal precioMenudeo;
    @Column(name = "fecha_aplica")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAplica;
    @Column(name = "precio_mayoreo")
    private BigDecimal precioMayoreo;
    @Column(name = "numero_productos_minimo_mayoreo")
    private BigDecimal numeroProductosMinimoMayoreo;
    @Column(name = "producto")
    private Integer producto;

    public PreciosProductos() {
    }

    public PreciosProductos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public BigDecimal getPrecioMenudeo() {
        return precioMenudeo;
    }

    public void setPrecioMenudeo(BigDecimal precioMenudeo) {
        this.precioMenudeo = precioMenudeo;
    }

    public Date getFechaAplica() {
        return fechaAplica;
    }

    public void setFechaAplica(Date fechaAplica) {
        this.fechaAplica = fechaAplica;
    }

    public BigDecimal getPrecioMayoreo() {
        return precioMayoreo;
    }

    public void setPrecioMayoreo(BigDecimal precioMayoreo) {
        this.precioMayoreo = precioMayoreo;
    }

    public BigDecimal getNumeroProductosMinimoMayoreo() {
        return numeroProductosMinimoMayoreo;
    }

    public void setNumeroProductosMinimoMayoreo(BigDecimal numeroProductosMinimoMayoreo) {
        this.numeroProductosMinimoMayoreo = numeroProductosMinimoMayoreo;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
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
        if (!(object instanceof PreciosProductos)) {
            return false;
        }
        PreciosProductos other = (PreciosProductos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.PreciosProductos[ id=" + id + " ]";
    }
    
}
=======
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "precios_productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PreciosProductos.findAll", query = "SELECT p FROM PreciosProductos p")
    , @NamedQuery(name = "PreciosProductos.findById", query = "SELECT p FROM PreciosProductos p WHERE p.id = :id")
    , @NamedQuery(name = "PreciosProductos.findByEliminado", query = "SELECT p FROM PreciosProductos p WHERE p.eliminado = :eliminado")
    , @NamedQuery(name = "PreciosProductos.findByFechaRegistro", query = "SELECT p FROM PreciosProductos p WHERE p.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "PreciosProductos.findByTenant", query = "SELECT p FROM PreciosProductos p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "PreciosProductos.findByPrecioMenudeo", query = "SELECT p FROM PreciosProductos p WHERE p.precioMenudeo = :precioMenudeo")
    , @NamedQuery(name = "PreciosProductos.findByFechaAplica", query = "SELECT p FROM PreciosProductos p WHERE p.fechaAplica = :fechaAplica")
    , @NamedQuery(name = "PreciosProductos.findByPrecioMayoreo", query = "SELECT p FROM PreciosProductos p WHERE p.precioMayoreo = :precioMayoreo")
    , @NamedQuery(name = "PreciosProductos.findByNumeroProductosMinimoMayoreo", query = "SELECT p FROM PreciosProductos p WHERE p.numeroProductosMinimoMayoreo = :numeroProductosMinimoMayoreo")
    , @NamedQuery(name = "PreciosProductos.findByProducto", query = "SELECT p FROM PreciosProductos p WHERE p.producto = :producto")})
public class PreciosProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "tenant")
    private Integer tenant;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_menudeo")
    private BigDecimal precioMenudeo;
    @Column(name = "fecha_aplica")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAplica;
    @Column(name = "precio_mayoreo")
    private BigDecimal precioMayoreo;
    @Column(name = "numero_productos_minimo_mayoreo")
    private BigDecimal numeroProductosMinimoMayoreo;
    @Column(name = "producto")
    private Integer producto;

    public PreciosProductos() {
    }

    public PreciosProductos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public BigDecimal getPrecioMenudeo() {
        return precioMenudeo;
    }

    public void setPrecioMenudeo(BigDecimal precioMenudeo) {
        this.precioMenudeo = precioMenudeo;
    }

    public Date getFechaAplica() {
        return fechaAplica;
    }

    public void setFechaAplica(Date fechaAplica) {
        this.fechaAplica = fechaAplica;
    }

    public BigDecimal getPrecioMayoreo() {
        return precioMayoreo;
    }

    public void setPrecioMayoreo(BigDecimal precioMayoreo) {
        this.precioMayoreo = precioMayoreo;
    }

    public BigDecimal getNumeroProductosMinimoMayoreo() {
        return numeroProductosMinimoMayoreo;
    }

    public void setNumeroProductosMinimoMayoreo(BigDecimal numeroProductosMinimoMayoreo) {
        this.numeroProductosMinimoMayoreo = numeroProductosMinimoMayoreo;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
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
        if (!(object instanceof PreciosProductos)) {
            return false;
        }
        PreciosProductos other = (PreciosProductos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.PreciosProductos[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
