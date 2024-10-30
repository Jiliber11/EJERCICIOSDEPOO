
package Ejercicio1;


public abstract class Pokemon {
    
    int num_pokedex;
    String nombrePokemon;
    double pesoPokemon;
    String sexo;
    String temporadaQueAparece;
    String tipo;
    
    //constructor

    public Pokemon() {
    }
    
    
    //metodos
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
    
}
