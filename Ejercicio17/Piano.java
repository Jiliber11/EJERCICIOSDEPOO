
package Ejercicio17;



    
    public class Piano extends Instrumento {
    // Constructor
    public Piano(String nombre, int volumen) {
        super(nombre, "Teclado", volumen);
    }

    // Implementación del método abstracto
    @Override
    public void tocar() {
        System.out.println(getNombre() + " (Piano) está tocando una melodía de teclado con un volumen de " + getVolumen() + ".");
    }
}

    

