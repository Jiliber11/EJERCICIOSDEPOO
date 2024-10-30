
package Ejercicio17;

  
    public class Main {
    public static void main(String[] args) {
        // Crear los instrumentos
        Instrumento guitarra = new Guitarra("Fender", 75);
        Instrumento piano = new Piano("Yamaha", 60);
        Instrumento trompeta = new Trompeta("Bach", 85);

        // Organizar el concierto
        Instrumento[] instrumentos = {guitarra, piano, trompeta};
        Concierto concierto = new Concierto();
        concierto.iniciarConcierto(instrumentos);
    }
}

    

