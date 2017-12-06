/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.solutics.arrow.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "catalogo_sucursales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoSucursales.findAll", query = "SELECT c FROM CatalogoSucursales c")
    , @NamedQuery(name = "CatalogoSucursales.findById", query = "SELECT c FROM CatalogoSucursales c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoSucursales.findByActivo", query = "SELECT c FROM CatalogoSucursales c WHERE c.activo = :activo")
    , @NamedQuery(name = "CatalogoSucursales.findByDescripcion", query = "SELECT c FROM CatalogoSucursales c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatalogoSucursales.findByNombre", query = "SELECT c FROM CatalogoSucursales c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoSucursales.findByTenant", query = "SELECT c FROM CatalogoSucursales c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoSucursales.findByFolio", query = "SELECT c FROM CatalogoSucursales c WHERE c.folio = :folio")
    , @NamedQuery(name = "CatalogoSucursales.findByLunesHoraInicio", query = "SELECT c FROM CatalogoSucursales c WHERE c.lunesHoraInicio = :lunesHoraInicio")
    , @NamedQuery(name = "CatalogoSucursales.findByLunesHoraFin", query = "SELECT c FROM CatalogoSucursales c WHERE c.lunesHoraFin = :lunesHoraFin")
    , @NamedQuery(name = "CatalogoSucursales.findByMartesHoraInicio", query = "SELECT c FROM CatalogoSucursales c WHERE c.martesHoraInicio = :martesHoraInicio")
    , @NamedQuery(name = "CatalogoSucursales.findByMartesHoraFin", query = "SELECT c FROM CatalogoSucursales c WHERE c.martesHoraFin = :martesHoraFin")
    , @NamedQuery(name = "CatalogoSucursales.findByMiercolesHoraInicio", query = "SELECT c FROM CatalogoSucursales c WHERE c.miercolesHoraInicio = :miercolesHoraInicio")
    , @NamedQuery(name = "CatalogoSucursales.findByMiercolesHoraFin", query = "SELECT c FROM CatalogoSucursales c WHERE c.miercolesHoraFin = :miercolesHoraFin")
    , @NamedQuery(name = "CatalogoSucursales.findByJuevesHoraInicio", query = "SELECT c FROM CatalogoSucursales c WHERE c.juevesHoraInicio = :juevesHoraInicio")
    , @NamedQuery(name = "CatalogoSucursales.findByJuevesHoraFin", query = "SELECT c FROM CatalogoSucursales c WHERE c.juevesHoraFin = :juevesHoraFin")
    , @NamedQuery(name = "CatalogoSucursales.findByViernesHoraInicio", query = "SELECT c FROM CatalogoSucursales c WHERE c.viernesHoraInicio = :viernesHoraInicio")
    , @NamedQuery(name = "CatalogoSucursales.findByViernesHoraFin", query = "SELECT c FROM CatalogoSucursales c WHERE c.viernesHoraFin = :viernesHoraFin")
    , @NamedQuery(name = "CatalogoSucursales.findBySabadoHoraInicio", query = "SELECT c FROM CatalogoSucursales c WHERE c.sabadoHoraInicio = :sabadoHoraInicio")
    , @NamedQuery(name = "CatalogoSucursales.findBySabadoHoraFin", query = "SELECT c FROM CatalogoSucursales c WHERE c.sabadoHoraFin = :sabadoHoraFin")
    , @NamedQuery(name = "CatalogoSucursales.findByDominfoHoraInicio", query = "SELECT c FROM CatalogoSucursales c WHERE c.dominfoHoraInicio = :dominfoHoraInicio")
    , @NamedQuery(name = "CatalogoSucursales.findByDominfoHoraFin", query = "SELECT c FROM CatalogoSucursales c WHERE c.dominfoHoraFin = :dominfoHoraFin")
    , @NamedQuery(name = "CatalogoSucursales.findByTelefono1", query = "SELECT c FROM CatalogoSucursales c WHERE c.telefono1 = :telefono1")
    , @NamedQuery(name = "CatalogoSucursales.findByTelefono2", query = "SELECT c FROM CatalogoSucursales c WHERE c.telefono2 = :telefono2")
    , @NamedQuery(name = "CatalogoSucursales.findByDireccion", query = "SELECT c FROM CatalogoSucursales c WHERE c.direccion = :direccion")
    , @NamedQuery(name = "CatalogoSucursales.findByFacebook", query = "SELECT c FROM CatalogoSucursales c WHERE c.facebook = :facebook")
    , @NamedQuery(name = "CatalogoSucursales.findByTwitter", query = "SELECT c FROM CatalogoSucursales c WHERE c.twitter = :twitter")
    , @NamedQuery(name = "CatalogoSucursales.findByInstagram", query = "SELECT c FROM CatalogoSucursales c WHERE c.instagram = :instagram")
    , @NamedQuery(name = "CatalogoSucursales.findByWhatsapp", query = "SELECT c FROM CatalogoSucursales c WHERE c.whatsapp = :whatsapp")
    , @NamedQuery(name = "CatalogoSucursales.findByYoutube", query = "SELECT c FROM CatalogoSucursales c WHERE c.youtube = :youtube")
    , @NamedQuery(name = "CatalogoSucursales.findByOtros", query = "SELECT c FROM CatalogoSucursales c WHERE c.otros = :otros")
    , @NamedQuery(name = "CatalogoSucursales.findByMontoLimite", query = "SELECT c FROM CatalogoSucursales c WHERE c.montoLimite = :montoLimite")
    , @NamedQuery(name = "CatalogoSucursales.findByIdClienteDefecto", query = "SELECT c FROM CatalogoSucursales c WHERE c.idClienteDefecto = :idClienteDefecto")})
