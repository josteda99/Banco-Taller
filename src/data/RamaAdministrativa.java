/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.HashMap;

/**
 *
 * @author Asus-PC
 */
public abstract class RamaAdministrativa implements Banco{
    private String nombre;
    private String apellido;
    private int edad;
    private String identificacion;
    
    public abstract void consultarInformacion(String numeroCuenta , HashMap<String,Cliente> clientes);
    public abstract void modificarDatos(String numeroCuenta , HashMap<String,Cliente> clientes, String tipoCuenta, int saldo, int prestamo , String id);
    public abstract void eliminarCliente(String numeroCuenta , HashMap<String,Cliente> clientes);
    public abstract void crearUsuario();
    public abstract void OrdenarSaldos(String numeroCuenta , HashMap<String,Cliente> clientes , Cliente cliente);

    public RamaAdministrativa(String nombre, String apellido, int edad, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
    }
    
    
    
}
