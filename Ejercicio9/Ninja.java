
package Ejercicio9;


 
    public abstract class Ninja {
    protected String nombre;
    protected int edad;
    protected String aldea;
    protected int nivelChakra;

    public Ninja(String nombre, int edad, String aldea, int nivelChakra) {
        this.nombre = nombre;
        this.edad = edad;
        this.aldea = aldea;
        this.nivelChakra = nivelChakra;
    }

    public void concentrarChakra() {
        System.out.println("Soy " + nombre + " y estoy concentrando chakra.");
    }

    public void realizarAtaqueBasico() {
        if (nivelChakra >= 5) {
            nivelChakra -= 5;
            System.out.println("Soy " + nombre + " y estoy lanzando un ataque básico.");
        } else {
            System.out.println("Soy " + nombre + " y estoy agotado; no puedo realizar un ataque básico.");
        }
    }

    protected boolean tieneChakraSuficiente(int costo) {
        if (nivelChakra >= costo) {
            nivelChakra -= costo;
            return true;
        } else {
            System.out.println("Soy " + nombre + " y estoy agotado; no puedo realizar esta técnica.");
            return false;
        }
    }
}


