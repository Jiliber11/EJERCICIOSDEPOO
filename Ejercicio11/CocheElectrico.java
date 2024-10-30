
package Ejercicio11;


public class CocheElectrico extends Coche implements Electrico {
    public CocheElectrico(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando la batería del coche eléctrico " + marca + " " + modelo + ".");
    }
}


