/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;
public class Eje5_guia6 {

    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int a=entrada.nextInt();
        double b= a*a;
        double c= a*a*a;
        double d=Math.sqrt(a);
        System.out.println(" el doble del numero ingresado es: "+ b);
        System.out.println(" el triple del numero ingresado es: "+ c);
        System.out.println(" la raiz cuadrada del numero ingresado es: "+ d);
        
    }
    
}
