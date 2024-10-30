
package Ejercicio14;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Evento> eventos = new ArrayList<>();

        eventos.add(new Concierto("Concierto de Rock", "2024-11-20", "The Rolling Stones", 10000));
        eventos.add(new Conferencia("Conferencia de Tecnología", "2024-12-05", "Innovaciones en IA", "Dr. John Doe"));

        for (Evento evento : eventos) {
            evento.mostrarDetalles();
            if (evento instanceof IReservable) {
                ((IReservable) evento).reservarAsiento();
                ((IReservable) evento).cancelarReserva();
            }
            System.out.println();
        }
    }
}

    

