/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author Asus-PC
 */
public class interfazUsuario {
    public static void bienvenida(){
        System.out.println("Bienvenido Administrador");
    }
    
    public static void opcionCuenta(){
        System.out.println("por favor ingrese la opcion deseada ***Solo un DIGITO NUMERICO***");
        System.out.println("1. Consultar Informacion");
        System.out.println("2. Modificar Informacion");
        System.out.println("3. Crear Usuario");
        System.out.println("4. Eliminar Usuario");    
        System.out.println("5. Salir");  
    }
    
    public static void mensajeError(){
        System.out.println("opcion invalidad, digite de nuevo SOLO UN DIGITO NUMERICO");
    }
}
