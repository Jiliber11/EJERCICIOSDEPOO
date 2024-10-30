
package Ejercicio16;


    
    public class Transformador extends Personaje implements IHabilidadNen {
    // Constructor
    public Transformador(String nombre, int edad, int energiaNen) {
        super(nombre, edad, energiaNen);
    }

    // Implementación del método abstracto
    @Override
    public void usarHabilidad() {
        System.out.println(getNombre() + " transforma su Nen en una nueva forma.");
        reducirEnergia(15);  // Reduce energía al usar la habilidad
    }

    // Implementación de la interfaz 
    @Override
    public void activarHabilidad() {
        System.out.println(getNombre() + " ha activado la habilidad de Transformación.");
    }

    @Override
    public void detenerHabilidad() {
        System.out.println(getNombre() + " ha detenido la habilidad de Transformación.");
    }
}

    

