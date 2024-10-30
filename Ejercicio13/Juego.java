
package Ejercicio13;


public abstract class Juego {
    protected String titulo;
    protected String plataforma;

    public Juego(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    public abstract void mostrarDetalles();
}

    

