
package data;

import java.util.HashMap;

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
    
    @Override
    public void consultarInformacion(String numeroCuenta , HashMap<String,Cliente> clientes){
       System.out.println(clientes.get(numeroCuenta)); 
       
    }
    
    @Override
    public void modificarDatos(String numeroCuenta , HashMap<String,Cliente> clientes, String tipoCuenta, int saldo, int prestamo , String id){
   
    }
    
    @Override
    public void eliminarCliente(String numeroCuenta , HashMap<String,Cliente> clientes){
        clientes.remove(numeroCuenta);
    }
    public void crearUsuario(){
    }

    @Override
    public void manejoDinero() {
       
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

    @Override
    public void OrdenarSaldos(String numeroCuenta, HashMap<String, Cliente> clientes, Cliente cliente) {

    }

   

    

    
}
