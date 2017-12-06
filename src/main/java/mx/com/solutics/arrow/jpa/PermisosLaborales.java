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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "permisos_laborales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PermisosLaborales.findAll", query = "SELECT p FROM PermisosLaborales p")
    , @NamedQuery(name = "PermisosLaborales.findById", query = "SELECT p FROM PermisosLaborales p WHERE p.id = :id")
    , @NamedQuery(name = "PermisosLaborales.findByEliminado", query = "SELECT p FROM PermisosLaborales p WHERE p.eliminado = :eliminado")
    , @NamedQuery(name = "PermisosLaborales.findByEstatus", query = "SELECT p FROM PermisosLaborales p WHERE p.estatus = :estatus")
    , @NamedQuery(name = "PermisosLaborales.findByFechaFin", query = "SELECT p FROM PermisosLaborales p WHERE p.fechaFin = :fechaFin")
    , @NamedQuery(name = "PermisosLaborales.findByFechaInicio", query = "SELECT p FROM PermisosLaborales p WHERE p.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "PermisosLaborales.findByFechaRegistro", query = "SELECT p FROM PermisosLaborales p WHERE p.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "PermisosLaborales.findByMotivo", query = "SELECT p FROM PermisosLaborales p WHERE p.motivo = :motivo")
    , @NamedQuery(name = "PermisosLaborales.findByTenant", query = "SELECT p FROM PermisosLaborales p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "PermisosLaborales.findByIdUsuarioAutoriza", query = "SELECT p FROM PermisosLaborales p WHERE p.idUsuarioAutoriza = :idUsuarioAutoriza")
    , @NamedQuery(name = "PermisosLaborales.findByIdUsuarioRegistra", query = "SELECT p FROM PermisosLaborales p WHERE p.idUsuarioRegistra = :idUsuarioRegistra")
    , @NamedQuery(name = "PermisosLaborales.findByIdUsuarioSolicita", query = "SELECT p FROM PermisosLaborales p WHERE p.idUsuarioSolicita = :idUsuarioSolicita")})
public class PermisosLaborales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Size(max = 255)
    @Column(name = "estatus")
    private String estatus;
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
    @Column(name = "motivo")
    private String motivo;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "id_usuario_autoriza")
    private Integer idUsuarioAutoriza;
    @Column(name = "id_usuario_registra")
    private Integer idUsuarioRegistra;
    @Column(name = "id_usuario_solicita")
    private Integer idUsuarioSolicita;

    public PermisosLaborales() {
    }

    public PermisosLaborales(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public Integer getIdUsuarioAutoriza() {
        return idUsuarioAutoriza;
    }

    public void setIdUsuarioAutoriza(Integer idUsuarioAutoriza) {
        this.idUsuarioAutoriza = idUsuarioAutoriza;
    }

    public Integer getIdUsuarioRegistra() {
        return idUsuarioRegistra;
    }

    public void setIdUsuarioRegistra(Integer idUsuarioRegistra) {
        this.idUsuarioRegistra = idUsuarioRegistra;
    }

    public Integer getIdUsuarioSolicita() {
        return idUsuarioSolicita;
    }

    public void setIdUsuarioSolicita(Integer idUsuarioSolicita) {
        this.idUsuarioSolicita = idUsuarioSolicita;
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
        if (!(object instanceof PermisosLaborales)) {
            return false;
        }
        PermisosLaborales other = (PermisosLaborales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.PermisosLaborales[ id=" + id + " ]";
    }
    
}
