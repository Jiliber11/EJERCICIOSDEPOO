
package ejerciciospoo242;

import java.util.Scanner;

/*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.*/



public class Ejercicio2 {
    
    
    public static void main(String[] args) {
        
     int precio;
     int llantasCompradas;
      Scanner sc = new Scanner(System.in);
        System.out.println("cuantas llantas vas a comprar?");
      llantasCompradas = sc.nextInt();
     
     if (llantasCompradas < 5){
     precio = llantasCompradas*100;
         System.out.println("el precio que pagaras por cada llanta es de 100usd");
         System.out.println(" el precio total por la cantidad de " +llantasCompradas+  " llantas compradas es de " + precio +"usd");
     }
     else if (llantasCompradas >= 5 && llantasCompradas <= 10){
         precio = llantasCompradas*75;
         System.out.println("el precio que pagaras por cada llanta es de 75usd");
      System.out.println("el precio total por la cantidad de " + llantasCompradas + " llantas compradas es de " + precio +"usd");
      
     }
     else {
     precio= llantasCompradas*50;
         System.out.println("el precio que pagaras por cada llanta es de 50usd");
         System.out.println(" el precio total por la cantidad de " + llantasCompradas + " llantas compradas es de " + precio +"usd");
         
     }  
        
        
        
        
    }
   
    
}
