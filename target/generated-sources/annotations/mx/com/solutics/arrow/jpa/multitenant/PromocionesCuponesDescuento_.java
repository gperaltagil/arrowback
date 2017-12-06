package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.PromocionesCuponesDescuento;
import mx.com.solutics.arrow.jpa.ServicioCuponesDescuento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(PromocionesCuponesDescuento.class)
public class PromocionesCuponesDescuento_ { 

    public static volatile SingularAttribute<PromocionesCuponesDescuento, String> descripcion;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Boolean> domingo;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Date> fechaRegistro;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Boolean> miercoles;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, BigDecimal> valor;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Boolean> martes;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Boolean> jueves;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Boolean> viernes;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Date> fechaFin;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, String> nombre;
    public static volatile ListAttribute<PromocionesCuponesDescuento, ServicioCuponesDescuento> servicioCuponesDescuentoList;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Boolean> eliminado;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Date> fechaInicio;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Boolean> sabado;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Integer> id;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Boolean> lunes;
    public static volatile SingularAttribute<PromocionesCuponesDescuento, Integer> tenant;

}