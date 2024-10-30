
package Ejercicio7;


    
    public class Androide17 extends GuerreroZ implements IAndroide {
    public Androide17(int nivelPoder, int universo) {
        super("Androide 17", nivelPoder, "Androide", universo, "Guerreros Z");
    }

    @Override
    public void atacarRayoMortal() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Rayo Mortal");
    }

    @Override
    public void atacarExplosiónEnergetica() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Explosión Energética");
    }

    @Override
    public void atacarGolpeDestructor() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Golpe Destructor");
    }

    @Override
    public void atacarAbsorberEnergia() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Absorber Energía");
    }
}

    

