/*
 16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje16_guia6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de vector");
        int a = entrada.nextInt();
        
        int vector[] = new int[a];
        llenarVector(vector, a);
        mostrarVector(vector, a);
        System.out.println("");
       
        System.out.println("Ingrese el numero a buscar en el vector");
        int b=entrada.nextInt();
         buscarNumero( vector,a, b);
        
    }

    public static void llenarVector(int vector[], int a) {
        for (int i = 0; i < a; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }    
    

    public static void mostrarVector(int vector[], int a) {
         for (int i = 0; i < a; i++) {
             System.out.print("["+vector[i]+"]");
        }
    }

    public static void buscarNumero(int vector[], int a, int b) {
        int con = 0;

        for (int i = 0; i < a; i++) {
            if (b == vector[i]) {
                System.out.println("el numero " + vector[i] + " en la posicion " + i);
                con = con + 1;
            }
        }
        if(con!=0){
            System.out.println("El numero se encontro la siguiente cantidad de veces: "+con);
        }else{
            System.out.println("El numero ingresado no se encontro...");
        }
    }
}
