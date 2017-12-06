package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.PrestamosEconomicos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(PrestamosEconomicos.class)
public class PrestamosEconomicos_ { 

    public static volatile SingularAttribute<PrestamosEconomicos, String> descripcion;
    public static volatile SingularAttribute<PrestamosEconomicos, Boolean> eliminado;
    public static volatile SingularAttribute<PrestamosEconomicos, Date> fechaRegistro;
    public static volatile SingularAttribute<PrestamosEconomicos, Integer> usuarioRegistra;
    public static volatile SingularAttribute<PrestamosEconomicos, BigDecimal> valor;
    public static volatile SingularAttribute<PrestamosEconomicos, Integer> id;
    public static volatile SingularAttribute<PrestamosEconomicos, Integer> tenant;
    public static volatile SingularAttribute<PrestamosEconomicos, Integer> usuarioSolicita;

}