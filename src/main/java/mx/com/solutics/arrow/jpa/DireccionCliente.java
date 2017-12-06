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
@Table(name = "direccion_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DireccionCliente.findAll", query = "SELECT d FROM DireccionCliente d")
    , @NamedQuery(name = "DireccionCliente.findById", query = "SELECT d FROM DireccionCliente d WHERE d.id = :id")
    , @NamedQuery(name = "DireccionCliente.findByCalle", query = "SELECT d FROM DireccionCliente d WHERE d.calle = :calle")
    , @NamedQuery(name = "DireccionCliente.findByCiudad", query = "SELECT d FROM DireccionCliente d WHERE d.ciudad = :ciudad")
    , @NamedQuery(name = "DireccionCliente.findByColonia", query = "SELECT d FROM DireccionCliente d WHERE d.colonia = :colonia")
    , @NamedQuery(name = "DireccionCliente.findByCp", query = "SELECT d FROM DireccionCliente d WHERE d.cp = :cp")
    , @NamedQuery(name = "DireccionCliente.findByEliminado", query = "SELECT d FROM DireccionCliente d WHERE d.eliminado = :eliminado")
    , @NamedQuery(name = "DireccionCliente.findByEstado", query = "SELECT d FROM DireccionCliente d WHERE d.estado = :estado")
    , @NamedQuery(name = "DireccionCliente.findByFechaRegistro", query = "SELECT d FROM DireccionCliente d WHERE d.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "DireccionCliente.findByMunicipio", query = "SELECT d FROM DireccionCliente d WHERE d.municipio = :municipio")
    , @NamedQuery(name = "DireccionCliente.findByNumExterior", query = "SELECT d FROM DireccionCliente d WHERE d.numExterior = :numExterior")
    , @NamedQuery(name = "DireccionCliente.findByNumInterior", query = "SELECT d FROM DireccionCliente d WHERE d.numInterior = :numInterior")
    , @NamedQuery(name = "DireccionCliente.findByPais", query = "SELECT d FROM DireccionCliente d WHERE d.pais = :pais")
    , @NamedQuery(name = "DireccionCliente.findByTenant", query = "SELECT d FROM DireccionCliente d WHERE d.tenant = :tenant")
    , @NamedQuery(name = "DireccionCliente.findByCatalogoClienteId", query = "SELECT d FROM DireccionCliente d WHERE d.catalogoClienteId = :catalogoClienteId")
    , @NamedQuery(name = "DireccionCliente.findByUltimaSucursal", query = "SELECT d FROM DireccionCliente d WHERE d.ultimaSucursal = :ultimaSucursal")})
