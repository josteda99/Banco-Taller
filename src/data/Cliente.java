
package data;


public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    private String numeroCuenta;
    private int saldo;
    private String prestamo;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String id, String numeroCuenta, int saldo, String prestamo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "nombre del usuario:" + nombre + "/ln"+
                "apellido del usuario" + apellido;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    
    
}
