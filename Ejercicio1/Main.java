
package Ejercicio1;


public class Main {
    
    public static void main(String[] args) {
        
        Squirtle squirtle = new Squirtle();
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bulbassaur bulb = new Bulbassaur();
        
        
        squirtle.atacarHidrobomba();
        pika.atacarRayoCarga();
        charm.atacarPunioFuego();
        bulb.atacarAraniazo();
        
        
        System.out.println("------------");
        
        pika.atacarImpactrueno();
        charm.atacarPunioFuego(); 
    }
    
}
