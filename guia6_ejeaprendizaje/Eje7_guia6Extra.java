/*
 7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
de n números (n>0). El valor de n se solicitará al principio del programa y los números 
serán introducidos por el usuario. Realice dos versiones del programa, una usando el 
bucle “while” y otra con el bucle “do - while”.
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje7_guia6Extra {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a promediar:");
        int a=entrada.nextInt();
        int max=0,min=0,prom=0,con=0,suma=0;
        
        while(con<=a){
            System.out.println("Ingrese un numero:");
            int n=entrada.nextInt();
            suma=suma+n;
            con=con+1;
            if(con==1){
                max=n;
                min=n;
            }
            if(n>max){
                max=n;
            }else if (n<min){
                min=n;
            }
        }
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);
        System.out.println("El promedio es: "+suma/con);
    }
    
}
