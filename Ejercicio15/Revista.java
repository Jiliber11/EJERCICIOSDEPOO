
package Ejercicio15;


public class Revista extends Publicacion implements IPrestable {
    private String frecuenciaPublicacion;

    public Revista(String titulo, String autor, String frecuenciaPublicacion) {
        super(titulo, autor);
        this.frecuenciaPublicacion = frecuenciaPublicacion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Revista:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Frecuencia de Publicación: " + frecuenciaPublicacion);
    }

    @Override
    public void prestar() {
        System.out.println("La revista '" + titulo + "' ha sido prestada.");
    }

    @Override
    public void devolver() {
        System.out.println("La revista '" + titulo + "' ha sido devuelta.");
    }
}

    

