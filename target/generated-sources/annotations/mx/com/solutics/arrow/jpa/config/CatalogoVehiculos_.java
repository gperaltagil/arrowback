package mx.com.solutics.arrow.jpa.config;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.CatalogoVehiculos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(CatalogoVehiculos.class)
public class CatalogoVehiculos_ { 

    public static volatile SingularAttribute<CatalogoVehiculos, Boolean> eliminado;
    public static volatile SingularAttribute<CatalogoVehiculos, String> color;
    public static volatile SingularAttribute<CatalogoVehiculos, Date> fechaRegistro;
    public static volatile SingularAttribute<CatalogoVehiculos, String> notas;
    public static volatile SingularAttribute<CatalogoVehiculos, String> vin;
    public static volatile SingularAttribute<CatalogoVehiculos, Integer> id;
    public static volatile SingularAttribute<CatalogoVehiculos, String> nombre;
    public static volatile SingularAttribute<CatalogoVehiculos, String> modelo;
    public static volatile SingularAttribute<CatalogoVehiculos, Integer> tenant;

}