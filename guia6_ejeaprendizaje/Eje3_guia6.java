/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;
public class Eje3_guia6 {

  
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String a=entrada.nextLine();
        String b=a.toUpperCase();
        String c=a.toLowerCase();
        System.out.println("La frase ingresada es: "+ a);
        System.out.println("La frase ingresada es: "+ b);
        System.out.println("La frase ingresada es: "+ c);
        
    }
    
}
