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
@Table(name = "catalogo_imagenes_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoImagenesProducto.findAll", query = "SELECT c FROM CatalogoImagenesProducto c")
    , @NamedQuery(name = "CatalogoImagenesProducto.findById", query = "SELECT c FROM CatalogoImagenesProducto c WHERE c.id = :id")
    , @NamedQuery(name = "CatalogoImagenesProducto.findByExtension", query = "SELECT c FROM CatalogoImagenesProducto c WHERE c.extension = :extension")
    , @NamedQuery(name = "CatalogoImagenesProducto.findByIdProducto", query = "SELECT c FROM CatalogoImagenesProducto c WHERE c.idProducto = :idProducto")
    , @NamedQuery(name = "CatalogoImagenesProducto.findByIdServicio", query = "SELECT c FROM CatalogoImagenesProducto c WHERE c.idServicio = :idServicio")
    , @NamedQuery(name = "CatalogoImagenesProducto.findByTenant", query = "SELECT c FROM CatalogoImagenesProducto c WHERE c.tenant = :tenant")})
public class CatalogoImagenesProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "foto_producto")
    private byte[] fotoProducto;
    @Size(max = 45)
    @Column(name = "extension")
    private String extension;
    @Column(name = "id_producto")
    private Integer idProducto;
    @Column(name = "id_servicio")
    private Integer idServicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;

    public CatalogoImagenesProducto() {
    }

    public CatalogoImagenesProducto(Integer id) {
        this.id = id;
    }

    public CatalogoImagenesProducto(Integer id, byte[] fotoProducto, int tenant) {
        this.id = id;
        this.fotoProducto = fotoProducto;
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(byte[] fotoProducto) {
        this.fotoProducto = fotoProducto;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
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
        if (!(object instanceof CatalogoImagenesProducto)) {
            return false;
        }
        CatalogoImagenesProducto other = (CatalogoImagenesProducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.CatalogoImagenesProducto[ id=" + id + " ]";
    }
    
}
