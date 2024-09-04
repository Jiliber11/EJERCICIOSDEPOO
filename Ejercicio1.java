
package ejerciciospoo242;

import java.util.Scanner;

/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.      */

public class Ejercicio1 {

 
    public static void main(String[] args) {
       
       int pc;
       double preciopc;
       preciopc = 500;
       double Totalpreciopc;
       
        Scanner sc = new Scanner(System.in);
        System.out.println(" ingrese el numero de pc que desea comprar");
       pc = sc.nextInt();
       
       if (pc < 5) {
         System.out.println(" tienes un 10% de descuento¡ ");
                 
       Totalpreciopc = pc*preciopc - (pc*preciopc) * 0.10; 
           System.out.println("el precio total de tu compra es de: " + Totalpreciopc);
       }
       
       
       
       else if (pc >= 5 && pc < 10) {
          System.out.println(" tienes un 20% de descuento¡ ");
                 
       Totalpreciopc = pc*preciopc - (pc*preciopc) * 0.20; 
           System.out.println("el precio total de tu compra es de: " + Totalpreciopc);   
       }
       
       else  {
           System.out.println(" has obtenido un 40% de descuento por tus pcs comprados");
             Totalpreciopc = pc*preciopc - (pc*preciopc) * 0.40; 
           System.out.println("el precio total de tu compra es de: " + Totalpreciopc); 
       }
       
       
           }
}
       
       
       
       
       
       
        
        
        
   
    

