
package Ejercicio12;


public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public abstract void mostrarTipo();
}

