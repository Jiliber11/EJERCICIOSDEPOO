
package Ejercicio1;

public class Charmander extends Pokemon implements IFuego{

    @Override
    protected void atacarPlacaje() {
        System.out.println("charm ataque placaje!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("charm ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("charm ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("soy charm ataque punio fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("soy charm ataque ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("soy charm ataque lanxa llamas");
    }
    
}
