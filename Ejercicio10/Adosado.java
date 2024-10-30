
package Ejercicio10;

public class Adosado extends Vivienda {
    private int numPlantas;

    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    @Override
    public double impuestoMunicipal() {
        return calcularPrecio() * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Plantas: " + numPlantas + ", Impuesto Municipal: " + impuestoMunicipal();
    }
}


