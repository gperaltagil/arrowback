package mx.com.solutics.arrow.bo.estados;


import java.io.Serializable;
import javax.persistence.Transient;
import mx.com.solutics.arrow_config.jpa.Credenciales;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gisel Peralta Gil <gperalta at smartsoftamerica.com.mx>
 */
public class CredencialesBO implements Serializable{
    
    private Credenciales credenciales;
    
    @Transient
    String contrasenaString;

    public CredencialesBO(Credenciales credenciales) {
        this.credenciales = credenciales;
    }
    
    public Credenciales getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    public String getContrasenaString() {
        return contrasenaString;
    }

    public void setContrasenaString(String contrasenaString) {
        this.contrasenaString = contrasenaString;
    }
    
}
