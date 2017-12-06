package mx.com.solutics.arrow.jpa.multitenant;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.CatalogoPerfilUsuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(CatalogoPerfilUsuario.class)
public class CatalogoPerfilUsuario_ { 

    public static volatile SingularAttribute<CatalogoPerfilUsuario, String> descripcion;
    public static volatile SingularAttribute<CatalogoPerfilUsuario, Integer> id;
    public static volatile SingularAttribute<CatalogoPerfilUsuario, Integer> tenant;
    public static volatile SingularAttribute<CatalogoPerfilUsuario, Boolean> activo;
    public static volatile SingularAttribute<CatalogoPerfilUsuario, String> perfil;

}