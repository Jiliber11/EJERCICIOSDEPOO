
package Ejercicio7;



    public class Main {
    public static void main(String[] args) {
        Goku goku = new Goku(9000, 7);
        Vegeta vegeta = new Vegeta(8500, 7);
        Piccolo piccolo = new Piccolo(7500, 7);
        Androide17 androide17 = new Androide17(8000, 7);
        Goku goku2 = new Goku (2000, 3);
        
        goku2.atacarOndaVital();
        // Ataques básicos
        goku.atacarGolpe();
        vegeta.atacarPatada();
        piccolo.atacarCabezazo();
        androide17.atacarGolpe();

        // Ataques especiales de cada tipo
        goku.atacarKamehameha();
        vegeta.atacarFinalFlash();
        piccolo.atacarCañonEspecial();
        androide17.atacarRayoMortal();
        
        
    }
}

    
    

