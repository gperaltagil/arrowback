<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.jpa;

import java.io.Serializable;
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
@Table(name = "permisos_usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PermisosUsuarios.findAll", query = "SELECT p FROM PermisosUsuarios p")
    , @NamedQuery(name = "PermisosUsuarios.findById", query = "SELECT p FROM PermisosUsuarios p WHERE p.id = :id")
    , @NamedQuery(name = "PermisosUsuarios.findByTenant", query = "SELECT p FROM PermisosUsuarios p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "PermisosUsuarios.findByEliminado", query = "SELECT p FROM PermisosUsuarios p WHERE p.eliminado = :eliminado")
    , @NamedQuery(name = "PermisosUsuarios.findByFechaRegistro", query = "SELECT p FROM PermisosUsuarios p WHERE p.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "PermisosUsuarios.findByFechaInicio", query = "SELECT p FROM PermisosUsuarios p WHERE p.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "PermisosUsuarios.findByFechaFin", query = "SELECT p FROM PermisosUsuarios p WHERE p.fechaFin = :fechaFin")
    , @NamedQuery(name = "PermisosUsuarios.findByMotivo", query = "SELECT p FROM PermisosUsuarios p WHERE p.motivo = :motivo")
    , @NamedQuery(name = "PermisosUsuarios.findByIdUsuarioSolicita", query = "SELECT p FROM PermisosUsuarios p WHERE p.idUsuarioSolicita = :idUsuarioSolicita")
    , @NamedQuery(name = "PermisosUsuarios.findByIdUsuarioRegistra", query = "SELECT p FROM PermisosUsuarios p WHERE p.idUsuarioRegistra = :idUsuarioRegistra")
    , @NamedQuery(name = "PermisosUsuarios.findByEstatus", query = "SELECT p FROM PermisosUsuarios p WHERE p.estatus = :estatus")})
public class PermisosUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Size(max = 512)
    @Column(name = "motivo")
    private String motivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario_solicita")
    private int idUsuarioSolicita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario_registra")
    private int idUsuarioRegistra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estatus")
    private String estatus;

    public PermisosUsuarios() {
    }

    public PermisosUsuarios(Integer id) {
        this.id = id;
    }

    public PermisosUsuarios(Integer id, int tenant, Date fechaInicio, Date fechaFin, int idUsuarioSolicita, int idUsuarioRegistra, String estatus) {
        this.id = id;
        this.tenant = tenant;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idUsuarioSolicita = idUsuarioSolicita;
        this.idUsuarioRegistra = idUsuarioRegistra;
        this.estatus = estatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdUsuarioSolicita() {
        return idUsuarioSolicita;
    }

    public void setIdUsuarioSolicita(int idUsuarioSolicita) {
        this.idUsuarioSolicita = idUsuarioSolicita;
    }

    public int getIdUsuarioRegistra() {
        return idUsuarioRegistra;
    }

    public void setIdUsuarioRegistra(int idUsuarioRegistra) {
        this.idUsuarioRegistra = idUsuarioRegistra;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
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
        if (!(object instanceof PermisosUsuarios)) {
            return false;
        }
        PermisosUsuarios other = (PermisosUsuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.PermisosUsuarios[ id=" + id + " ]";
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
@Table(name = "permisos_usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PermisosUsuarios.findAll", query = "SELECT p FROM PermisosUsuarios p")
    , @NamedQuery(name = "PermisosUsuarios.findById", query = "SELECT p FROM PermisosUsuarios p WHERE p.id = :id")
    , @NamedQuery(name = "PermisosUsuarios.findByTenant", query = "SELECT p FROM PermisosUsuarios p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "PermisosUsuarios.findByEliminado", query = "SELECT p FROM PermisosUsuarios p WHERE p.eliminado = :eliminado")
    , @NamedQuery(name = "PermisosUsuarios.findByFechaRegistro", query = "SELECT p FROM PermisosUsuarios p WHERE p.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "PermisosUsuarios.findByFechaInicio", query = "SELECT p FROM PermisosUsuarios p WHERE p.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "PermisosUsuarios.findByFechaFin", query = "SELECT p FROM PermisosUsuarios p WHERE p.fechaFin = :fechaFin")
    , @NamedQuery(name = "PermisosUsuarios.findByMotivo", query = "SELECT p FROM PermisosUsuarios p WHERE p.motivo = :motivo")
    , @NamedQuery(name = "PermisosUsuarios.findByIdUsuarioSolicita", query = "SELECT p FROM PermisosUsuarios p WHERE p.idUsuarioSolicita = :idUsuarioSolicita")
    , @NamedQuery(name = "PermisosUsuarios.findByIdUsuarioRegistra", query = "SELECT p FROM PermisosUsuarios p WHERE p.idUsuarioRegistra = :idUsuarioRegistra")
    , @NamedQuery(name = "PermisosUsuarios.findByEstatus", query = "SELECT p FROM PermisosUsuarios p WHERE p.estatus = :estatus")})
public class PermisosUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Size(max = 512)
    @Column(name = "motivo")
    private String motivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario_solicita")
    private int idUsuarioSolicita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario_registra")
    private int idUsuarioRegistra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estatus")
    private String estatus;

    public PermisosUsuarios() {
    }

    public PermisosUsuarios(Integer id) {
        this.id = id;
    }

    public PermisosUsuarios(Integer id, int tenant, Date fechaInicio, Date fechaFin, int idUsuarioSolicita, int idUsuarioRegistra, String estatus) {
        this.id = id;
        this.tenant = tenant;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idUsuarioSolicita = idUsuarioSolicita;
        this.idUsuarioRegistra = idUsuarioRegistra;
        this.estatus = estatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdUsuarioSolicita() {
        return idUsuarioSolicita;
    }

    public void setIdUsuarioSolicita(int idUsuarioSolicita) {
        this.idUsuarioSolicita = idUsuarioSolicita;
    }

    public int getIdUsuarioRegistra() {
        return idUsuarioRegistra;
    }

    public void setIdUsuarioRegistra(int idUsuarioRegistra) {
        this.idUsuarioRegistra = idUsuarioRegistra;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
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
        if (!(object instanceof PermisosUsuarios)) {
            return false;
        }
        PermisosUsuarios other = (PermisosUsuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.PermisosUsuarios[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
