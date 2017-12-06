package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.CatalogoServicios;
import mx.com.solutics.arrow.jpa.PromocionesCuponesDescuento;
import mx.com.solutics.arrow.jpa.ServicioCuponesDescuento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(ServicioCuponesDescuento.class)
public class ServicioCuponesDescuento_ { 

    public static volatile SingularAttribute<ServicioCuponesDescuento, CatalogoServicios> servicio;
    public static volatile SingularAttribute<ServicioCuponesDescuento, PromocionesCuponesDescuento> idPromocionCuponesDescuento;
    public static volatile SingularAttribute<ServicioCuponesDescuento, Integer> id;
    public static volatile SingularAttribute<ServicioCuponesDescuento, BigDecimal> cantidad;
    public static volatile SingularAttribute<ServicioCuponesDescuento, Integer> tenant;
    public static volatile SingularAttribute<ServicioCuponesDescuento, Boolean> activo;

}