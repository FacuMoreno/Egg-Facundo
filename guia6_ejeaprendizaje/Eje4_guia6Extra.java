/*
 *4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje4_guia6Extra {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a=0;
       
         System.out.println("Ingrese un numero del 1 al 10:");
         a=entrada.nextInt();
         numeroRomano(a);
        
            
    }
    public static void numeroRomano(int a){
        switch(a){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                 break;
            case 3:
                System.out.println("III");
                 break;
            case 4:
                System.out.println("IV");
                 break;
            case 5:
                System.out.println("V");
                 break;
            case 6:
                System.out.println("VI");
                 break;
            case 7:
                System.out.println("VII");
                 break;
            case 8:
                System.out.println("VIII");
                 break;
            case 9:
                System.out.println("IX");
                 break;
            case 10:
                System.out.println("X");
                 break;
            default:
                System.out.println( "Numero incorrecto");
                   
            
        }
    }
    
}
