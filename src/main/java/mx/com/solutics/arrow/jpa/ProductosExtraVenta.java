/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.jpa;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "productos_extra_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductosExtraVenta.findAll", query = "SELECT p FROM ProductosExtraVenta p")
    , @NamedQuery(name = "ProductosExtraVenta.findById", query = "SELECT p FROM ProductosExtraVenta p WHERE p.id = :id")
    , @NamedQuery(name = "ProductosExtraVenta.findByTenant", query = "SELECT p FROM ProductosExtraVenta p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "ProductosExtraVenta.findByCodigo", query = "SELECT p FROM ProductosExtraVenta p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "ProductosExtraVenta.findByDescripcion", query = "SELECT p FROM ProductosExtraVenta p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "ProductosExtraVenta.findByEliminado", query = "SELECT p FROM ProductosExtraVenta p WHERE p.eliminado = :eliminado")
    , @NamedQuery(name = "ProductosExtraVenta.findByFechaRegistro", query = "SELECT p FROM ProductosExtraVenta p WHERE p.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "ProductosExtraVenta.findByNombreProducto", query = "SELECT p FROM ProductosExtraVenta p WHERE p.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "ProductosExtraVenta.findByNumeroUsos", query = "SELECT p FROM ProductosExtraVenta p WHERE p.numeroUsos = :numeroUsos")
    , @NamedQuery(name = "ProductosExtraVenta.findByPorcentajeUso", query = "SELECT p FROM ProductosExtraVenta p WHERE p.porcentajeUso = :porcentajeUso")
    , @NamedQuery(name = "ProductosExtraVenta.findByPrecioUnitario", query = "SELECT p FROM ProductosExtraVenta p WHERE p.precioUnitario = :precioUnitario")
    , @NamedQuery(name = "ProductosExtraVenta.findByProductoId", query = "SELECT p FROM ProductosExtraVenta p WHERE p.productoId = :productoId")
    , @NamedQuery(name = "ProductosExtraVenta.findByServicio", query = "SELECT p FROM ProductosExtraVenta p WHERE p.servicio = :servicio")
    , @NamedQuery(name = "ProductosExtraVenta.findByVenta", query = "SELECT p FROM ProductosExtraVenta p WHERE p.venta = :venta")})
public class ProductosExtraVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 31)
    @Column(name = "tenant")
    private String tenant;
    @Size(max = 255)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Size(max = 255)
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Column(name = "numero_usos")
    private BigInteger numeroUsos;
    @Column(name = "porcentaje_uso")
    private BigInteger porcentajeUso;
    @Column(name = "precio_unitario")
    private BigInteger precioUnitario;
    @Column(name = "producto_id")
    private Integer productoId;
    @Column(name = "servicio")
    private Integer servicio;
    @Column(name = "venta")
    private Integer venta;

    public ProductosExtraVenta() {
    }

    public ProductosExtraVenta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public BigInteger getNumeroUsos() {
        return numeroUsos;
    }

    public void setNumeroUsos(BigInteger numeroUsos) {
        this.numeroUsos = numeroUsos;
    }

    public BigInteger getPorcentajeUso() {
        return porcentajeUso;
    }

    public void setPorcentajeUso(BigInteger porcentajeUso) {
        this.porcentajeUso = porcentajeUso;
    }

    public BigInteger getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigInteger precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Integer getServicio() {
        return servicio;
    }

    public void setServicio(Integer servicio) {
        this.servicio = servicio;
    }

    public Integer getVenta() {
        return venta;
    }

    public void setVenta(Integer venta) {
        this.venta = venta;
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
        if (!(object instanceof ProductosExtraVenta)) {
            return false;
        }
        ProductosExtraVenta other = (ProductosExtraVenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.ProductosExtraVenta[ id=" + id + " ]";
    }
    
}
