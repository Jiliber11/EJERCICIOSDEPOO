
package Ejercicio8;


    
    public class ProfesorEmerito extends Profesor {
    private int añosEmerito;

    // Constructor
    public ProfesorEmerito(String nombre, int edad, int añosConsolidados, int añosEmerito) {
        super(nombre, edad, añosConsolidados);
        this.añosEmerito = añosEmerito;
    }

    // Getter y Setter
    public int getAñosEmerito() {
        return añosEmerito;
    }

    public void setAñosEmerito(int añosEmerito) {
        this.añosEmerito = añosEmerito;
    }

    //metodos 
    public double obtenerSalarioBase() {
        // Acceso directo al atributo protegido añosConsolidados
        return 925 + añosConsolidados * 12.25 + 23.40 * añosEmerito;
    }
}

    

