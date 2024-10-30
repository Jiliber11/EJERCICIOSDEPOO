
package Ejercicio16;

    
    public class Pelea{
    public void iniciarPelea(Personaje p1, Personaje p2) {
        System.out.println("¡Comienza la pelea entre " + p1.getNombre() + " y " + p2.getNombre() + "!\n");

        // Activar y usar habilidades
        System.out.println("Habilidades en acción:");
        p1.usarHabilidad();
        p2.usarHabilidad();

        // Mostrar energía restante de cada personaje
        System.out.println("Energía restante:");
        System.out.println(p1.getNombre() + ": " + p1.getEnergiaNen());
        System.out.println(p2.getNombre() + ": " + p2.getEnergiaNen());
    }
}

    

