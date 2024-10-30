
package Ejercicio5;

    
    import java.util.Scanner;

public class Empleado {
    // Atributos privados
    private String nombre;
    private String telefono;
    
    // Atributo estático privado para contar el número de empleados creados
    private static int numeroEmpleados = 0;
    
    // Constructor 
    public Empleado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        numeroEmpleados++; // Incrementar el contador 
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Método estático
    public static int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    // Método toString para mostrar los datos del empleado
    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Teléfono: " + telefono;
    }
}


