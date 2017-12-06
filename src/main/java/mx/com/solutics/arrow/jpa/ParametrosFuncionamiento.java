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
@Table(name = "parametros_funcionamiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParametrosFuncionamiento.findAll", query = "SELECT p FROM ParametrosFuncionamiento p")
    , @NamedQuery(name = "ParametrosFuncionamiento.findById", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.id = :id")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByTenant", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.tenant = :tenant")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByReinicioVentaAlPagar", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.reinicioVentaAlPagar = :reinicioVentaAlPagar")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByOpcionEntregasPosteriores", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.opcionEntregasPosteriores = :opcionEntregasPosteriores")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByHabilitadaCajaChica", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.habilitadaCajaChica = :habilitadaCajaChica")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByHabilitadaCajaFuerte", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.habilitadaCajaFuerte = :habilitadaCajaFuerte")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByHabilitadaBanco", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.habilitadaBanco = :habilitadaBanco")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByMostrarTodosEmpleadosNomina", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.mostrarTodosEmpleadosNomina = :mostrarTodosEmpleadosNomina")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByMostrarSalarioFijoNomina", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.mostrarSalarioFijoNomina = :mostrarSalarioFijoNomina")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByMostrarValesNomina", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.mostrarValesNomina = :mostrarValesNomina")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByMostrarHonorarios", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.mostrarHonorarios = :mostrarHonorarios")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByHabilitarMultiplesPrecios", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.habilitarMultiplesPrecios = :habilitarMultiplesPrecios")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloAgenda", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloAgenda = :moduloAgenda")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloTarjetaRegalo", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloTarjetaRegalo = :moduloTarjetaRegalo")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloAlmacen", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloAlmacen = :moduloAlmacen")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloGastos", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloGastos = :moduloGastos")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloDeudascobrar", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloDeudascobrar = :moduloDeudascobrar")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloDeudaspagar", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloDeudaspagar = :moduloDeudaspagar")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloPrestamoEmpleados", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloPrestamoEmpleados = :moduloPrestamoEmpleados")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloPuestos", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloPuestos = :moduloPuestos")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloEmpleados", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloEmpleados = :moduloEmpleados")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloPermisosacceso", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloPermisosacceso = :moduloPermisosacceso")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloChecador", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloChecador = :moduloChecador")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloPermisosLaborales", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloPermisosLaborales = :moduloPermisosLaborales")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloPromociones", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloPromociones = :moduloPromociones")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModulocatSucursales", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.modulocatSucursales = :modulocatSucursales")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModulocatClientes", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.modulocatClientes = :modulocatClientes")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModulocatProveedores", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.modulocatProveedores = :modulocatProveedores")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModulocatProductos", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.modulocatProductos = :modulocatProductos")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModulocatServicios", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.modulocatServicios = :modulocatServicios")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModulocatConsumibles", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.modulocatConsumibles = :modulocatConsumibles")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModulocatVehiculos", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.modulocatVehiculos = :modulocatVehiculos")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByModuloInformacionEmpresa", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.moduloInformacionEmpresa = :moduloInformacionEmpresa")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByCodigoProductoTicket", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.codigoProductoTicket = :codigoProductoTicket")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByMostrarDescuentoTicket", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.mostrarDescuentoTicket = :mostrarDescuentoTicket")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByMostrarFacebookTicket", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.mostrarFacebookTicket = :mostrarFacebookTicket")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByMostrarInstagramTicket", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.mostrarInstagramTicket = :mostrarInstagramTicket")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByMostrarTwitterTicket", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.mostrarTwitterTicket = :mostrarTwitterTicket")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByMostrarNumcitasTicket", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.mostrarNumcitasTicket = :mostrarNumcitasTicket")
    , @NamedQuery(name = "ParametrosFuncionamiento.findByMostrarWhatsappTicket", query = "SELECT p FROM ParametrosFuncionamiento p WHERE p.mostrarWhatsappTicket = :mostrarWhatsappTicket")})
