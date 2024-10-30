
package Ejercicio15;


public class Libro extends Publicacion implements IPrestable {
    private int numeroDePaginas;

    public Libro(String titulo, String autor, int numeroDePaginas) {
        super(titulo, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroDePaginas);
    }

    @Override
    public void prestar() {
        System.out.println("El libro '" + titulo + "' ha sido prestado.");
    }

    @Override
    public void devolver() {
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }
}

    

