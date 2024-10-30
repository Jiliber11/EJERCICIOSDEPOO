
package Ejercicio14;

public class Concierto extends Evento implements IReservable {
    private String artista;
    private int capacidad;

    public Concierto(String nombre, String fecha, String artista, int capacidad) {
        super(nombre, fecha);
        this.artista = artista;
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Concierto:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Artista: " + artista);
        System.out.println("Capacidad: " + capacidad + " personas");
    }

    @Override
    public void reservarAsiento() {
        System.out.println("Has reservado un asiento para el concierto de " + artista + ".");
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Has cancelado tu reserva para el concierto de " + artista + ".");
    }
}

    

