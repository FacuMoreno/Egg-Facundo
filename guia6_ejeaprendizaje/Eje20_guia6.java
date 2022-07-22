/*
 20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje20_guia6 {

    
    public static void main(String[] args) {

        int matriz[][] = new int[3][3];

        boolean b = false;
        while (b == false) {

            llenarMatriz(matriz);
            b = comprobarMatriz(matriz);
        }

        mostrarMatriz(matriz);
        boolean d=cuadradomagico(matriz);
        if(d==true){
            System.out.println("La matriz  es Cuadrado Magico");
        }else{
            System.out.println("La matriz no es cuadrado magico");  
        }
        

    }
    
    public static void llenarMatriz(int matriz[][]) {
        Scanner entrada = new Scanner(System.in);
       int a;
        System.out.println("Ingrese los numeros de la matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a = entrada.nextInt();

                matriz[i][j] = a;

            }
        }
    }
        
     public static void mostrarMatriz(int matriz[][]){
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.print("["+matriz[i][j]+"]");
             }
             System.out.println("");
         }

     }      
    public static boolean comprobarMatriz(int matriz[][]) {
        boolean b = false;
        int c = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] < 10) {
                    c = c + 1;
                }

            }

        }
        if (c == 9) {
            b = true;
        } else {
            b = false;
        }
        return (b);
    }
    public static boolean cuadradomagico(int matriz[][]){
        int fil=0,col=0,diag=0;
        boolean d;
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
               fil= fil+ matriz[0][j] ;
               col= col + matriz[i][0];
               diag=matriz[0][0]+matriz[1][1]+matriz[2][2];
             }
             
         }
         fil=fil/3;
         col=col/3;
         
         System.out.println("fila= "+fil+ "columna ="+col+"diagonal="+diag);
         if(fil==col && fil==diag){
             d=true;
             } else {
             d=false;
         }  
         return(d);
    }
     
    }
