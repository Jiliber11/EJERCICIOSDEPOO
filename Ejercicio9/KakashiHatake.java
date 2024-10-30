
package Ejercicio9;


    
    public class KakashiHatake extends Ninja implements INinjutsu, IGenjutsu {
    public KakashiHatake(int edad, String aldea, int nivelChakra) {
        super("Kakashi Hatake", edad, aldea, nivelChakra);
    }

    @Override
    public void atacarBolaFuego() {
        if (tieneChakraSuficiente(10)) {
            System.out.println("Soy " + nombre + " y estoy usando Bola de Fuego.");
        }
    }

    @Override
    public void invocarKuchiyose() {
        if (tieneChakraSuficiente(15)) {
            System.out.println("Soy " + nombre + " y estoy usando Kuchiyose (invocación de perros ninja).");
        }
    }

    @Override
    public void atacarIlusionOscura() {
        if (tieneChakraSuficiente(10)) {
            System.out.println("Soy " + nombre + " y estoy usando Ilusión Oscura.");
        }
    }

    @Override
    public void atacarParalisisMental() {
        if (tieneChakraSuficiente(12)) {
            System.out.println("Soy " + nombre + " y estoy usando Parálisis Mental.");
        }
    }
}


