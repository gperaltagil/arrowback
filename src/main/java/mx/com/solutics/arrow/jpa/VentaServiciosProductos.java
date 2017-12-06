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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "venta_servicios_productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentaServiciosProductos.findAll", query = "SELECT v FROM VentaServiciosProductos v")
    , @NamedQuery(name = "VentaServiciosProductos.findById", query = "SELECT v FROM VentaServiciosProductos v WHERE v.id = :id")
    , @NamedQuery(name = "VentaServiciosProductos.findByTenant", query = "SELECT v FROM VentaServiciosProductos v WHERE v.tenant = :tenant")
    , @NamedQuery(name = "VentaServiciosProductos.findByActivo", query = "SELECT v FROM VentaServiciosProductos v WHERE v.activo = :activo")
    , @NamedQuery(name = "VentaServiciosProductos.findByCantidad", query = "SELECT v FROM VentaServiciosProductos v WHERE v.cantidad = :cantidad")
    , @NamedQuery(name = "VentaServiciosProductos.findByIdProducto", query = "SELECT v FROM VentaServiciosProductos v WHERE v.idProducto = :idProducto")
    , @NamedQuery(name = "VentaServiciosProductos.findByIdServicio", query = "SELECT v FROM VentaServiciosProductos v WHERE v.idServicio = :idServicio")
    , @NamedQuery(name = "VentaServiciosProductos.findByPrecioOriginal", query = "SELECT v FROM VentaServiciosProductos v WHERE v.precioOriginal = :precioOriginal")
    , @NamedQuery(name = "VentaServiciosProductos.findByPrecioUnitario", query = "SELECT v FROM VentaServiciosProductos v WHERE v.precioUnitario = :precioUnitario")
    , @NamedQuery(name = "VentaServiciosProductos.findByTotal", query = "SELECT v FROM VentaServiciosProductos v WHERE v.total = :total")
    , @NamedQuery(name = "VentaServiciosProductos.findByVenta", query = "SELECT v FROM VentaServiciosProductos v WHERE v.venta = :venta")
    , @NamedQuery(name = "VentaServiciosProductos.findByIdPedido", query = "SELECT v FROM VentaServiciosProductos v WHERE v.idPedido = :idPedido")
    , @NamedQuery(name = "VentaServiciosProductos.findByIdDireccionEntrega", query = "SELECT v FROM VentaServiciosProductos v WHERE v.idDireccionEntrega = :idDireccionEntrega")
    , @NamedQuery(name = "VentaServiciosProductos.findByEntregado", query = "SELECT v FROM VentaServiciosProductos v WHERE v.entregado = :entregado")
    , @NamedQuery(name = "VentaServiciosProductos.findByEstatusPago", query = "SELECT v FROM VentaServiciosProductos v WHERE v.estatusPago = :estatusPago")
    , @NamedQuery(name = "VentaServiciosProductos.findByNotas", query = "SELECT v FROM VentaServiciosProductos v WHERE v.notas = :notas")})
public class VentaServiciosProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "activo")
    private Boolean activo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "id_producto")
    private Integer idProducto;
    @Column(name = "id_servicio")
    private Integer idServicio;
    @Column(name = "precio_original")
    private BigDecimal precioOriginal;
    @Column(name = "precio_unitario")
    private BigDecimal precioUnitario;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "venta")
    private Integer venta;
    @Column(name = "id_pedido")
    private Integer idPedido;
    @Column(name = "id_direccion_entrega")
    private Integer idDireccionEntrega;
    @Column(name = "entregado")
    private Boolean entregado;
    @Column(name = "estatus_pago")
    private Integer estatusPago;
    @Size(max = 256)
    @Column(name = "notas")
    private String notas;

    public VentaServiciosProductos() {
    }

    public VentaServiciosProductos(Integer id) {
        this.id = id;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public BigDecimal getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(BigDecimal precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getVenta() {
        return venta;
    }

    public void setVenta(Integer venta) {
        this.venta = venta;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdDireccionEntrega() {
        return idDireccionEntrega;
    }

    public void setIdDireccionEntrega(Integer idDireccionEntrega) {
        this.idDireccionEntrega = idDireccionEntrega;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public Integer getEstatusPago() {
        return estatusPago;
    }

    public void setEstatusPago(Integer estatusPago) {
        this.estatusPago = estatusPago;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
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
        if (!(object instanceof VentaServiciosProductos)) {
            return false;
        }
        VentaServiciosProductos other = (VentaServiciosProductos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.VentaServiciosProductos[ id=" + id + " ]";
    }
    
}
