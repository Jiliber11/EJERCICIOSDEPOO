
package Ejercicio4;

// modificadaa
public abstract class Cuenta {
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

    // Constructor 
    public Cuenta(Persona cliente, long numeroCuenta) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    // getters y setters)
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    // Métodos
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a ingresar debe ser mayor que 0.");
        }
    }

  
    public abstract void retirar(double cantidad);
}

