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
@Table(name = "catalogo_productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoProductos.findAll", query = "SELECT c FROM CatalogoProductos c")
    , @NamedQuery(name = "CatalogoProductos.findById", query = "SELECT c FROM CatalogoProductos c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoProductos.findByAlto", query = "SELECT c FROM CatalogoProductos c WHERE c.alto = :alto")
    , @NamedQuery(name = "CatalogoProductos.findByAncho", query = "SELECT c FROM CatalogoProductos c WHERE c.ancho = :ancho")
    , @NamedQuery(name = "CatalogoProductos.findByCodigo", query = "SELECT c FROM CatalogoProductos c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "CatalogoProductos.findByColor", query = "SELECT c FROM CatalogoProductos c WHERE c.color = :color")
    , @NamedQuery(name = "CatalogoProductos.findByDescripcion", query = "SELECT c FROM CatalogoProductos c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatalogoProductos.findByEliminado", query = "SELECT c FROM CatalogoProductos c WHERE c.eliminado = :eliminado")
    , @NamedQuery(name = "CatalogoProductos.findByFechaRegistro", query = "SELECT c FROM CatalogoProductos c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CatalogoProductos.findByLargo", query = "SELECT c FROM CatalogoProductos c WHERE c.largo = :largo")
    , @NamedQuery(name = "CatalogoProductos.findByNombre", query = "SELECT c FROM CatalogoProductos c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoProductos.findByPeso", query = "SELECT c FROM CatalogoProductos c WHERE c.peso = :peso")
    , @NamedQuery(name = "CatalogoProductos.findByStock", query = "SELECT c FROM CatalogoProductos c WHERE c.stock = :stock")
    , @NamedQuery(name = "CatalogoProductos.findByTenant", query = "SELECT c FROM CatalogoProductos c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoProductos.findByProveedor", query = "SELECT c FROM CatalogoProductos c WHERE c.proveedor = :proveedor")
    , @NamedQuery(name = "CatalogoProductos.findByCodigoPersonalizado", query = "SELECT c FROM CatalogoProductos c WHERE c.codigoPersonalizado = :codigoPersonalizado")
    , @NamedQuery(name = "CatalogoProductos.findByPrecio", query = "SELECT c FROM CatalogoProductos c WHERE c.precio = :precio")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioVariable", query = "SELECT c FROM CatalogoProductos c WHERE c.precioVariable = :precioVariable")
    , @NamedQuery(name = "CatalogoProductos.findByNumeroUsos", query = "SELECT c FROM CatalogoProductos c WHERE c.numeroUsos = :numeroUsos")
    , @NamedQuery(name = "CatalogoProductos.findByClave", query = "SELECT c FROM CatalogoProductos c WHERE c.clave = :clave")
    , @NamedQuery(name = "CatalogoProductos.findByCaja", query = "SELECT c FROM CatalogoProductos c WHERE c.caja = :caja")
    , @NamedQuery(name = "CatalogoProductos.findByMaster", query = "SELECT c FROM CatalogoProductos c WHERE c.master = :master")
    , @NamedQuery(name = "CatalogoProductos.findByUnidad", query = "SELECT c FROM CatalogoProductos c WHERE c.unidad = :unidad")
    , @NamedQuery(name = "CatalogoProductos.findByEan", query = "SELECT c FROM CatalogoProductos c WHERE c.ean = :ean")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioMinimoVenta", query = "SELECT c FROM CatalogoProductos c WHERE c.precioMinimoVenta = :precioMinimoVenta")
    , @NamedQuery(name = "CatalogoProductos.findByAltaRotacion", query = "SELECT c FROM CatalogoProductos c WHERE c.altaRotacion = :altaRotacion")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioMayoreoIva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioMayoreoIva = :precioMayoreoIva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioDistribuidorIva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioDistribuidorIva = :precioDistribuidorIva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioPublicoIva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioPublicoIva = :precioPublicoIva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioMayoreoSiniva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioMayoreoSiniva = :precioMayoreoSiniva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioDistribuidorSiniva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioDistribuidorSiniva = :precioDistribuidorSiniva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioPublicoSiniva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioPublicoSiniva = :precioPublicoSiniva")
    , @NamedQuery(name = "CatalogoProductos.findByMarca", query = "SELECT c FROM CatalogoProductos c WHERE c.marca = :marca")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioSubdistribuidorSiniva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioSubdistribuidorSiniva = :precioSubdistribuidorSiniva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioSubdistribuidorIva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioSubdistribuidorIva = :precioSubdistribuidorIva")
    , @NamedQuery(name = "CatalogoProductos.findByCatalogoProductoscol", query = "SELECT c FROM CatalogoProductos c WHERE c.catalogoProductoscol = :catalogoProductoscol")
    , @NamedQuery(name = "CatalogoProductos.findByPorcentajeUso", query = "SELECT c FROM CatalogoProductos c WHERE c.porcentajeUso = :porcentajeUso")
    , @NamedQuery(name = "CatalogoProductos.findByCodigoEntradaAlmacenMasivo", query = "SELECT c FROM CatalogoProductos c WHERE c.codigoEntradaAlmacenMasivo = :codigoEntradaAlmacenMasivo")
    , @NamedQuery(name = "CatalogoProductos.findByNumeroEntradaAlmacenMasivo", query = "SELECT c FROM CatalogoProductos c WHERE c.numeroEntradaAlmacenMasivo = :numeroEntradaAlmacenMasivo")
    , @NamedQuery(name = "CatalogoProductos.findByRegimenFiscal", query = "SELECT c FROM CatalogoProductos c WHERE c.regimenFiscal = :regimenFiscal")
    , @NamedQuery(name = "CatalogoProductos.findByUsucfdiCfdiRegimenFiscal", query = "SELECT c FROM CatalogoProductos c WHERE c.usucfdiCfdiRegimenFiscal = :usucfdiCfdiRegimenFiscal")
    , @NamedQuery(name = "CatalogoProductos.findByImpuestoTrasladado", query = "SELECT c FROM CatalogoProductos c WHERE c.impuestoTrasladado = :impuestoTrasladado")
    , @NamedQuery(name = "CatalogoProductos.findByTipoFactorTrasladado", query = "SELECT c FROM CatalogoProductos c WHERE c.tipoFactorTrasladado = :tipoFactorTrasladado")
    , @NamedQuery(name = "CatalogoProductos.findByTasaCuotaTrasladado", query = "SELECT c FROM CatalogoProductos c WHERE c.tasaCuotaTrasladado = :tasaCuotaTrasladado")
    , @NamedQuery(name = "CatalogoProductos.findByImpuestoRetenido", query = "SELECT c FROM CatalogoProductos c WHERE c.impuestoRetenido = :impuestoRetenido")
    , @NamedQuery(name = "CatalogoProductos.findByTipoFactorRetenido", query = "SELECT c FROM CatalogoProductos c WHERE c.tipoFactorRetenido = :tipoFactorRetenido")
    , @NamedQuery(name = "CatalogoProductos.findByTasaCuotaRetenido", query = "SELECT c FROM CatalogoProductos c WHERE c.tasaCuotaRetenido = :tasaCuotaRetenido")
    , @NamedQuery(name = "CatalogoProductos.findByIva", query = "SELECT c FROM CatalogoProductos c WHERE c.iva = :iva")
    , @NamedQuery(name = "CatalogoProductos.findByIsr", query = "SELECT c FROM CatalogoProductos c WHERE c.isr = :isr")
    , @NamedQuery(name = "CatalogoProductos.findByIeps", query = "SELECT c FROM CatalogoProductos c WHERE c.ieps = :ieps")
    , @NamedQuery(name = "CatalogoProductos.findByTipoFactor", query = "SELECT c FROM CatalogoProductos c WHERE c.tipoFactor = :tipoFactor")
    , @NamedQuery(name = "CatalogoProductos.findByClaveProductoServicio", query = "SELECT c FROM CatalogoProductos c WHERE c.claveProductoServicio = :claveProductoServicio")
    , @NamedQuery(name = "CatalogoProductos.findByClaveUnidad", query = "SELECT c FROM CatalogoProductos c WHERE c.claveUnidad = :claveUnidad")})
