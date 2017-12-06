package mx.com.solutics.arrow.jpa.config;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.ExistenciasProductoSucursal;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(ExistenciasProductoSucursal.class)
public class ExistenciasProductoSucursal_ { 

    public static volatile SingularAttribute<ExistenciasProductoSucursal, Integer> idSucursal;
    public static volatile SingularAttribute<ExistenciasProductoSucursal, BigDecimal> totalServicio;
    public static volatile SingularAttribute<ExistenciasProductoSucursal, BigDecimal> totalAlmacen;
    public static volatile SingularAttribute<ExistenciasProductoSucursal, BigDecimal> totalBaja;
    public static volatile SingularAttribute<ExistenciasProductoSucursal, BigDecimal> totalVenta;
    public static volatile SingularAttribute<ExistenciasProductoSucursal, Integer> id;
    public static volatile SingularAttribute<ExistenciasProductoSucursal, Integer> idProducto;
    public static volatile SingularAttribute<ExistenciasProductoSucursal, BigDecimal> totalPiso;
    public static volatile SingularAttribute<ExistenciasProductoSucursal, Integer> tenant;

}