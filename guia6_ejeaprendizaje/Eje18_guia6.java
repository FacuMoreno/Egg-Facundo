/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa)
 */
package guia6_ejeaprendizaje;


public class Eje18_guia6 {

   
    public static void main(String[] args) {
        int matriz[][]=new int[4][4];
        int matriz1[][]=new int[4][4];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("");
        matriztraspuesta(matriz,matriz1);
        mostrarMatriz(matriz1);
    }
    public static void llenarMatriz(int matriz[][]){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]= (int)( Math.random()*10);
            }
        }
    }
    public static void mostrarMatriz(int matriz[][]){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static void matriztraspuesta(int matriz [][], int matriz1[][]){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz1[j][i]=matriz[i][j];
             //   System.out.print("["+matriz[j][i]+"]");
            }
           // System.out.println("");
        }
    }
}
