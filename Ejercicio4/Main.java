
package Ejercicio4;


public class Main {
   
    public static void main(String[] args) {
       
        Persona persona1 = new Persona("Carlos Gómez", "12345678X");

        // Crear Cuenta Corriente
        CuentaCorriente cuentaCorriente = new CuentaCorriente(persona1, 1234567890L, 500);
        cuentaCorriente.ingresar(1000);
        System.out.println(cuentaCorriente.toString());
        cuentaCorriente.retirar(200); // Retirar dentro del límite
        System.out.println("Saldo después de retirar $200: " + cuentaCorriente.getSaldo());
        cuentaCorriente.retirar(600); // Retirar fuera del límite
        System.out.println("Saldo después de intento de retirar $600: " + cuentaCorriente.getSaldo());
        System.out.println();

        // Crwar Cuenta de Ahorro
        CuentaAhorro cuentaAhorro = new CuentaAhorro(persona1, 9876543210L, 200);
        cuentaAhorro.ingresar(1000);
        System.out.println(cuentaAhorro.toString());
        cuentaAhorro.retirar(700); // Retirar dentro del límite mínimo de saldo
        System.out.println("Saldo después de retirar $700: " + cuentaAhorro.getSaldo());
        cuentaAhorro.retirar(200); // Retirar fuera del saldo mínimo permitido
        System.out.println("Saldo después de intento de retirar $200: " + cuentaAhorro.getSaldo());
    }
}

    

