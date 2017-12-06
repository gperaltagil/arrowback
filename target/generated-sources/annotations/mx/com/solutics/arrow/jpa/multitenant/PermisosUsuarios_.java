package mx.com.solutics.arrow.jpa.multitenant;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.PermisosUsuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(PermisosUsuarios.class)
public class PermisosUsuarios_ { 

    public static volatile SingularAttribute<PermisosUsuarios, Integer> idUsuarioSolicita;
    public static volatile SingularAttribute<PermisosUsuarios, String> motivo;
    public static volatile SingularAttribute<PermisosUsuarios, Boolean> eliminado;
    public static volatile SingularAttribute<PermisosUsuarios, String> estatus;
    public static volatile SingularAttribute<PermisosUsuarios, Date> fechaInicio;
    public static volatile SingularAttribute<PermisosUsuarios, Integer> idUsuarioRegistra;
    public static volatile SingularAttribute<PermisosUsuarios, Date> fechaRegistro;
    public static volatile SingularAttribute<PermisosUsuarios, Integer> id;
    public static volatile SingularAttribute<PermisosUsuarios, Date> fechaFin;
    public static volatile SingularAttribute<PermisosUsuarios, Integer> tenant;

}