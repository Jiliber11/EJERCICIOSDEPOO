
package Ejercicio11;


    public class Coche extends Vehiculo{
    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El coche " + marca + " " + modelo + " está frenando.");
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Este es un coche.");
    }
}

    

