/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje9_guia6Extra {

    
    public static void main(String[] args) {
        int a=0,b=0,c=0,con=0;
        Scanner entrada = new Scanner(System.in);
        do{
        System.out.println("Ingrese 2 numeros enteros mayor que 1 :");
         a=entrada.nextInt();
         b=entrada.nextInt();
        }while(a<1 || b<1 || a<b);
        do{
            c=a-b;
            con=con+1;
            a=c;
        }while(c>b);
        System.out.println("cociente es :"+con);
        System.out.println("El resto es: "+c);
        
    }
    
}
