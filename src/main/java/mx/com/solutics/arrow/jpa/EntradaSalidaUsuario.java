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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "entrada_salida_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EntradaSalidaUsuario.findAll", query = "SELECT e FROM EntradaSalidaUsuario e")
    , @NamedQuery(name = "EntradaSalidaUsuario.findById", query = "SELECT e FROM EntradaSalidaUsuario e WHERE e.id = :id")
    , @NamedQuery(name = "EntradaSalidaUsuario.findByEvento1", query = "SELECT e FROM EntradaSalidaUsuario e WHERE e.evento1 = :evento1")
    , @NamedQuery(name = "EntradaSalidaUsuario.findByEvento2", query = "SELECT e FROM EntradaSalidaUsuario e WHERE e.evento2 = :evento2")
    , @NamedQuery(name = "EntradaSalidaUsuario.findByTenant", query = "SELECT e FROM EntradaSalidaUsuario e WHERE e.tenant = :tenant")
    , @NamedQuery(name = "EntradaSalidaUsuario.findByCatalogoUsuarioId", query = "SELECT e FROM EntradaSalidaUsuario e WHERE e.catalogoUsuarioId = :catalogoUsuarioId")
    , @NamedQuery(name = "EntradaSalidaUsuario.findByEvento3", query = "SELECT e FROM EntradaSalidaUsuario e WHERE e.evento3 = :evento3")
    , @NamedQuery(name = "EntradaSalidaUsuario.findByEvento4", query = "SELECT e FROM EntradaSalidaUsuario e WHERE e.evento4 = :evento4")})
public class EntradaSalidaUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "evento1")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evento1;
    @Column(name = "evento2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evento2;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "catalogo_usuario_id")
    private Integer catalogoUsuarioId;
    @Column(name = "evento3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evento3;
    @Column(name = "evento4")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evento4;

    public EntradaSalidaUsuario() {
    }

    public EntradaSalidaUsuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEvento1() {
        return evento1;
    }

    public void setEvento1(Date evento1) {
        this.evento1 = evento1;
    }

    public Date getEvento2() {
        return evento2;
    }

    public void setEvento2(Date evento2) {
        this.evento2 = evento2;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public Integer getCatalogoUsuarioId() {
        return catalogoUsuarioId;
    }

    public void setCatalogoUsuarioId(Integer catalogoUsuarioId) {
        this.catalogoUsuarioId = catalogoUsuarioId;
    }

    public Date getEvento3() {
        return evento3;
    }

    public void setEvento3(Date evento3) {
        this.evento3 = evento3;
    }

    public Date getEvento4() {
        return evento4;
    }

    public void setEvento4(Date evento4) {
        this.evento4 = evento4;
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
        if (!(object instanceof EntradaSalidaUsuario)) {
            return false;
        }
        EntradaSalidaUsuario other = (EntradaSalidaUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.EntradaSalidaUsuario[ id=" + id + " ]";
    }
    
}
