
package Ejercicio6;



    
    import java.util.ArrayList;
import java.util.List;

public class Mansion {
    private List<Habitacion> arrayHabitaciones;

    // Constructor que inicializa un ArrayList vacío de habitaciones
    public Mansion() {
        this.arrayHabitaciones = new ArrayList<>();
    }

    // Método para agregar una habitación a la mansión
    public boolean agregarHabitacion(Habitacion hab) {
        return arrayHabitaciones.add(hab);
    }

    // Método para calcular el precio total de todas las alfombras en la mansión
    public double calcularPrecioTotalAlfombras() {
        double precioTotal = 0;
        for (Habitacion habitacion : arrayHabitaciones) {
            precioTotal += habitacion.calcularPrecioTotal();
        }
        return precioTotal;
    }

    // Método para calcular el precio total de todas las alfombras cuadradas en la mansión
    public double calcularPrecioAlfombrasCuadradas() {
        double precioTotalCuadradas = 0;
        for (Habitacion habitacion : arrayHabitaciones) {
            precioTotalCuadradas += habitacion.calcularPrecioAlfombrasCuadradas();
        }
        return precioTotalCuadradas;
    }
}

    

