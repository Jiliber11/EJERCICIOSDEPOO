
package Ejercicio11;


public class Bicicleta extends Vehiculo {
    public Bicicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta " + marca + " " + modelo + " está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta " + marca + " " + modelo + " está frenando.");
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Esta es una bicicleta.");
    }
}

    

