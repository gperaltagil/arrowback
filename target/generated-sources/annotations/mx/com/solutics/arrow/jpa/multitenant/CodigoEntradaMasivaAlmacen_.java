package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.CodigoEntradaMasivaAlmacen;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(CodigoEntradaMasivaAlmacen.class)
public class CodigoEntradaMasivaAlmacen_ { 

    public static volatile SingularAttribute<CodigoEntradaMasivaAlmacen, String> codigoMasivo;
    public static volatile SingularAttribute<CodigoEntradaMasivaAlmacen, Date> fechaRegistro;
    public static volatile SingularAttribute<CodigoEntradaMasivaAlmacen, Integer> id;
    public static volatile SingularAttribute<CodigoEntradaMasivaAlmacen, Integer> idProducto;
    public static volatile SingularAttribute<CodigoEntradaMasivaAlmacen, BigDecimal> cantidad;
    public static volatile SingularAttribute<CodigoEntradaMasivaAlmacen, Integer> tenant;

}