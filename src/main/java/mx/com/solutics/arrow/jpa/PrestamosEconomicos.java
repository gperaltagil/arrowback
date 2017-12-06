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
@Table(name = "prestamos_economicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrestamosEconomicos.findAll", query = "SELECT p FROM PrestamosEconomicos p")
    , @NamedQuery(name = "PrestamosEconomicos.findById", query = "SELECT p FROM PrestamosEconomicos p WHERE p.id = :id")
    , @NamedQuery(name = "PrestamosEconomicos.findByDescripcion", query = "SELECT p FROM PrestamosEconomicos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "PrestamosEconomicos.findByTenant", query = "SELECT p FROM PrestamosEconomicos p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "PrestamosEconomicos.findByValor", query = "SELECT p FROM PrestamosEconomicos p WHERE p.valor = :valor")
    , @NamedQuery(name = "PrestamosEconomicos.findByUsuarioSolicita", query = "SELECT p FROM PrestamosEconomicos p WHERE p.usuarioSolicita = :usuarioSolicita")
    , @NamedQuery(name = "PrestamosEconomicos.findByUsuarioRegistra", query = "SELECT p FROM PrestamosEconomicos p WHERE p.usuarioRegistra = :usuarioRegistra")
    , @NamedQuery(name = "PrestamosEconomicos.findByFechaRegistro", query = "SELECT p FROM PrestamosEconomicos p WHERE p.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "PrestamosEconomicos.findByEliminado", query = "SELECT p FROM PrestamosEconomicos p WHERE p.eliminado = :eliminado")})
public class PrestamosEconomicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tenant")
    private Integer tenant;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private BigDecimal valor;
    @Column(name = "usuario_solicita")
    private Integer usuarioSolicita;
    @Column(name = "usuario_registra")
    private Integer usuarioRegistra;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "eliminado")
    private Boolean eliminado;

    public PrestamosEconomicos() {
    }

    public PrestamosEconomicos(Integer id) {
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

    public Integer getUsuarioSolicita() {
        return usuarioSolicita;
    }

    public void setUsuarioSolicita(Integer usuarioSolicita) {
        this.usuarioSolicita = usuarioSolicita;
    }

    public Integer getUsuarioRegistra() {
        return usuarioRegistra;
    }

    public void setUsuarioRegistra(Integer usuarioRegistra) {
        this.usuarioRegistra = usuarioRegistra;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
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
        if (!(object instanceof PrestamosEconomicos)) {
            return false;
        }
        PrestamosEconomicos other = (PrestamosEconomicos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.PrestamosEconomicos[ id=" + id + " ]";
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
@Table(name = "prestamos_economicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrestamosEconomicos.findAll", query = "SELECT p FROM PrestamosEconomicos p")
    , @NamedQuery(name = "PrestamosEconomicos.findById", query = "SELECT p FROM PrestamosEconomicos p WHERE p.id = :id")
    , @NamedQuery(name = "PrestamosEconomicos.findByDescripcion", query = "SELECT p FROM PrestamosEconomicos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "PrestamosEconomicos.findByTenant", query = "SELECT p FROM PrestamosEconomicos p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "PrestamosEconomicos.findByValor", query = "SELECT p FROM PrestamosEconomicos p WHERE p.valor = :valor")
    , @NamedQuery(name = "PrestamosEconomicos.findByUsuarioSolicita", query = "SELECT p FROM PrestamosEconomicos p WHERE p.usuarioSolicita = :usuarioSolicita")
    , @NamedQuery(name = "PrestamosEconomicos.findByUsuarioRegistra", query = "SELECT p FROM PrestamosEconomicos p WHERE p.usuarioRegistra = :usuarioRegistra")
    , @NamedQuery(name = "PrestamosEconomicos.findByFechaRegistro", query = "SELECT p FROM PrestamosEconomicos p WHERE p.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "PrestamosEconomicos.findByEliminado", query = "SELECT p FROM PrestamosEconomicos p WHERE p.eliminado = :eliminado")})
public class PrestamosEconomicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tenant")
    private Integer tenant;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private BigDecimal valor;
    @Column(name = "usuario_solicita")
    private Integer usuarioSolicita;
    @Column(name = "usuario_registra")
    private Integer usuarioRegistra;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "eliminado")
    private Boolean eliminado;

    public PrestamosEconomicos() {
    }

    public PrestamosEconomicos(Integer id) {
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

    public Integer getUsuarioSolicita() {
        return usuarioSolicita;
    }

    public void setUsuarioSolicita(Integer usuarioSolicita) {
        this.usuarioSolicita = usuarioSolicita;
    }

    public Integer getUsuarioRegistra() {
        return usuarioRegistra;
    }

    public void setUsuarioRegistra(Integer usuarioRegistra) {
        this.usuarioRegistra = usuarioRegistra;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
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
        if (!(object instanceof PrestamosEconomicos)) {
            return false;
        }
        PrestamosEconomicos other = (PrestamosEconomicos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.PrestamosEconomicos[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
