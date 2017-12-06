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
@Table(name = "ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v")
    , @NamedQuery(name = "Ventas.findById", query = "SELECT v FROM Ventas v WHERE v.id = :id")
    , @NamedQuery(name = "Ventas.findByActivo", query = "SELECT v FROM Ventas v WHERE v.activo = :activo")
    , @NamedQuery(name = "Ventas.findByCliente", query = "SELECT v FROM Ventas v WHERE v.cliente = :cliente")
    , @NamedQuery(name = "Ventas.findByUsuarioRegistra", query = "SELECT v FROM Ventas v WHERE v.usuarioRegistra = :usuarioRegistra")
    , @NamedQuery(name = "Ventas.findByUsuarioVende", query = "SELECT v FROM Ventas v WHERE v.usuarioVende = :usuarioVende")
    , @NamedQuery(name = "Ventas.findByFechaRegistro", query = "SELECT v FROM Ventas v WHERE v.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Ventas.findByRequiereFactura", query = "SELECT v FROM Ventas v WHERE v.requiereFactura = :requiereFactura")
    , @NamedQuery(name = "Ventas.findByTotalVenta", query = "SELECT v FROM Ventas v WHERE v.totalVenta = :totalVenta")
    , @NamedQuery(name = "Ventas.findByUsuarioElimina", query = "SELECT v FROM Ventas v WHERE v.usuarioElimina = :usuarioElimina")
    , @NamedQuery(name = "Ventas.findByFechaElimina", query = "SELECT v FROM Ventas v WHERE v.fechaElimina = :fechaElimina")
    , @NamedQuery(name = "Ventas.findBySucursal", query = "SELECT v FROM Ventas v WHERE v.sucursal = :sucursal")
    , @NamedQuery(name = "Ventas.findByTenant", query = "SELECT v FROM Ventas v WHERE v.tenant = :tenant")
    , @NamedQuery(name = "Ventas.findByTipoPublicidad", query = "SELECT v FROM Ventas v WHERE v.tipoPublicidad = :tipoPublicidad")
    , @NamedQuery(name = "Ventas.findByEfectivo", query = "SELECT v FROM Ventas v WHERE v.efectivo = :efectivo")
    , @NamedQuery(name = "Ventas.findByTarjetaDebito", query = "SELECT v FROM Ventas v WHERE v.tarjetaDebito = :tarjetaDebito")
    , @NamedQuery(name = "Ventas.findByTarjetaCredito", query = "SELECT v FROM Ventas v WHERE v.tarjetaCredito = :tarjetaCredito")
    , @NamedQuery(name = "Ventas.findByTarjetaRegalo", query = "SELECT v FROM Ventas v WHERE v.tarjetaRegalo = :tarjetaRegalo")
    , @NamedQuery(name = "Ventas.findByCantidadEfectivo", query = "SELECT v FROM Ventas v WHERE v.cantidadEfectivo = :cantidadEfectivo")
    , @NamedQuery(name = "Ventas.findByCantidadDebito", query = "SELECT v FROM Ventas v WHERE v.cantidadDebito = :cantidadDebito")
    , @NamedQuery(name = "Ventas.findByCantidadCredito", query = "SELECT v FROM Ventas v WHERE v.cantidadCredito = :cantidadCredito")
    , @NamedQuery(name = "Ventas.findByCantidadRegalo", query = "SELECT v FROM Ventas v WHERE v.cantidadRegalo = :cantidadRegalo")
    , @NamedQuery(name = "Ventas.findByFolioTarjeta", query = "SELECT v FROM Ventas v WHERE v.folioTarjeta = :folioTarjeta")
    , @NamedQuery(name = "Ventas.findByPendienteDefinirProductos", query = "SELECT v FROM Ventas v WHERE v.pendienteDefinirProductos = :pendienteDefinirProductos")
    , @NamedQuery(name = "Ventas.findByIdPromocion", query = "SELECT v FROM Ventas v WHERE v.idPromocion = :idPromocion")
    , @NamedQuery(name = "Ventas.findByTipoPromocion", query = "SELECT v FROM Ventas v WHERE v.tipoPromocion = :tipoPromocion")
    , @NamedQuery(name = "Ventas.findByTotalVentaSinPromocion", query = "SELECT v FROM Ventas v WHERE v.totalVentaSinPromocion = :totalVentaSinPromocion")
    , @NamedQuery(name = "Ventas.findByPropina", query = "SELECT v FROM Ventas v WHERE v.propina = :propina")
    , @NamedQuery(name = "Ventas.findByFolio", query = "SELECT v FROM Ventas v WHERE v.folio = :folio")
    , @NamedQuery(name = "Ventas.findByCantidadPagoCredito", query = "SELECT v FROM Ventas v WHERE v.cantidadPagoCredito = :cantidadPagoCredito")
    , @NamedQuery(name = "Ventas.findByCredito", query = "SELECT v FROM Ventas v WHERE v.credito = :credito")
    , @NamedQuery(name = "Ventas.findByIdCorteCaja", query = "SELECT v FROM Ventas v WHERE v.idCorteCaja = :idCorteCaja")
    , @NamedQuery(name = "Ventas.findByIdFactura", query = "SELECT v FROM Ventas v WHERE v.idFactura = :idFactura")})
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "activo")
    private Boolean activo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente")
    private int cliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_registra")
    private int usuarioRegistra;
    @Column(name = "usuario_vende")
    private Integer usuarioVende;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "requiere_factura")
    private Boolean requiereFactura;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_venta")
    private BigDecimal totalVenta;
    @Column(name = "usuario_elimina")
    private Integer usuarioElimina;
    @Column(name = "fecha_elimina")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaElimina;
    @Column(name = "sucursal")
    private Integer sucursal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Size(max = 255)
    @Column(name = "tipo_publicidad")
    private String tipoPublicidad;
    @Column(name = "efectivo")
    private Boolean efectivo;
    @Column(name = "tarjeta_debito")
    private Boolean tarjetaDebito;
    @Column(name = "tarjeta_credito")
    private Boolean tarjetaCredito;
    @Column(name = "tarjeta_regalo")
    private Boolean tarjetaRegalo;
    @Column(name = "cantidad_efectivo")
    private BigDecimal cantidadEfectivo;
    @Column(name = "cantidad_debito")
    private BigDecimal cantidadDebito;
    @Column(name = "cantidad_credito")
    private BigDecimal cantidadCredito;
    @Column(name = "cantidad_regalo")
    private BigDecimal cantidadRegalo;
    @Size(max = 45)
    @Column(name = "folio_tarjeta")
    private String folioTarjeta;
    @Column(name = "pendiente_definir_productos")
    private Boolean pendienteDefinirProductos;
    @Column(name = "id_promocion")
    private Integer idPromocion;
    @Size(max = 45)
    @Column(name = "tipo_promocion")
    private String tipoPromocion;
    @Column(name = "total_venta_sin_promocion")
    private BigDecimal totalVentaSinPromocion;
    @Column(name = "propina")
    private BigDecimal propina;
    @Size(max = 6)
    @Column(name = "folio")
    private String folio;
    @Column(name = "cantidad_pago_credito")
    private BigDecimal cantidadPagoCredito;
    @Column(name = "credito")
    private Boolean credito;
    @Column(name = "id_corte_caja")
    private Integer idCorteCaja;
    @Size(max = 45)
    @Column(name = "id_factura")
    private String idFactura;

    public Ventas() {
    }

    public Ventas(Integer id) {
        this.id = id;
    }

    public Ventas(Integer id, int cliente, int usuarioRegistra, Date fechaRegistro, int tenant) {
        this.id = id;
        this.cliente = cliente;
        this.usuarioRegistra = usuarioRegistra;
        this.fechaRegistro = fechaRegistro;
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getUsuarioRegistra() {
        return usuarioRegistra;
    }

    public void setUsuarioRegistra(int usuarioRegistra) {
        this.usuarioRegistra = usuarioRegistra;
    }

    public Integer getUsuarioVende() {
        return usuarioVende;
    }

    public void setUsuarioVende(Integer usuarioVende) {
        this.usuarioVende = usuarioVende;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getRequiereFactura() {
        return requiereFactura;
    }

    public void setRequiereFactura(Boolean requiereFactura) {
        this.requiereFactura = requiereFactura;
    }

    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Integer getUsuarioElimina() {
        return usuarioElimina;
    }

    public void setUsuarioElimina(Integer usuarioElimina) {
        this.usuarioElimina = usuarioElimina;
    }

    public Date getFechaElimina() {
        return fechaElimina;
    }

    public void setFechaElimina(Date fechaElimina) {
        this.fechaElimina = fechaElimina;
    }

    public Integer getSucursal() {
        return sucursal;
    }

    public void setSucursal(Integer sucursal) {
        this.sucursal = sucursal;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
    }

    public String getTipoPublicidad() {
        return tipoPublicidad;
    }

    public void setTipoPublicidad(String tipoPublicidad) {
        this.tipoPublicidad = tipoPublicidad;
    }

    public Boolean getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Boolean efectivo) {
        this.efectivo = efectivo;
    }

    public Boolean getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(Boolean tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public Boolean getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(Boolean tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Boolean getTarjetaRegalo() {
        return tarjetaRegalo;
    }

    public void setTarjetaRegalo(Boolean tarjetaRegalo) {
        this.tarjetaRegalo = tarjetaRegalo;
    }

    public BigDecimal getCantidadEfectivo() {
        return cantidadEfectivo;
    }

    public void setCantidadEfectivo(BigDecimal cantidadEfectivo) {
        this.cantidadEfectivo = cantidadEfectivo;
    }

    public BigDecimal getCantidadDebito() {
        return cantidadDebito;
    }

    public void setCantidadDebito(BigDecimal cantidadDebito) {
        this.cantidadDebito = cantidadDebito;
    }

    public BigDecimal getCantidadCredito() {
        return cantidadCredito;
    }

    public void setCantidadCredito(BigDecimal cantidadCredito) {
        this.cantidadCredito = cantidadCredito;
    }

    public BigDecimal getCantidadRegalo() {
        return cantidadRegalo;
    }

    public void setCantidadRegalo(BigDecimal cantidadRegalo) {
        this.cantidadRegalo = cantidadRegalo;
    }

    public String getFolioTarjeta() {
        return folioTarjeta;
    }

    public void setFolioTarjeta(String folioTarjeta) {
        this.folioTarjeta = folioTarjeta;
    }

    public Boolean getPendienteDefinirProductos() {
        return pendienteDefinirProductos;
    }

    public void setPendienteDefinirProductos(Boolean pendienteDefinirProductos) {
        this.pendienteDefinirProductos = pendienteDefinirProductos;
    }

    public Integer getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Integer idPromocion) {
        this.idPromocion = idPromocion;
    }

    public String getTipoPromocion() {
        return tipoPromocion;
    }

    public void setTipoPromocion(String tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    public BigDecimal getTotalVentaSinPromocion() {
        return totalVentaSinPromocion;
    }

    public void setTotalVentaSinPromocion(BigDecimal totalVentaSinPromocion) {
        this.totalVentaSinPromocion = totalVentaSinPromocion;
    }

    public BigDecimal getPropina() {
        return propina;
    }

    public void setPropina(BigDecimal propina) {
        this.propina = propina;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public BigDecimal getCantidadPagoCredito() {
        return cantidadPagoCredito;
    }

    public void setCantidadPagoCredito(BigDecimal cantidadPagoCredito) {
        this.cantidadPagoCredito = cantidadPagoCredito;
    }

    public Boolean getCredito() {
        return credito;
    }

    public void setCredito(Boolean credito) {
        this.credito = credito;
    }

    public Integer getIdCorteCaja() {
        return idCorteCaja;
    }

    public void setIdCorteCaja(Integer idCorteCaja) {
        this.idCorteCaja = idCorteCaja;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
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
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.Ventas[ id=" + id + " ]";
    }
    
}
