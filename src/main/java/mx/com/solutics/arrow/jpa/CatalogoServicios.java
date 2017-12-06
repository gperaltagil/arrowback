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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "catalogo_servicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoServicios.findAll", query = "SELECT c FROM CatalogoServicios c")
    , @NamedQuery(name = "CatalogoServicios.findById", query = "SELECT c FROM CatalogoServicios c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoServicios.findByDescripcion", query = "SELECT c FROM CatalogoServicios c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatalogoServicios.findByEliminado", query = "SELECT c FROM CatalogoServicios c WHERE c.eliminado = :eliminado")
    , @NamedQuery(name = "CatalogoServicios.findByFechaRegistro", query = "SELECT c FROM CatalogoServicios c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CatalogoServicios.findByNombre", query = "SELECT c FROM CatalogoServicios c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoServicios.findByTenant", query = "SELECT c FROM CatalogoServicios c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoServicios.findByTiempoDuracion", query = "SELECT c FROM CatalogoServicios c WHERE c.tiempoDuracion = :tiempoDuracion")
    , @NamedQuery(name = "CatalogoServicios.findByCodigo", query = "SELECT c FROM CatalogoServicios c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "CatalogoServicios.findByPrecio", query = "SELECT c FROM CatalogoServicios c WHERE c.precio = :precio")
    , @NamedQuery(name = "CatalogoServicios.findByDefinirProductosEnVenta", query = "SELECT c FROM CatalogoServicios c WHERE c.definirProductosEnVenta = :definirProductosEnVenta")
    , @NamedQuery(name = "CatalogoServicios.findByPrecioVariable", query = "SELECT c FROM CatalogoServicios c WHERE c.precioVariable = :precioVariable")
    , @NamedQuery(name = "CatalogoServicios.findByIva", query = "SELECT c FROM CatalogoServicios c WHERE c.iva = :iva")
    , @NamedQuery(name = "CatalogoServicios.findByIsr", query = "SELECT c FROM CatalogoServicios c WHERE c.isr = :isr")
    , @NamedQuery(name = "CatalogoServicios.findByIeps", query = "SELECT c FROM CatalogoServicios c WHERE c.ieps = :ieps")
    , @NamedQuery(name = "CatalogoServicios.findByTipoFactor", query = "SELECT c FROM CatalogoServicios c WHERE c.tipoFactor = :tipoFactor")
    , @NamedQuery(name = "CatalogoServicios.findByClaveProductoServicio", query = "SELECT c FROM CatalogoServicios c WHERE c.claveProductoServicio = :claveProductoServicio")
    , @NamedQuery(name = "CatalogoServicios.findByClaveUnidad", query = "SELECT c FROM CatalogoServicios c WHERE c.claveUnidad = :claveUnidad")})
