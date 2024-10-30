
package Ejercicio9;


    
    class SakuraHaruno extends Ninja implements IGenjutsu {
    public SakuraHaruno(int edad, String aldea, int nivelChakra) {
        super("Sakura Haruno", edad, aldea, nivelChakra);
    }

    @Override
    public void atacarIlusionOscura() {
        if (tieneChakraSuficiente(10)) {
            System.out.println("Soy " + nombre + " y estoy usando Ilusión Oscura.");
        }
    }

    @Override
    public void atacarParalisisMental() {
        if (tieneChakraSuficiente(12)) {
            System.out.println("Soy " + nombre + " y estoy usando Parálisis Mental.");
        }
    }
}

    

