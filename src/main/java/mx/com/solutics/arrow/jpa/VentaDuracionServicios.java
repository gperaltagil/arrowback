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
@Table(name = "venta_duracion_servicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentaDuracionServicios.findAll", query = "SELECT v FROM VentaDuracionServicios v")
    , @NamedQuery(name = "VentaDuracionServicios.findById", query = "SELECT v FROM VentaDuracionServicios v WHERE v.id = :id")
    , @NamedQuery(name = "VentaDuracionServicios.findByTenant", query = "SELECT v FROM VentaDuracionServicios v WHERE v.tenant = :tenant")
    , @NamedQuery(name = "VentaDuracionServicios.findByActivo", query = "SELECT v FROM VentaDuracionServicios v WHERE v.activo = :activo")
    , @NamedQuery(name = "VentaDuracionServicios.findByDuracionMinutos", query = "SELECT v FROM VentaDuracionServicios v WHERE v.duracionMinutos = :duracionMinutos")
    , @NamedQuery(name = "VentaDuracionServicios.findByEstatus", query = "SELECT v FROM VentaDuracionServicios v WHERE v.estatus = :estatus")
    , @NamedQuery(name = "VentaDuracionServicios.findByEstatusPago", query = "SELECT v FROM VentaDuracionServicios v WHERE v.estatusPago = :estatusPago")
    , @NamedQuery(name = "VentaDuracionServicios.findByFin", query = "SELECT v FROM VentaDuracionServicios v WHERE v.fin = :fin")
    , @NamedQuery(name = "VentaDuracionServicios.findByIdUsuarioTecnica", query = "SELECT v FROM VentaDuracionServicios v WHERE v.idUsuarioTecnica = :idUsuarioTecnica")
    , @NamedQuery(name = "VentaDuracionServicios.findByInicio", query = "SELECT v FROM VentaDuracionServicios v WHERE v.inicio = :inicio")
    , @NamedQuery(name = "VentaDuracionServicios.findByVentaServiciosProductos", query = "SELECT v FROM VentaDuracionServicios v WHERE v.ventaServiciosProductos = :ventaServiciosProductos")})
public class VentaDuracionServicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tenant")
    private Integer tenant;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "duracion_minutos")
    private Integer duracionMinutos;
    @Size(max = 255)
    @Column(name = "estatus")
    private String estatus;
    @Column(name = "estatus_pago")
    private Integer estatusPago;
    @Column(name = "fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fin;
    @Column(name = "id_usuario_tecnica")
    private Integer idUsuarioTecnica;
    @Column(name = "inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicio;
    @Column(name = "venta_servicios_productos")
    private Integer ventaServiciosProductos;

    public VentaDuracionServicios() {
    }

    public VentaDuracionServicios(Integer id) {
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Integer getEstatusPago() {
        return estatusPago;
    }

    public void setEstatusPago(Integer estatusPago) {
        this.estatusPago = estatusPago;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Integer getIdUsuarioTecnica() {
        return idUsuarioTecnica;
    }

    public void setIdUsuarioTecnica(Integer idUsuarioTecnica) {
        this.idUsuarioTecnica = idUsuarioTecnica;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Integer getVentaServiciosProductos() {
        return ventaServiciosProductos;
    }

    public void setVentaServiciosProductos(Integer ventaServiciosProductos) {
        this.ventaServiciosProductos = ventaServiciosProductos;
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
        if (!(object instanceof VentaDuracionServicios)) {
            return false;
        }
        VentaDuracionServicios other = (VentaDuracionServicios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.VentaDuracionServicios[ id=" + id + " ]";
    }
    
}
