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
        System.out.println("5. Cerrar Sesion");  
    }
    
    public static void mensajeError(){
        System.out.println("opcion invalida, digite de nuevo***SOLO UN DIGITO NUMERICO***");
        System.out.println(" ");
    }
    
    public static void mensajeNumeroCuenta(){
        System.out.println("para Consultar informacion de los clientes, por favor ingrese el numero de cuenta del cliente ***solo numeros***");
    }
    
    public static void mensajeEliminar(){
        System.out.println("para eliminar un cliente ingrese el numero de cuenta ***solo NUMEROS***");
    }
    
    public static void mensajeExitoEliminar(){
        System.out.println("el usuario ha sido Eliminado exitosamente");
        System.out.println(" "); 
    }
    public static boolean mensajeExitoEliminarbool(){
        return true;
    }
    
    public static void mensajeLoginUsuario(){
        System.out.println("por favor ingrese su usuario y presione ENTER");
    }
    
    public static void mensajeLoginContraseña(){
        System.out.println("por favor ingrese su contraseña y presione ENTER");

    }
    
    public static void pedirNombre(){
         System.out.println("ingrese el nombre");
    }
    
    public static void pedirApellido(){
         System.out.println("ingrese el Apellido");
    }
    
    public static void pedirId(){
         System.out.println("ingrese la identificacion");
    }
    
    public static void pedirTipoCuenta(){
         System.out.println("ingrese el tipo de cuenta");
    }
    
    public static void pedirNumeroCuenta(){
         System.out.println("ingrese el numero de cuenta");
    }
    
    public static void pedirSaldo(){
         System.out.println("ingrese el saldo inicial");
    }
    
    public static void pedirPrestamo(){
         System.out.println("ingrese cuanto ha pedido al banco");
    }
    public static void usuarioCreado(){
         System.out.println("el usuario ha sido creado Satisfactoriamente...");
    }
    
    public static void idModi(){
         System.out.println("ingrese la identificacion nueva");
    }
      
    public static void tipoCuentaModi(){
         System.out.println("ingrese el tipo de cuenta a cambiar");
    }
    
    public static void sadloModi(){
         System.out.println("ingrese el saldo a modificar");
    }
}
