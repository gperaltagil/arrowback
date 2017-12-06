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
@Table(name = "configuracion_informacion_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracionInformacionEmpresa.findAll", query = "SELECT c FROM ConfiguracionInformacionEmpresa c")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findById", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.id = :id")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByNombreEmpresa", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.nombreEmpresa = :nombreEmpresa")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByDireccionEmpresa", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.direccionEmpresa = :direccionEmpresa")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByTenant", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByFacebook", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.facebook = :facebook")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByInstagram", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.instagram = :instagram")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByTelefono", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByTwitter", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.twitter = :twitter")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByWhatsapp", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.whatsapp = :whatsapp")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByRfc", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.rfc = :rfc")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByNombre", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByIdCfdiRegimenFiscal", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.idCfdiRegimenFiscal = :idCfdiRegimenFiscal")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByCodigoPostal", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByCp", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.cp = :cp")})
public class ConfiguracionInformacionEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 512)
    @Column(name = "direccion_empresa")
    private String direccionEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Size(max = 75)
    @Column(name = "facebook")
    private String facebook;
    @Size(max = 75)
    @Column(name = "instagram")
    private String instagram;
    @Size(max = 75)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 75)
    @Column(name = "twitter")
    private String twitter;
    @Size(max = 75)
    @Column(name = "whatsapp")
    private String whatsapp;
    @Size(max = 250)
    @Column(name = "rfc")
    private String rfc;
    @Size(max = 250)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "id_cfdi_regimen_fiscal")
    private Integer idCfdiRegimenFiscal;
    @Column(name = "codigo_postal")
    private Integer codigoPostal;
    @Size(max = 10)
    @Column(name = "cp")
    private String cp;

    public ConfiguracionInformacionEmpresa() {
    }

    public ConfiguracionInformacionEmpresa(Integer id) {
        this.id = id;
    }

    public ConfiguracionInformacionEmpresa(Integer id, String nombreEmpresa, String direccionEmpresa, int tenant) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCfdiRegimenFiscal() {
        return idCfdiRegimenFiscal;
    }

    public void setIdCfdiRegimenFiscal(Integer idCfdiRegimenFiscal) {
        this.idCfdiRegimenFiscal = idCfdiRegimenFiscal;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
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
        if (!(object instanceof ConfiguracionInformacionEmpresa)) {
            return false;
        }
        ConfiguracionInformacionEmpresa other = (ConfiguracionInformacionEmpresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.ConfiguracionInformacionEmpresa[ id=" + id + " ]";
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
@Table(name = "configuracion_informacion_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracionInformacionEmpresa.findAll", query = "SELECT c FROM ConfiguracionInformacionEmpresa c")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findById", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.id = :id")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByNombreEmpresa", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.nombreEmpresa = :nombreEmpresa")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByDireccionEmpresa", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.direccionEmpresa = :direccionEmpresa")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByTenant", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByFacebook", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.facebook = :facebook")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByInstagram", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.instagram = :instagram")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByTelefono", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByTwitter", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.twitter = :twitter")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByWhatsapp", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.whatsapp = :whatsapp")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByRfc", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.rfc = :rfc")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByNombre", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByIdCfdiRegimenFiscal", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.idCfdiRegimenFiscal = :idCfdiRegimenFiscal")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByCodigoPostal", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "ConfiguracionInformacionEmpresa.findByCp", query = "SELECT c FROM ConfiguracionInformacionEmpresa c WHERE c.cp = :cp")})
public class ConfiguracionInformacionEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 512)
    @Column(name = "direccion_empresa")
    private String direccionEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Size(max = 75)
    @Column(name = "facebook")
    private String facebook;
    @Size(max = 75)
    @Column(name = "instagram")
    private String instagram;
    @Size(max = 75)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 75)
    @Column(name = "twitter")
    private String twitter;
    @Size(max = 75)
    @Column(name = "whatsapp")
    private String whatsapp;
    @Size(max = 250)
    @Column(name = "rfc")
    private String rfc;
    @Size(max = 250)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "id_cfdi_regimen_fiscal")
    private Integer idCfdiRegimenFiscal;
    @Column(name = "codigo_postal")
    private Integer codigoPostal;
    @Size(max = 10)
    @Column(name = "cp")
    private String cp;

    public ConfiguracionInformacionEmpresa() {
    }

    public ConfiguracionInformacionEmpresa(Integer id) {
        this.id = id;
    }

    public ConfiguracionInformacionEmpresa(Integer id, String nombreEmpresa, String direccionEmpresa, int tenant) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCfdiRegimenFiscal() {
        return idCfdiRegimenFiscal;
    }

    public void setIdCfdiRegimenFiscal(Integer idCfdiRegimenFiscal) {
        this.idCfdiRegimenFiscal = idCfdiRegimenFiscal;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
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
        if (!(object instanceof ConfiguracionInformacionEmpresa)) {
            return false;
        }
        ConfiguracionInformacionEmpresa other = (ConfiguracionInformacionEmpresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.ConfiguracionInformacionEmpresa[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
