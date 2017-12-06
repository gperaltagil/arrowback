package mx.com.solutics.arrow_config.jpa.multitenant;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow_config.jpa.Credenciales;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(Credenciales.class)
public class Credenciales_ { 

    public static volatile SingularAttribute<Credenciales, byte[]> salContrasena;
    public static volatile SingularAttribute<Credenciales, byte[]> salToken;
    public static volatile SingularAttribute<Credenciales, byte[]> contrasena;
    public static volatile SingularAttribute<Credenciales, Integer> usuario;
    public static volatile SingularAttribute<Credenciales, Integer> id;
    public static volatile SingularAttribute<Credenciales, String> correoElectronico;
    public static volatile SingularAttribute<Credenciales, Integer> tenant;
    public static volatile SingularAttribute<Credenciales, byte[]> token;

}