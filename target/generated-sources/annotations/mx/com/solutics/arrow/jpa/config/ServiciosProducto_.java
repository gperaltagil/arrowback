package mx.com.solutics.arrow.jpa.config;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.ServiciosProducto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(ServiciosProducto.class)
public class ServiciosProducto_ { 

    public static volatile SingularAttribute<ServiciosProducto, String> descripcion;
    public static volatile SingularAttribute<ServiciosProducto, Integer> servicio;
    public static volatile SingularAttribute<ServiciosProducto, Boolean> eliminado;
    public static volatile SingularAttribute<ServiciosProducto, Boolean> estratus;
    public static volatile SingularAttribute<ServiciosProducto, Date> fechaRegistro;
    public static volatile SingularAttribute<ServiciosProducto, BigDecimal> porcentajeUso;
    public static volatile SingularAttribute<ServiciosProducto, BigDecimal> numeroUsos;
    public static volatile SingularAttribute<ServiciosProducto, Integer> id;
    public static volatile SingularAttribute<ServiciosProducto, Integer> producto;
    public static volatile SingularAttribute<ServiciosProducto, Integer> tenant;

}