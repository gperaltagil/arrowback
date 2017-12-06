<<<<<<< HEAD
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "usuario_sucursal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioSucursal.findAll", query = "SELECT u FROM UsuarioSucursal u")
    , @NamedQuery(name = "UsuarioSucursal.findById", query = "SELECT u FROM UsuarioSucursal u WHERE u.id = :id")
    , @NamedQuery(name = "UsuarioSucursal.findByTenant", query = "SELECT u FROM UsuarioSucursal u WHERE u.tenant = :tenant")
    , @NamedQuery(name = "UsuarioSucursal.findBySucursal", query = "SELECT u FROM UsuarioSucursal u WHERE u.sucursal = :sucursal")
    , @NamedQuery(name = "UsuarioSucursal.findByUsuario", query = "SELECT u FROM UsuarioSucursal u WHERE u.usuario = :usuario")
    , @NamedQuery(name = "UsuarioSucursal.findByEliminado", query = "SELECT u FROM UsuarioSucursal u WHERE u.eliminado = :eliminado")})
public class UsuarioSucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "sucursal")
    private Integer sucursal;
    @Column(name = "usuario")
    private Integer usuario;
    @Column(name = "eliminado")
    private Boolean eliminado;

    public UsuarioSucursal() {
    }

    public UsuarioSucursal(Integer id) {
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

    public Integer getSucursal() {
        return sucursal;
    }

    public void setSucursal(Integer sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
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
        if (!(object instanceof UsuarioSucursal)) {
            return false;
        }
        UsuarioSucursal other = (UsuarioSucursal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.UsuarioSucursal[ id=" + id + " ]";
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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "usuario_sucursal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioSucursal.findAll", query = "SELECT u FROM UsuarioSucursal u")
    , @NamedQuery(name = "UsuarioSucursal.findById", query = "SELECT u FROM UsuarioSucursal u WHERE u.id = :id")
    , @NamedQuery(name = "UsuarioSucursal.findByTenant", query = "SELECT u FROM UsuarioSucursal u WHERE u.tenant = :tenant")
    , @NamedQuery(name = "UsuarioSucursal.findBySucursal", query = "SELECT u FROM UsuarioSucursal u WHERE u.sucursal = :sucursal")
    , @NamedQuery(name = "UsuarioSucursal.findByUsuario", query = "SELECT u FROM UsuarioSucursal u WHERE u.usuario = :usuario")
    , @NamedQuery(name = "UsuarioSucursal.findByEliminado", query = "SELECT u FROM UsuarioSucursal u WHERE u.eliminado = :eliminado")})
public class UsuarioSucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "sucursal")
    private Integer sucursal;
    @Column(name = "usuario")
    private Integer usuario;
    @Column(name = "eliminado")
    private Boolean eliminado;

    public UsuarioSucursal() {
    }

    public UsuarioSucursal(Integer id) {
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

    public Integer getSucursal() {
        return sucursal;
    }

    public void setSucursal(Integer sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
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
        if (!(object instanceof UsuarioSucursal)) {
            return false;
        }
        UsuarioSucursal other = (UsuarioSucursal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.UsuarioSucursal[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
