package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.CatalogoServicios;
import mx.com.solutics.arrow.jpa.PromocionesCombos;
import mx.com.solutics.arrow.jpa.ServicioPromocionCombos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(ServicioPromocionCombos.class)
public class ServicioPromocionCombos_ { 

    public static volatile SingularAttribute<ServicioPromocionCombos, CatalogoServicios> servicio;
    public static volatile SingularAttribute<ServicioPromocionCombos, PromocionesCombos> idPromocionCombos;
    public static volatile SingularAttribute<ServicioPromocionCombos, Integer> id;
    public static volatile SingularAttribute<ServicioPromocionCombos, BigDecimal> cantidad;
    public static volatile SingularAttribute<ServicioPromocionCombos, Integer> tenant;
    public static volatile SingularAttribute<ServicioPromocionCombos, Boolean> activo;

}