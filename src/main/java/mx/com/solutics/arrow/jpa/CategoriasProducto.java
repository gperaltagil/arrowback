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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "categorias_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriasProducto.findAll", query = "SELECT c FROM CategoriasProducto c")
    , @NamedQuery(name = "CategoriasProducto.findById", query = "SELECT c FROM CategoriasProducto c WHERE c.id = :id")
    , @NamedQuery(name = "CategoriasProducto.findByNombre", query = "SELECT c FROM CategoriasProducto c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CategoriasProducto.findByEstatus", query = "SELECT c FROM CategoriasProducto c WHERE c.estatus = :estatus")
    , @NamedQuery(name = "CategoriasProducto.findByIdProducto", query = "SELECT c FROM CategoriasProducto c WHERE c.idProducto = :idProducto")
    , @NamedQuery(name = "CategoriasProducto.findByTenant", query = "SELECT c FROM CategoriasProducto c WHERE c.tenant = :tenant")})
public class CategoriasProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 256)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 256)
    @Column(name = "estatus")
    private String estatus;
    @Column(name = "id_producto")
    private Integer idProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;

    public CategoriasProducto() {
    }

    public CategoriasProducto(Integer id) {
        this.id = id;
    }

    public CategoriasProducto(Integer id, int tenant) {
        this.id = id;
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
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
        if (!(object instanceof CategoriasProducto)) {
            return false;
        }
        CategoriasProducto other = (CategoriasProducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CategoriasProducto[ id=" + id + " ]";
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "categorias_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriasProducto.findAll", query = "SELECT c FROM CategoriasProducto c")
    , @NamedQuery(name = "CategoriasProducto.findById", query = "SELECT c FROM CategoriasProducto c WHERE c.id = :id")
    , @NamedQuery(name = "CategoriasProducto.findByNombre", query = "SELECT c FROM CategoriasProducto c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CategoriasProducto.findByEstatus", query = "SELECT c FROM CategoriasProducto c WHERE c.estatus = :estatus")
    , @NamedQuery(name = "CategoriasProducto.findByIdProducto", query = "SELECT c FROM CategoriasProducto c WHERE c.idProducto = :idProducto")
    , @NamedQuery(name = "CategoriasProducto.findByTenant", query = "SELECT c FROM CategoriasProducto c WHERE c.tenant = :tenant")})
public class CategoriasProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 256)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 256)
    @Column(name = "estatus")
    private String estatus;
    @Column(name = "id_producto")
    private Integer idProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;

    public CategoriasProducto() {
    }

    public CategoriasProducto(Integer id) {
        this.id = id;
    }

    public CategoriasProducto(Integer id, int tenant) {
        this.id = id;
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
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
        if (!(object instanceof CategoriasProducto)) {
            return false;
        }
        CategoriasProducto other = (CategoriasProducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CategoriasProducto[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
