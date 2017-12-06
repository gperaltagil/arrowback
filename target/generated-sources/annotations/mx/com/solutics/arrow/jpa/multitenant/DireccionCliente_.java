package mx.com.solutics.arrow.jpa.multitenant;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.DireccionCliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(DireccionCliente.class)
public class DireccionCliente_ { 

    public static volatile SingularAttribute<DireccionCliente, String> estado;
    public static volatile SingularAttribute<DireccionCliente, String> numInterior;
    public static volatile SingularAttribute<DireccionCliente, Date> fechaRegistro;
    public static volatile SingularAttribute<DireccionCliente, String> municipio;
    public static volatile SingularAttribute<DireccionCliente, String> calle;
    public static volatile SingularAttribute<DireccionCliente, String> numExterior;
    public static volatile SingularAttribute<DireccionCliente, String> cp;
    public static volatile SingularAttribute<DireccionCliente, String> colonia;
    public static volatile SingularAttribute<DireccionCliente, String> pais;
    public static volatile SingularAttribute<DireccionCliente, Boolean> eliminado;
    public static volatile SingularAttribute<DireccionCliente, Integer> ultimaSucursal;
    public static volatile SingularAttribute<DireccionCliente, String> ciudad;
    public static volatile SingularAttribute<DireccionCliente, Integer> catalogoClienteId;
    public static volatile SingularAttribute<DireccionCliente, Integer> id;
    public static volatile SingularAttribute<DireccionCliente, Integer> tenant;

}