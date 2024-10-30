
package Ejercicio16;

public abstract class Personaje {
    private String nombre;
    private int edad;
    private int energiaNen;

    // Constructor
    public Personaje(String nombre, int edad, int energiaNen) {
        this.nombre = nombre;
        this.edad = edad;
        this.energiaNen = energiaNen;
    }

    // Método abstracto que cada subclase implementará
    public abstract void usarHabilidad();

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getEnergiaNen() {
        return energiaNen;
    }

    // Método para reducir la energía Nen
    public void reducirEnergia(int cantidad) {
        this.energiaNen = Math.max(0, this.energiaNen - cantidad);
    }
}

    

