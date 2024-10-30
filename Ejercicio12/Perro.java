
package Ejercicio12;


// Perro.java
public class Perro extends Animal implements IDomesticable {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Este es un perro.");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " está jugando.");
    }
}
