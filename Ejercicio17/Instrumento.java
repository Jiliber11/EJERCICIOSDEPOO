
package Ejercicio17;

    
    public abstract class Instrumento {
    private String nombre;
    private String tipo;
    private int volumen;

    // Constructor
    public Instrumento(String nombre, String tipo, int volumen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.volumen = volumen;
    }

    // Método abstracto para tocar el instrumento
    public abstract void tocar();

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVolumen() {
        return volumen;
    }

    // Métodocambiar el volumen
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}

    

