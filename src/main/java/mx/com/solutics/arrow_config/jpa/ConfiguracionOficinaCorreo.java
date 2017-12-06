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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "configuracion_oficina_correo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracionOficinaCorreo.findAll", query = "SELECT c FROM ConfiguracionOficinaCorreo c")
    , @NamedQuery(name = "ConfiguracionOficinaCorreo.findById", query = "SELECT c FROM ConfiguracionOficinaCorreo c WHERE c.id = :id")
    , @NamedQuery(name = "ConfiguracionOficinaCorreo.findByParametros", query = "SELECT c FROM ConfiguracionOficinaCorreo c WHERE c.parametros = :parametros")
    , @NamedQuery(name = "ConfiguracionOficinaCorreo.findByValor", query = "SELECT c FROM ConfiguracionOficinaCorreo c WHERE c.valor = :valor")})
public class ConfiguracionOficinaCorreo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "parametros")
    private String parametros;
    @Size(max = 255)
    @Column(name = "valor")
    private String valor;

    public ConfiguracionOficinaCorreo() {
    }

    public ConfiguracionOficinaCorreo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
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
        if (!(object instanceof ConfiguracionOficinaCorreo)) {
            return false;
        }
        ConfiguracionOficinaCorreo other = (ConfiguracionOficinaCorreo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow_config.jpa.ConfiguracionOficinaCorreo[ id=" + id + " ]";
    }
    
}
