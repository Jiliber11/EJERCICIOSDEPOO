
package Ejercicio17;

    
    public class Trompeta extends Instrumento implements IAfinable {
    // Constructor
    public Trompeta(String nombre, int volumen) {
        super(nombre, "Viento", volumen);
    }

    // Implementación del método abstracto
    @Override
    public void tocar() {
        System.out.println(getNombre() + " (Trompeta) está tocando una melodía de viento con un volumen de " + getVolumen() + ".");
    }

    // Implementación de los métodos de Afinable
    @Override
    public void afinar() {
        System.out.println(getNombre() + " está siendo afinada.");
    }

    @Override
    public void desafinar() {
        System.out.println(getNombre() + " se ha desafinado.");
    }
}


