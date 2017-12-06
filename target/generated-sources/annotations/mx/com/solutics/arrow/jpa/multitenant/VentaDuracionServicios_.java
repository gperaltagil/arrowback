package mx.com.solutics.arrow.jpa.multitenant;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.VentaDuracionServicios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(VentaDuracionServicios.class)
public class VentaDuracionServicios_ { 

    public static volatile SingularAttribute<VentaDuracionServicios, Integer> estatusPago;
    public static volatile SingularAttribute<VentaDuracionServicios, String> estatus;
    public static volatile SingularAttribute<VentaDuracionServicios, Date> inicio;
    public static volatile SingularAttribute<VentaDuracionServicios, Integer> duracionMinutos;
    public static volatile SingularAttribute<VentaDuracionServicios, Date> fin;
    public static volatile SingularAttribute<VentaDuracionServicios, Integer> id;
    public static volatile SingularAttribute<VentaDuracionServicios, Integer> idUsuarioTecnica;
    public static volatile SingularAttribute<VentaDuracionServicios, Integer> tenant;
    public static volatile SingularAttribute<VentaDuracionServicios, Boolean> activo;
    public static volatile SingularAttribute<VentaDuracionServicios, Integer> ventaServiciosProductos;

}