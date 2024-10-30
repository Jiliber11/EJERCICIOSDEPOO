
package Ejercicio10;
//mejora incluida em las clase
public class Main {
    public static void main(String[] args) {
        Vivienda vivienda = new Vivienda("Calle A", 100) {
            @Override
            public double impuestoMunicipal() {
                return calcularPrecio() * 0.05;
            }
        };
        Piso piso = new Piso("Calle B", 80, 3, 1);
        Adosado adosado = new Adosado("Calle C", 120, 2);
        Chalet chalet = new Chalet("Calle D", 150, 101, true);

        // Prueba del método aumentarPrecio
        piso.aumentarPrecio(20);
        adosado.aumentarPrecio(30);
        chalet.aumentarPrecio(50);

        System.out.println(vivienda);
        System.out.println(piso);
        System.out.println(adosado);
        System.out.println(chalet);
    }
}


    

