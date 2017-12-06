package mx.com.solutics.arrow.jpa.config;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.JornadaLaboral;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(JornadaLaboral.class)
public class JornadaLaboral_ { 

    public static volatile SingularAttribute<JornadaLaboral, Date> horaFin;
    public static volatile SingularAttribute<JornadaLaboral, String> estatus;
    public static volatile SingularAttribute<JornadaLaboral, Integer> catalogoUsuarioId;
    public static volatile SingularAttribute<JornadaLaboral, Integer> id;
    public static volatile SingularAttribute<JornadaLaboral, String> dia;
    public static volatile SingularAttribute<JornadaLaboral, Date> horaInicio;
    public static volatile SingularAttribute<JornadaLaboral, Integer> tenant;

}