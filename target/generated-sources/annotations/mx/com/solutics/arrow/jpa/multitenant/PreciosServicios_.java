package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.PreciosServicios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(PreciosServicios.class)
public class PreciosServicios_ { 

    public static volatile SingularAttribute<PreciosServicios, Integer> servicio;
    public static volatile SingularAttribute<PreciosServicios, Boolean> eliminado;
    public static volatile SingularAttribute<PreciosServicios, Date> fechaRegistro;
    public static volatile SingularAttribute<PreciosServicios, BigDecimal> precioMenudeo;
    public static volatile SingularAttribute<PreciosServicios, Date> fechaAplica;
    public static volatile SingularAttribute<PreciosServicios, BigDecimal> precioMayoreo;
    public static volatile SingularAttribute<PreciosServicios, Integer> id;
    public static volatile SingularAttribute<PreciosServicios, Integer> tenant;
    public static volatile SingularAttribute<PreciosServicios, BigDecimal> numeroServicioMinimoMayoreo;

}