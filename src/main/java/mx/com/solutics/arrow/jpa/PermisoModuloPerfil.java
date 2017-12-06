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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "permiso_modulo_perfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PermisoModuloPerfil.findAll", query = "SELECT p FROM PermisoModuloPerfil p")
    , @NamedQuery(name = "PermisoModuloPerfil.findById", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.id = :id")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPerfilUsuario", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.perfilUsuario = :perfilUsuario")
    , @NamedQuery(name = "PermisoModuloPerfil.findByTenant", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "PermisoModuloPerfil.findByAgenda", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.agenda = :agenda")
    , @NamedQuery(name = "PermisoModuloPerfil.findByTarjetaRegalo", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.tarjetaRegalo = :tarjetaRegalo")
    , @NamedQuery(name = "PermisoModuloPerfil.findByAlmacen", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.almacen = :almacen")
    , @NamedQuery(name = "PermisoModuloPerfil.findByLineaCredito", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.lineaCredito = :lineaCredito")
    , @NamedQuery(name = "PermisoModuloPerfil.findByEgresos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.egresos = :egresos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPermisosLaborales", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.permisosLaborales = :permisosLaborales")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPrestamosEconomicos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.prestamosEconomicos = :prestamosEconomicos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatSucursales", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catSucursales = :catSucursales")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatPerfilesUsuario", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catPerfilesUsuario = :catPerfilesUsuario")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatUsuarios", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catUsuarios = :catUsuarios")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatClientes", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catClientes = :catClientes")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatProveedores", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catProveedores = :catProveedores")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatProductos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catProductos = :catProductos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatServicios", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catServicios = :catServicios")
    , @NamedQuery(name = "PermisoModuloPerfil.findByVenta", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.venta = :venta")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatPermisos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catPermisos = :catPermisos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCorteCaja", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.corteCaja = :corteCaja")
    , @NamedQuery(name = "PermisoModuloPerfil.findByVentasProceso", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.ventasProceso = :ventasProceso")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCreditoClientes", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.creditoClientes = :creditoClientes")
    , @NamedQuery(name = "PermisoModuloPerfil.findByNomina", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.nomina = :nomina")
    , @NamedQuery(name = "PermisoModuloPerfil.findByVentasDetallarProductos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.ventasDetallarProductos = :ventasDetallarProductos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByHuellasEmpleados", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.huellasEmpleados = :huellasEmpleados")
    , @NamedQuery(name = "PermisoModuloPerfil.findByDeudasPagar", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.deudasPagar = :deudasPagar")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPedidos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.pedidos = :pedidos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByFacturacion", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.facturacion = :facturacion")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatalogoVehiculos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catalogoVehiculos = :catalogoVehiculos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCreditoProveedores", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.creditoProveedores = :creditoProveedores")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPermisosAcceso", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.permisosAcceso = :permisosAcceso")
    , @NamedQuery(name = "PermisoModuloPerfil.findByChecador", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.checador = :checador")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPromociones", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.promociones = :promociones")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatConsumibles", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catConsumibles = :catConsumibles")
    , @NamedQuery(name = "PermisoModuloPerfil.findByInformacionEmpresa", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.informacionEmpresa = :informacionEmpresa")})
public class PermisoModuloPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "perfil_usuario")
    private int perfilUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Column(name = "agenda")
    private Boolean agenda;
    @Column(name = "tarjeta_regalo")
    private Boolean tarjetaRegalo;
    @Column(name = "almacen")
    private Boolean almacen;
    @Column(name = "linea_credito")
    private Boolean lineaCredito;
    @Column(name = "egresos")
    private Boolean egresos;
    @Column(name = "permisos_laborales")
    private Boolean permisosLaborales;
    @Column(name = "prestamos_economicos")
    private Boolean prestamosEconomicos;
    @Column(name = "cat_sucursales")
    private Boolean catSucursales;
    @Column(name = "cat_perfiles_usuario")
    private Boolean catPerfilesUsuario;
    @Column(name = "cat_usuarios")
    private Boolean catUsuarios;
    @Column(name = "cat_clientes")
    private Boolean catClientes;
    @Column(name = "cat_proveedores")
    private Boolean catProveedores;
    @Column(name = "cat_productos")
    private Boolean catProductos;
    @Column(name = "cat_servicios")
    private Boolean catServicios;
    @Column(name = "venta")
    private Boolean venta;
    @Column(name = "cat_permisos")
    private Boolean catPermisos;
    @Column(name = "corte_caja")
    private Boolean corteCaja;
    @Column(name = "ventas_proceso")
    private Boolean ventasProceso;
    @Column(name = "credito_clientes")
    private Boolean creditoClientes;
    @Column(name = "nomina")
    private Boolean nomina;
    @Column(name = "ventas_detallar_productos")
    private Boolean ventasDetallarProductos;
    @Column(name = "huellas_empleados")
    private Boolean huellasEmpleados;
    @Column(name = "deudas_pagar")
    private Boolean deudasPagar;
    @Column(name = "pedidos")
    private Boolean pedidos;
    @Column(name = "facturacion")
    private Boolean facturacion;
    @Column(name = "catalogo_vehiculos")
    private Boolean catalogoVehiculos;
    @Column(name = "credito_proveedores")
    private Boolean creditoProveedores;
    @Column(name = "permisos_acceso")
    private Boolean permisosAcceso;
    @Column(name = "checador")
    private Boolean checador;
    @Column(name = "promociones")
    private Boolean promociones;
    @Column(name = "cat_consumibles")
    private Boolean catConsumibles;
    @Column(name = "informacionEmpresa")
    private Boolean informacionEmpresa;

    public PermisoModuloPerfil() {
    }

    public PermisoModuloPerfil(Integer id) {
        this.id = id;
    }

    public PermisoModuloPerfil(Integer id, int perfilUsuario, int tenant) {
        this.id = id;
        this.perfilUsuario = perfilUsuario;
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(int perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
    }

    public Boolean getAgenda() {
        return agenda;
    }

    public void setAgenda(Boolean agenda) {
        this.agenda = agenda;
    }

    public Boolean getTarjetaRegalo() {
        return tarjetaRegalo;
    }

    public void setTarjetaRegalo(Boolean tarjetaRegalo) {
        this.tarjetaRegalo = tarjetaRegalo;
    }

    public Boolean getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Boolean almacen) {
        this.almacen = almacen;
    }

    public Boolean getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(Boolean lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public Boolean getEgresos() {
        return egresos;
    }

    public void setEgresos(Boolean egresos) {
        this.egresos = egresos;
    }

    public Boolean getPermisosLaborales() {
        return permisosLaborales;
    }

    public void setPermisosLaborales(Boolean permisosLaborales) {
        this.permisosLaborales = permisosLaborales;
    }

    public Boolean getPrestamosEconomicos() {
        return prestamosEconomicos;
    }

    public void setPrestamosEconomicos(Boolean prestamosEconomicos) {
        this.prestamosEconomicos = prestamosEconomicos;
    }

    public Boolean getCatSucursales() {
        return catSucursales;
    }

    public void setCatSucursales(Boolean catSucursales) {
        this.catSucursales = catSucursales;
    }

    public Boolean getCatPerfilesUsuario() {
        return catPerfilesUsuario;
    }

    public void setCatPerfilesUsuario(Boolean catPerfilesUsuario) {
        this.catPerfilesUsuario = catPerfilesUsuario;
    }

    public Boolean getCatUsuarios() {
        return catUsuarios;
    }

    public void setCatUsuarios(Boolean catUsuarios) {
        this.catUsuarios = catUsuarios;
    }

    public Boolean getCatClientes() {
        return catClientes;
    }

    public void setCatClientes(Boolean catClientes) {
        this.catClientes = catClientes;
    }

    public Boolean getCatProveedores() {
        return catProveedores;
    }

    public void setCatProveedores(Boolean catProveedores) {
        this.catProveedores = catProveedores;
    }

    public Boolean getCatProductos() {
        return catProductos;
    }

    public void setCatProductos(Boolean catProductos) {
        this.catProductos = catProductos;
    }

    public Boolean getCatServicios() {
        return catServicios;
    }

    public void setCatServicios(Boolean catServicios) {
        this.catServicios = catServicios;
    }

    public Boolean getVenta() {
        return venta;
    }

    public void setVenta(Boolean venta) {
        this.venta = venta;
    }

    public Boolean getCatPermisos() {
        return catPermisos;
    }

    public void setCatPermisos(Boolean catPermisos) {
        this.catPermisos = catPermisos;
    }

    public Boolean getCorteCaja() {
        return corteCaja;
    }

    public void setCorteCaja(Boolean corteCaja) {
        this.corteCaja = corteCaja;
    }

    public Boolean getVentasProceso() {
        return ventasProceso;
    }

    public void setVentasProceso(Boolean ventasProceso) {
        this.ventasProceso = ventasProceso;
    }

    public Boolean getCreditoClientes() {
        return creditoClientes;
    }

    public void setCreditoClientes(Boolean creditoClientes) {
        this.creditoClientes = creditoClientes;
    }

    public Boolean getNomina() {
        return nomina;
    }

    public void setNomina(Boolean nomina) {
        this.nomina = nomina;
    }

    public Boolean getVentasDetallarProductos() {
        return ventasDetallarProductos;
    }

    public void setVentasDetallarProductos(Boolean ventasDetallarProductos) {
        this.ventasDetallarProductos = ventasDetallarProductos;
    }

    public Boolean getHuellasEmpleados() {
        return huellasEmpleados;
    }

    public void setHuellasEmpleados(Boolean huellasEmpleados) {
        this.huellasEmpleados = huellasEmpleados;
    }

    public Boolean getDeudasPagar() {
        return deudasPagar;
    }

    public void setDeudasPagar(Boolean deudasPagar) {
        this.deudasPagar = deudasPagar;
    }

    public Boolean getPedidos() {
        return pedidos;
    }

    public void setPedidos(Boolean pedidos) {
        this.pedidos = pedidos;
    }

    public Boolean getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(Boolean facturacion) {
        this.facturacion = facturacion;
    }

    public Boolean getCatalogoVehiculos() {
        return catalogoVehiculos;
    }

    public void setCatalogoVehiculos(Boolean catalogoVehiculos) {
        this.catalogoVehiculos = catalogoVehiculos;
    }

    public Boolean getCreditoProveedores() {
        return creditoProveedores;
    }

    public void setCreditoProveedores(Boolean creditoProveedores) {
        this.creditoProveedores = creditoProveedores;
    }

    public Boolean getPermisosAcceso() {
        return permisosAcceso;
    }

    public void setPermisosAcceso(Boolean permisosAcceso) {
        this.permisosAcceso = permisosAcceso;
    }

    public Boolean getChecador() {
        return checador;
    }

    public void setChecador(Boolean checador) {
        this.checador = checador;
    }

    public Boolean getPromociones() {
        return promociones;
    }

    public void setPromociones(Boolean promociones) {
        this.promociones = promociones;
    }

    public Boolean getCatConsumibles() {
        return catConsumibles;
    }

    public void setCatConsumibles(Boolean catConsumibles) {
        this.catConsumibles = catConsumibles;
    }

    public Boolean getInformacionEmpresa() {
        return informacionEmpresa;
    }

    public void setInformacionEmpresa(Boolean informacionEmpresa) {
        this.informacionEmpresa = informacionEmpresa;
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
        if (!(object instanceof PermisoModuloPerfil)) {
            return false;
        }
        PermisoModuloPerfil other = (PermisoModuloPerfil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.PermisoModuloPerfil[ id=" + id + " ]";
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
@Entity
@Table(name = "permiso_modulo_perfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PermisoModuloPerfil.findAll", query = "SELECT p FROM PermisoModuloPerfil p")
    , @NamedQuery(name = "PermisoModuloPerfil.findById", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.id = :id")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPerfilUsuario", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.perfilUsuario = :perfilUsuario")
    , @NamedQuery(name = "PermisoModuloPerfil.findByTenant", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "PermisoModuloPerfil.findByAgenda", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.agenda = :agenda")
    , @NamedQuery(name = "PermisoModuloPerfil.findByTarjetaRegalo", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.tarjetaRegalo = :tarjetaRegalo")
    , @NamedQuery(name = "PermisoModuloPerfil.findByAlmacen", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.almacen = :almacen")
    , @NamedQuery(name = "PermisoModuloPerfil.findByLineaCredito", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.lineaCredito = :lineaCredito")
    , @NamedQuery(name = "PermisoModuloPerfil.findByEgresos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.egresos = :egresos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPermisosLaborales", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.permisosLaborales = :permisosLaborales")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPrestamosEconomicos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.prestamosEconomicos = :prestamosEconomicos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatSucursales", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catSucursales = :catSucursales")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatPerfilesUsuario", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catPerfilesUsuario = :catPerfilesUsuario")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatUsuarios", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catUsuarios = :catUsuarios")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatClientes", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catClientes = :catClientes")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatProveedores", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catProveedores = :catProveedores")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatProductos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catProductos = :catProductos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatServicios", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catServicios = :catServicios")
    , @NamedQuery(name = "PermisoModuloPerfil.findByVenta", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.venta = :venta")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatPermisos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catPermisos = :catPermisos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCorteCaja", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.corteCaja = :corteCaja")
    , @NamedQuery(name = "PermisoModuloPerfil.findByVentasProceso", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.ventasProceso = :ventasProceso")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCreditoClientes", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.creditoClientes = :creditoClientes")
    , @NamedQuery(name = "PermisoModuloPerfil.findByNomina", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.nomina = :nomina")
    , @NamedQuery(name = "PermisoModuloPerfil.findByVentasDetallarProductos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.ventasDetallarProductos = :ventasDetallarProductos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByHuellasEmpleados", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.huellasEmpleados = :huellasEmpleados")
    , @NamedQuery(name = "PermisoModuloPerfil.findByDeudasPagar", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.deudasPagar = :deudasPagar")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPedidos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.pedidos = :pedidos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByFacturacion", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.facturacion = :facturacion")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatalogoVehiculos", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catalogoVehiculos = :catalogoVehiculos")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCreditoProveedores", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.creditoProveedores = :creditoProveedores")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPermisosAcceso", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.permisosAcceso = :permisosAcceso")
    , @NamedQuery(name = "PermisoModuloPerfil.findByChecador", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.checador = :checador")
    , @NamedQuery(name = "PermisoModuloPerfil.findByPromociones", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.promociones = :promociones")
    , @NamedQuery(name = "PermisoModuloPerfil.findByCatConsumibles", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.catConsumibles = :catConsumibles")
    , @NamedQuery(name = "PermisoModuloPerfil.findByInformacionEmpresa", query = "SELECT p FROM PermisoModuloPerfil p WHERE p.informacionEmpresa = :informacionEmpresa")})
public class PermisoModuloPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "perfil_usuario")
    private int perfilUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Column(name = "agenda")
    private Boolean agenda;
    @Column(name = "tarjeta_regalo")
    private Boolean tarjetaRegalo;
    @Column(name = "almacen")
    private Boolean almacen;
    @Column(name = "linea_credito")
    private Boolean lineaCredito;
    @Column(name = "egresos")
    private Boolean egresos;
    @Column(name = "permisos_laborales")
    private Boolean permisosLaborales;
    @Column(name = "prestamos_economicos")
    private Boolean prestamosEconomicos;
    @Column(name = "cat_sucursales")
    private Boolean catSucursales;
    @Column(name = "cat_perfiles_usuario")
    private Boolean catPerfilesUsuario;
    @Column(name = "cat_usuarios")
    private Boolean catUsuarios;
    @Column(name = "cat_clientes")
    private Boolean catClientes;
    @Column(name = "cat_proveedores")
    private Boolean catProveedores;
    @Column(name = "cat_productos")
    private Boolean catProductos;
    @Column(name = "cat_servicios")
    private Boolean catServicios;
    @Column(name = "venta")
    private Boolean venta;
    @Column(name = "cat_permisos")
    private Boolean catPermisos;
    @Column(name = "corte_caja")
    private Boolean corteCaja;
    @Column(name = "ventas_proceso")
    private Boolean ventasProceso;
    @Column(name = "credito_clientes")
    private Boolean creditoClientes;
    @Column(name = "nomina")
    private Boolean nomina;
    @Column(name = "ventas_detallar_productos")
    private Boolean ventasDetallarProductos;
    @Column(name = "huellas_empleados")
    private Boolean huellasEmpleados;
    @Column(name = "deudas_pagar")
    private Boolean deudasPagar;
    @Column(name = "pedidos")
    private Boolean pedidos;
    @Column(name = "facturacion")
    private Boolean facturacion;
    @Column(name = "catalogo_vehiculos")
    private Boolean catalogoVehiculos;
    @Column(name = "credito_proveedores")
    private Boolean creditoProveedores;
    @Column(name = "permisos_acceso")
    private Boolean permisosAcceso;
    @Column(name = "checador")
    private Boolean checador;
    @Column(name = "promociones")
    private Boolean promociones;
    @Column(name = "cat_consumibles")
    private Boolean catConsumibles;
    @Column(name = "informacionEmpresa")
    private Boolean informacionEmpresa;

    public PermisoModuloPerfil() {
    }

    public PermisoModuloPerfil(Integer id) {
        this.id = id;
    }

    public PermisoModuloPerfil(Integer id, int perfilUsuario, int tenant) {
        this.id = id;
        this.perfilUsuario = perfilUsuario;
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(int perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
    }

    public Boolean getAgenda() {
        return agenda;
    }

    public void setAgenda(Boolean agenda) {
        this.agenda = agenda;
    }

    public Boolean getTarjetaRegalo() {
        return tarjetaRegalo;
    }

    public void setTarjetaRegalo(Boolean tarjetaRegalo) {
        this.tarjetaRegalo = tarjetaRegalo;
    }

    public Boolean getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Boolean almacen) {
        this.almacen = almacen;
    }

    public Boolean getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(Boolean lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public Boolean getEgresos() {
        return egresos;
    }

    public void setEgresos(Boolean egresos) {
        this.egresos = egresos;
    }

    public Boolean getPermisosLaborales() {
        return permisosLaborales;
    }

    public void setPermisosLaborales(Boolean permisosLaborales) {
        this.permisosLaborales = permisosLaborales;
    }

    public Boolean getPrestamosEconomicos() {
        return prestamosEconomicos;
    }

    public void setPrestamosEconomicos(Boolean prestamosEconomicos) {
        this.prestamosEconomicos = prestamosEconomicos;
    }

    public Boolean getCatSucursales() {
        return catSucursales;
    }

    public void setCatSucursales(Boolean catSucursales) {
        this.catSucursales = catSucursales;
    }

    public Boolean getCatPerfilesUsuario() {
        return catPerfilesUsuario;
    }

    public void setCatPerfilesUsuario(Boolean catPerfilesUsuario) {
        this.catPerfilesUsuario = catPerfilesUsuario;
    }

    public Boolean getCatUsuarios() {
        return catUsuarios;
    }

    public void setCatUsuarios(Boolean catUsuarios) {
        this.catUsuarios = catUsuarios;
    }

    public Boolean getCatClientes() {
        return catClientes;
    }

    public void setCatClientes(Boolean catClientes) {
        this.catClientes = catClientes;
    }

    public Boolean getCatProveedores() {
        return catProveedores;
    }

    public void setCatProveedores(Boolean catProveedores) {
        this.catProveedores = catProveedores;
    }

    public Boolean getCatProductos() {
        return catProductos;
    }

    public void setCatProductos(Boolean catProductos) {
        this.catProductos = catProductos;
    }

    public Boolean getCatServicios() {
        return catServicios;
    }

    public void setCatServicios(Boolean catServicios) {
        this.catServicios = catServicios;
    }

    public Boolean getVenta() {
        return venta;
    }

    public void setVenta(Boolean venta) {
        this.venta = venta;
    }

    public Boolean getCatPermisos() {
        return catPermisos;
    }

    public void setCatPermisos(Boolean catPermisos) {
        this.catPermisos = catPermisos;
    }

    public Boolean getCorteCaja() {
        return corteCaja;
    }

    public void setCorteCaja(Boolean corteCaja) {
        this.corteCaja = corteCaja;
    }

    public Boolean getVentasProceso() {
        return ventasProceso;
    }

    public void setVentasProceso(Boolean ventasProceso) {
        this.ventasProceso = ventasProceso;
    }

    public Boolean getCreditoClientes() {
        return creditoClientes;
    }

    public void setCreditoClientes(Boolean creditoClientes) {
        this.creditoClientes = creditoClientes;
    }

    public Boolean getNomina() {
        return nomina;
    }

    public void setNomina(Boolean nomina) {
        this.nomina = nomina;
    }

    public Boolean getVentasDetallarProductos() {
        return ventasDetallarProductos;
    }

    public void setVentasDetallarProductos(Boolean ventasDetallarProductos) {
        this.ventasDetallarProductos = ventasDetallarProductos;
    }

    public Boolean getHuellasEmpleados() {
        return huellasEmpleados;
    }

    public void setHuellasEmpleados(Boolean huellasEmpleados) {
        this.huellasEmpleados = huellasEmpleados;
    }

    public Boolean getDeudasPagar() {
        return deudasPagar;
    }

    public void setDeudasPagar(Boolean deudasPagar) {
        this.deudasPagar = deudasPagar;
    }

    public Boolean getPedidos() {
        return pedidos;
    }

    public void setPedidos(Boolean pedidos) {
        this.pedidos = pedidos;
    }

    public Boolean getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(Boolean facturacion) {
        this.facturacion = facturacion;
    }

    public Boolean getCatalogoVehiculos() {
        return catalogoVehiculos;
    }

    public void setCatalogoVehiculos(Boolean catalogoVehiculos) {
        this.catalogoVehiculos = catalogoVehiculos;
    }

    public Boolean getCreditoProveedores() {
        return creditoProveedores;
    }

    public void setCreditoProveedores(Boolean creditoProveedores) {
        this.creditoProveedores = creditoProveedores;
    }

    public Boolean getPermisosAcceso() {
        return permisosAcceso;
    }

    public void setPermisosAcceso(Boolean permisosAcceso) {
        this.permisosAcceso = permisosAcceso;
    }

    public Boolean getChecador() {
        return checador;
    }

    public void setChecador(Boolean checador) {
        this.checador = checador;
    }

    public Boolean getPromociones() {
        return promociones;
    }

    public void setPromociones(Boolean promociones) {
        this.promociones = promociones;
    }

    public Boolean getCatConsumibles() {
        return catConsumibles;
    }

    public void setCatConsumibles(Boolean catConsumibles) {
        this.catConsumibles = catConsumibles;
    }

    public Boolean getInformacionEmpresa() {
        return informacionEmpresa;
    }

    public void setInformacionEmpresa(Boolean informacionEmpresa) {
        this.informacionEmpresa = informacionEmpresa;
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
        if (!(object instanceof PermisoModuloPerfil)) {
            return false;
        }
        PermisoModuloPerfil other = (PermisoModuloPerfil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.PermisoModuloPerfil[ id=" + id + " ]";
    }
    
}
>>>>>>> 7ae90e97d6d6021ba716150e5dde40c954652c18
