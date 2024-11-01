
package Ejercicio6;


    
    public class AlfombraRedonda extends Alfombra {
    private int radio;

    // Constructor
    public AlfombraRedonda(String color, int precioMetro, int radio) {
        super(color, precioMetro);
        this.radio = radio;
    }

    // Getter y Setter 
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    
    @Override
    public double calcularSuperficie() {
        return Math.PI * radio * radio;
    }

    
    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * getPrecioMetro();
    }

    // Método toString para mostrar detalles de la alfombra redonda
    @Override
    public String toString() {
        return "Alfombra Redonda - Color: " + getColor() +
               ", Precio por Metro: " + getPrecioMetro() +
               ", Radio: " + radio +
               ", Superficie: " + calcularSuperficie() +
               ", Precio: " + calcularPrecio();
    }
}

    
    

