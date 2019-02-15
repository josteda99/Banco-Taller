
package data;


public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    private String numeroCuenta;
    private int saldo;
    private String prestamo;
    private String tipoCuenta;

    public Cliente() {
    }
    
    public Cliente(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Cliente(String nombre, String apellido, String id, String numeroCuenta, int saldo, String prestamo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.prestamo = prestamo;
    }

    public Cliente(String nombre, String apellido, String id, String numeroCuenta, int saldo, String prestamo, String tipoCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.prestamo = prestamo;
        this.tipoCuenta = tipoCuenta;
    }
    
    
    @Override
    public String toString() {
        return "nombre del usuario:" + nombre + '\n' +
                "apellido del usuario" + apellido + '\n' +
                "identificacion : " + id + '\n' + 
                "tipo de Cuenta : " + tipoCuenta + '\n' +
                "numero de cuenta: " + numeroCuenta + '\n'+
                "saldo: " + saldo + '\n' +
                "prestamo: " + prestamo +
                '\n' + " ";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setPrestamo(String prestamo) {
        this.prestamo = prestamo;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getPrestamo() {
        return prestamo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
    
    
    
    
}
