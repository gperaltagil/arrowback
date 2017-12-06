package mx.com.solutics.arrow.jpa.multitenant;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.CatalogoImagenesProducto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(CatalogoImagenesProducto.class)
public class CatalogoImagenesProducto_ { 

    public static volatile SingularAttribute<CatalogoImagenesProducto, String> extension;
    public static volatile SingularAttribute<CatalogoImagenesProducto, Integer> id;
    public static volatile SingularAttribute<CatalogoImagenesProducto, Integer> idProducto;
    public static volatile SingularAttribute<CatalogoImagenesProducto, Integer> idServicio;
    public static volatile SingularAttribute<CatalogoImagenesProducto, byte[]> fotoProducto;
    public static volatile SingularAttribute<CatalogoImagenesProducto, Integer> tenant;

}