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
@Table(name = "promociones_descuento_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PromocionesDescuentoVenta.findAll", query = "SELECT p FROM PromocionesDescuentoVenta p")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findById", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.id = :id")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByDescripcion", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByEliminado", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.eliminado = :eliminado")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByFechaFin", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.fechaFin = :fechaFin")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByFechaInicio", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByFechaRegistro", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByNombre", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByTenant", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByValor", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.valor = :valor")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByPrecioMinimoAplicable", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.precioMinimoAplicable = :precioMinimoAplicable")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByLunes", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.lunes = :lunes")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByMartes", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.martes = :martes")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByMiercoles", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.miercoles = :miercoles")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByJueves", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.jueves = :jueves")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByViernes", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.viernes = :viernes")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findBySabado", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.sabado = :sabado")
    , @NamedQuery(name = "PromocionesDescuentoVenta.findByDomingo", query = "SELECT p FROM PromocionesDescuentoVenta p WHERE p.domingo = :domingo")})
public class PromocionesDescuentoVenta implements Serializable {

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
    @Column(name = "lunes")
    private Boolean lunes;
    @Column(name = "martes")
    private Boolean martes;
    @Column(name = "miercoles")
    private Boolean miercoles;
    @Column(name = "jueves")
    private Boolean jueves;
    @Column(name = "viernes")
    private Boolean viernes;
    @Column(name = "sabado")
    private Boolean sabado;
    @Column(name = "domingo")
    private Boolean domingo;

    public PromocionesDescuentoVenta() {
    }

    public PromocionesDescuentoVenta(Integer id) {
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

    public Boolean getLunes() {
        return lunes;
    }

    public void setLunes(Boolean lunes) {
        this.lunes = lunes;
    }

    public Boolean getMartes() {
        return martes;
    }

    public void setMartes(Boolean martes) {
        this.martes = martes;
    }

    public Boolean getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(Boolean miercoles) {
        this.miercoles = miercoles;
    }

    public Boolean getJueves() {
        return jueves;
    }

    public void setJueves(Boolean jueves) {
        this.jueves = jueves;
    }

    public Boolean getViernes() {
        return viernes;
    }

    public void setViernes(Boolean viernes) {
        this.viernes = viernes;
    }

    public Boolean getSabado() {
        return sabado;
    }

    public void setSabado(Boolean sabado) {
        this.sabado = sabado;
    }

    public Boolean getDomingo() {
        return domingo;
    }

    public void setDomingo(Boolean domingo) {
        this.domingo = domingo;
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
        if (!(object instanceof PromocionesDescuentoVenta)) {
            return false;
        }
        PromocionesDescuentoVenta other = (PromocionesDescuentoVenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.PromocionesDescuentoVenta[ id=" + id + " ]";
    }
    
}
