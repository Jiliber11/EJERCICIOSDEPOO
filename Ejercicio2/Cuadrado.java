
package Ejercicio2;


public class Cuadrado extends Forma {
    private double lado;

    // Constructor
    public Cuadrado(String nombre, double posicionX, double posicionY, String color, double lado) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }

    // Getter y setter para lado
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // método 
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

    

