package bussinnessLogic;

import data.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import ui.interfazUsuario;

public class Menu {

    public static void main(String[] args) {
        
        //clientes
        Cliente c1 = new Cliente("alfonso","ramirez","123456789","123",600000000,"400000","Cuenta Corriente");
        Cliente c2 = new Cliente("andres","pereira","15678567543","456",9000000,"400000","Cuenta Ahorros");
        Cliente c3 = new Cliente("lorena", "sierra" , "39638532986" , "678" ,2000000 , "50000" , "Cuenta Ahorros");
        Cliente c4 = new Cliente("mariana", "lopez" , "5457457", "910" , 600000 , "750000" , "Cuenta Corriente");
        Cliente c5 = new Cliente("armando", "banquito" , "1238567654" ,"111", 12000000 , "10000" , "Cuenta Ahorros");
        Cliente c6 = new Cliente("laura", "cardenas" , "485634865" , "213" , 40000 , "500000" , "cuenta corriente");
        Cliente cn = new Cliente();
        Cliente clienteCreado = new Cliente();
        
        //administradores
        Administrador a1 = new Administrador("alejandra09", "contrasenna", "alejandra", "ramirez", 23, "102938475");
        Administrador a2 = new Administrador("alberto123", "contrasenna1", "alberto", "villamil", 34, "101754384");
        
        //creacion del mapa (clave: String numero de cuenta ) (de clientes)
        HashMap<String,Cliente> clientes = new HashMap<>();
        
        //meter el cliente a el mapa
        clientes.put(c1.getNumeroCuenta(),c1);
        clientes.put(c2.getNumeroCuenta(),c2);
        clientes.put(c3.getNumeroCuenta(),c3);
        clientes.put(c4.getNumeroCuenta(),c4);
        clientes.put(c5.getNumeroCuenta(),c5);
        clientes.put(c6.getNumeroCuenta(),c6);

        //meter saldos en un array
        List<Cliente> clientesPorSaldos = new ArrayList<>(clientes.values());
        Collections.sort(clientesPorSaldos, Comparator.comparing(Cliente::getSaldo));
        
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
        int cont = 0;
        int cont1 = 0;
       int verInformacion;
       int saldoSubido;
       int retencionFuente;

       //metodo para agregar el procentaje de descuento
       
       for(int i=0 ; i < clientesPorSaldos.size() ; i++){
           
           //retencion en la fuente, impuesto, para persoas con menos de 50000000 pesos
           if(clientesPorSaldos.get(i).getSaldo() < 50000000){
                retencionFuente = clientesPorSaldos.get(i).getSaldo() - ((clientesPorSaldos.get(i).getSaldo()* 2 )/100);
                clientesPorSaldos.get(i).setSaldo(retencionFuente);
           }else{
                retencionFuente = clientesPorSaldos.get(i).getSaldo() + ((clientesPorSaldos.get(i).getSaldo()* (int)2.75 )/100);
                clientesPorSaldos.get(i).setSaldo(retencionFuente);
           }
           
           if(clientesPorSaldos.get(i).getSaldo() > 1000000){
                saldoSubido = clientesPorSaldos.get(i).getSaldo() + ((clientesPorSaldos.get(i).getSaldo()*3)/100);
                clientesPorSaldos.get(i).setSaldo(saldoSubido);
           }
           
       }
       
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
                        case 2://modificar datos
                             do{
                                interfazUsuario.mensajeNumeroCuenta1();
                                Scanner numeroCuentaMod = new Scanner(System.in);
                                numeroCuentaUsuarioMod = numeroCuentaMod.nextLine();
                                
                                if(clientes.containsKey(numeroCuentaUsuarioMod)==true){
                                    interfazUsuario.opcionCuenta2();
                                    int opcion2 =lector.nextInt();
                                  
                                   switch(opcion2){
                                       case 1:
                                            interfazUsuario.idModi();
                                            Scanner id = new Scanner(System.in);
                                            idMod = id.nextLine();
                                            clientes.get(numeroCuentaUsuarioMod).setId(idMod);
                                       break;
                                       case 2:
                                            interfazUsuario.tipoCuentaModi();
                                            Scanner tipoCuentaEdita = new Scanner(System.in);
                                            cuentaMod = tipoCuentaEdita.nextLine();
                                            clientes.get(numeroCuentaUsuarioMod).setTipoCuenta(cuentaMod);
                                       break;
                                       case 3:
                                           interfazUsuario.sadloModi();
                                           Scanner Saldo = new Scanner(System.in);
                                           saldoMod = Saldo.nextInt();
                                           clientes.get(numeroCuentaUsuarioMod).setSaldo(saldoMod);
                                       break;
                                       case 4:
                                            interfazUsuario.sadloModi();
                                            Scanner Prestamo = new Scanner(System.in);
                                            saldoMod = Prestamo.nextInt();
                                            clientes.get(numeroCuentaUsuarioMod).setSaldo(saldoMod);
                                       break;
                                       case 5:
                                            interfazUsuario.idModi();
                                            Scanner id1 = new Scanner(System.in);
                                            idMod = id1.nextLine();
                                            clientes.get(numeroCuentaUsuarioMod).setId(idMod);
                                            interfazUsuario.tipoCuentaModi();
                                            Scanner tipoCuentaEdita1 = new Scanner(System.in);
                                            cuentaMod = tipoCuentaEdita1.nextLine();
                                            clientes.get(numeroCuentaUsuarioMod).setTipoCuenta(cuentaMod);
                                            interfazUsuario.sadloModi();
                                            Scanner Saldo1 = new Scanner(System.in);
                                            saldoMod = Saldo1.nextInt();
                                            clientes.get(numeroCuentaUsuarioMod).setSaldo(saldoMod);
                                       default: 
                                           System.out.println("opcion invalida");
                                         break;
                                   }
                                   modificado = true;
                                }
                            }while(modificado == false); 
                            break;
                        case 3://crear Usuario
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
                                clientes.put(numeroCuentaNuevaCreada,cn);
                                clientes.replace(numeroCuentaNuevaCreada,clienteCreado);
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
                            break;
                        case 5://tabla de reportes, 5 usuario con mas dinero
                            interfazUsuario.imprimirTabla();
                                for(int i = 5 ; i>=0 ; i--){
                                    if(cont < 5){
                                        System.out.println(clientesPorSaldos.get(i).getNombre() + " " + clientesPorSaldos.get(i).getApellido() );
                                        cont++;
                                    }
                                }
                                interfazUsuario.infoTabla();
                                Scanner verInfo = new Scanner(System.in);
                                verInformacion = verInfo.nextInt();
                                if(verInformacion == 1){
                                    for(int j = 5 ; j>=0 ; j--){
                                        if(cont1 < 5){
                                            System.out.println("nombre: " + clientesPorSaldos.get(j).getNombre() + " " + clientesPorSaldos.get(j).getApellido() );
                                            System.out.println("Identifiacion: " + clientesPorSaldos.get(j).getId());
                                            System.out.println("No. Cuenta: " + clientesPorSaldos.get(j).getNumeroCuenta());
                                            System.out.println("Tipo De Cuenta: " + clientesPorSaldos.get(j).getTipoCuenta());
                                            System.out.println("Saldo Total: " + clientesPorSaldos.get(j).getSaldo());
                                            System.out.println(" ");
                                            cont1++;
                                        }
                                    }
                                }
                        break;
                        case 6://salir
                          break;    
                        default:
                            interfazUsuario.mensajeError();    
                    }
                }while(opcion != 6);
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
