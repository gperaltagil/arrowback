/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.jpa;

import java.io.Serializable;
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
@Table(name = "catalogo_perfil_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoPerfilUsuario.findAll", query = "SELECT c FROM CatalogoPerfilUsuario c")
    , @NamedQuery(name = "CatalogoPerfilUsuario.findById", query = "SELECT c FROM CatalogoPerfilUsuario c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoPerfilUsuario.findByTenant", query = "SELECT c FROM CatalogoPerfilUsuario c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoPerfilUsuario.findByActivo", query = "SELECT c FROM CatalogoPerfilUsuario c WHERE c.activo = :activo")
    , @NamedQuery(name = "CatalogoPerfilUsuario.findByDescripcion", query = "SELECT c FROM CatalogoPerfilUsuario c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatalogoPerfilUsuario.findByPerfil", query = "SELECT c FROM CatalogoPerfilUsuario c WHERE c.perfil = :perfil")})
public class CatalogoPerfilUsuario implements Serializable {

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
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "perfil")
    private String perfil;

    public CatalogoPerfilUsuario() {
    }

    public CatalogoPerfilUsuario(Integer id) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
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
        if (!(object instanceof CatalogoPerfilUsuario)) {
            return false;
        }
        CatalogoPerfilUsuario other = (CatalogoPerfilUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoPerfilUsuario[ id=" + id + " ]";
    }
    
}
