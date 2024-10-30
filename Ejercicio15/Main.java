
package Ejercicio15;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();

        publicaciones.add(new Libro("El Quijote", "Miguel de Cervantes", 1024));
        publicaciones.add(new Revista("National Geographic", "National Geographic Society", "Mensual"));

        for (Publicacion publicacion : publicaciones) {
            publicacion.mostrarDetalles();
            if (publicacion instanceof IPrestable) {
                ((IPrestable) publicacion).prestar();
                ((IPrestable) publicacion).devolver();
            }
            System.out.println();
        }
    }
}

    

