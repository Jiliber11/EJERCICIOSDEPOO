
package Ejercicio7;


    
   public class Vegeta extends GuerreroZ implements ISaiyajin {
    public Vegeta(int nivelPoder, int universo) {
        super("Vegeta", nivelPoder, "Saiyajin", universo, "Guerreros Z");
    }

    @Override
    public void atacarKamehameha() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Kamehameha");
    }

    @Override
    public void atacarFinalFlash() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Final Flash");
    }

    @Override
    public void atacarBigBang() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Big Bang");
    }

    @Override
    public void atacarOndaVital() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Onda Vital");
    }
}

    

