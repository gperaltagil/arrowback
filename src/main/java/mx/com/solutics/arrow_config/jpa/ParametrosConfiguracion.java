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
@Table(name = "parametros_configuracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParametrosConfiguracion.findAll", query = "SELECT p FROM ParametrosConfiguracion p")
    , @NamedQuery(name = "ParametrosConfiguracion.findById", query = "SELECT p FROM ParametrosConfiguracion p WHERE p.id = :id")
    , @NamedQuery(name = "ParametrosConfiguracion.findByDescripcion", query = "SELECT p FROM ParametrosConfiguracion p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "ParametrosConfiguracion.findByNombre", query = "SELECT p FROM ParametrosConfiguracion p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "ParametrosConfiguracion.findByValor", query = "SELECT p FROM ParametrosConfiguracion p WHERE p.valor = :valor")})
public class ParametrosConfiguracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "valor")
    private String valor;

    public ParametrosConfiguracion() {
    }

    public ParametrosConfiguracion(Integer id) {
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
        if (!(object instanceof ParametrosConfiguracion)) {
            return false;
        }
        ParametrosConfiguracion other = (ParametrosConfiguracion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow_config.jpa.ParametrosConfiguracion[ id=" + id + " ]";
    }
    
}
