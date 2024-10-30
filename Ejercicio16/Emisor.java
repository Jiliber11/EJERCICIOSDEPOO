
package Ejercicio16;



    
    public class Emisor extends Personaje implements IHabilidadNen {
        
    // Constructor
    public Emisor(String nombre, int edad, int energiaNen) {
        super(nombre, edad, energiaNen);
    }

    // Implementación del método abstracto
    @Override
    public void usarHabilidad() {
        System.out.println(getNombre() + " usa Emisión, lanzando su Nen a distancia.");
        reducirEnergia(10);  // Reduce energía al usar la habilidad
    }

    // Implementación de la interfaz
    @Override
    public void activarHabilidad() {
        System.out.println(getNombre() + " ha activado la habilidad de Emisión.");
    }

    @Override
    public void detenerHabilidad() {
        System.out.println(getNombre() + " ha detenido la habilidad de Emisión.");
    }
}

    

