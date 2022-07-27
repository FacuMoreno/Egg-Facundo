/*
 20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje20_guia6Extra {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int a=entrada.nextInt();
        int vector[]=new int[a];
        cargaVector(vector,a);
        System.out.println("");
        mostrarVector(vector,a);
        
        
        
    }
     public static void mostrarVector(int vector[], int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("[" + vector[i] + "]");

        }
    }
     public static void cargaVector(int vector[], int a) {
        int b;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los numeros del vector:");
        for (int i = 0; i < a; i++) {
            b = entrada.nextInt();
            vector[i] = b;

        }
    }
    
}
