/*
 *2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje2_guia6Extra {

   
    public static void main(String[] args) {
        int a=0,b=0,c=0,d=0,e=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor para A :");
        a=entrada.nextInt();
        System.out.println("Ingrese un valor para B :");
        b=entrada.nextInt();
        System.out.println("Ingrese un valor para C :");
        c=entrada.nextInt();
        System.out.println("Ingrese un valor para D :");
        d=entrada.nextInt();
        System.out.println(" Valor A: "+a+" Valor B :"+b+" Valor C :"+c+" Valor D :"+d);
        e=b;
        b=c;
        c=a;
        a=d;
        d=e;
       System.out.println(" Valor A: "+a+" Valor B :"+b+" Valor C :"+c+" Valor D :"+d); 
        
    }
    
}
