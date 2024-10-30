
package Ejercicio16;

    
    public class Main {
    public static void main(String[] args) {
        // Crear personajes
        Personaje emisor = new Emisor("Gon", 12, 100);
        Personaje transformador = new Transformador("Killua", 12, 100);

        // Crear y comenzar la pelea
        Pelea pelea = new Pelea();
        pelea.iniciarPelea(emisor, transformador);
    }
}

    