public class ParametrosFuncionamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tenant")
    private int tenant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reinicio_venta_al_pagar")
    private boolean reinicioVentaAlPagar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "opcion_entregas_posteriores")
    private boolean opcionEntregasPosteriores;
    @Basic(optional = false)
    @NotNull
    @Column(name = "habilitada_caja_chica")
    private boolean habilitadaCajaChica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "habilitada_caja_fuerte")
    private boolean habilitadaCajaFuerte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "habilitada_banco")
    private boolean habilitadaBanco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mostrar_todos_empleados_nomina")
    private boolean mostrarTodosEmpleadosNomina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mostrar_salario_fijo_nomina")
    private boolean mostrarSalarioFijoNomina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mostrar_vales_nomina")
    private boolean mostrarValesNomina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mostrar_honorarios")
    private boolean mostrarHonorarios;
    @Column(name = "habilitar_multiples_precios")
    private Boolean habilitarMultiplesPrecios;
    @Column(name = "modulo_agenda")
    private Boolean moduloAgenda;
    @Column(name = "modulo_tarjeta_regalo")
    private Boolean moduloTarjetaRegalo;
    @Column(name = "modulo_Almacen")
    private Boolean moduloAlmacen;
    @Column(name = "modulo_Gastos")
    private Boolean moduloGastos;
    @Column(name = "modulo_Deudas_cobrar")
    private Boolean moduloDeudascobrar;
    @Column(name = "modulo_Deudas_pagar")
    private Boolean moduloDeudaspagar;
    @Column(name = "modulo_prestamo_empleados")
    private Boolean moduloPrestamoEmpleados;
    @Column(name = "modulo_Puestos")
    private Boolean moduloPuestos;
    @Column(name = "modulo_Empleados")
    private Boolean moduloEmpleados;
    @Column(name = "modulo_Permisos_acceso")
    private Boolean moduloPermisosacceso;
    @Column(name = "modulo_checador")
    private Boolean moduloChecador;
    @Column(name = "modulo_permisos_laborales")
    private Boolean moduloPermisosLaborales;
    @Column(name = "modulo_promociones")
    private Boolean moduloPromociones;
    @Column(name = "modulo_catSucursales")
    private Boolean modulocatSucursales;
    @Column(name = "modulo_catClientes")
    private Boolean modulocatClientes;
    @Column(name = "modulo_catProveedores")
    private Boolean modulocatProveedores;
    @Column(name = "modulo_catProductos")
    private Boolean modulocatProductos;
    @Column(name = "modulo_catServicios")
    private Boolean modulocatServicios;
    @Column(name = "modulo_catConsumibles")
    private Boolean modulocatConsumibles;
    @Column(name = "modulo_catVehiculos")
    private Boolean modulocatVehiculos;
    @Column(name = "modulo_informacion_empresa")
    private Boolean moduloInformacionEmpresa;
    @Column(name = "codigoProductoTicket")
    private Boolean codigoProductoTicket;
    @Column(name = "mostrar_descuento_ticket")
    private Boolean mostrarDescuentoTicket;
    @Column(name = "mostrar_facebook_ticket")
    private Boolean mostrarFacebookTicket;
    @Column(name = "mostrar_instagram_ticket")
    private Boolean mostrarInstagramTicket;
    @Column(name = "mostrar_twitter_ticket")
    private Boolean mostrarTwitterTicket;
    @Column(name = "mostrar_numcitas_ticket")
    private Boolean mostrarNumcitasTicket;
    @Column(name = "mostrar_whatsapp_ticket")
    private Boolean mostrarWhatsappTicket;

    public ParametrosFuncionamiento() {
    }

    public ParametrosFuncionamiento(Integer id) {
        this.id = id;
    }

    public ParametrosFuncionamiento(Integer id, int tenant, boolean reinicioVentaAlPagar, boolean opcionEntregasPosteriores, boolean habilitadaCajaChica, boolean habilitadaCajaFuerte, boolean habilitadaBanco, boolean mostrarTodosEmpleadosNomina, boolean mostrarSalarioFijoNomina, boolean mostrarValesNomina, boolean mostrarHonorarios) {
        this.id = id;
        this.tenant = tenant;
        this.reinicioVentaAlPagar = reinicioVentaAlPagar;
        this.opcionEntregasPosteriores = opcionEntregasPosteriores;
        this.habilitadaCajaChica = habilitadaCajaChica;
        this.habilitadaCajaFuerte = habilitadaCajaFuerte;
        this.habilitadaBanco = habilitadaBanco;
        this.mostrarTodosEmpleadosNomina = mostrarTodosEmpleadosNomina;
        this.mostrarSalarioFijoNomina = mostrarSalarioFijoNomina;
        this.mostrarValesNomina = mostrarValesNomina;
        this.mostrarHonorarios = mostrarHonorarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTenant() {
        return tenant;
    }

    public void setTenant(int tenant) {
        this.tenant = tenant;
    }

    public boolean getReinicioVentaAlPagar() {
        return reinicioVentaAlPagar;
    }

    public void setReinicioVentaAlPagar(boolean reinicioVentaAlPagar) {
        this.reinicioVentaAlPagar = reinicioVentaAlPagar;
    }

    public boolean getOpcionEntregasPosteriores() {
        return opcionEntregasPosteriores;
    }

    public void setOpcionEntregasPosteriores(boolean opcionEntregasPosteriores) {
        this.opcionEntregasPosteriores = opcionEntregasPosteriores;
    }

    public boolean getHabilitadaCajaChica() {
        return habilitadaCajaChica;
    }

    public void setHabilitadaCajaChica(boolean habilitadaCajaChica) {
        this.habilitadaCajaChica = habilitadaCajaChica;
    }

    public boolean getHabilitadaCajaFuerte() {
        return habilitadaCajaFuerte;
    }

    public void setHabilitadaCajaFuerte(boolean habilitadaCajaFuerte) {
        this.habilitadaCajaFuerte = habilitadaCajaFuerte;
    }

    public boolean getHabilitadaBanco() {
        return habilitadaBanco;
    }

    public void setHabilitadaBanco(boolean habilitadaBanco) {
        this.habilitadaBanco = habilitadaBanco;
    }

    public boolean getMostrarTodosEmpleadosNomina() {
        return mostrarTodosEmpleadosNomina;
    }

    public void setMostrarTodosEmpleadosNomina(boolean mostrarTodosEmpleadosNomina) {
        this.mostrarTodosEmpleadosNomina = mostrarTodosEmpleadosNomina;
    }

    public boolean getMostrarSalarioFijoNomina() {
        return mostrarSalarioFijoNomina;
    }

    public void setMostrarSalarioFijoNomina(boolean mostrarSalarioFijoNomina) {
        this.mostrarSalarioFijoNomina = mostrarSalarioFijoNomina;
    }

    public boolean getMostrarValesNomina() {
        return mostrarValesNomina;
    }

    public void setMostrarValesNomina(boolean mostrarValesNomina) {
        this.mostrarValesNomina = mostrarValesNomina;
    }

    public boolean getMostrarHonorarios() {
        return mostrarHonorarios;
    }

    public void setMostrarHonorarios(boolean mostrarHonorarios) {
        this.mostrarHonorarios = mostrarHonorarios;
    }

    public Boolean getHabilitarMultiplesPrecios() {
        return habilitarMultiplesPrecios;
    }

    public void setHabilitarMultiplesPrecios(Boolean habilitarMultiplesPrecios) {
        this.habilitarMultiplesPrecios = habilitarMultiplesPrecios;
    }

    public Boolean getModuloAgenda() {
        return moduloAgenda;
    }

    public void setModuloAgenda(Boolean moduloAgenda) {
        this.moduloAgenda = moduloAgenda;
    }

    public Boolean getModuloTarjetaRegalo() {
        return moduloTarjetaRegalo;
    }

    public void setModuloTarjetaRegalo(Boolean moduloTarjetaRegalo) {
        this.moduloTarjetaRegalo = moduloTarjetaRegalo;
    }

    public Boolean getModuloAlmacen() {
        return moduloAlmacen;
    }

    public void setModuloAlmacen(Boolean moduloAlmacen) {
        this.moduloAlmacen = moduloAlmacen;
    }

    public Boolean getModuloGastos() {
        return moduloGastos;
    }

    public void setModuloGastos(Boolean moduloGastos) {
        this.moduloGastos = moduloGastos;
    }

    public Boolean getModuloDeudascobrar() {
        return moduloDeudascobrar;
    }

    public void setModuloDeudascobrar(Boolean moduloDeudascobrar) {
        this.moduloDeudascobrar = moduloDeudascobrar;
    }

    public Boolean getModuloDeudaspagar() {
        return moduloDeudaspagar;
    }

    public void setModuloDeudaspagar(Boolean moduloDeudaspagar) {
        this.moduloDeudaspagar = moduloDeudaspagar;
    }

    public Boolean getModuloPrestamoEmpleados() {
        return moduloPrestamoEmpleados;
    }

    public void setModuloPrestamoEmpleados(Boolean moduloPrestamoEmpleados) {
        this.moduloPrestamoEmpleados = moduloPrestamoEmpleados;
    }

    public Boolean getModuloPuestos() {
        return moduloPuestos;
    }

    public void setModuloPuestos(Boolean moduloPuestos) {
        this.moduloPuestos = moduloPuestos;
    }

    public Boolean getModuloEmpleados() {
        return moduloEmpleados;
    }

    public void setModuloEmpleados(Boolean moduloEmpleados) {
        this.moduloEmpleados = moduloEmpleados;
    }

    public Boolean getModuloPermisosacceso() {
        return moduloPermisosacceso;
    }

    public void setModuloPermisosacceso(Boolean moduloPermisosacceso) {
        this.moduloPermisosacceso = moduloPermisosacceso;
    }

    public Boolean getModuloChecador() {
        return moduloChecador;
    }

    public void setModuloChecador(Boolean moduloChecador) {
        this.moduloChecador = moduloChecador;
    }

    public Boolean getModuloPermisosLaborales() {
        return moduloPermisosLaborales;
    }

    public void setModuloPermisosLaborales(Boolean moduloPermisosLaborales) {
        this.moduloPermisosLaborales = moduloPermisosLaborales;
    }

    public Boolean getModuloPromociones() {
        return moduloPromociones;
    }

    public void setModuloPromociones(Boolean moduloPromociones) {
        this.moduloPromociones = moduloPromociones;
    }

    public Boolean getModulocatSucursales() {
        return modulocatSucursales;
    }

    public void setModulocatSucursales(Boolean modulocatSucursales) {
        this.modulocatSucursales = modulocatSucursales;
    }

    public Boolean getModulocatClientes() {
        return modulocatClientes;
    }

    public void setModulocatClientes(Boolean modulocatClientes) {
        this.modulocatClientes = modulocatClientes;
    }

    public Boolean getModulocatProveedores() {
        return modulocatProveedores;
    }

    public void setModulocatProveedores(Boolean modulocatProveedores) {
        this.modulocatProveedores = modulocatProveedores;
    }

    public Boolean getModulocatProductos() {
        return modulocatProductos;
    }

    public void setModulocatProductos(Boolean modulocatProductos) {
        this.modulocatProductos = modulocatProductos;
    }

    public Boolean getModulocatServicios() {
        return modulocatServicios;
    }

    public void setModulocatServicios(Boolean modulocatServicios) {
        this.modulocatServicios = modulocatServicios;
    }

    public Boolean getModulocatConsumibles() {
        return modulocatConsumibles;
    }

    public void setModulocatConsumibles(Boolean modulocatConsumibles) {
        this.modulocatConsumibles = modulocatConsumibles;
    }

    public Boolean getModulocatVehiculos() {
        return modulocatVehiculos;
    }

    public void setModulocatVehiculos(Boolean modulocatVehiculos) {
        this.modulocatVehiculos = modulocatVehiculos;
    }

    public Boolean getModuloInformacionEmpresa() {
        return moduloInformacionEmpresa;
    }

    public void setModuloInformacionEmpresa(Boolean moduloInformacionEmpresa) {
        this.moduloInformacionEmpresa = moduloInformacionEmpresa;
    }

    public Boolean getCodigoProductoTicket() {
        return codigoProductoTicket;
    }

    public void setCodigoProductoTicket(Boolean codigoProductoTicket) {
        this.codigoProductoTicket = codigoProductoTicket;
    }

    public Boolean getMostrarDescuentoTicket() {
        return mostrarDescuentoTicket;
    }

    public void setMostrarDescuentoTicket(Boolean mostrarDescuentoTicket) {
        this.mostrarDescuentoTicket = mostrarDescuentoTicket;
    }

    public Boolean getMostrarFacebookTicket() {
        return mostrarFacebookTicket;
    }

    public void setMostrarFacebookTicket(Boolean mostrarFacebookTicket) {
        this.mostrarFacebookTicket = mostrarFacebookTicket;
    }

    public Boolean getMostrarInstagramTicket() {
        return mostrarInstagramTicket;
    }

    public void setMostrarInstagramTicket(Boolean mostrarInstagramTicket) {
        this.mostrarInstagramTicket = mostrarInstagramTicket;
    }

    public Boolean getMostrarTwitterTicket() {
        return mostrarTwitterTicket;
    }

    public void setMostrarTwitterTicket(Boolean mostrarTwitterTicket) {
        this.mostrarTwitterTicket = mostrarTwitterTicket;
    }

    public Boolean getMostrarNumcitasTicket() {
        return mostrarNumcitasTicket;
    }

    public void setMostrarNumcitasTicket(Boolean mostrarNumcitasTicket) {
        this.mostrarNumcitasTicket = mostrarNumcitasTicket;
    }

    public Boolean getMostrarWhatsappTicket() {
        return mostrarWhatsappTicket;
    }

    public void setMostrarWhatsappTicket(Boolean mostrarWhatsappTicket) {
        this.mostrarWhatsappTicket = mostrarWhatsappTicket;
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
        if (!(object instanceof ParametrosFuncionamiento)) {
            return false;
        }
        ParametrosFuncionamiento other = (ParametrosFuncionamiento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.solutics.arrow.jpa.ParametrosFuncionamiento[ id=" + id + " ]";
    }
    
}
