package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.TotalesAlmacenEconomico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(TotalesAlmacenEconomico.class)
public class TotalesAlmacenEconomico_ { 

    public static volatile SingularAttribute<TotalesAlmacenEconomico, BigDecimal> totalSalidaBanco;
    public static volatile SingularAttribute<TotalesAlmacenEconomico, BigDecimal> totalSalidaCaja;
    public static volatile SingularAttribute<TotalesAlmacenEconomico, Integer> sucursal;
    public static volatile SingularAttribute<TotalesAlmacenEconomico, BigDecimal> existenciaCaja;
    public static volatile SingularAttribute<TotalesAlmacenEconomico, BigDecimal> totalEntradaBanco;
    public static volatile SingularAttribute<TotalesAlmacenEconomico, Integer> id;
    public static volatile SingularAttribute<TotalesAlmacenEconomico, BigDecimal> totalEntradaCaja;
    public static volatile SingularAttribute<TotalesAlmacenEconomico, BigDecimal> existenciaBanco;
    public static volatile SingularAttribute<TotalesAlmacenEconomico, Integer> tenant;

}