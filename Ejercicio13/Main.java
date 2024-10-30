
package Ejercicio13;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Juego> juegos = new ArrayList<>();

        juegos.add(new JuegoDeAccion("Call of Duty", "PC", "Difícil"));
        juegos.add(new JuegoDeEstrategia("Age of Empires", "Xbox", 8));

        for (Juego juego : juegos) {
            juego.mostrarDetalles();
            if (juego instanceof Multijugador) {
                ((Multijugador) juego).unirPartida();
                ((Multijugador) juego).salirPartida();
            }
            System.out.println();
        }
    }
}

    
