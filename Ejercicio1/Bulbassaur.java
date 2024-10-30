
package Ejercicio1;


public class Bulbassaur extends Pokemon implements IPlanta{

    @Override
    protected void atacarPlacaje() {
        System.out.println("bubassuour ataque placaje!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("bulbassour ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("bulbasaur ataque mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("bulbasaur ataque paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("bulbasaur ataque drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("bulbasaur ataque hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("bulbassaur ataque latigo cepa");
    }
    
    
    
}
