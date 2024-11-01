
package Ejercicio6;


    
    public abstract class Alfombra implements IAlfombras {
    // Atributos privados
    private String color;
    private int precioMetro;

    // Constructor
    public Alfombra(String color, int precioMetro) {
        this.color = color;
        this.precioMetro = precioMetro;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecioMetro() {
        return precioMetro;
    }

    public void setPrecioMetro(int precioMetro) {
        this.precioMetro = precioMetro;
    }

    // Métodos abstractos de la interfaz
    public abstract double calcularSuperficie();
    public abstract double calcularPrecio();
}

    

