package mx.com.solutics.arrow.jpa.config;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.PromocionesCombos;
import mx.com.solutics.arrow.jpa.ServicioPromocionCombos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(PromocionesCombos.class)
public class PromocionesCombos_ { 

    public static volatile SingularAttribute<PromocionesCombos, String> descripcion;
    public static volatile SingularAttribute<PromocionesCombos, Boolean> domingo;
    public static volatile SingularAttribute<PromocionesCombos, Date> fechaRegistro;
    public static volatile SingularAttribute<PromocionesCombos, Boolean> miercoles;
    public static volatile SingularAttribute<PromocionesCombos, BigDecimal> valor;
    public static volatile SingularAttribute<PromocionesCombos, Boolean> martes;
    public static volatile SingularAttribute<PromocionesCombos, Boolean> jueves;
    public static volatile SingularAttribute<PromocionesCombos, Boolean> viernes;
    public static volatile ListAttribute<PromocionesCombos, ServicioPromocionCombos> servicioPromocionCombosList;
    public static volatile SingularAttribute<PromocionesCombos, Date> fechaFin;
    public static volatile SingularAttribute<PromocionesCombos, String> nombre;
    public static volatile SingularAttribute<PromocionesCombos, Boolean> eliminado;
    public static volatile SingularAttribute<PromocionesCombos, Date> fechaInicio;
    public static volatile SingularAttribute<PromocionesCombos, Boolean> sabado;
    public static volatile SingularAttribute<PromocionesCombos, Integer> id;
    public static volatile SingularAttribute<PromocionesCombos, Boolean> lunes;
    public static volatile SingularAttribute<PromocionesCombos, Integer> tenant;

}