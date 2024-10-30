
package Ejercicio13;



public class JuegoDeEstrategia extends Juego implements Multijugador {
    private int numeroDeJugadores;

    public JuegoDeEstrategia(String titulo, String plataforma, int numeroDeJugadores) {
        super(titulo, plataforma);
        this.numeroDeJugadores = numeroDeJugadores;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Juego de Estrategia:");
        System.out.println("Título: " + titulo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Número de Jugadores: " + numeroDeJugadores);
    }

    @Override
    public void unirPartida() {
        System.out.println("Unido a la partida multijugador en " + titulo + ".");
    }

    @Override
    public void salirPartida() {
        System.out.println("Saliste de la partida multijugador en " + titulo + ".");
    }
}

    

