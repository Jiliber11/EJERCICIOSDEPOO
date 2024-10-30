
package Ejercicio14;


public abstract class Evento {
    protected String nombre;
    protected String fecha;

    public Evento(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public abstract void mostrarDetalles();
}

    

