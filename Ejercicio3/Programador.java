
package Ejercicio3;


public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    // Constructores
    public Programador(String nombre, String dni, int edad, boolean casado, double salario,
                       int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    
    public Programador() {
        super();
        this.lineasDeCodigoPorHora = 0;
        this.lenguajeDominante = "";
    }

    // Getters y setters
    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    // Método 
    public double calculaSalario() {
        return 10 * lineasDeCodigoPorHora;
    }

    // Sobrescribi el método toString para incluir los atributos adicionales
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Líneas de Código por Hora: " + lineasDeCodigoPorHora + "\n" +
               "Lenguaje Dominante: " + lenguajeDominante + "\n" +
               "Salario Calculado (según líneas de código): $" + calculaSalario();
    }
}

    

