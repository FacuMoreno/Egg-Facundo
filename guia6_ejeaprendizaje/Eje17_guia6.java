/*
 *17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje17_guia6 {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int a=entrada.nextInt();
        int vector[]=new int [a];
        llenarVector(vector,a);
        mostrarVector(vector,a);
        System.out.println("");
        calculaDigitos(vector,a);
    }
    
    public static void llenarVector(int vector[],int a){
         Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese los numeros del vector ");
        int b;
        for(int i=0;i<a;i++){
            b=entrada.nextInt();
            vector[i]=b;
        }
    }
    
    public static void mostrarVector(int vector[],int a){
         for(int i=0;i<a;i++){
             System.out.print("{"+vector[i]+"]");
        }
    }
    
    public static void calculaDigitos(int vector[], int a) {
        int con = 0, con1 = 0, con2 = 0, con3 = 0, con4 = 0;
        for (int i = 0; i < a; i++) {
            if (vector[i] < 10) {
                con = con + 1;
            } else if (vector[i] < 100) {
                con1 = con1 + 1;
            } else if (vector[i] < 1000) {
                con2 = con2 + 1;
            } else if (vector[i] < 10000) {
                con3 = con3 + 1;
            } else if (vector[i] < 100000) {
                con4 = con4 + 1;
            }
        }
        System.out.println(" la cantidad de numeros 1 digito es: " + con);
        System.out.println(" la cantidad de numeros 2 digito es: " + con1);
        System.out.println(" la cantidad de numeros 3 digito es: " + con2);
        System.out.println(" la cantidad de numeros 4 digito es: " + con3);
        System.out.println(" la cantidad de numeros 5 digito es: " + con4);
    }
}
