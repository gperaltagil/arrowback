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
@Table(name = "catalogo_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoCliente.findAll", query = "SELECT c FROM CatalogoCliente c")
    , @NamedQuery(name = "CatalogoCliente.findById", query = "SELECT c FROM CatalogoCliente c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoCliente.findByActivo", query = "SELECT c FROM CatalogoCliente c WHERE c.activo = :activo")
    , @NamedQuery(name = "CatalogoCliente.findByApellidoMaterno", query = "SELECT c FROM CatalogoCliente c WHERE c.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "CatalogoCliente.findByApellidoPaterno", query = "SELECT c FROM CatalogoCliente c WHERE c.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "CatalogoCliente.findByContrasena", query = "SELECT c FROM CatalogoCliente c WHERE c.contrasena = :contrasena")
    , @NamedQuery(name = "CatalogoCliente.findByCorreoElectronico", query = "SELECT c FROM CatalogoCliente c WHERE c.correoElectronico = :correoElectronico")
    , @NamedQuery(name = "CatalogoCliente.findByEliminado", query = "SELECT c FROM CatalogoCliente c WHERE c.eliminado = :eliminado")
    , @NamedQuery(name = "CatalogoCliente.findByFechaNacimiento", query = "SELECT c FROM CatalogoCliente c WHERE c.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "CatalogoCliente.findByFechaRegistro", query = "SELECT c FROM CatalogoCliente c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CatalogoCliente.findByLimiteCredito", query = "SELECT c FROM CatalogoCliente c WHERE c.limiteCredito = :limiteCredito")
    , @NamedQuery(name = "CatalogoCliente.findByLineaCredito", query = "SELECT c FROM CatalogoCliente c WHERE c.lineaCredito = :lineaCredito")
    , @NamedQuery(name = "CatalogoCliente.findByNombre", query = "SELECT c FROM CatalogoCliente c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoCliente.findByTelefonoCasa", query = "SELECT c FROM CatalogoCliente c WHERE c.telefonoCasa = :telefonoCasa")
    , @NamedQuery(name = "CatalogoCliente.findByTelefonoCelular", query = "SELECT c FROM CatalogoCliente c WHERE c.telefonoCelular = :telefonoCelular")
    , @NamedQuery(name = "CatalogoCliente.findByTenant", query = "SELECT c FROM CatalogoCliente c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoCliente.findByUsuario", query = "SELECT c FROM CatalogoCliente c WHERE c.usuario = :usuario")
    , @NamedQuery(name = "CatalogoCliente.findByFacebook", query = "SELECT c FROM CatalogoCliente c WHERE c.facebook = :facebook")
    , @NamedQuery(name = "CatalogoCliente.findByTwitter", query = "SELECT c FROM CatalogoCliente c WHERE c.twitter = :twitter")
    , @NamedQuery(name = "CatalogoCliente.findByInstagram", query = "SELECT c FROM CatalogoCliente c WHERE c.instagram = :instagram")
    , @NamedQuery(name = "CatalogoCliente.findByWhatsapp", query = "SELECT c FROM CatalogoCliente c WHERE c.whatsapp = :whatsapp")
    , @NamedQuery(name = "CatalogoCliente.findByYoutube", query = "SELECT c FROM CatalogoCliente c WHERE c.youtube = :youtube")
    , @NamedQuery(name = "CatalogoCliente.findByOtros", query = "SELECT c FROM CatalogoCliente c WHERE c.otros = :otros")
    , @NamedQuery(name = "CatalogoCliente.findByUltimaSucursal", query = "SELECT c FROM CatalogoCliente c WHERE c.ultimaSucursal = :ultimaSucursal")
    , @NamedQuery(name = "CatalogoCliente.findByPublicidadEnterado", query = "SELECT c FROM CatalogoCliente c WHERE c.publicidadEnterado = :publicidadEnterado")
    , @NamedQuery(name = "CatalogoCliente.findByPrecio", query = "SELECT c FROM CatalogoCliente c WHERE c.precio = :precio")
    , @NamedQuery(name = "CatalogoCliente.findByLatitud", query = "SELECT c FROM CatalogoCliente c WHERE c.latitud = :latitud")
    , @NamedQuery(name = "CatalogoCliente.findByLongitud", query = "SELECT c FROM CatalogoCliente c WHERE c.longitud = :longitud")})
public class CatalogoCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "activo")
    private Boolean activo;
    @Size(max = 255)
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Size(max = 255)
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Size(max = 255)
    @Column(name = "contrasena")
    private String contrasena;
    @Size(max = 255)
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "limite_credito")
    private BigDecimal limiteCredito;
    @Column(name = "linea_credito")
    private Boolean lineaCredito;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "telefono_casa")
    private String telefonoCasa;
    @Size(max = 255)
    @Column(name = "telefono_celular")
    private String telefonoCelular;
    @Column(name = "tenant")
    private Integer tenant;
    @Size(max = 255)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 1024)
    @Column(name = "facebook")
    private String facebook;
    @Size(max = 1024)
    @Column(name = "twitter")
    private String twitter;
    @Size(max = 1024)
    @Column(name = "instagram")
    private String instagram;
    @Size(max = 1024)
    @Column(name = "whatsapp")
    private String whatsapp;
    @Size(max = 1024)
    @Column(name = "youtube")
    private String youtube;
    @Size(max = 1024)
    @Column(name = "otros")
    private String otros;
    @Column(name = "ultima_sucursal")
    private Integer ultimaSucursal;
    @Lob
    @Size(max = 65535)
    @Column(name = "notas")
    private String notas;
    @Column(name = "publicidad_enterado")
    private Boolean publicidadEnterado;
    @Size(max = 1024)
    @Column(name = "precio")
    private String precio;
    @Column(name = "latitud")
    private Float latitud;
    @Column(name = "longitud")
    private Float longitud;

    public CatalogoCliente() {
    }

    public CatalogoCliente(Integer id) {
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

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Boolean getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(Boolean lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public Integer getUltimaSucursal() {
        return ultimaSucursal;
    }

    public void setUltimaSucursal(Integer ultimaSucursal) {
        this.ultimaSucursal = ultimaSucursal;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Boolean getPublicidadEnterado() {
        return publicidadEnterado;
    }

    public void setPublicidadEnterado(Boolean publicidadEnterado) {
        this.publicidadEnterado = publicidadEnterado;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
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
        if (!(object instanceof CatalogoCliente)) {
            return false;
        }
        CatalogoCliente other = (CatalogoCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoCliente[ id=" + id + " ]";
    }
    
}
