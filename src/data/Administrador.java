/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Asus-PC
 */
public class Administrador extends RamaAdministrativa{
    private String nombreUsuario;
    private String contrasenna;

    public Administrador() {
        super(null, null, 0, null);
    }

    
    public Administrador(String nombre, String apellido, int edad, String identificacion) {
        super(nombre, apellido, edad, identificacion);
    }

    public Administrador(String nombreUsuario, String contrasenna, String nombre, String apellido, int edad, String identificacion) {
        super(nombre, apellido, edad, identificacion);
        this.nombreUsuario = nombreUsuario;
        this.contrasenna = contrasenna;
    }

    
    
    
    
    public void ofrecerInformacion(){
    
    }
    
    public void consultarInformacion(String numeroCuenta , HashMap<String,Cliente> clientes){
       System.out.println(clientes.get(numeroCuenta)); 
       
    }
    
    public void modificarDatos(){
    }
    public void eliminarCliente(){
    }
    public void crearUsuario(){
    }

    @Override
    public void manejoDinero() {
       
    }

    @Override
    public void consultarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    
}
