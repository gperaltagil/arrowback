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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "catalogo_vehiculos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoVehiculos.findAll", query = "SELECT c FROM CatalogoVehiculos c")
    , @NamedQuery(name = "CatalogoVehiculos.findById", query = "SELECT c FROM CatalogoVehiculos c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoVehiculos.findByNotas", query = "SELECT c FROM CatalogoVehiculos c WHERE c.notas = :notas")
    , @NamedQuery(name = "CatalogoVehiculos.findByEliminado", query = "SELECT c FROM CatalogoVehiculos c WHERE c.eliminado = :eliminado")
    , @NamedQuery(name = "CatalogoVehiculos.findByFechaRegistro", query = "SELECT c FROM CatalogoVehiculos c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CatalogoVehiculos.findByNombre", query = "SELECT c FROM CatalogoVehiculos c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoVehiculos.findByModelo", query = "SELECT c FROM CatalogoVehiculos c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "CatalogoVehiculos.findByTenant", query = "SELECT c FROM CatalogoVehiculos c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoVehiculos.findByVin", query = "SELECT c FROM CatalogoVehiculos c WHERE c.vin = :vin")
    , @NamedQuery(name = "CatalogoVehiculos.findByColor", query = "SELECT c FROM CatalogoVehiculos c WHERE c.color = :color")})
public class CatalogoVehiculos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "notas")
    private String notas;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 128)
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "tenant")
    private Integer tenant;
    @Size(max = 256)
    @Column(name = "vin")
    private String vin;
    @Size(max = 256)
    @Column(name = "color")
    private String color;

    public CatalogoVehiculos() {
    }

    public CatalogoVehiculos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        if (!(object instanceof CatalogoVehiculos)) {
            return false;
        }
        CatalogoVehiculos other = (CatalogoVehiculos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoVehiculos[ id=" + id + " ]";
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "catalogo_vehiculos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoVehiculos.findAll", query = "SELECT c FROM CatalogoVehiculos c")
    , @NamedQuery(name = "CatalogoVehiculos.findById", query = "SELECT c FROM CatalogoVehiculos c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoVehiculos.findByNotas", query = "SELECT c FROM CatalogoVehiculos c WHERE c.notas = :notas")
    , @NamedQuery(name = "CatalogoVehiculos.findByEliminado", query = "SELECT c FROM CatalogoVehiculos c WHERE c.eliminado = :eliminado")
    , @NamedQuery(name = "CatalogoVehiculos.findByFechaRegistro", query = "SELECT c FROM CatalogoVehiculos c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CatalogoVehiculos.findByNombre", query = "SELECT c FROM CatalogoVehiculos c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoVehiculos.findByModelo", query = "SELECT c FROM CatalogoVehiculos c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "CatalogoVehiculos.findByTenant", query = "SELECT c FROM CatalogoVehiculos c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoVehiculos.findByVin", query = "SELECT c FROM CatalogoVehiculos c WHERE c.vin = :vin")
    , @NamedQuery(name = "CatalogoVehiculos.findByColor", query = "SELECT c FROM CatalogoVehiculos c WHERE c.color = :color")})
public class CatalogoVehiculos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "notas")
    private String notas;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 128)
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "tenant")
    private Integer tenant;
    @Size(max = 256)
    @Column(name = "vin")
    private String vin;
    @Size(max = 256)
    @Column(name = "color")
    private String color;

    public CatalogoVehiculos() {
    }

    public CatalogoVehiculos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        if (!(object instanceof CatalogoVehiculos)) {
            return false;
        }
        CatalogoVehiculos other = (CatalogoVehiculos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoVehiculos[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
