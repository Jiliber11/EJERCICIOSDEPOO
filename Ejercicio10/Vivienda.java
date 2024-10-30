
package Ejercicio10;
  //mejora1:)
    public abstract class Vivienda implements IViviendas {
    protected String calle;
    protected int superficieEnMetros;

    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
    }

    public double calcularPrecio() {
        return superficieEnMetros * 1000;
    }

    public abstract double impuestoMunicipal();

    @Override
    public void aumentarPrecio(int aumento) {
        superficieEnMetros += aumento;
    }

    @Override
    public String toString() {
        return "Calle: " + calle + ", Superficie: " + superficieEnMetros + " m2, Precio: " + calcularPrecio();
    }
}

