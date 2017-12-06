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
@Table(name = "catalogo_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoUsuario.findAll", query = "SELECT c FROM CatalogoUsuario c")
    , @NamedQuery(name = "CatalogoUsuario.findById", query = "SELECT c FROM CatalogoUsuario c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoUsuario.findByTenant", query = "SELECT c FROM CatalogoUsuario c WHERE c.tenant = :tenant")
    , @NamedQuery(name = "CatalogoUsuario.findByApellidoMaterno", query = "SELECT c FROM CatalogoUsuario c WHERE c.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "CatalogoUsuario.findByApellidoPaterno", query = "SELECT c FROM CatalogoUsuario c WHERE c.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "CatalogoUsuario.findByDomicilio", query = "SELECT c FROM CatalogoUsuario c WHERE c.domicilio = :domicilio")
    , @NamedQuery(name = "CatalogoUsuario.findByEstatus", query = "SELECT c FROM CatalogoUsuario c WHERE c.estatus = :estatus")
    , @NamedQuery(name = "CatalogoUsuario.findByNombre", query = "SELECT c FROM CatalogoUsuario c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoUsuario.findByRutaFoto", query = "SELECT c FROM CatalogoUsuario c WHERE c.rutaFoto = :rutaFoto")
    , @NamedQuery(name = "CatalogoUsuario.findByTelefono", query = "SELECT c FROM CatalogoUsuario c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "CatalogoUsuario.findByPerfilUsuario", query = "SELECT c FROM CatalogoUsuario c WHERE c.perfilUsuario = :perfilUsuario")
    , @NamedQuery(name = "CatalogoUsuario.findByCurp", query = "SELECT c FROM CatalogoUsuario c WHERE c.curp = :curp")
    , @NamedQuery(name = "CatalogoUsuario.findByRfc", query = "SELECT c FROM CatalogoUsuario c WHERE c.rfc = :rfc")
    , @NamedQuery(name = "CatalogoUsuario.findByFechaIngreso", query = "SELECT c FROM CatalogoUsuario c WHERE c.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "CatalogoUsuario.findByGanancia", query = "SELECT c FROM CatalogoUsuario c WHERE c.ganancia = :ganancia")
    , @NamedQuery(name = "CatalogoUsuario.findByEsOperativa", query = "SELECT c FROM CatalogoUsuario c WHERE c.esOperativa = :esOperativa")
    , @NamedQuery(name = "CatalogoUsuario.findByNumeroContactoEmerjencia", query = "SELECT c FROM CatalogoUsuario c WHERE c.numeroContactoEmerjencia = :numeroContactoEmerjencia")
    , @NamedQuery(name = "CatalogoUsuario.findByNombreContactoEmergencia", query = "SELECT c FROM CatalogoUsuario c WHERE c.nombreContactoEmergencia = :nombreContactoEmergencia")
    , @NamedQuery(name = "CatalogoUsuario.findByNumeroSeguroSocial", query = "SELECT c FROM CatalogoUsuario c WHERE c.numeroSeguroSocial = :numeroSeguroSocial")
    , @NamedQuery(name = "CatalogoUsuario.findBySalarioFijo", query = "SELECT c FROM CatalogoUsuario c WHERE c.salarioFijo = :salarioFijo")
    , @NamedQuery(name = "CatalogoUsuario.findByVales", query = "SELECT c FROM CatalogoUsuario c WHERE c.vales = :vales")
    , @NamedQuery(name = "CatalogoUsuario.findByHonorarios", query = "SELECT c FROM CatalogoUsuario c WHERE c.honorarios = :honorarios")})
public class CatalogoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tenant")
    private Integer tenant;
    @Size(max = 255)
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Size(max = 255)
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Size(max = 255)
    @Column(name = "domicilio")
    private String domicilio;
    @Column(name = "estatus")
    private Boolean estatus;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "ruta_foto")
    private String rutaFoto;
    @Size(max = 255)
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "perfil_usuario")
    private Integer perfilUsuario;
    @Size(max = 128)
    @Column(name = "curp")
    private String curp;
    @Size(max = 128)
    @Column(name = "rfc")
    private String rfc;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Lob
    @Size(max = 65535)
    @Column(name = "notas")
    private String notas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ganancia")
    private BigDecimal ganancia;
    @Column(name = "es_operativa")
    private Boolean esOperativa;
    @Size(max = 256)
    @Column(name = "numero_contacto_emerjencia")
    private String numeroContactoEmerjencia;
    @Size(max = 256)
    @Column(name = "nombre_contacto_emergencia")
    private String nombreContactoEmergencia;
    @Size(max = 256)
    @Column(name = "numero_seguro_social")
    private String numeroSeguroSocial;
    @Column(name = "salario_fijo")
    private BigDecimal salarioFijo;
    @Column(name = "vales")
    private BigDecimal vales;
    @Column(name = "honorarios")
    private BigDecimal honorarios;

    public CatalogoUsuario() {
    }

    public CatalogoUsuario(Integer id) {
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(Integer perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public BigDecimal getGanancia() {
        return ganancia;
    }

    public void setGanancia(BigDecimal ganancia) {
        this.ganancia = ganancia;
    }

    public Boolean getEsOperativa() {
        return esOperativa;
    }

    public void setEsOperativa(Boolean esOperativa) {
        this.esOperativa = esOperativa;
    }

    public String getNumeroContactoEmerjencia() {
        return numeroContactoEmerjencia;
    }

    public void setNumeroContactoEmerjencia(String numeroContactoEmerjencia) {
        this.numeroContactoEmerjencia = numeroContactoEmerjencia;
    }

    public String getNombreContactoEmergencia() {
        return nombreContactoEmergencia;
    }

    public void setNombreContactoEmergencia(String nombreContactoEmergencia) {
        this.nombreContactoEmergencia = nombreContactoEmergencia;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public BigDecimal getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(BigDecimal salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public BigDecimal getVales() {
        return vales;
    }

    public void setVales(BigDecimal vales) {
        this.vales = vales;
    }

    public BigDecimal getHonorarios() {
        return honorarios;
    }

    public void setHonorarios(BigDecimal honorarios) {
        this.honorarios = honorarios;
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
        if (!(object instanceof CatalogoUsuario)) {
            return false;
        }
        CatalogoUsuario other = (CatalogoUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoUsuario[ id=" + id + " ]";
    }
    
}
