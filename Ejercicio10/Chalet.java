
package Ejercicio10;

public class Chalet extends Vivienda {
    private int numParcela;
    private boolean conPiscina;

    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }

    @Override
    public double calcularPrecio() {
        return superficieEnMetros * 1300;
    }

    @Override
    public double impuestoMunicipal() {
        double impuestoBase = calcularPrecio() * 0.05;
        if (conPiscina) {
            impuestoBase += 200;
        }
        return impuestoBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Parcela: " + numParcela + ", Con Piscina: " + conPiscina + ", Impuesto Municipal: " + impuestoMunicipal();
    }
}


    

