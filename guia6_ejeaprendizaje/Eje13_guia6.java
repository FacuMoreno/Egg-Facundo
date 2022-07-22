/*
 13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje13_guia6 {

   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos:");
        int a = entrada.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i > 1 && i < a && j > 1 && j < a) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}