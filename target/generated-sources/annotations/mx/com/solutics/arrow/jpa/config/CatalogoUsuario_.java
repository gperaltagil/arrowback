package mx.com.solutics.arrow.jpa.config;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.solutics.arrow.jpa.CatalogoUsuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T23:48:36")
@StaticMetamodel(CatalogoUsuario.class)
public class CatalogoUsuario_ { 

    public static volatile SingularAttribute<CatalogoUsuario, Boolean> esOperativa;
    public static volatile SingularAttribute<CatalogoUsuario, String> apellidoPaterno;
    public static volatile SingularAttribute<CatalogoUsuario, Integer> perfilUsuario;
    public static volatile SingularAttribute<CatalogoUsuario, BigDecimal> vales;
    public static volatile SingularAttribute<CatalogoUsuario, String> numeroContactoEmerjencia;
    public static volatile SingularAttribute<CatalogoUsuario, String> notas;
    public static volatile SingularAttribute<CatalogoUsuario, String> nombreContactoEmergencia;
    public static volatile SingularAttribute<CatalogoUsuario, BigDecimal> salarioFijo;
    public static volatile SingularAttribute<CatalogoUsuario, String> nombre;
    public static volatile SingularAttribute<CatalogoUsuario, String> rfc;
    public static volatile SingularAttribute<CatalogoUsuario, BigDecimal> ganancia;
    public static volatile SingularAttribute<CatalogoUsuario, String> apellidoMaterno;
    public static volatile SingularAttribute<CatalogoUsuario, Date> fechaIngreso;
    public static volatile SingularAttribute<CatalogoUsuario, String> domicilio;
    public static volatile SingularAttribute<CatalogoUsuario, Boolean> estatus;
    public static volatile SingularAttribute<CatalogoUsuario, String> numeroSeguroSocial;
    public static volatile SingularAttribute<CatalogoUsuario, BigDecimal> honorarios;
    public static volatile SingularAttribute<CatalogoUsuario, Integer> id;
    public static volatile SingularAttribute<CatalogoUsuario, String> telefono;
    public static volatile SingularAttribute<CatalogoUsuario, String> rutaFoto;
    public static volatile SingularAttribute<CatalogoUsuario, Integer> tenant;
    public static volatile SingularAttribute<CatalogoUsuario, String> curp;

}