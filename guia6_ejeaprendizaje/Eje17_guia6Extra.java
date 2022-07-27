/*
 17. Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es 
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje17_guia6Extra {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean b;
        System.out.println("Ingrese un numero:");
        int a=entrada.nextInt();
       b= numeroPrimo(a);
       if(b==true){
           System.out.println("Es Primo");
       }else{
           System.out.println("No es Primo");
       }
        
    }
    public static boolean numeroPrimo(int a){
        boolean c;
        int b=0;
        
        if(a<=1||a==4){
            c=false;
        }
        for(int  i=1;i<=a;i++){
            if(a%i==0){
                    
                b=b+1;
            }
            
        }
        if(b==2){
            c=true;
        }else{
            c=false;
        }
      return(c); 
      
    }
    
}
