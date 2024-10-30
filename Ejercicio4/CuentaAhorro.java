
package Ejercicio4;



public class CuentaAhorro extends Cuenta {
    private double saldoMinimo;

    // Constructor parametrizado
    public CuentaAhorro(Persona cliente, long numeroCuenta, double saldoMinimo) {
        super(cliente, numeroCuenta);
        this.saldoMinimo = saldoMinimo;
    }

    // Métodos 
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    // método retirar con la condición de saldo mínimo
    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && (getSaldo() - cantidad) >= saldoMinimo) {
            setSaldo(getSaldo() - cantidad);
        } else {
            System.out.println("No se puede retirar: saldo insuficiente o se supera el saldo mínimo.");
        }
    }

    // yoString para mostrar la información de la cuenta
    @Override
    public String toString() {
        return "Cuenta de Ahorro:\n" +
               "Cliente: " + getCliente().getNombre() + "\n" +
               "NIF: " + getCliente().getNif() + "\n" +
               "Número de Cuenta: " + getNumeroCuenta() + "\n" +
               "Saldo: $" + getSaldo() + "\n" +
               "Saldo Mínimo: $" + saldoMinimo;
    }
}

    

