
package Ejercicio11;



    
   
public class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta " + marca + " " + modelo + " está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La motocicleta " + marca + " " + modelo + " está frenando.");
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Esta es una motocicleta.");
    }
}

    

