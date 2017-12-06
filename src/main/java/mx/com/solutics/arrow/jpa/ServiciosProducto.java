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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "servicios_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiciosProducto.findAll", query = "SELECT s FROM ServiciosProducto s")
    , @NamedQuery(name = "ServiciosProducto.findById", query = "SELECT s FROM ServiciosProducto s WHERE s.id = :id")
    , @NamedQuery(name = "ServiciosProducto.findByDescripcion", query = "SELECT s FROM ServiciosProducto s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "ServiciosProducto.findByEliminado", query = "SELECT s FROM ServiciosProducto s WHERE s.eliminado = :eliminado")
    , @NamedQuery(name = "ServiciosProducto.findByFechaRegistro", query = "SELECT s FROM ServiciosProducto s WHERE s.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "ServiciosProducto.findByTenant", query = "SELECT s FROM ServiciosProducto s WHERE s.tenant = :tenant")
    , @NamedQuery(name = "ServiciosProducto.findByProducto", query = "SELECT s FROM ServiciosProducto s WHERE s.producto = :producto")
    , @NamedQuery(name = "ServiciosProducto.findByServicio", query = "SELECT s FROM ServiciosProducto s WHERE s.servicio = :servicio")
    , @NamedQuery(name = "ServiciosProducto.findByPorcentajeUso", query = "SELECT s FROM ServiciosProducto s WHERE s.porcentajeUso = :porcentajeUso")
    , @NamedQuery(name = "ServiciosProducto.findByEstratus", query = "SELECT s FROM ServiciosProducto s WHERE s.estratus = :estratus")
    , @NamedQuery(name = "ServiciosProducto.findByNumeroUsos", query = "SELECT s FROM ServiciosProducto s WHERE s.numeroUsos = :numeroUsos")})
public class ServiciosProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "producto")
    private Integer producto;
    @Column(name = "servicio")
    private Integer servicio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentaje_uso")
    private BigDecimal porcentajeUso;
    @Column(name = "estratus")
    private Boolean estratus;
    @Column(name = "numero_usos")
    private BigDecimal numeroUsos;

    public ServiciosProducto() {
    }

    public ServiciosProducto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }

    public Integer getServicio() {
        return servicio;
    }

    public void setServicio(Integer servicio) {
        this.servicio = servicio;
    }

    public BigDecimal getPorcentajeUso() {
        return porcentajeUso;
    }

    public void setPorcentajeUso(BigDecimal porcentajeUso) {
        this.porcentajeUso = porcentajeUso;
    }

    public Boolean getEstratus() {
        return estratus;
    }

    public void setEstratus(Boolean estratus) {
        this.estratus = estratus;
    }

    public BigDecimal getNumeroUsos() {
        return numeroUsos;
    }

    public void setNumeroUsos(BigDecimal numeroUsos) {
        this.numeroUsos = numeroUsos;
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
        if (!(object instanceof ServiciosProducto)) {
            return false;
        }
        ServiciosProducto other = (ServiciosProducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.ServiciosProducto[ id=" + id + " ]";
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "servicios_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiciosProducto.findAll", query = "SELECT s FROM ServiciosProducto s")
    , @NamedQuery(name = "ServiciosProducto.findById", query = "SELECT s FROM ServiciosProducto s WHERE s.id = :id")
    , @NamedQuery(name = "ServiciosProducto.findByDescripcion", query = "SELECT s FROM ServiciosProducto s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "ServiciosProducto.findByEliminado", query = "SELECT s FROM ServiciosProducto s WHERE s.eliminado = :eliminado")
    , @NamedQuery(name = "ServiciosProducto.findByFechaRegistro", query = "SELECT s FROM ServiciosProducto s WHERE s.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "ServiciosProducto.findByTenant", query = "SELECT s FROM ServiciosProducto s WHERE s.tenant = :tenant")
    , @NamedQuery(name = "ServiciosProducto.findByProducto", query = "SELECT s FROM ServiciosProducto s WHERE s.producto = :producto")
    , @NamedQuery(name = "ServiciosProducto.findByServicio", query = "SELECT s FROM ServiciosProducto s WHERE s.servicio = :servicio")
    , @NamedQuery(name = "ServiciosProducto.findByPorcentajeUso", query = "SELECT s FROM ServiciosProducto s WHERE s.porcentajeUso = :porcentajeUso")
    , @NamedQuery(name = "ServiciosProducto.findByEstratus", query = "SELECT s FROM ServiciosProducto s WHERE s.estratus = :estratus")
    , @NamedQuery(name = "ServiciosProducto.findByNumeroUsos", query = "SELECT s FROM ServiciosProducto s WHERE s.numeroUsos = :numeroUsos")})
public class ServiciosProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "producto")
    private Integer producto;
    @Column(name = "servicio")
    private Integer servicio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentaje_uso")
    private BigDecimal porcentajeUso;
    @Column(name = "estratus")
    private Boolean estratus;
    @Column(name = "numero_usos")
    private BigDecimal numeroUsos;

    public ServiciosProducto() {
    }

    public ServiciosProducto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }

    public Integer getServicio() {
        return servicio;
    }

    public void setServicio(Integer servicio) {
        this.servicio = servicio;
    }

    public BigDecimal getPorcentajeUso() {
        return porcentajeUso;
    }

    public void setPorcentajeUso(BigDecimal porcentajeUso) {
        this.porcentajeUso = porcentajeUso;
    }

    public Boolean getEstratus() {
        return estratus;
    }

    public void setEstratus(Boolean estratus) {
        this.estratus = estratus;
    }

    public BigDecimal getNumeroUsos() {
        return numeroUsos;
    }

    public void setNumeroUsos(BigDecimal numeroUsos) {
        this.numeroUsos = numeroUsos;
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
        if (!(object instanceof ServiciosProducto)) {
            return false;
        }
        ServiciosProducto other = (ServiciosProducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.ServiciosProducto[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
