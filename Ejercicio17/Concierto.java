
package Ejercicio17;


    public class Concierto {
    public void iniciarConcierto(Instrumento[] instrumentos) {
        System.out.println("¡Bienvenidos al concierto!");

        for (Instrumento instrumento : instrumentos) {
            if (instrumento instanceof IAfinable) {
                ((IAfinable) instrumento).afinar();
            }
            instrumento.tocar();
            if (instrumento instanceof IAfinable) {
                ((IAfinable) instrumento).desafinar();
            }
            System.out.println();
        }
    }
}

    