public class CatalogoServicios implements Serializable {

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
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tenant")
    private Integer tenant;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tiempo_duracion")
    private BigDecimal tiempoDuracion;
    @Size(max = 128)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "definir_productos_en_venta")
    private Boolean definirProductosEnVenta;
    @Column(name = "precio_variable")
    private Boolean precioVariable;
    @Column(name = "iva")
    private BigDecimal iva;
    @Column(name = "isr")
    private BigDecimal isr;
    @Size(max = 11)
    @Column(name = "ieps")
    private String ieps;
    @Size(max = 50)
    @Column(name = "tipo_factor")
    private String tipoFactor;
    @Size(max = 250)
    @Column(name = "clave_producto_servicio")
    private String claveProductoServicio;
    @Size(max = 250)
    @Column(name = "clave_unidad")
    private String claveUnidad;
    @OneToMany(mappedBy = "servicio")
    private List<ServicioPromocionCombos> servicioPromocionCombosList;
    @OneToMany(mappedBy = "servicio")
    private List<ServicioCuponesDescuento> servicioCuponesDescuentoList;

    public CatalogoServicios() {
    }

    public CatalogoServicios(Integer id) {
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

    public BigDecimal getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(BigDecimal tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Boolean getDefinirProductosEnVenta() {
        return definirProductosEnVenta;
    }

    public void setDefinirProductosEnVenta(Boolean definirProductosEnVenta) {
        this.definirProductosEnVenta = definirProductosEnVenta;
    }

    public Boolean getPrecioVariable() {
        return precioVariable;
    }

    public void setPrecioVariable(Boolean precioVariable) {
        this.precioVariable = precioVariable;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getIsr() {
        return isr;
    }

    public void setIsr(BigDecimal isr) {
        this.isr = isr;
    }

    public String getIeps() {
        return ieps;
    }

    public void setIeps(String ieps) {
        this.ieps = ieps;
    }

    public String getTipoFactor() {
        return tipoFactor;
    }

    public void setTipoFactor(String tipoFactor) {
        this.tipoFactor = tipoFactor;
    }

    public String getClaveProductoServicio() {
        return claveProductoServicio;
    }

    public void setClaveProductoServicio(String claveProductoServicio) {
        this.claveProductoServicio = claveProductoServicio;
    }

    public String getClaveUnidad() {
        return claveUnidad;
    }

    public void setClaveUnidad(String claveUnidad) {
        this.claveUnidad = claveUnidad;
    }

    @XmlTransient
    public List<ServicioPromocionCombos> getServicioPromocionCombosList() {
        return servicioPromocionCombosList;
    }

    public void setServicioPromocionCombosList(List<ServicioPromocionCombos> servicioPromocionCombosList) {
        this.servicioPromocionCombosList = servicioPromocionCombosList;
    }

    @XmlTransient
    public List<ServicioCuponesDescuento> getServicioCuponesDescuentoList() {
        return servicioCuponesDescuentoList;
    }

    public void setServicioCuponesDescuentoList(List<ServicioCuponesDescuento> servicioCuponesDescuentoList) {
        this.servicioCuponesDescuentoList = servicioCuponesDescuentoList;
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
        if (!(object instanceof CatalogoServicios)) {
            return false;
        }
        CatalogoServicios other = (CatalogoServicios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoServicios[ id=" + id + " ]";
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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "catalogo_servicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoServicios.findAll", query = "SELECT c FROM CatalogoServicios c")
    , @NamedQuery(name = "CatalogoServicios.findById", query = "SELECT c FROM CatalogoServicios c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoServicios.findByDescripcion", query = "SELECT c FROM CatalogoServicios c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatalogoServicios.findByEliminado", query = "SELECT c FROM CatalogoServicios c WHERE c.eliminado = :eliminado")
    , @NamedQuery(name = "CatalogoServicios.findByFechaRegistro", query = "SELECT c FROM CatalogoServicios c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CatalogoServicios.findByNombre", query = "SELECT c FROM CatalogoServicios c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoServicios.findByTenant", query = "SELECT c FROM CatalogoServicios c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoServicios.findByTiempoDuracion", query = "SELECT c FROM CatalogoServicios c WHERE c.tiempoDuracion = :tiempoDuracion")
    , @NamedQuery(name = "CatalogoServicios.findByCodigo", query = "SELECT c FROM CatalogoServicios c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "CatalogoServicios.findByPrecio", query = "SELECT c FROM CatalogoServicios c WHERE c.precio = :precio")
    , @NamedQuery(name = "CatalogoServicios.findByDefinirProductosEnVenta", query = "SELECT c FROM CatalogoServicios c WHERE c.definirProductosEnVenta = :definirProductosEnVenta")
    , @NamedQuery(name = "CatalogoServicios.findByPrecioVariable", query = "SELECT c FROM CatalogoServicios c WHERE c.precioVariable = :precioVariable")
    , @NamedQuery(name = "CatalogoServicios.findByIva", query = "SELECT c FROM CatalogoServicios c WHERE c.iva = :iva")
    , @NamedQuery(name = "CatalogoServicios.findByIsr", query = "SELECT c FROM CatalogoServicios c WHERE c.isr = :isr")
    , @NamedQuery(name = "CatalogoServicios.findByIeps", query = "SELECT c FROM CatalogoServicios c WHERE c.ieps = :ieps")
    , @NamedQuery(name = "CatalogoServicios.findByTipoFactor", query = "SELECT c FROM CatalogoServicios c WHERE c.tipoFactor = :tipoFactor")
    , @NamedQuery(name = "CatalogoServicios.findByClaveProductoServicio", query = "SELECT c FROM CatalogoServicios c WHERE c.claveProductoServicio = :claveProductoServicio")
    , @NamedQuery(name = "CatalogoServicios.findByClaveUnidad", query = "SELECT c FROM CatalogoServicios c WHERE c.claveUnidad = :claveUnidad")})
public class CatalogoServicios implements Serializable {

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
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tenant")
    private Integer tenant;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tiempo_duracion")
    private BigDecimal tiempoDuracion;
    @Size(max = 128)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "definir_productos_en_venta")
    private Boolean definirProductosEnVenta;
    @Column(name = "precio_variable")
    private Boolean precioVariable;
    @Column(name = "iva")
    private BigDecimal iva;
    @Column(name = "isr")
    private BigDecimal isr;
    @Size(max = 11)
    @Column(name = "ieps")
    private String ieps;
    @Size(max = 50)
    @Column(name = "tipo_factor")
    private String tipoFactor;
    @Size(max = 250)
    @Column(name = "clave_producto_servicio")
    private String claveProductoServicio;
    @Size(max = 250)
    @Column(name = "clave_unidad")
    private String claveUnidad;
    @OneToMany(mappedBy = "servicio")
    private List<ServicioPromocionCombos> servicioPromocionCombosList;
    @OneToMany(mappedBy = "servicio")
    private List<ServicioCuponesDescuento> servicioCuponesDescuentoList;

    public CatalogoServicios() {
    }

    public CatalogoServicios(Integer id) {
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

    public BigDecimal getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(BigDecimal tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Boolean getDefinirProductosEnVenta() {
        return definirProductosEnVenta;
    }

    public void setDefinirProductosEnVenta(Boolean definirProductosEnVenta) {
        this.definirProductosEnVenta = definirProductosEnVenta;
    }

    public Boolean getPrecioVariable() {
        return precioVariable;
    }

    public void setPrecioVariable(Boolean precioVariable) {
        this.precioVariable = precioVariable;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getIsr() {
        return isr;
    }

    public void setIsr(BigDecimal isr) {
        this.isr = isr;
    }

    public String getIeps() {
        return ieps;
    }

    public void setIeps(String ieps) {
        this.ieps = ieps;
    }

    public String getTipoFactor() {
        return tipoFactor;
    }

    public void setTipoFactor(String tipoFactor) {
        this.tipoFactor = tipoFactor;
    }

    public String getClaveProductoServicio() {
        return claveProductoServicio;
    }

    public void setClaveProductoServicio(String claveProductoServicio) {
        this.claveProductoServicio = claveProductoServicio;
    }

    public String getClaveUnidad() {
        return claveUnidad;
    }

    public void setClaveUnidad(String claveUnidad) {
        this.claveUnidad = claveUnidad;
    }

    @XmlTransient
    public List<ServicioPromocionCombos> getServicioPromocionCombosList() {
        return servicioPromocionCombosList;
    }

    public void setServicioPromocionCombosList(List<ServicioPromocionCombos> servicioPromocionCombosList) {
        this.servicioPromocionCombosList = servicioPromocionCombosList;
    }

    @XmlTransient
    public List<ServicioCuponesDescuento> getServicioCuponesDescuentoList() {
        return servicioCuponesDescuentoList;
    }

    public void setServicioCuponesDescuentoList(List<ServicioCuponesDescuento> servicioCuponesDescuentoList) {
        this.servicioCuponesDescuentoList = servicioCuponesDescuentoList;
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
        if (!(object instanceof CatalogoServicios)) {
            return false;
        }
        CatalogoServicios other = (CatalogoServicios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoServicios[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
