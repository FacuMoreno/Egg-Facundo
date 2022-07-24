/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje21_guia6 {

    
    public static void main(String[] args) {
        
        int m[][]=new int[5][5];
        int p[][]=new int[3][3];
        int s[][]=new int[3][3];
        llenarMatriz(m,5);
        llenarMatriz(p,3);
        mostrarMatriz(m,5);
        System.out.println("");
        mostrarMatriz(p,3);
        subMatriz(m,5,p,3);
        
        
    }
    public static void llenarMatriz(int matriz[][],int n){
        Scanner entrada=new Scanner(System.in);
        int a;
        System.out.println("Ingrese los numeros de la matriz");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a=entrada.nextInt();
                matriz[i][j]=a;                
                
            }
        }          
    }
    public static void mostrarMatriz(int matriz[][],int n){
     for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("["+matriz[i][j]+"]");
                                
            }
            System.out.println("");
        }   
    }
     
    public static void subMatriz(int m[][], int n, int p[][], int a) {
        int con = 0;
        int fil = 0, col = 0;
        int pi = 0, pj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (p[0][0] == m[i][j]) {
                    fil = i;
                    col = j;
                    if (fil + 2 < n && col + 2 < n) {
                        for (int b = fil; b < fil + 3; b++) {
                            for (int c = col; c < col + 3; c++) {
                                if (p[pi][pj] == m[b][c]) {
                                    con = con + 1;
                                }
                                pj = pj + 1;
                            }
                            pj=0;
                            pi = pi + 1;
                        }
                        pi=0;
                        pj=0;
                    }
                    if (con == 9) {
                        System.out.println("La matriz P, si esta contenida en la Matriz M");
                        System.out.println("Empieza en :");
                                
                        System.out.println("Fila"+fil + ","+"Columna" + col);
                    }else{
                        System.out.println("La matriz P, NO esta contenida en M");
                    }

                }
            }
        }
}
}