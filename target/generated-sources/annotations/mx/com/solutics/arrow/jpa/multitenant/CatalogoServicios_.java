package mx.com.solutics.arrow.jpa.multitenant;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.CatalogoServicios;
import mx.com.solutics.arrow.jpa.ServicioCuponesDescuento;
import mx.com.solutics.arrow.jpa.ServicioPromocionCombos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(CatalogoServicios.class)
public class CatalogoServicios_ { 

    public static volatile SingularAttribute<CatalogoServicios, String> descripcion;
    public static volatile SingularAttribute<CatalogoServicios, String> codigo;
    public static volatile SingularAttribute<CatalogoServicios, Date> fechaRegistro;
    public static volatile SingularAttribute<CatalogoServicios, BigDecimal> isr;
    public static volatile SingularAttribute<CatalogoServicios, String> tipoFactor;
    public static volatile ListAttribute<CatalogoServicios, ServicioPromocionCombos> servicioPromocionCombosList;
    public static volatile SingularAttribute<CatalogoServicios, String> nombre;
    public static volatile SingularAttribute<CatalogoServicios, String> ieps;
    public static volatile SingularAttribute<CatalogoServicios, Boolean> precioVariable;
    public static volatile SingularAttribute<CatalogoServicios, BigDecimal> precio;
    public static volatile ListAttribute<CatalogoServicios, ServicioCuponesDescuento> servicioCuponesDescuentoList;
    public static volatile SingularAttribute<CatalogoServicios, Boolean> eliminado;
    public static volatile SingularAttribute<CatalogoServicios, BigDecimal> iva;
    public static volatile SingularAttribute<CatalogoServicios, BigDecimal> tiempoDuracion;
    public static volatile SingularAttribute<CatalogoServicios, Boolean> definirProductosEnVenta;
    public static volatile SingularAttribute<CatalogoServicios, String> claveUnidad;
    public static volatile SingularAttribute<CatalogoServicios, String> claveProductoServicio;
    public static volatile SingularAttribute<CatalogoServicios, Integer> id;
    public static volatile SingularAttribute<CatalogoServicios, Integer> tenant;

}