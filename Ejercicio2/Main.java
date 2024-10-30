
package Ejercicio2;


public class Main {
    public static void main(String[] args) {
        
        // Crear un objeto Triangulo y mostrar el área
        Triangulo triangulo = new Triangulo("Triángulo", 0, 0, "Azul", 7, 10);
        System.out.println("Nombre: " + triangulo.getNombre());
        System.out.println("Color: " + triangulo.getColor());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        
        System.out.println("----------------------------------------------");
        
        // Crear un objeto Cuadrado y mostrar el área y el perímetro
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 1, 1, "Rojo", 4);
        System.out.println("Nombre: " + cuadrado.getNombre());
        System.out.println("Color: " + cuadrado.getColor());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
    }
}

    

