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
import javax.persistence.Lob;
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
@Table(name = "catalogo_proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoProveedores.findAll", query = "SELECT c FROM CatalogoProveedores c")
    , @NamedQuery(name = "CatalogoProveedores.findById", query = "SELECT c FROM CatalogoProveedores c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoProveedores.findByDescripcion", query = "SELECT c FROM CatalogoProveedores c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatalogoProveedores.findByNombre", query = "SELECT c FROM CatalogoProveedores c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoProveedores.findByTenant", query = "SELECT c FROM CatalogoProveedores c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoProveedores.findByUsuarioRegistra", query = "SELECT c FROM CatalogoProveedores c WHERE c.usuarioRegistra = :usuarioRegistra")
    , @NamedQuery(name = "CatalogoProveedores.findByFechaRegistro", query = "SELECT c FROM CatalogoProveedores c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CatalogoProveedores.findByTelefono1", query = "SELECT c FROM CatalogoProveedores c WHERE c.telefono1 = :telefono1")
    , @NamedQuery(name = "CatalogoProveedores.findByDireccion1", query = "SELECT c FROM CatalogoProveedores c WHERE c.direccion1 = :direccion1")
    , @NamedQuery(name = "CatalogoProveedores.findByTelefono2", query = "SELECT c FROM CatalogoProveedores c WHERE c.telefono2 = :telefono2")
    , @NamedQuery(name = "CatalogoProveedores.findByDireccion2", query = "SELECT c FROM CatalogoProveedores c WHERE c.direccion2 = :direccion2")
    , @NamedQuery(name = "CatalogoProveedores.findByEliminado", query = "SELECT c FROM CatalogoProveedores c WHERE c.eliminado = :eliminado")})
public class CatalogoProveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "usuario_registra")
    private Integer usuarioRegistra;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Size(max = 256)
    @Column(name = "telefono1")
    private String telefono1;
    @Size(max = 256)
    @Column(name = "direccion1")
    private String direccion1;
    @Size(max = 256)
    @Column(name = "telefono2")
    private String telefono2;
    @Size(max = 256)
    @Column(name = "direccion2")
    private String direccion2;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Lob
    @Size(max = 65535)
    @Column(name = "nombre_contacto")
    private String nombreContacto;
    @Lob
    @Size(max = 65535)
    @Column(name = "correo1")
    private String correo1;
    @Lob
    @Size(max = 65535)
    @Column(name = "correo2")
    private String correo2;
    @Lob
    @Size(max = 65535)
    @Column(name = "notas")
    private String notas;

    public CatalogoProveedores() {
    }

    public CatalogoProveedores(Integer id) {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
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

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getCorreo1() {
        return correo1;
    }

    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }

    public String getCorreo2() {
        return correo2;
    }

    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
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
        if (!(object instanceof CatalogoProveedores)) {
            return false;
        }
        CatalogoProveedores other = (CatalogoProveedores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoProveedores[ id=" + id + " ]";
    }
    
}
