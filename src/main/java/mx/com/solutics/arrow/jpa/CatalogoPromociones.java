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
@Table(name = "catalogo_promociones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoPromociones.findAll", query = "SELECT c FROM CatalogoPromociones c")
    , @NamedQuery(name = "CatalogoPromociones.findById", query = "SELECT c FROM CatalogoPromociones c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoPromociones.findByDescripcion", query = "SELECT c FROM CatalogoPromociones c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatalogoPromociones.findByEliminado", query = "SELECT c FROM CatalogoPromociones c WHERE c.eliminado = :eliminado")
    , @NamedQuery(name = "CatalogoPromociones.findByFechaFin", query = "SELECT c FROM CatalogoPromociones c WHERE c.fechaFin = :fechaFin")
    , @NamedQuery(name = "CatalogoPromociones.findByFechaInicio", query = "SELECT c FROM CatalogoPromociones c WHERE c.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "CatalogoPromociones.findByFechaRegistro", query = "SELECT c FROM CatalogoPromociones c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CatalogoPromociones.findByIdTipoPromocion", query = "SELECT c FROM CatalogoPromociones c WHERE c.idTipoPromocion = :idTipoPromocion")
    , @NamedQuery(name = "CatalogoPromociones.findByNombre", query = "SELECT c FROM CatalogoPromociones c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoPromociones.findByTenant", query = "SELECT c FROM CatalogoPromociones c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoPromociones.findByValor", query = "SELECT c FROM CatalogoPromociones c WHERE c.valor = :valor")
    , @NamedQuery(name = "CatalogoPromociones.findByPrecioMinimoAplicable", query = "SELECT c FROM CatalogoPromociones c WHERE c.precioMinimoAplicable = :precioMinimoAplicable")})
public class CatalogoPromociones implements Serializable {

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
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "id_tipo_promocion")
    private Integer idTipoPromocion;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tenant")
    private Integer tenant;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private BigDecimal valor;
    @Column(name = "precioMinimoAplicable")
    private BigDecimal precioMinimoAplicable;

    public CatalogoPromociones() {
    }

    public CatalogoPromociones(Integer id) {
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

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdTipoPromocion() {
        return idTipoPromocion;
    }

    public void setIdTipoPromocion(Integer idTipoPromocion) {
        this.idTipoPromocion = idTipoPromocion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getPrecioMinimoAplicable() {
        return precioMinimoAplicable;
    }

    public void setPrecioMinimoAplicable(BigDecimal precioMinimoAplicable) {
        this.precioMinimoAplicable = precioMinimoAplicable;
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
        if (!(object instanceof CatalogoPromociones)) {
            return false;
        }
        CatalogoPromociones other = (CatalogoPromociones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoPromociones[ id=" + id + " ]";
    }
    
}
