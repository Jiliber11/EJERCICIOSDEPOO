
package ejerciciospoo242;

import java.util.Scanner;

public class PracticarParcial1 {
    
    public static void main(String[] args) {
        
        int NcarrerasHockey[] = new int[6];
        for(int i = 0; i<NcarrerasHockey.length; i++){
            System.out.println("el dato que va en el indice" + i + " es ");
        NcarrerasHockey [i] = (int) (Math.random()*20);
            System.out.println("---"+NcarrerasHockey[i]);
        
        }
        Scanner sc = new Scanner(System.in);
        int DatosC[] = new int[5];
        int CodigoJinete;
        System.out.println(" ingrese el codigo del jinete");
        CodigoJinete = sc.nextInt();
        
        System.out.println("---");
       
        int CantDeCarrerasOcupando1=0;
        System.out.println("ingrese la cantidad de carreras ganadas");
        CantDeCarrerasOcupando1 = sc.nextInt();
        
        System.out.println("---");
        
        int CantDeCarrerasOcupando2=0;
        System.out.println("ingrese la cantidad de carreras en el 2 lugar");
        CantDeCarrerasOcupando2 = sc.nextInt();
        
        int CantDeCarrerasOcupando3=0;
        System.out.println("ingrese la cantidad de carreras en el 3 lugar");
        CantDeCarrerasOcupando3 = sc.nextInt();
       
        int PuntuacionL1 = 0;
        int PuntuacionL2 = 0;
        int PuntuacionL3= 0;
        int PuntuacionFinal = 0;   
        
        if(CantDeCarrerasOcupando1>=1){
        PuntuacionL1 = CantDeCarrerasOcupando1 * 5;
        }
        if(CantDeCarrerasOcupando2>=1){
        PuntuacionL2 = CantDeCarrerasOcupando2 * 3;
        }
        if(CantDeCarrerasOcupando3>=1){
        PuntuacionL3= CantDeCarrerasOcupando3;
                }
        PuntuacionFinal= PuntuacionL1 + PuntuacionL2 + PuntuacionL3;
        
        DatosC[0] = CodigoJinete;
        DatosC[1] = CantDeCarrerasOcupando1;
        DatosC[2] = CantDeCarrerasOcupando2;
        DatosC[3] = CantDeCarrerasOcupando3;
        DatosC[4] = PuntuacionFinal;
        
       System.out.println("codigo " + DatosC[0]);
       System.out.print("1puesto  " + DatosC[1]);
       System.out.print("2puesto  " + DatosC[2]);
       System.out.print("3puesto  " + DatosC[3]);
       System.out.print("puntuacion " + DatosC[4] );
        }
          //podio 
         
    
    
    
    
         }
        
        
        
        
        
    
    
    

 /*int CodigoJinete=0;
        int CantidadDeCarreras=0;
        int Puntuacion = 0;
        int DatosC[] = new int[5];
        DatosC[0] = CodigoJinete;
        DatosC[1] = CantidadDeCarreras;
        DatosC[1] = CantidadDeCarreras;
        DatosC[1] = CantidadDeCarreras;
        DatosC[1] = Puntuacion;*/


/*    int codigoJinete=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("ingresa el codigo del jinete");
        codigoJinete = sc.nextInt();
        int DatosC[] = new int[5];
         for(int e = 0; e<1; e++){
             System.out.println("el codigo del jinete es: " + );*/