
package Ejercicio12;


public class Gato extends Animal implements IDomesticable {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Este es un gato.");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " está jugando.");
    }
}

    

