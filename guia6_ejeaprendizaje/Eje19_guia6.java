/*
 19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje19_guia6 {

   
    public static void main(String[] args) {
        
        int matriz[][]=new int[3][3];
        int matriz1[][]=new int[3][3];
        int matriz2[][]=new int[3][3];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("");
                
        matrizTraspuesta(matriz,matriz1);
        mostrarMatriz(matriz1);
        matrizSimetrica(matriz1,matriz2);
        System.out.println("");
        mostrarMatriz(matriz2);
    }
    public static void llenarMatriz(int matriz[][]){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese los numeros de la matriz ");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int a=entrada.nextInt();
                matriz[i][j]=a;
            }
        }
    }
   public static void  mostrarMatriz(int matriz[][]){
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
   }
   public static void matrizTraspuesta(int matriz[][],int matriz1[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz1[j][i]=matriz[i][j];
                
            }
        }
   }
   public static void matrizSimetrica(int matriz1[][],int matriz2[][]){
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz2[i][j]=matriz1[i][j]*-1;
                
            }
        }
   }
}
