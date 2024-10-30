
package Ejercicio6;

    
    public class AlfombraCuadrada extends Alfombra {
    private int lado;

    // Constructor
    public AlfombraCuadrada(String color, int precioMetro, int lado) {
        super(color, precioMetro);
        this.lado = lado;
    }

    // Getter y Setter para lado
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    
    @Override
    public double calcularSuperficie() {
        return lado * lado;
    }

    
    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * getPrecioMetro();
    }

    // Método toString para mostrar detalles de la alfombra cuadrada
    @Override
    public String toString() {
        return "Alfombra Cuadrada - Color: " + getColor() +
               ", Precio por Metro: " + getPrecioMetro() +
               ", Lado: " + lado +
               ", Superficie: " + calcularSuperficie() +
               ", Precio: " + calcularPrecio();
    }
}


