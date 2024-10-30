
package Ejercicio1;


public class Pikachu extends Pokemon implements IElectrico{

    @Override
    protected void atacarPlacaje() {
        System.out.println("pikachu ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("pikachu ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("pikachu ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("soy pikachu ataque impact trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("soy pikachu ataque punio trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("soy pikachu ataque rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("soy pikachu ataque rayo carga");
    }
    
}
