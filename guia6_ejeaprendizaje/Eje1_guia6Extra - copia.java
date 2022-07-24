/*
 1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje1_guia6Extra {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos:");
        int a=entrada.nextInt();
        double b=0;
        double c=0;
        int dia=0;
       
        b=a/60;
        b= Math.floor(b);
              
        while(b>=24){
            dia=dia+1;
              b=b-24;
        }
        System.out.println("La cantidad es: "+ dia +" dias " + ", " + b +" horas");
       
        
        
        
           
          
            
    }
    
}
