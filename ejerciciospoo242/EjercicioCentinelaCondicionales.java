
package ejerciciospoo242;
  
    
    
    import java.util.Scanner;

public class EjercicioCentinelaCondicionales {

   
    public static void main(String[] args) {
        
        //sabemos que es un bucle
        //sabemos la condición de salida
        //qué estructura usar
        
        System.out.println("Ingrese una palabra");
        Scanner teclado = new Scanner (System.in);
        String palabra = teclado.next();
        
        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La palabra es: " + palabra); 
            
            System.out.println("Ingrese una palabra");
            palabra = teclado.next();
        }
        
        
    }
    
}
    

