package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.Pedido;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> idUsuarioEntrega;
    public static volatile SingularAttribute<Pedido, Integer> idVehiculo;
    public static volatile SingularAttribute<Pedido, BigDecimal> casetas;
    public static volatile SingularAttribute<Pedido, BigDecimal> adicionales;
    public static volatile SingularAttribute<Pedido, Date> fechaSalida;
    public static volatile SingularAttribute<Pedido, Date> fechaRegreso;
    public static volatile SingularAttribute<Pedido, Integer> id;
    public static volatile SingularAttribute<Pedido, Integer> tenant;
    public static volatile SingularAttribute<Pedido, BigDecimal> combustible;

}