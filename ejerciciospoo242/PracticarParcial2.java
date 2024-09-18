
package ejerciciospoo242;

import java.util.Scanner;


public class PracticarParcial2 {
    
    public static void main(String[] args) {
        
        Double TipoServicio;
        Double TipoProducto;
        Double PesoTransportado = 0.0;
        Double TiempoPermanencia;
        Double LargoCamion;
        //costo por peso transportado
        Double CostoTransportado=0.0;
        //costo permanencia
        Double CostoPermanencia= 0.0;
        
        Double CostoTotalParqueadero=0.0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tipo de servicio. 1cargar--"
                + "--2descargar");
        TipoServicio = sc.nextDouble();
        
          System.out.println(" ingrese el tipo de producto.  1 perecedero"
                  + "----2no perecedero");
         TipoProducto = sc.nextDouble();
         
         System.out.println("ingrese el peso a transportar");
         PesoTransportado = sc.nextDouble();
         
         System.out.println("Ingrese el tiempo de permanencia(horas)");
         TiempoPermanencia = sc.nextDouble();
         
         System.out.println("ingrese el largoo del camion(metros)");
         LargoCamion = sc.nextDouble();
         
        if(TipoServicio == 2 && TipoProducto ==1 && PesoTransportado<8){
          PesoTransportado = PesoTransportado * 15000;
           
                   }
        if(TipoServicio == 2 && TipoProducto ==1 && PesoTransportado>=8){
        CostoTransportado = PesoTransportado * 9000;
        }
        
        if(TipoServicio == 2 && TipoProducto ==2 && PesoTransportado<8){
        CostoTransportado = 60.000;
        }
         if(TipoServicio == 2 && TipoProducto ==2 && PesoTransportado>=8 && PesoTransportado<=10){
        CostoTransportado = 60.000;
        
        } if(TipoServicio == 2 && TipoProducto ==2 && PesoTransportado>10){
        CostoTransportado = PesoTransportado* 7000;
        }
        
        //carga
        if(TipoServicio == 1 && TiempoPermanencia<=2){
            CostoPermanencia = 0.0;
        }
        if(TipoServicio == 1 && TiempoPermanencia>2 && LargoCamion>4){
            CostoPermanencia = TiempoPermanencia * 4000 + TiempoPermanencia *4000*0.25;
            
        }
        CostoTotalParqueadero = CostoPermanencia+CostoTransportado;
        
        Double Datosc [] = new Double[6];
        
        Datosc [0] = TipoServicio;
        Datosc [1] = TipoProducto;
        Datosc [2] = PesoTransportado;
        Datosc [3] = TiempoPermanencia;
        Datosc [4] = LargoCamion;
        Datosc [5] = CostoTotalParqueadero;
        
        for(int i=0; i<Datosc.length; i++){
           
            System.out.print("   " + Datosc[i]+ "    ");
        
        }
        
       // Double [][] = new Double [][]
        
        
        
    }
    
}

