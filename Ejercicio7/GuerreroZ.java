
package Ejercicio7;

    
   public abstract class GuerreroZ {
    protected String nombreGuerrero;
    protected int nivelPoder;
    protected String raza;
    protected int universo;
    protected String equipo;

    public GuerreroZ(String nombreGuerrero, int nivelPoder, String raza, int universo, String equipo) {
        this.nombreGuerrero = nombreGuerrero;
        this.nivelPoder = nivelPoder;
        this.raza = raza;
        this.universo = universo;
        this.equipo = equipo;
    }

    public void atacarGolpe() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Golpe");
    }

    public void atacarPatada() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Patada");
    }

    public void atacarCabezazo() {
        System.out.println("Soy " + nombreGuerrero + " y estoy atacando con Cabezazo");
    }
}

    