public class CatalogoSucursales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "activo")
    private Boolean activo;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "folio")
    private Integer folio;
    @Column(name = "lunes_hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lunesHoraInicio;
    @Column(name = "lunes_hora_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lunesHoraFin;
    @Column(name = "martes_hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date martesHoraInicio;
    @Column(name = "martes_hora_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date martesHoraFin;
    @Column(name = "miercoles_hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date miercolesHoraInicio;
    @Column(name = "miercoles__hora_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date miercolesHoraFin;
    @Column(name = "jueves__hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date juevesHoraInicio;
    @Column(name = "jueves__hora_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date juevesHoraFin;
    @Column(name = "viernes_hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date viernesHoraInicio;
    @Column(name = "viernes__hora_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date viernesHoraFin;
    @Column(name = "sabado__hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sabadoHoraInicio;
    @Column(name = "sabado__hora_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sabadoHoraFin;
    @Column(name = "dominfo_hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dominfoHoraInicio;
    @Column(name = "dominfo_hora_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dominfoHoraFin;
    @Size(max = 256)
    @Column(name = "telefono1")
    private String telefono1;
    @Size(max = 256)
    @Column(name = "telefono2")
    private String telefono2;
    @Size(max = 256)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 512)
    @Column(name = "facebook")
    private String facebook;
    @Size(max = 512)
    @Column(name = "twitter")
    private String twitter;
    @Size(max = 512)
    @Column(name = "instagram")
    private String instagram;
    @Size(max = 512)
    @Column(name = "whatsapp")
    private String whatsapp;
    @Size(max = 512)
    @Column(name = "youtube")
    private String youtube;
    @Size(max = 512)
    @Column(name = "otros")
    private String otros;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto_limite")
    private BigDecimal montoLimite;
    @Column(name = "id_cliente_defecto")
    private Integer idClienteDefecto;

    public CatalogoSucursales() {
    }

    public CatalogoSucursales(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public Date getLunesHoraInicio() {
        return lunesHoraInicio;
    }

    public void setLunesHoraInicio(Date lunesHoraInicio) {
        this.lunesHoraInicio = lunesHoraInicio;
    }

    public Date getLunesHoraFin() {
        return lunesHoraFin;
    }

    public void setLunesHoraFin(Date lunesHoraFin) {
        this.lunesHoraFin = lunesHoraFin;
    }

    public Date getMartesHoraInicio() {
        return martesHoraInicio;
    }

    public void setMartesHoraInicio(Date martesHoraInicio) {
        this.martesHoraInicio = martesHoraInicio;
    }

    public Date getMartesHoraFin() {
        return martesHoraFin;
    }

    public void setMartesHoraFin(Date martesHoraFin) {
        this.martesHoraFin = martesHoraFin;
    }

    public Date getMiercolesHoraInicio() {
        return miercolesHoraInicio;
    }

    public void setMiercolesHoraInicio(Date miercolesHoraInicio) {
        this.miercolesHoraInicio = miercolesHoraInicio;
    }

    public Date getMiercolesHoraFin() {
        return miercolesHoraFin;
    }

    public void setMiercolesHoraFin(Date miercolesHoraFin) {
        this.miercolesHoraFin = miercolesHoraFin;
    }

    public Date getJuevesHoraInicio() {
        return juevesHoraInicio;
    }

    public void setJuevesHoraInicio(Date juevesHoraInicio) {
        this.juevesHoraInicio = juevesHoraInicio;
    }

    public Date getJuevesHoraFin() {
        return juevesHoraFin;
    }

    public void setJuevesHoraFin(Date juevesHoraFin) {
        this.juevesHoraFin = juevesHoraFin;
    }

    public Date getViernesHoraInicio() {
        return viernesHoraInicio;
    }

    public void setViernesHoraInicio(Date viernesHoraInicio) {
        this.viernesHoraInicio = viernesHoraInicio;
    }

    public Date getViernesHoraFin() {
        return viernesHoraFin;
    }

    public void setViernesHoraFin(Date viernesHoraFin) {
        this.viernesHoraFin = viernesHoraFin;
    }

    public Date getSabadoHoraInicio() {
        return sabadoHoraInicio;
    }

    public void setSabadoHoraInicio(Date sabadoHoraInicio) {
        this.sabadoHoraInicio = sabadoHoraInicio;
    }

    public Date getSabadoHoraFin() {
        return sabadoHoraFin;
    }

    public void setSabadoHoraFin(Date sabadoHoraFin) {
        this.sabadoHoraFin = sabadoHoraFin;
    }

    public Date getDominfoHoraInicio() {
        return dominfoHoraInicio;
    }

    public void setDominfoHoraInicio(Date dominfoHoraInicio) {
        this.dominfoHoraInicio = dominfoHoraInicio;
    }

    public Date getDominfoHoraFin() {
        return dominfoHoraFin;
    }

    public void setDominfoHoraFin(Date dominfoHoraFin) {
        this.dominfoHoraFin = dominfoHoraFin;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public BigDecimal getMontoLimite() {
        return montoLimite;
    }

    public void setMontoLimite(BigDecimal montoLimite) {
        this.montoLimite = montoLimite;
    }

    public Integer getIdClienteDefecto() {
        return idClienteDefecto;
    }

    public void setIdClienteDefecto(Integer idClienteDefecto) {
        this.idClienteDefecto = idClienteDefecto;
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
        if (!(object instanceof CatalogoSucursales)) {
            return false;
        }
        CatalogoSucursales other = (CatalogoSucursales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoSucursales[ id=" + id + " ]";
    }
    
}
