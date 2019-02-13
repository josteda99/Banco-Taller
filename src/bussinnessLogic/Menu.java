package bussinnessLogic;

import data.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import ui.interfazUsuario;

public class Menu {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("alfonso","ramirez","123456789","123",100000,"400000");
        Administrador a1 = new Administrador("alejandra09", "contrasenna", "alejandra", "ramirez", 23, "102938475");
        Administrador a2 = new Administrador("alberto123", "contrasenna1", "alberto", "villamil", 34, "101754384");
        
        
        /*
        HashMap<String,Cliente> clientes = new HashMap<>();
        clientes.put(c1.getNumeroCuenta(),c1);
        String numero;
        Scanner lector = new Scanner(System.in);
        numero = lector.nextLine();
        a1.consultarInformacion(numero,clientes);
        */
       String contra ;
       String usuario;
       String opcion;
       int contador=0;
        do{
            Scanner lector = new Scanner(System.in);
            usuario = lector.nextLine();
            Scanner lector1 = new Scanner(System.in);
            contra= lector1.nextLine();
            if(a1.getNombreUsuario().equals(usuario) && a1.getContrasenna().equals(contra)){
                do{
                    interfazUsuario.bienvenida();
                    interfazUsuario.opcionCuenta();
                    Scanner lector3 = new Scanner(System.in);
                    opcion = lector.nextLine();
                    switch(opcion){
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                        case "4":
                            break;
                        case "5":
                            break;
                        default:
                            interfazUsuario.mensajeError();    
                    }
                }while(opcion == "5");
                break;
            }else{
                contador = contador + 1;
                System.out.println("el usuario y la contraseña es incorrecto, por favor intentelo de nuevo " + " quedan " + (3-contador) + "intentos");
                if(contador == 3){
                    break;
                }
            }

        }while(a1.getNombreUsuario() != usuario && a1.getContrasenna() != contra);
        
       
        
        
    }
    
}
