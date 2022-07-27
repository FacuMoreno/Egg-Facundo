/*
 19. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos)

 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje19_guia6Extra {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int a = entrada.nextInt();
        int vector1[] = new int[a];
        int vector2[] = new int[a];
        cargaVector(vector1, a);
        cargaVector(vector2, a);
        mostrarVector(vector1, a);
        System.out.println("");
        mostrarVector(vector2, a);
        boolean d = comparaVectores(vector1, vector2, a);
        System.out.println("");
        if (d == true) {
            System.out.println("vectores iguales");
        } else {
            System.out.println("Los vectores no son iguales");
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

    public static void mostrarVector(int vector[], int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("[" + vector[i] + "]");

        }
    }

    public static boolean comparaVectores(int vector1[], int vector2[], int a) {
        boolean d;
        int c=0;
        for (int i = 0; i < a; i++) {
            if (vector1[i] == vector2[i]) {
                c=c+1;

            }
        }
        if (c == a) {
            d = true;
        } else {
            d = false;
        }
        return (d);
    }
}
