package mx.com.solutics.arrow.jpa.config;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.PreciosProductos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(PreciosProductos.class)
public class PreciosProductos_ { 

    public static volatile SingularAttribute<PreciosProductos, Boolean> eliminado;
    public static volatile SingularAttribute<PreciosProductos, BigDecimal> numeroProductosMinimoMayoreo;
    public static volatile SingularAttribute<PreciosProductos, Date> fechaRegistro;
    public static volatile SingularAttribute<PreciosProductos, BigDecimal> precioMenudeo;
    public static volatile SingularAttribute<PreciosProductos, Date> fechaAplica;
    public static volatile SingularAttribute<PreciosProductos, BigDecimal> precioMayoreo;
    public static volatile SingularAttribute<PreciosProductos, Integer> id;
    public static volatile SingularAttribute<PreciosProductos, Integer> producto;
    public static volatile SingularAttribute<PreciosProductos, Integer> tenant;

}