package mx.com.solutics.arrow.jpa.config;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.CatalogoPromociones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(CatalogoPromociones.class)
public class CatalogoPromociones_ { 

    public static volatile SingularAttribute<CatalogoPromociones, String> descripcion;
    public static volatile SingularAttribute<CatalogoPromociones, Boolean> eliminado;
    public static volatile SingularAttribute<CatalogoPromociones, Date> fechaInicio;
    public static volatile SingularAttribute<CatalogoPromociones, Date> fechaRegistro;
    public static volatile SingularAttribute<CatalogoPromociones, BigDecimal> precioMinimoAplicable;
    public static volatile SingularAttribute<CatalogoPromociones, BigDecimal> valor;
    public static volatile SingularAttribute<CatalogoPromociones, Integer> id;
    public static volatile SingularAttribute<CatalogoPromociones, Integer> idTipoPromocion;
    public static volatile SingularAttribute<CatalogoPromociones, Date> fechaFin;
    public static volatile SingularAttribute<CatalogoPromociones, String> nombre;
    public static volatile SingularAttribute<CatalogoPromociones, Integer> tenant;

}