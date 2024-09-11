
package ejerciciospoo242;

import java.util.Scanner;


/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.*/

public class Ejercicio4 {
    
    
    public static void main(String[] args) {
        
      double kilosC = 0;
      float precioP = 500;
      double descuento = 0.0;
      double totalPrecio;
      double PrecioConDescuento;
      
      
        System.out.println("ingresa la cantidad de kilos que vas a comprar");
      Scanner sc = new Scanner(System.in);
      
       kilosC = sc.nextDouble();
       
       
      if (kilosC >10.01) {
       descuento = 0.20; 
      } 
      else if(kilosC > 5.01){
        
      descuento = 0.15;
    } else if (kilosC >2.01) {
            descuento=0.10;
    
}
      totalPrecio = kilosC * precioP;
      
        System.out.println("el precio que que pagarias sin descuento es de:" + totalPrecio);
      
      PrecioConDescuento = totalPrecio - (totalPrecio*descuento);
      
        System.out.println(" el precio que pagaras con el descuento que se te aplica será de : " + PrecioConDescuento);
        
        
        
        
    }
    
}
