
package Ejercicio12;

public class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío!");
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Este es un pájaro.");
    }
}
