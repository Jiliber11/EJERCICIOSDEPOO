
package Ejercicio11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche("Toyota", "Corolla"));
        vehiculos.add(new Motocicleta("Yamaha", "MT-07"));
        vehiculos.add(new Bicicleta("Giant", "Talon"));
        vehiculos.add(new CocheElectrico("Tesla", "Model 3"));

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarTipo();
            vehiculo.acelerar();
            vehiculo.frenar();
            if (vehiculo instanceof CocheElectrico) {
                ((CocheElectrico) vehiculo).cargarBateria();
            }
            System.out.println();
        }
    }
}

    
    
   

