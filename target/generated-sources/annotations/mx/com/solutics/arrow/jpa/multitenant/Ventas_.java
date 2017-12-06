package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.Ventas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Boolean> tarjetaCredito;
    public static volatile SingularAttribute<Ventas, BigDecimal> totalVentaSinPromocion;
    public static volatile SingularAttribute<Ventas, Boolean> requiereFactura;
    public static volatile SingularAttribute<Ventas, String> tipoPublicidad;
    public static volatile SingularAttribute<Ventas, BigDecimal> cantidadEfectivo;
    public static volatile SingularAttribute<Ventas, BigDecimal> cantidadDebito;
    public static volatile SingularAttribute<Ventas, Integer> usuarioRegistra;
    public static volatile SingularAttribute<Ventas, BigDecimal> totalVenta;
    public static volatile SingularAttribute<Ventas, Boolean> tarjetaDebito;
    public static volatile SingularAttribute<Ventas, BigDecimal> propina;
    public static volatile SingularAttribute<Ventas, BigDecimal> cantidadCredito;
    public static volatile SingularAttribute<Ventas, String> folioTarjeta;
    public static volatile SingularAttribute<Ventas, BigDecimal> cantidadPagoCredito;
    public static volatile SingularAttribute<Ventas, Boolean> credito;
    public static volatile SingularAttribute<Ventas, Integer> id;
    public static volatile SingularAttribute<Ventas, Boolean> tarjetaRegalo;
    public static volatile SingularAttribute<Ventas, Integer> tenant;
    public static volatile SingularAttribute<Ventas, Integer> idCorteCaja;
    public static volatile SingularAttribute<Ventas, Boolean> pendienteDefinirProductos;
    public static volatile SingularAttribute<Ventas, Date> fechaRegistro;
    public static volatile SingularAttribute<Ventas, Integer> usuarioVende;
    public static volatile SingularAttribute<Ventas, Date> fechaElimina;
    public static volatile SingularAttribute<Ventas, String> tipoPromocion;
    public static volatile SingularAttribute<Ventas, Integer> usuarioElimina;
    public static volatile SingularAttribute<Ventas, Integer> cliente;
    public static volatile SingularAttribute<Ventas, Integer> sucursal;
    public static volatile SingularAttribute<Ventas, String> idFactura;
    public static volatile SingularAttribute<Ventas, Boolean> efectivo;
    public static volatile SingularAttribute<Ventas, String> folio;
    public static volatile SingularAttribute<Ventas, BigDecimal> cantidadRegalo;
    public static volatile SingularAttribute<Ventas, Integer> idPromocion;
    public static volatile SingularAttribute<Ventas, Boolean> activo;

}