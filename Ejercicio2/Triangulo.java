
package Ejercicio2;


public class Triangulo extends Forma {
    private double base;
    private double altura;

    // Constructo
    public Triangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    // Getter y setter 
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

   
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //método 
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

    

