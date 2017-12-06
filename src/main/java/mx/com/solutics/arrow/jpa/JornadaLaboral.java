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
@Table(name = "jornada_laboral")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JornadaLaboral.findAll", query = "SELECT j FROM JornadaLaboral j")
    , @NamedQuery(name = "JornadaLaboral.findById", query = "SELECT j FROM JornadaLaboral j WHERE j.id = :id")
    , @NamedQuery(name = "JornadaLaboral.findByDia", query = "SELECT j FROM JornadaLaboral j WHERE j.dia = :dia")
    , @NamedQuery(name = "JornadaLaboral.findByHoraInicio", query = "SELECT j FROM JornadaLaboral j WHERE j.horaInicio = :horaInicio")
    , @NamedQuery(name = "JornadaLaboral.findByHoraFin", query = "SELECT j FROM JornadaLaboral j WHERE j.horaFin = :horaFin")
    , @NamedQuery(name = "JornadaLaboral.findByEstatus", query = "SELECT j FROM JornadaLaboral j WHERE j.estatus = :estatus")
    , @NamedQuery(name = "JornadaLaboral.findByTenant", query = "SELECT j FROM JornadaLaboral j WHERE j.tenant = :tenant")
    , @NamedQuery(name = "JornadaLaboral.findByCatalogoUsuarioId", query = "SELECT j FROM JornadaLaboral j WHERE j.catalogoUsuarioId = :catalogoUsuarioId")})
public class JornadaLaboral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 9)
    @Column(name = "dia")
    private String dia;
    @Column(name = "hora_inicio")
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    @Column(name = "hora_fin")
    @Temporal(TemporalType.TIME)
    private Date horaFin;
    @Size(max = 8)
    @Column(name = "estatus")
    private String estatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catalogo_usuario_id")
    private int catalogoUsuarioId;

    public JornadaLaboral() {
    }

    public JornadaLaboral(Integer id) {
        this.id = id;
    }

    public JornadaLaboral(Integer id, int tenant, int catalogoUsuarioId) {
        this.id = id;
        this.tenant = tenant;
        this.catalogoUsuarioId = catalogoUsuarioId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
    }

    public int getCatalogoUsuarioId() {
        return catalogoUsuarioId;
    }

    public void setCatalogoUsuarioId(int catalogoUsuarioId) {
        this.catalogoUsuarioId = catalogoUsuarioId;
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
        if (!(object instanceof JornadaLaboral)) {
            return false;
        }
        JornadaLaboral other = (JornadaLaboral) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.JornadaLaboral[ id=" + id + " ]";
    }
    
}
