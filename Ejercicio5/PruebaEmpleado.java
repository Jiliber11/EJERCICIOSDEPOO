
package Ejercicio5;

import java.util.Scanner;


    
    public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[4]; // Array de 4 empleados
        
        // Leer datos de cada empleado desde la consola
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            
            // Crear el empleado
            empleados[i] = new Empleado(nombre, telefono);
        }
        
        // Mostrar los datos de cada empleado
        System.out.println("\nDatos de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
        
        // Mostrar el número de empleados creados
        System.out.println("\nNúmero total de empleados instanciados: " + Empleado.getNumeroEmpleados());
        
        scanner.close();
    }
}

    