public class DireccionCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "calle")
    private String calle;
    @Size(max = 255)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 255)
    @Column(name = "colonia")
    private String colonia;
    @Size(max = 255)
    @Column(name = "cp")
    private String cp;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Size(max = 255)
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Size(max = 255)
    @Column(name = "municipio")
    private String municipio;
    @Size(max = 255)
    @Column(name = "num_exterior")
    private String numExterior;
    @Size(max = 255)
    @Column(name = "num_interior")
    private String numInterior;
    @Size(max = 255)
    @Column(name = "pais")
    private String pais;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "catalogo_cliente_id")
    private Integer catalogoClienteId;
    @Column(name = "ultima_sucursal")
    private Integer ultimaSucursal;

    public DireccionCliente() {
    }

    public DireccionCliente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    public String getNumInterior() {
        return numInterior;
    }

    public void setNumInterior(String numInterior) {
        this.numInterior = numInterior;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public Integer getCatalogoClienteId() {
        return catalogoClienteId;
    }

    public void setCatalogoClienteId(Integer catalogoClienteId) {
        this.catalogoClienteId = catalogoClienteId;
    }

    public Integer getUltimaSucursal() {
        return ultimaSucursal;
    }

    public void setUltimaSucursal(Integer ultimaSucursal) {
        this.ultimaSucursal = ultimaSucursal;
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
        if (!(object instanceof DireccionCliente)) {
            return false;
        }
        DireccionCliente other = (DireccionCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.DireccionCliente[ id=" + id + " ]";
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
@Table(name = "direccion_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DireccionCliente.findAll", query = "SELECT d FROM DireccionCliente d")
    , @NamedQuery(name = "DireccionCliente.findById", query = "SELECT d FROM DireccionCliente d WHERE d.id = :id")
    , @NamedQuery(name = "DireccionCliente.findByCalle", query = "SELECT d FROM DireccionCliente d WHERE d.calle = :calle")
    , @NamedQuery(name = "DireccionCliente.findByCiudad", query = "SELECT d FROM DireccionCliente d WHERE d.ciudad = :ciudad")
    , @NamedQuery(name = "DireccionCliente.findByColonia", query = "SELECT d FROM DireccionCliente d WHERE d.colonia = :colonia")
    , @NamedQuery(name = "DireccionCliente.findByCp", query = "SELECT d FROM DireccionCliente d WHERE d.cp = :cp")
    , @NamedQuery(name = "DireccionCliente.findByEliminado", query = "SELECT d FROM DireccionCliente d WHERE d.eliminado = :eliminado")
    , @NamedQuery(name = "DireccionCliente.findByEstado", query = "SELECT d FROM DireccionCliente d WHERE d.estado = :estado")
    , @NamedQuery(name = "DireccionCliente.findByFechaRegistro", query = "SELECT d FROM DireccionCliente d WHERE d.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "DireccionCliente.findByMunicipio", query = "SELECT d FROM DireccionCliente d WHERE d.municipio = :municipio")
    , @NamedQuery(name = "DireccionCliente.findByNumExterior", query = "SELECT d FROM DireccionCliente d WHERE d.numExterior = :numExterior")
    , @NamedQuery(name = "DireccionCliente.findByNumInterior", query = "SELECT d FROM DireccionCliente d WHERE d.numInterior = :numInterior")
    , @NamedQuery(name = "DireccionCliente.findByPais", query = "SELECT d FROM DireccionCliente d WHERE d.pais = :pais")
    , @NamedQuery(name = "DireccionCliente.findByTenant", query = "SELECT d FROM DireccionCliente d WHERE d.tenant = :tenant")
    , @NamedQuery(name = "DireccionCliente.findByCatalogoClienteId", query = "SELECT d FROM DireccionCliente d WHERE d.catalogoClienteId = :catalogoClienteId")
    , @NamedQuery(name = "DireccionCliente.findByUltimaSucursal", query = "SELECT d FROM DireccionCliente d WHERE d.ultimaSucursal = :ultimaSucursal")})
public class DireccionCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "calle")
    private String calle;
    @Size(max = 255)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 255)
    @Column(name = "colonia")
    private String colonia;
    @Size(max = 255)
    @Column(name = "cp")
    private String cp;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Size(max = 255)
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Size(max = 255)
    @Column(name = "municipio")
    private String municipio;
    @Size(max = 255)
    @Column(name = "num_exterior")
    private String numExterior;
    @Size(max = 255)
    @Column(name = "num_interior")
    private String numInterior;
    @Size(max = 255)
    @Column(name = "pais")
    private String pais;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "catalogo_cliente_id")
    private Integer catalogoClienteId;
    @Column(name = "ultima_sucursal")
    private Integer ultimaSucursal;

    public DireccionCliente() {
    }

    public DireccionCliente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    public String getNumInterior() {
        return numInterior;
    }

    public void setNumInterior(String numInterior) {
        this.numInterior = numInterior;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public Integer getCatalogoClienteId() {
        return catalogoClienteId;
    }

    public void setCatalogoClienteId(Integer catalogoClienteId) {
        this.catalogoClienteId = catalogoClienteId;
    }

    public Integer getUltimaSucursal() {
        return ultimaSucursal;
    }

    public void setUltimaSucursal(Integer ultimaSucursal) {
        this.ultimaSucursal = ultimaSucursal;
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
        if (!(object instanceof DireccionCliente)) {
            return false;
        }
        DireccionCliente other = (DireccionCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.DireccionCliente[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
