package bussinnessLogic;

import data.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import ui.interfazUsuario;

public class Menu {

    public static void main(String[] args) {
        
        //clientes
        Cliente c1 = new Cliente("alfonso","ramirez","123456789","123",1000000,"400000","Cuenta Corriente");
        Cliente c2 = new Cliente("andres","pereira","15678567543","456",1000000,"400000","Cuenta Ahorros");
        Cliente c3 = new Cliente("antonio","villamil","124654324","789",1000000,"400000","Cuenta Corriente");
        Cliente c4 = new Cliente("angelica","rodriguez","845678","101",1000000,"400000","Cuenta Ahorros");
        Cliente c5 = new Cliente("antanas","quintero","4895","121",1000000,"400000","Cuenta Corriente");
        Cliente cm = new Cliente();
        Cliente cn = new Cliente("999");
        Cliente clienteCreado = new Cliente();

        //administradores
        Administrador a1 = new Administrador("alejandra09", "contrasenna", "alejandra", "ramirez", 23, "102938475");
        Administrador a2 = new Administrador("alberto123", "contrasenna1", "alberto", "villamil", 34, "101754384");
        
        //creacion del mapa (clave: String numero de cuenta ) (de clientes)
        HashMap<String,Cliente> clientes = new HashMap<>();
        
        //meter el cliente a el mapa
        clientes.put(c1.getNumeroCuenta(),c1);
        clientes.put("999",cn);
        
        //variables
       String contra ;
       String usuario;
       int opcion;
       String numeroCuentaUsuario;
       String numeroCuentaUsuario1;
       String numeroCuentaUsuario2;
       String tipoCuenta;
       int contador=0;
       boolean eliminado = false;
       boolean modificado = false;
       String nombreNuevo;
       String apellidoNuevo;
       String idNueva;
       String tipoDeCuentaNueva;
       String numeroCuentaNuevaCreada; 
       int saldoInicial;
       String prestacionInicial;
       String idMod;
       String cuentaMod;
       String nCuentaMod;
       int saldoMod;
       String numeroCuentaUsuarioMod;
       
       
       
       
       
       //inicio del menu
        do{
            interfazUsuario.mensajeLoginUsuario();
            Scanner lector = new Scanner(System.in);
            usuario = lector.nextLine();
            interfazUsuario.mensajeLoginContraseña();
            Scanner lector1 = new Scanner(System.in);
            contra= lector1.nextLine();
            if(a1.getNombreUsuario().equals(usuario) && a1.getContrasenna().equals(contra)){
                do{
                    interfazUsuario.bienvenida();
                    interfazUsuario.opcionCuenta();
                    Scanner lector3 = new Scanner(System.in);
                    opcion = lector.nextInt();
                    switch(opcion){
                        case 1://Consultar informacion
                            do{
                                interfazUsuario.mensajeNumeroCuenta();
                                Scanner numeroCuenta = new Scanner(System.in);
                                numeroCuentaUsuario = numeroCuenta.nextLine();
                                a1.consultarInformacion(numeroCuentaUsuario,clientes);
                            }while(clientes.containsKey(numeroCuentaUsuario)==false);
                            break;
                        case 2:
                            do{
                                interfazUsuario.mensajeNumeroCuenta();
                                Scanner numeroCuentaMod = new Scanner(System.in);
                                numeroCuentaUsuarioMod = numeroCuentaMod.nextLine();
                                if(numeroCuentaUsuarioMod.equals(clientes.get(numeroCuentaUsuarioMod))){
                                    interfazUsuario.idModi();
                                    Scanner id = new Scanner(System.in);
                                    idMod = id.nextLine();
                                    interfazUsuario.tipoCuentaModi();
                                    Scanner tipoCuentaEdita = new Scanner(System.in);
                                    cuentaMod = tipoCuentaEdita.nextLine();
                                    interfazUsuario.sadloModi();
                                    Scanner Saldo = new Scanner(System.in);
                                    saldoMod = Saldo.nextInt();
                                    clientes.get(numeroCuentaUsuarioMod).setId(idMod);
                                    clientes.get(numeroCuentaUsuarioMod).setTipoCuenta(cuentaMod);
                                    clientes.get(numeroCuentaUsuarioMod).setSaldo(saldoMod);
                                    modificado = true;
                                }
                            }while(modificado == false); 
                            break;
                        case 3:
                                interfazUsuario.pedirNombre();
                                Scanner nombre = new Scanner(System.in);
                                nombreNuevo = nombre.nextLine();
                                interfazUsuario.pedirApellido();
                                Scanner apellido = new Scanner(System.in);
                                apellidoNuevo = apellido.nextLine();
                                interfazUsuario.pedirId();
                                Scanner identificacion = new Scanner(System.in);
                                idNueva = identificacion.nextLine();
                                interfazUsuario.pedirTipoCuenta();
                                Scanner tipoDeCuenta = new Scanner(System.in);
                                tipoDeCuentaNueva = tipoDeCuenta.nextLine();
                                interfazUsuario.pedirNumeroCuenta();
                                Scanner numeroCuentaNueva = new Scanner(System.in);
                                numeroCuentaNuevaCreada = numeroCuentaNueva.nextLine();
                                interfazUsuario.pedirSaldo();
                                Scanner  saldo= new Scanner(System.in);
                                saldoInicial = saldo.nextInt();
                                interfazUsuario.pedirPrestamo();
                                Scanner prestaciones = new Scanner(System.in);
                                prestacionInicial = prestaciones.nextLine();
                                clienteCreado.setNombre(nombreNuevo);
                                clienteCreado.setApellido(apellidoNuevo);
                                clienteCreado.setId(idNueva);
                                clienteCreado.setTipoCuenta(tipoDeCuentaNueva);
                                clienteCreado.setNumeroCuenta(numeroCuentaNuevaCreada);
                                clienteCreado.setSaldo(saldoInicial);
                                clienteCreado.setPrestamo(prestacionInicial);
                                clientes.replace("0",clienteCreado);
                                interfazUsuario.usuarioCreado();
                            break;
                        case 4://Eliminar usuario
                            do{
                                interfazUsuario.mensajeEliminar();
                                Scanner numeroCuenta1 = new Scanner(System.in);
                                numeroCuentaUsuario1 = numeroCuenta1.nextLine();
                                if(clientes.containsKey(numeroCuentaUsuario1) == true ){
                                    a1.eliminarCliente(numeroCuentaUsuario1, clientes);
                                    interfazUsuario.mensajeExitoEliminar();
                                    eliminado = true;
                                    break;
                                }
                            }while(eliminado == false);
                        case 5://salir
                          break;
                        default:
                            interfazUsuario.mensajeError();    
                    }
                }while(opcion != 5);
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
