/*
 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;
public class Eje1_guia6 {

    
    public static void main(String[] args) {
        int c;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int a=entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b=entrada.nextInt();
        c=a+b;
        System.out.println("La suma es:" + c);
    }
    
}
