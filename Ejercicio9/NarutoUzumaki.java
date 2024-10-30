
package Ejercicio9;



    
    public class NarutoUzumaki extends Ninja implements INinjutsu {
    public NarutoUzumaki(int edad, String aldea, int nivelChakra) {
        super("Naruto Uzumaki", edad, aldea, nivelChakra);
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
            System.out.println("Soy " + nombre + " y estoy usando Kuchiyose (invocación de sapo gigante).");
        }
    }
}

    

