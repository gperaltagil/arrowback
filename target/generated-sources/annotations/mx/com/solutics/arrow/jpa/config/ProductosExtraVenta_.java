package mx.com.solutics.arrow.jpa.config;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.ProductosExtraVenta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(ProductosExtraVenta.class)
public class ProductosExtraVenta_ { 

    public static volatile SingularAttribute<ProductosExtraVenta, String> descripcion;
    public static volatile SingularAttribute<ProductosExtraVenta, String> codigo;
    public static volatile SingularAttribute<ProductosExtraVenta, Integer> venta;
    public static volatile SingularAttribute<ProductosExtraVenta, BigInteger> precioUnitario;
    public static volatile SingularAttribute<ProductosExtraVenta, Integer> servicio;
    public static volatile SingularAttribute<ProductosExtraVenta, Date> fechaRegistro;
    public static volatile SingularAttribute<ProductosExtraVenta, BigInteger> porcentajeUso;
    public static volatile SingularAttribute<ProductosExtraVenta, Integer> productoId;
    public static volatile SingularAttribute<ProductosExtraVenta, BigInteger> numeroUsos;
    public static volatile SingularAttribute<ProductosExtraVenta, String> nombreProducto;
    public static volatile SingularAttribute<ProductosExtraVenta, Boolean> eliminado;
    public static volatile SingularAttribute<ProductosExtraVenta, Integer> id;
    public static volatile SingularAttribute<ProductosExtraVenta, String> tenant;

}