/*
 18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje18_guia6Extra {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int a=entrada.nextInt();
        int vector[]=new int[a];
        cargaVector(vector,a);
       int suma= sumaVector(vector,a);
        mostrarVector(vector,a);
        System.out.println("");
        System.out.println("La suma de los elementos del vector es: "+suma);
               
        
    }
    public static void cargaVector(int vector[],int a){
        int b;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los numeros del vector...");
        for (int i = 0; i < a; i++) {
            
            b=entrada.nextInt();
            vector[i]=b;
            
        }
    }
    public static int sumaVector(int vector[],int a){
        int suma=0;
        for (int i = 0; i < a; i++) {
            suma=suma+vector[i];
        }
        return(suma);
    }
    public static void mostrarVector(int vector[],int a){
        for (int i = 0; i < a; i++) {
            System.out.print("["+vector[i]+"]");
            
        }
    }
}
