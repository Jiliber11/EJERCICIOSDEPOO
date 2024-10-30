
package Ejercicio14;



public class Conferencia extends Evento implements IReservable {
    private String tema;
    private String ponente;

    public Conferencia(String nombre, String fecha, String tema, String ponente) {
        super(nombre, fecha);
        this.tema = tema;
        this.ponente = ponente;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Conferencia:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tema: " + tema);
        System.out.println("Ponente: " + ponente);
    }

    @Override
    public void reservarAsiento() {
        System.out.println("Has reservado un asiento para la conferencia sobre " + tema + ".");
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Has cancelado tu reserva para la conferencia sobre " + tema + ".");
    }
}


