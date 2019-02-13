/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Asus-PC
 */
public abstract class RamaAdministrativa implements Banco{
    private String nombre;
    private String apellido;
    private int edad;
    private String identificacion;
    
    public abstract void consultarInformacion();
    public abstract void modificarDatos();
    public abstract void eliminarCliente();
    public abstract void crearUsuario();

    public RamaAdministrativa(String nombre, String apellido, int edad, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
    }
    
    
    
}
