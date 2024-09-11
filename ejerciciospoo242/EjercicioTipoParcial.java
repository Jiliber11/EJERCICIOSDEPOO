
package ejerciciospoo242;

import java.util.Scanner;

        /*Construya un programa que capture las tres califcaciones de un curso
        de n estudiantes (máximo 50) para un curso de la USCO.
Las notas son valores entre 0 y 5 y deben validarse.
Para almancenar las notas debe usar una matriz.
El programa tiene los siguientes requerimientos:
Calcular la nota definitiva usando promedio ariméticos y almacenarlo en un vector.
De forma alternativa, debe calcular la definitiva usando promedio
ponderado de la siguiente forma:
Nota:25%;
Nota2:30%;
Nota3:45%;
Esta nueva nota debe almacearse en otro vector.
Determine la catidad de alumnos que pasan el curso usando cada uno de los métodos
        de cálculo de la definitiva anteriores.
Determine las notas máxima y minima de vada corte.*/

public class EjercicioTipoParcial {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int MAX_ESTUDIANTES = 50;
        int NCORTES = 3;
        int estu;
        
        System.out.print("Ingrese el número de estudiantes (máximo 50): ");
        estu = sc.nextInt();
        
        if (estu > MAX_ESTUDIANTES || estu <= 0) {
            System.out.println("Número de estudiantes no válido. Debe estar entre 1 y 50.");
            return;
        }
        double[][] notas = new double[estu][NCORTES];
        
         // Vectores para almacenar las notas finales
        double[] promedioAritmetico = new double[estu];
        double[] promedioPonderado = new double[estu];
  
        //
        // Variables para almacenar las notas máximas y mínimas de cada corte
        double[] maxNota = new double[NCORTES];
        double[] minNota = new double[NCORTES];
        
    }
    
    
}
