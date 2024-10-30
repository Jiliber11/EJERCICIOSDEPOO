
package Ejercicio9;


    public class RockLee extends Ninja implements ITaijutsu {
    public RockLee(int edad, String aldea, int nivelChakra) {
        super("Rock Lee", edad, aldea, nivelChakra);
    }

    @Override
    public void atacarPuñoDinamico() {
        if (tieneChakraSuficiente(8)) {
            System.out.println("Soy " + nombre + " y estoy atacando con Puño Dinámico.");
        }
    }

    @Override
    public void atacarLotoPrimario() {
        if (tieneChakraSuficiente(12)) {
            System.out.println("Soy " + nombre + " y estoy atacando con Loto Primario.");
        }
    }
}

    

