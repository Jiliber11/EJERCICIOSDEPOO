
package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     

        // Crear alfombras
        AlfombraRedonda alfombraRedonda1 = new AlfombraRedonda("Rojo", 20, 5);
        AlfombraCuadrada alfombraCuadrada1 = new AlfombraCuadrada("Azul", 15, 4);
        AlfombraRedonda alfombraRedonda2 = new AlfombraRedonda("Verde", 18, 3);
        AlfombraCuadrada alfombraCuadrada2 = new AlfombraCuadrada("Amarillo", 12, 6);

        // Crear una habitación
        Habitacion habitacion1 = new Habitacion("Sala de estar");
        habitacion1.agregarAlfombra(alfombraRedonda1);
        habitacion1.agregarAlfombra(alfombraCuadrada1);

        // Otra habitación con alfombras
        Habitacion habitacion2 = new Habitacion("Dormitorio");
        habitacion2.agregarAlfombra(alfombraRedonda2);
        habitacion2.agregarAlfombra(alfombraCuadrada2);
        

        // Probar los métodos de la clase Habitacion
        System.out.println("Precio total de alfombras en " + habitacion1.getNombre() + ": " + habitacion1.calcularPrecioTotal());
        System.out.println("Precio de alfombras cuadradas en " + habitacion1.getNombre() + ": " + habitacion1.calcularPrecioAlfombrasCuadradas());

        System.out.println("Precio total de alfombras en " + habitacion2.getNombre() + ": " + habitacion2.calcularPrecioTotal());
        System.out.println("Precio de alfombras cuadradas en " + habitacion2.getNombre() + ": " + habitacion2.calcularPrecioAlfombrasCuadradas());

        // Crear una mansión y agregar habitaciones
        Mansion mansion = new Mansion();
        mansion.agregarHabitacion(habitacion1);
        mansion.agregarHabitacion(habitacion2);

        // Probar los métodos de la clase Mansion
        System.out.println("Precio total de todas las alfombras en la mansión: " + mansion.calcularPrecioTotalAlfombras());
        System.out.println("Precio total de alfombras cuadradas en la mansión: " + mansion.calcularPrecioAlfombrasCuadradas());
        
       
    }
}


    

