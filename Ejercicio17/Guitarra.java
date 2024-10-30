
package Ejercicio17;


    
   public class Guitarra extends Instrumento implements IAfinable {
    // Constructor
    public Guitarra(String nombre, int volumen) {
        super(nombre, "Cuerda", volumen);
    }

    // Implementación del método abstracto 
    @Override
    public void tocar() {
        System.out.println(getNombre() + " (Guitarra) está tocando una melodía de cuerda con un volumen de " + getVolumen() + ".");
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

    

