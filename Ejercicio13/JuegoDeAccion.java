
package Ejercicio13;

public class JuegoDeAccion extends Juego {
    private String nivelDificultad;

    public JuegoDeAccion(String titulo, String plataforma, String nivelDificultad) {
        super(titulo, plataforma);
        this.nivelDificultad = nivelDificultad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Juego de Acción:");
        System.out.println("Título: " + titulo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Nivel de Dificultad: " + nivelDificultad);
    }
}


