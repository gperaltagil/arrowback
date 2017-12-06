package mx.com.solutics.arrow.jpa.config;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.PermisosLaborales;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(PermisosLaborales.class)
public class PermisosLaborales_ { 

    public static volatile SingularAttribute<PermisosLaborales, Integer> idUsuarioAutoriza;
    public static volatile SingularAttribute<PermisosLaborales, Integer> idUsuarioSolicita;
    public static volatile SingularAttribute<PermisosLaborales, String> motivo;
    public static volatile SingularAttribute<PermisosLaborales, Boolean> eliminado;
    public static volatile SingularAttribute<PermisosLaborales, String> estatus;
    public static volatile SingularAttribute<PermisosLaborales, Date> fechaInicio;
    public static volatile SingularAttribute<PermisosLaborales, Integer> idUsuarioRegistra;
    public static volatile SingularAttribute<PermisosLaborales, Date> fechaRegistro;
    public static volatile SingularAttribute<PermisosLaborales, Integer> id;
    public static volatile SingularAttribute<PermisosLaborales, Date> fechaFin;
    public static volatile SingularAttribute<PermisosLaborales, Integer> tenant;

}