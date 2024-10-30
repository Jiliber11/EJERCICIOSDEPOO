
package Ejercicio10;



public class Piso extends Vivienda {
    private int planta;
    private int puerta;

    public Piso(String calle, int superficieEnMetros, int planta, int puerta) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    @Override
    public double impuestoMunicipal() {
        return calcularPrecio() * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + ", Planta: " + planta + ", Puerta: " + puerta + ", Impuesto Municipal: " + impuestoMunicipal();
    }
}


