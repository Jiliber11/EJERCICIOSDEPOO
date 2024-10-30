
package Ejercicio6;



    
    import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private String nombre;
    private List<Alfombra> alfombras;

    // Constructor
    public Habitacion(String nombre) {
        this.nombre = nombre;
        this.alfombras = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alfombra> getAlfombras() {
        return alfombras;
    }

  
    public boolean agregarAlfombra(Alfombra alf) {
        return alfombras.add(alf);
    }

    
    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Alfombra alfombra : alfombras) {
            precioTotal += alfombra.calcularPrecio();
        }
        return precioTotal;
    }

    
    public double calcularPrecioAlfombrasCuadradas() {
        double precioTotalCuadradas = 0;
        for (Alfombra alfombra : alfombras) {
            if (alfombra instanceof AlfombraCuadrada) {
                precioTotalCuadradas += alfombra.calcularPrecio();
            }
        }
        return precioTotalCuadradas;
    }
}

    

