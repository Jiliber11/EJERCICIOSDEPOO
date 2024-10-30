
package Ejercicio12;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("simon"));
        animales.add(new Gato("mishimishi"));
        animales.add(new Pajaro("Rebeca"));

        for (Animal animal : animales) {
            animal.mostrarTipo();
            animal.hacerSonido();
            if (animal instanceof IDomesticable) {
                ((IDomesticable) animal).jugar();
            }
            System.out.println();
        }
    }
}

    

