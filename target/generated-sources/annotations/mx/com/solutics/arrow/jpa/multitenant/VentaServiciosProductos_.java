package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.VentaServiciosProductos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(VentaServiciosProductos.class)
public class VentaServiciosProductos_ { 

    public static volatile SingularAttribute<VentaServiciosProductos, Integer> venta;
    public static volatile SingularAttribute<VentaServiciosProductos, BigDecimal> precioUnitario;
    public static volatile SingularAttribute<VentaServiciosProductos, String> notas;
    public static volatile SingularAttribute<VentaServiciosProductos, Integer> idPedido;
    public static volatile SingularAttribute<VentaServiciosProductos, Integer> idDireccionEntrega;
    public static volatile SingularAttribute<VentaServiciosProductos, Integer> estatusPago;
    public static volatile SingularAttribute<VentaServiciosProductos, BigDecimal> total;
    public static volatile SingularAttribute<VentaServiciosProductos, BigDecimal> precioOriginal;
    public static volatile SingularAttribute<VentaServiciosProductos, Boolean> entregado;
    public static volatile SingularAttribute<VentaServiciosProductos, Integer> id;
    public static volatile SingularAttribute<VentaServiciosProductos, BigDecimal> cantidad;
    public static volatile SingularAttribute<VentaServiciosProductos, Integer> idProducto;
    public static volatile SingularAttribute<VentaServiciosProductos, Integer> idServicio;
    public static volatile SingularAttribute<VentaServiciosProductos, Integer> tenant;
    public static volatile SingularAttribute<VentaServiciosProductos, Boolean> activo;

}