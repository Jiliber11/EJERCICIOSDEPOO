
package Ejercicio3;


public class Main {
    

    public static void main(String[] args) {
        // Crear un objeto Empleado y mostrar su información
        Empleado empleado = new Empleado("Juan Pérez", "12345678A", 30, true, 3000);
        System.out.println("Información del Empleado:");
        System.out.println(empleado.toString());
        System.out.println();

        // Aumentar el salario del empleado en un 10%
        empleado.subirSalario(10);
        System.out.println("Salario después del aumento del 10%:");
        System.out.println(empleado.toString());
        System.out.println();

        // Crear  Programador y mostrar su información
        Programador programador = new Programador("Ana López", "87654321B", 25, false, 3500, 50, "Java");
        System.out.println("Información del Programador:");
        System.out.println(programador.toString());
        System.out.println();

        // Aumentar el salario del programador en un 15%
        programador.subirSalario(15);
        System.out.println("Salario después del aumento del 15%:");
        System.out.println(programador.toString());
    }
}

    

