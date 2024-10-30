
package Ejercicio4;


public class CuentaCorriente extends Cuenta {
    private double maximoRetirable;

    // Constructor 
    public CuentaCorriente(Persona cliente, long numeroCuenta, double maximoRetirable) {
        super(cliente, numeroCuenta);
        this.maximoRetirable = maximoRetirable;
    }

    // Métodos 
    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    //método retirar con la condición del máximo retirable
    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= maximoRetirable && cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
        } else {
            System.out.println("Cantidad inválida o supera el máximo retirable permitido.");
        }
    }

    // toString para mostrar la información de la cuenta
    @Override
    public String toString() {
        return "Cuenta Corriente:\n" +
               "Cliente: " + getCliente().getNombre() + "\n" +
               "NIF: " + getCliente().getNif() + "\n" +
               "Número de Cuenta: " + getNumeroCuenta() + "\n" +
               "Saldo: $" + getSaldo() + "\n" +
               "Máximo Retirable: $" + maximoRetirable;
    }
}


