package mx.com.solutics.arrow.jpa.config;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.Nomina;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(Nomina.class)
public class Nomina_ { 

    public static volatile SingularAttribute<Nomina, Integer> idTecnica;
    public static volatile SingularAttribute<Nomina, BigDecimal> totalPagado;
    public static volatile SingularAttribute<Nomina, BigDecimal> gananciaPagado;
    public static volatile SingularAttribute<Nomina, Integer> usuarioPago;
    public static volatile SingularAttribute<Nomina, BigDecimal> descuento;
    public static volatile SingularAttribute<Nomina, String> folio;
    public static volatile SingularAttribute<Nomina, Integer> id;
    public static volatile SingularAttribute<Nomina, Date> fechaPago;
    public static volatile SingularAttribute<Nomina, Integer> tenant;

}