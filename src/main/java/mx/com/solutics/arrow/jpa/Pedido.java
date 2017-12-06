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
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findById", query = "SELECT p FROM Pedido p WHERE p.id = :id")
    , @NamedQuery(name = "Pedido.findByTenant", query = "SELECT p FROM Pedido p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "Pedido.findByIdVehiculo", query = "SELECT p FROM Pedido p WHERE p.idVehiculo = :idVehiculo")
    , @NamedQuery(name = "Pedido.findByIdUsuarioEntrega", query = "SELECT p FROM Pedido p WHERE p.idUsuarioEntrega = :idUsuarioEntrega")
    , @NamedQuery(name = "Pedido.findByFechaSalida", query = "SELECT p FROM Pedido p WHERE p.fechaSalida = :fechaSalida")
    , @NamedQuery(name = "Pedido.findByFechaRegreso", query = "SELECT p FROM Pedido p WHERE p.fechaRegreso = :fechaRegreso")
    , @NamedQuery(name = "Pedido.findByCombustible", query = "SELECT p FROM Pedido p WHERE p.combustible = :combustible")
    , @NamedQuery(name = "Pedido.findByCasetas", query = "SELECT p FROM Pedido p WHERE p.casetas = :casetas")
    , @NamedQuery(name = "Pedido.findByAdicionales", query = "SELECT p FROM Pedido p WHERE p.adicionales = :adicionales")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "id_vehiculo")
    private Integer idVehiculo;
    @Column(name = "id_usuario_entrega")
    private Integer idUsuarioEntrega;
    @Column(name = "fecha_salida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Column(name = "fecha_regreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegreso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "combustible")
    private BigDecimal combustible;
    @Column(name = "casetas")
    private BigDecimal casetas;
    @Column(name = "adicionales")
    private BigDecimal adicionales;

    public Pedido() {
    }

    public Pedido(Integer id) {
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

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Integer getIdUsuarioEntrega() {
        return idUsuarioEntrega;
    }

    public void setIdUsuarioEntrega(Integer idUsuarioEntrega) {
        this.idUsuarioEntrega = idUsuarioEntrega;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public BigDecimal getCombustible() {
        return combustible;
    }

    public void setCombustible(BigDecimal combustible) {
        this.combustible = combustible;
    }

    public BigDecimal getCasetas() {
        return casetas;
    }

    public void setCasetas(BigDecimal casetas) {
        this.casetas = casetas;
    }

    public BigDecimal getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(BigDecimal adicionales) {
        this.adicionales = adicionales;
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
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.Pedido[ id=" + id + " ]";
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
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findById", query = "SELECT p FROM Pedido p WHERE p.id = :id")
    , @NamedQuery(name = "Pedido.findByTenant", query = "SELECT p FROM Pedido p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "Pedido.findByIdVehiculo", query = "SELECT p FROM Pedido p WHERE p.idVehiculo = :idVehiculo")
    , @NamedQuery(name = "Pedido.findByIdUsuarioEntrega", query = "SELECT p FROM Pedido p WHERE p.idUsuarioEntrega = :idUsuarioEntrega")
    , @NamedQuery(name = "Pedido.findByFechaSalida", query = "SELECT p FROM Pedido p WHERE p.fechaSalida = :fechaSalida")
    , @NamedQuery(name = "Pedido.findByFechaRegreso", query = "SELECT p FROM Pedido p WHERE p.fechaRegreso = :fechaRegreso")
    , @NamedQuery(name = "Pedido.findByCombustible", query = "SELECT p FROM Pedido p WHERE p.combustible = :combustible")
    , @NamedQuery(name = "Pedido.findByCasetas", query = "SELECT p FROM Pedido p WHERE p.casetas = :casetas")
    , @NamedQuery(name = "Pedido.findByAdicionales", query = "SELECT p FROM Pedido p WHERE p.adicionales = :adicionales")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "id_vehiculo")
    private Integer idVehiculo;
    @Column(name = "id_usuario_entrega")
    private Integer idUsuarioEntrega;
    @Column(name = "fecha_salida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Column(name = "fecha_regreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegreso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "combustible")
    private BigDecimal combustible;
    @Column(name = "casetas")
    private BigDecimal casetas;
    @Column(name = "adicionales")
    private BigDecimal adicionales;

    public Pedido() {
    }

    public Pedido(Integer id) {
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

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Integer getIdUsuarioEntrega() {
        return idUsuarioEntrega;
    }

    public void setIdUsuarioEntrega(Integer idUsuarioEntrega) {
        this.idUsuarioEntrega = idUsuarioEntrega;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public BigDecimal getCombustible() {
        return combustible;
    }

    public void setCombustible(BigDecimal combustible) {
        this.combustible = combustible;
    }

    public BigDecimal getCasetas() {
        return casetas;
    }

    public void setCasetas(BigDecimal casetas) {
        this.casetas = casetas;
    }

    public BigDecimal getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(BigDecimal adicionales) {
        this.adicionales = adicionales;
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
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.Pedido[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
