/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow_config.jpa;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "credenciales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Credenciales.findAll", query = "SELECT c FROM Credenciales c")
    , @NamedQuery(name = "Credenciales.findById", query = "SELECT c FROM Credenciales c WHERE c.id = :id")
    , @NamedQuery(name = "Credenciales.findByCorreoElectronico", query = "SELECT c FROM Credenciales c WHERE c.correoElectronico = :correoElectronico")
    , @NamedQuery(name = "Credenciales.findByUsuario", query = "SELECT c FROM Credenciales c WHERE c.usuario = :usuario")
    , @NamedQuery(name = "Credenciales.findByTenant", query = "SELECT c FROM Credenciales c WHERE c.tenant = :tenant")})
public class Credenciales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "contrasena")
    private byte[] contrasena;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario")
    private int usuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "sal_contrasena")
    private byte[] salContrasena;
    @Lob
    @Column(name = "sal_token")
    private byte[] salToken;
    @Lob
    @Column(name = "token")
    private byte[] token;

    public Credenciales() {
    }

    public Credenciales(Integer id) {
        this.id = id;
    }

    public Credenciales(Integer id, String correoElectronico, byte[] contrasena, int usuario, int tenant, byte[] salContrasena) {
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.usuario = usuario;
        this.tenant = tenant;
        this.salContrasena = salContrasena;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public byte[] getContrasena() {
        return contrasena;
    }

    public void setContrasena(byte[] contrasena) {
        this.contrasena = contrasena;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
    }

    public byte[] getSalContrasena() {
        return salContrasena;
    }

    public void setSalContrasena(byte[] salContrasena) {
        this.salContrasena = salContrasena;
    }

    public byte[] getSalToken() {
        return salToken;
    }

    public void setSalToken(byte[] salToken) {
        this.salToken = salToken;
    }

    public byte[] getToken() {
        return token;
    }

    public void setToken(byte[] token) {
        this.token = token;
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
        if (!(object instanceof Credenciales)) {
            return false;
        }
        Credenciales other = (Credenciales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow_config.jpa.Credenciales[ id=" + id + " ]";
    }
    
}
