package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.PromocionesDescuentoVenta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(PromocionesDescuentoVenta.class)
public class PromocionesDescuentoVenta_ { 

    public static volatile SingularAttribute<PromocionesDescuentoVenta, String> descripcion;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Boolean> domingo;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Date> fechaRegistro;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Boolean> miercoles;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, BigDecimal> precioMinimoAplicable;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, BigDecimal> valor;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Boolean> martes;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Boolean> jueves;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Boolean> viernes;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Date> fechaFin;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, String> nombre;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Boolean> eliminado;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Date> fechaInicio;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Boolean> sabado;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Integer> id;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Boolean> lunes;
    public static volatile SingularAttribute<PromocionesDescuentoVenta, Integer> tenant;

}