
package Ejercicio1;

public class Squirtle extends Pokemon implements IAgua{

    @Override
    protected void atacarPlacaje() {
        System.out.println("soy squirtle ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("squirtle ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("squirtle ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("squirtle ataque hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("squirtle ataque pistola agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("squirtle ataque burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("squirtle ataque hidroopulso");
    }
    
}