public class CatalogoProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "alto")
    private BigDecimal alto;
    @Column(name = "ancho")
    private BigDecimal ancho;
    @Size(max = 255)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 255)
    @Column(name = "color")
    private String color;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "largo")
    private BigDecimal largo;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "peso")
    private BigDecimal peso;
    @Column(name = "stock")
    private BigDecimal stock;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "proveedor")
    private Integer proveedor;
    @Size(max = 124)
    @Column(name = "codigo_personalizado")
    private String codigoPersonalizado;
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "precio_variable")
    private Boolean precioVariable;
    @Column(name = "numeroUsos")
    private BigDecimal numeroUsos;
    @Size(max = 256)
    @Column(name = "clave")
    private String clave;
    @Size(max = 256)
    @Column(name = "caja")
    private String caja;
    @Size(max = 256)
    @Column(name = "master")
    private String master;
    @Size(max = 256)
    @Column(name = "unidad")
    private String unidad;
    @Size(max = 256)
    @Column(name = "ean")
    private String ean;
    @Column(name = "precio_minimo_venta")
    private BigDecimal precioMinimoVenta;
    @Column(name = "alta_rotacion")
    private Boolean altaRotacion;
    @Column(name = "precio_mayoreo_iva")
    private BigDecimal precioMayoreoIva;
    @Column(name = "precio_distribuidor_iva")
    private BigDecimal precioDistribuidorIva;
    @Column(name = "precio_publico_iva")
    private BigDecimal precioPublicoIva;
    @Column(name = "precio_mayoreo_siniva")
    private BigDecimal precioMayoreoSiniva;
    @Column(name = "precio_distribuidor_siniva")
    private BigDecimal precioDistribuidorSiniva;
    @Column(name = "precio_publico_siniva")
    private BigDecimal precioPublicoSiniva;
    @Size(max = 255)
    @Column(name = "marca")
    private String marca;
    @Column(name = "precio_subdistribuidor_siniva")
    private BigDecimal precioSubdistribuidorSiniva;
    @Column(name = "precio_subdistribuidor_iva")
    private BigDecimal precioSubdistribuidorIva;
    @Size(max = 45)
    @Column(name = "catalogo_productoscol")
    private String catalogoProductoscol;
    @Column(name = "porcentajeUso")
    private BigDecimal porcentajeUso;
    @Size(max = 255)
    @Column(name = "codigo_entrada_almacen_masivo")
    private String codigoEntradaAlmacenMasivo;
    @Column(name = "numero_entrada_almacen_masivo")
    private BigDecimal numeroEntradaAlmacenMasivo;
    @Column(name = "regimen_fiscal")
    private Integer regimenFiscal;
    @Column(name = "usucfdi _cfdi_regimen_fiscal")
    private Integer usucfdiCfdiRegimenFiscal;
    @Column(name = "impuesto_trasladado")
    private Integer impuestoTrasladado;
    @Column(name = "tipo_factor_trasladado")
    private Integer tipoFactorTrasladado;
    @Column(name = "tasa_cuota_trasladado")
    private Integer tasaCuotaTrasladado;
    @Column(name = "impuesto_retenido")
    private Integer impuestoRetenido;
    @Column(name = "tipo_factor_retenido")
    private Integer tipoFactorRetenido;
    @Column(name = "tasa_cuota_retenido")
    private Integer tasaCuotaRetenido;
    @Column(name = "iva")
    private BigDecimal iva;
    @Column(name = "isr")
    private BigDecimal isr;
    @Column(name = "ieps")
    private BigDecimal ieps;
    @Size(max = 50)
    @Column(name = "tipo_factor")
    private String tipoFactor;
    @Size(max = 250)
    @Column(name = "clave_producto_servicio")
    private String claveProductoServicio;
    @Size(max = 250)
    @Column(name = "clave_unidad")
    private String claveUnidad;

    public CatalogoProductos() {
    }

    public CatalogoProductos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAlto() {
        return alto;
    }

    public void setAlto(BigDecimal alto) {
        this.alto = alto;
    }

    public BigDecimal getAncho() {
        return ancho;
    }

    public void setAncho(BigDecimal ancho) {
        this.ancho = ancho;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public BigDecimal getLargo() {
        return largo;
    }

    public void setLargo(BigDecimal largo) {
        this.largo = largo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public Integer getProveedor() {
        return proveedor;
    }

    public void setProveedor(Integer proveedor) {
        this.proveedor = proveedor;
    }

    public String getCodigoPersonalizado() {
        return codigoPersonalizado;
    }

    public void setCodigoPersonalizado(String codigoPersonalizado) {
        this.codigoPersonalizado = codigoPersonalizado;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Boolean getPrecioVariable() {
        return precioVariable;
    }

    public void setPrecioVariable(Boolean precioVariable) {
        this.precioVariable = precioVariable;
    }

    public BigDecimal getNumeroUsos() {
        return numeroUsos;
    }

    public void setNumeroUsos(BigDecimal numeroUsos) {
        this.numeroUsos = numeroUsos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public BigDecimal getPrecioMinimoVenta() {
        return precioMinimoVenta;
    }

    public void setPrecioMinimoVenta(BigDecimal precioMinimoVenta) {
        this.precioMinimoVenta = precioMinimoVenta;
    }

    public Boolean getAltaRotacion() {
        return altaRotacion;
    }

    public void setAltaRotacion(Boolean altaRotacion) {
        this.altaRotacion = altaRotacion;
    }

    public BigDecimal getPrecioMayoreoIva() {
        return precioMayoreoIva;
    }

    public void setPrecioMayoreoIva(BigDecimal precioMayoreoIva) {
        this.precioMayoreoIva = precioMayoreoIva;
    }

    public BigDecimal getPrecioDistribuidorIva() {
        return precioDistribuidorIva;
    }

    public void setPrecioDistribuidorIva(BigDecimal precioDistribuidorIva) {
        this.precioDistribuidorIva = precioDistribuidorIva;
    }

    public BigDecimal getPrecioPublicoIva() {
        return precioPublicoIva;
    }

    public void setPrecioPublicoIva(BigDecimal precioPublicoIva) {
        this.precioPublicoIva = precioPublicoIva;
    }

    public BigDecimal getPrecioMayoreoSiniva() {
        return precioMayoreoSiniva;
    }

    public void setPrecioMayoreoSiniva(BigDecimal precioMayoreoSiniva) {
        this.precioMayoreoSiniva = precioMayoreoSiniva;
    }

    public BigDecimal getPrecioDistribuidorSiniva() {
        return precioDistribuidorSiniva;
    }

    public void setPrecioDistribuidorSiniva(BigDecimal precioDistribuidorSiniva) {
        this.precioDistribuidorSiniva = precioDistribuidorSiniva;
    }

    public BigDecimal getPrecioPublicoSiniva() {
        return precioPublicoSiniva;
    }

    public void setPrecioPublicoSiniva(BigDecimal precioPublicoSiniva) {
        this.precioPublicoSiniva = precioPublicoSiniva;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrecioSubdistribuidorSiniva() {
        return precioSubdistribuidorSiniva;
    }

    public void setPrecioSubdistribuidorSiniva(BigDecimal precioSubdistribuidorSiniva) {
        this.precioSubdistribuidorSiniva = precioSubdistribuidorSiniva;
    }

    public BigDecimal getPrecioSubdistribuidorIva() {
        return precioSubdistribuidorIva;
    }

    public void setPrecioSubdistribuidorIva(BigDecimal precioSubdistribuidorIva) {
        this.precioSubdistribuidorIva = precioSubdistribuidorIva;
    }

    public String getCatalogoProductoscol() {
        return catalogoProductoscol;
    }

    public void setCatalogoProductoscol(String catalogoProductoscol) {
        this.catalogoProductoscol = catalogoProductoscol;
    }

    public BigDecimal getPorcentajeUso() {
        return porcentajeUso;
    }

    public void setPorcentajeUso(BigDecimal porcentajeUso) {
        this.porcentajeUso = porcentajeUso;
    }

    public String getCodigoEntradaAlmacenMasivo() {
        return codigoEntradaAlmacenMasivo;
    }

    public void setCodigoEntradaAlmacenMasivo(String codigoEntradaAlmacenMasivo) {
        this.codigoEntradaAlmacenMasivo = codigoEntradaAlmacenMasivo;
    }

    public BigDecimal getNumeroEntradaAlmacenMasivo() {
        return numeroEntradaAlmacenMasivo;
    }

    public void setNumeroEntradaAlmacenMasivo(BigDecimal numeroEntradaAlmacenMasivo) {
        this.numeroEntradaAlmacenMasivo = numeroEntradaAlmacenMasivo;
    }

    public Integer getRegimenFiscal() {
        return regimenFiscal;
    }

    public void setRegimenFiscal(Integer regimenFiscal) {
        this.regimenFiscal = regimenFiscal;
    }

    public Integer getUsucfdiCfdiRegimenFiscal() {
        return usucfdiCfdiRegimenFiscal;
    }

    public void setUsucfdiCfdiRegimenFiscal(Integer usucfdiCfdiRegimenFiscal) {
        this.usucfdiCfdiRegimenFiscal = usucfdiCfdiRegimenFiscal;
    }

    public Integer getImpuestoTrasladado() {
        return impuestoTrasladado;
    }

    public void setImpuestoTrasladado(Integer impuestoTrasladado) {
        this.impuestoTrasladado = impuestoTrasladado;
    }

    public Integer getTipoFactorTrasladado() {
        return tipoFactorTrasladado;
    }

    public void setTipoFactorTrasladado(Integer tipoFactorTrasladado) {
        this.tipoFactorTrasladado = tipoFactorTrasladado;
    }

    public Integer getTasaCuotaTrasladado() {
        return tasaCuotaTrasladado;
    }

    public void setTasaCuotaTrasladado(Integer tasaCuotaTrasladado) {
        this.tasaCuotaTrasladado = tasaCuotaTrasladado;
    }

    public Integer getImpuestoRetenido() {
        return impuestoRetenido;
    }

    public void setImpuestoRetenido(Integer impuestoRetenido) {
        this.impuestoRetenido = impuestoRetenido;
    }

    public Integer getTipoFactorRetenido() {
        return tipoFactorRetenido;
    }

    public void setTipoFactorRetenido(Integer tipoFactorRetenido) {
        this.tipoFactorRetenido = tipoFactorRetenido;
    }

    public Integer getTasaCuotaRetenido() {
        return tasaCuotaRetenido;
    }

    public void setTasaCuotaRetenido(Integer tasaCuotaRetenido) {
        this.tasaCuotaRetenido = tasaCuotaRetenido;
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

    public BigDecimal getIeps() {
        return ieps;
    }

    public void setIeps(BigDecimal ieps) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoProductos)) {
            return false;
        }
        CatalogoProductos other = (CatalogoProductos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoProductos[ id=" + id + " ]";
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
@Table(name = "catalogo_productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoProductos.findAll", query = "SELECT c FROM CatalogoProductos c")
    , @NamedQuery(name = "CatalogoProductos.findById", query = "SELECT c FROM CatalogoProductos c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoProductos.findByAlto", query = "SELECT c FROM CatalogoProductos c WHERE c.alto = :alto")
    , @NamedQuery(name = "CatalogoProductos.findByAncho", query = "SELECT c FROM CatalogoProductos c WHERE c.ancho = :ancho")
    , @NamedQuery(name = "CatalogoProductos.findByCodigo", query = "SELECT c FROM CatalogoProductos c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "CatalogoProductos.findByColor", query = "SELECT c FROM CatalogoProductos c WHERE c.color = :color")
    , @NamedQuery(name = "CatalogoProductos.findByDescripcion", query = "SELECT c FROM CatalogoProductos c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatalogoProductos.findByEliminado", query = "SELECT c FROM CatalogoProductos c WHERE c.eliminado = :eliminado")
    , @NamedQuery(name = "CatalogoProductos.findByFechaRegistro", query = "SELECT c FROM CatalogoProductos c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CatalogoProductos.findByLargo", query = "SELECT c FROM CatalogoProductos c WHERE c.largo = :largo")
    , @NamedQuery(name = "CatalogoProductos.findByNombre", query = "SELECT c FROM CatalogoProductos c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoProductos.findByPeso", query = "SELECT c FROM CatalogoProductos c WHERE c.peso = :peso")
    , @NamedQuery(name = "CatalogoProductos.findByStock", query = "SELECT c FROM CatalogoProductos c WHERE c.stock = :stock")
    , @NamedQuery(name = "CatalogoProductos.findByTenant", query = "SELECT c FROM CatalogoProductos c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoProductos.findByProveedor", query = "SELECT c FROM CatalogoProductos c WHERE c.proveedor = :proveedor")
    , @NamedQuery(name = "CatalogoProductos.findByCodigoPersonalizado", query = "SELECT c FROM CatalogoProductos c WHERE c.codigoPersonalizado = :codigoPersonalizado")
    , @NamedQuery(name = "CatalogoProductos.findByPrecio", query = "SELECT c FROM CatalogoProductos c WHERE c.precio = :precio")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioVariable", query = "SELECT c FROM CatalogoProductos c WHERE c.precioVariable = :precioVariable")
    , @NamedQuery(name = "CatalogoProductos.findByNumeroUsos", query = "SELECT c FROM CatalogoProductos c WHERE c.numeroUsos = :numeroUsos")
    , @NamedQuery(name = "CatalogoProductos.findByClave", query = "SELECT c FROM CatalogoProductos c WHERE c.clave = :clave")
    , @NamedQuery(name = "CatalogoProductos.findByCaja", query = "SELECT c FROM CatalogoProductos c WHERE c.caja = :caja")
    , @NamedQuery(name = "CatalogoProductos.findByMaster", query = "SELECT c FROM CatalogoProductos c WHERE c.master = :master")
    , @NamedQuery(name = "CatalogoProductos.findByUnidad", query = "SELECT c FROM CatalogoProductos c WHERE c.unidad = :unidad")
    , @NamedQuery(name = "CatalogoProductos.findByEan", query = "SELECT c FROM CatalogoProductos c WHERE c.ean = :ean")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioMinimoVenta", query = "SELECT c FROM CatalogoProductos c WHERE c.precioMinimoVenta = :precioMinimoVenta")
    , @NamedQuery(name = "CatalogoProductos.findByAltaRotacion", query = "SELECT c FROM CatalogoProductos c WHERE c.altaRotacion = :altaRotacion")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioMayoreoIva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioMayoreoIva = :precioMayoreoIva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioDistribuidorIva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioDistribuidorIva = :precioDistribuidorIva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioPublicoIva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioPublicoIva = :precioPublicoIva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioMayoreoSiniva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioMayoreoSiniva = :precioMayoreoSiniva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioDistribuidorSiniva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioDistribuidorSiniva = :precioDistribuidorSiniva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioPublicoSiniva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioPublicoSiniva = :precioPublicoSiniva")
    , @NamedQuery(name = "CatalogoProductos.findByMarca", query = "SELECT c FROM CatalogoProductos c WHERE c.marca = :marca")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioSubdistribuidorSiniva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioSubdistribuidorSiniva = :precioSubdistribuidorSiniva")
    , @NamedQuery(name = "CatalogoProductos.findByPrecioSubdistribuidorIva", query = "SELECT c FROM CatalogoProductos c WHERE c.precioSubdistribuidorIva = :precioSubdistribuidorIva")
    , @NamedQuery(name = "CatalogoProductos.findByCatalogoProductoscol", query = "SELECT c FROM CatalogoProductos c WHERE c.catalogoProductoscol = :catalogoProductoscol")
    , @NamedQuery(name = "CatalogoProductos.findByPorcentajeUso", query = "SELECT c FROM CatalogoProductos c WHERE c.porcentajeUso = :porcentajeUso")
    , @NamedQuery(name = "CatalogoProductos.findByCodigoEntradaAlmacenMasivo", query = "SELECT c FROM CatalogoProductos c WHERE c.codigoEntradaAlmacenMasivo = :codigoEntradaAlmacenMasivo")
    , @NamedQuery(name = "CatalogoProductos.findByNumeroEntradaAlmacenMasivo", query = "SELECT c FROM CatalogoProductos c WHERE c.numeroEntradaAlmacenMasivo = :numeroEntradaAlmacenMasivo")
    , @NamedQuery(name = "CatalogoProductos.findByRegimenFiscal", query = "SELECT c FROM CatalogoProductos c WHERE c.regimenFiscal = :regimenFiscal")
    , @NamedQuery(name = "CatalogoProductos.findByUsucfdiCfdiRegimenFiscal", query = "SELECT c FROM CatalogoProductos c WHERE c.usucfdiCfdiRegimenFiscal = :usucfdiCfdiRegimenFiscal")
    , @NamedQuery(name = "CatalogoProductos.findByImpuestoTrasladado", query = "SELECT c FROM CatalogoProductos c WHERE c.impuestoTrasladado = :impuestoTrasladado")
    , @NamedQuery(name = "CatalogoProductos.findByTipoFactorTrasladado", query = "SELECT c FROM CatalogoProductos c WHERE c.tipoFactorTrasladado = :tipoFactorTrasladado")
    , @NamedQuery(name = "CatalogoProductos.findByTasaCuotaTrasladado", query = "SELECT c FROM CatalogoProductos c WHERE c.tasaCuotaTrasladado = :tasaCuotaTrasladado")
    , @NamedQuery(name = "CatalogoProductos.findByImpuestoRetenido", query = "SELECT c FROM CatalogoProductos c WHERE c.impuestoRetenido = :impuestoRetenido")
    , @NamedQuery(name = "CatalogoProductos.findByTipoFactorRetenido", query = "SELECT c FROM CatalogoProductos c WHERE c.tipoFactorRetenido = :tipoFactorRetenido")
    , @NamedQuery(name = "CatalogoProductos.findByTasaCuotaRetenido", query = "SELECT c FROM CatalogoProductos c WHERE c.tasaCuotaRetenido = :tasaCuotaRetenido")
    , @NamedQuery(name = "CatalogoProductos.findByIva", query = "SELECT c FROM CatalogoProductos c WHERE c.iva = :iva")
    , @NamedQuery(name = "CatalogoProductos.findByIsr", query = "SELECT c FROM CatalogoProductos c WHERE c.isr = :isr")
    , @NamedQuery(name = "CatalogoProductos.findByIeps", query = "SELECT c FROM CatalogoProductos c WHERE c.ieps = :ieps")
    , @NamedQuery(name = "CatalogoProductos.findByTipoFactor", query = "SELECT c FROM CatalogoProductos c WHERE c.tipoFactor = :tipoFactor")
    , @NamedQuery(name = "CatalogoProductos.findByClaveProductoServicio", query = "SELECT c FROM CatalogoProductos c WHERE c.claveProductoServicio = :claveProductoServicio")
    , @NamedQuery(name = "CatalogoProductos.findByClaveUnidad", query = "SELECT c FROM CatalogoProductos c WHERE c.claveUnidad = :claveUnidad")})
public class CatalogoProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "alto")
    private BigDecimal alto;
    @Column(name = "ancho")
    private BigDecimal ancho;
    @Size(max = 255)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 255)
    @Column(name = "color")
    private String color;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "largo")
    private BigDecimal largo;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "peso")
    private BigDecimal peso;
    @Column(name = "stock")
    private BigDecimal stock;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "proveedor")
    private Integer proveedor;
    @Size(max = 124)
    @Column(name = "codigo_personalizado")
    private String codigoPersonalizado;
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "precio_variable")
    private Boolean precioVariable;
    @Column(name = "numeroUsos")
    private BigDecimal numeroUsos;
    @Size(max = 256)
    @Column(name = "clave")
    private String clave;
    @Size(max = 256)
    @Column(name = "caja")
    private String caja;
    @Size(max = 256)
    @Column(name = "master")
    private String master;
    @Size(max = 256)
    @Column(name = "unidad")
    private String unidad;
    @Size(max = 256)
    @Column(name = "ean")
    private String ean;
    @Column(name = "precio_minimo_venta")
    private BigDecimal precioMinimoVenta;
    @Column(name = "alta_rotacion")
    private Boolean altaRotacion;
    @Column(name = "precio_mayoreo_iva")
    private BigDecimal precioMayoreoIva;
    @Column(name = "precio_distribuidor_iva")
    private BigDecimal precioDistribuidorIva;
    @Column(name = "precio_publico_iva")
    private BigDecimal precioPublicoIva;
    @Column(name = "precio_mayoreo_siniva")
    private BigDecimal precioMayoreoSiniva;
    @Column(name = "precio_distribuidor_siniva")
    private BigDecimal precioDistribuidorSiniva;
    @Column(name = "precio_publico_siniva")
    private BigDecimal precioPublicoSiniva;
    @Size(max = 255)
    @Column(name = "marca")
    private String marca;
    @Column(name = "precio_subdistribuidor_siniva")
    private BigDecimal precioSubdistribuidorSiniva;
    @Column(name = "precio_subdistribuidor_iva")
    private BigDecimal precioSubdistribuidorIva;
    @Size(max = 45)
    @Column(name = "catalogo_productoscol")
    private String catalogoProductoscol;
    @Column(name = "porcentajeUso")
    private BigDecimal porcentajeUso;
    @Size(max = 255)
    @Column(name = "codigo_entrada_almacen_masivo")
    private String codigoEntradaAlmacenMasivo;
    @Column(name = "numero_entrada_almacen_masivo")
    private BigDecimal numeroEntradaAlmacenMasivo;
    @Column(name = "regimen_fiscal")
    private Integer regimenFiscal;
    @Column(name = "usucfdi _cfdi_regimen_fiscal")
    private Integer usucfdiCfdiRegimenFiscal;
    @Column(name = "impuesto_trasladado")
    private Integer impuestoTrasladado;
    @Column(name = "tipo_factor_trasladado")
    private Integer tipoFactorTrasladado;
    @Column(name = "tasa_cuota_trasladado")
    private Integer tasaCuotaTrasladado;
    @Column(name = "impuesto_retenido")
    private Integer impuestoRetenido;
    @Column(name = "tipo_factor_retenido")
    private Integer tipoFactorRetenido;
    @Column(name = "tasa_cuota_retenido")
    private Integer tasaCuotaRetenido;
    @Column(name = "iva")
    private BigDecimal iva;
    @Column(name = "isr")
    private BigDecimal isr;
    @Column(name = "ieps")
    private BigDecimal ieps;
    @Size(max = 50)
    @Column(name = "tipo_factor")
    private String tipoFactor;
    @Size(max = 250)
    @Column(name = "clave_producto_servicio")
    private String claveProductoServicio;
    @Size(max = 250)
    @Column(name = "clave_unidad")
    private String claveUnidad;

    public CatalogoProductos() {
    }

    public CatalogoProductos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAlto() {
        return alto;
    }

    public void setAlto(BigDecimal alto) {
        this.alto = alto;
    }

    public BigDecimal getAncho() {
        return ancho;
    }

    public void setAncho(BigDecimal ancho) {
        this.ancho = ancho;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public BigDecimal getLargo() {
        return largo;
    }

    public void setLargo(BigDecimal largo) {
        this.largo = largo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public Integer getProveedor() {
        return proveedor;
    }

    public void setProveedor(Integer proveedor) {
        this.proveedor = proveedor;
    }

    public String getCodigoPersonalizado() {
        return codigoPersonalizado;
    }

    public void setCodigoPersonalizado(String codigoPersonalizado) {
        this.codigoPersonalizado = codigoPersonalizado;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Boolean getPrecioVariable() {
        return precioVariable;
    }

    public void setPrecioVariable(Boolean precioVariable) {
        this.precioVariable = precioVariable;
    }

    public BigDecimal getNumeroUsos() {
        return numeroUsos;
    }

    public void setNumeroUsos(BigDecimal numeroUsos) {
        this.numeroUsos = numeroUsos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public BigDecimal getPrecioMinimoVenta() {
        return precioMinimoVenta;
    }

    public void setPrecioMinimoVenta(BigDecimal precioMinimoVenta) {
        this.precioMinimoVenta = precioMinimoVenta;
    }

    public Boolean getAltaRotacion() {
        return altaRotacion;
    }

    public void setAltaRotacion(Boolean altaRotacion) {
        this.altaRotacion = altaRotacion;
    }

    public BigDecimal getPrecioMayoreoIva() {
        return precioMayoreoIva;
    }

    public void setPrecioMayoreoIva(BigDecimal precioMayoreoIva) {
        this.precioMayoreoIva = precioMayoreoIva;
    }

    public BigDecimal getPrecioDistribuidorIva() {
        return precioDistribuidorIva;
    }

    public void setPrecioDistribuidorIva(BigDecimal precioDistribuidorIva) {
        this.precioDistribuidorIva = precioDistribuidorIva;
    }

    public BigDecimal getPrecioPublicoIva() {
        return precioPublicoIva;
    }

    public void setPrecioPublicoIva(BigDecimal precioPublicoIva) {
        this.precioPublicoIva = precioPublicoIva;
    }

    public BigDecimal getPrecioMayoreoSiniva() {
        return precioMayoreoSiniva;
    }

    public void setPrecioMayoreoSiniva(BigDecimal precioMayoreoSiniva) {
        this.precioMayoreoSiniva = precioMayoreoSiniva;
    }

    public BigDecimal getPrecioDistribuidorSiniva() {
        return precioDistribuidorSiniva;
    }

    public void setPrecioDistribuidorSiniva(BigDecimal precioDistribuidorSiniva) {
        this.precioDistribuidorSiniva = precioDistribuidorSiniva;
    }

    public BigDecimal getPrecioPublicoSiniva() {
        return precioPublicoSiniva;
    }

    public void setPrecioPublicoSiniva(BigDecimal precioPublicoSiniva) {
        this.precioPublicoSiniva = precioPublicoSiniva;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrecioSubdistribuidorSiniva() {
        return precioSubdistribuidorSiniva;
    }

    public void setPrecioSubdistribuidorSiniva(BigDecimal precioSubdistribuidorSiniva) {
        this.precioSubdistribuidorSiniva = precioSubdistribuidorSiniva;
    }

    public BigDecimal getPrecioSubdistribuidorIva() {
        return precioSubdistribuidorIva;
    }

    public void setPrecioSubdistribuidorIva(BigDecimal precioSubdistribuidorIva) {
        this.precioSubdistribuidorIva = precioSubdistribuidorIva;
    }

    public String getCatalogoProductoscol() {
        return catalogoProductoscol;
    }

    public void setCatalogoProductoscol(String catalogoProductoscol) {
        this.catalogoProductoscol = catalogoProductoscol;
    }

    public BigDecimal getPorcentajeUso() {
        return porcentajeUso;
    }

    public void setPorcentajeUso(BigDecimal porcentajeUso) {
        this.porcentajeUso = porcentajeUso;
    }

    public String getCodigoEntradaAlmacenMasivo() {
        return codigoEntradaAlmacenMasivo;
    }

    public void setCodigoEntradaAlmacenMasivo(String codigoEntradaAlmacenMasivo) {
        this.codigoEntradaAlmacenMasivo = codigoEntradaAlmacenMasivo;
    }

    public BigDecimal getNumeroEntradaAlmacenMasivo() {
        return numeroEntradaAlmacenMasivo;
    }

    public void setNumeroEntradaAlmacenMasivo(BigDecimal numeroEntradaAlmacenMasivo) {
        this.numeroEntradaAlmacenMasivo = numeroEntradaAlmacenMasivo;
    }

    public Integer getRegimenFiscal() {
        return regimenFiscal;
    }

    public void setRegimenFiscal(Integer regimenFiscal) {
        this.regimenFiscal = regimenFiscal;
    }

    public Integer getUsucfdiCfdiRegimenFiscal() {
        return usucfdiCfdiRegimenFiscal;
    }

    public void setUsucfdiCfdiRegimenFiscal(Integer usucfdiCfdiRegimenFiscal) {
        this.usucfdiCfdiRegimenFiscal = usucfdiCfdiRegimenFiscal;
    }

    public Integer getImpuestoTrasladado() {
        return impuestoTrasladado;
    }

    public void setImpuestoTrasladado(Integer impuestoTrasladado) {
        this.impuestoTrasladado = impuestoTrasladado;
    }

    public Integer getTipoFactorTrasladado() {
        return tipoFactorTrasladado;
    }

    public void setTipoFactorTrasladado(Integer tipoFactorTrasladado) {
        this.tipoFactorTrasladado = tipoFactorTrasladado;
    }

    public Integer getTasaCuotaTrasladado() {
        return tasaCuotaTrasladado;
    }

    public void setTasaCuotaTrasladado(Integer tasaCuotaTrasladado) {
        this.tasaCuotaTrasladado = tasaCuotaTrasladado;
    }

    public Integer getImpuestoRetenido() {
        return impuestoRetenido;
    }

    public void setImpuestoRetenido(Integer impuestoRetenido) {
        this.impuestoRetenido = impuestoRetenido;
    }

    public Integer getTipoFactorRetenido() {
        return tipoFactorRetenido;
    }

    public void setTipoFactorRetenido(Integer tipoFactorRetenido) {
        this.tipoFactorRetenido = tipoFactorRetenido;
    }

    public Integer getTasaCuotaRetenido() {
        return tasaCuotaRetenido;
    }

    public void setTasaCuotaRetenido(Integer tasaCuotaRetenido) {
        this.tasaCuotaRetenido = tasaCuotaRetenido;
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

    public BigDecimal getIeps() {
        return ieps;
    }

    public void setIeps(BigDecimal ieps) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoProductos)) {
            return false;
        }
        CatalogoProductos other = (CatalogoProductos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoProductos[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
