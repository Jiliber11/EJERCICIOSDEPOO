
package Ejercicio7;



    
    public class Piccolo extends GuerreroZ implements INamekiano {
    public Piccolo(int nivelPoder, int universo) {
        super("Piccolo", nivelPoder, "Namekiano", universo, "Guerreros Z");
    }

    @Override
    public void atacarCañonEspecial() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Cañon Especial");
    }

    @Override
    public void atacarOndaMística() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Onda Mística");
    }

    @Override
    public void atacarGranadaInfernal() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Granada Infernal");
    }
}

    

