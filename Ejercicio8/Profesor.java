
package Ejercicio8;


    
    public class Profesor {
    protected String nombre;
    protected int edad;
    protected int añosConsolidados;

    // Constructor
    public Profesor(String nombre, int edad, int añosConsolidados) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosConsolidados = añosConsolidados;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosConsolidados() {
        return añosConsolidados;
    }

    public void setAñosConsolidados(int añosConsolidados) {
        this.añosConsolidados = añosConsolidados;
    }
}


