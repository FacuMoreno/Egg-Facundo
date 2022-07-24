
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje21plus_guia6 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m[][]=new int[5][5];
        int p[][]=new int[3][3];
        int con=1;
        int con1=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                m[i][j]=con;
                con=con+1;
            }
        }
       for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("["+m[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("Ingrese los numeros de matriz p");
       
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int a=entrada.nextInt();
                p[i][j]=a;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+p[i][j]+"]");
            }
            System.out.println("");
        }
        
       
        int fil = 0, col = 0;
        int pi = 0, pj = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (p[0][0] == m[i][j]) {
                    fil = i;
                    col = j;
                    
                    if (fil + 2 < 5 && col + 2 < 5) {
                        for (int b = fil; b < fil+3; b++) {
                            for (int c = col; c < col + 3; c++) {
                                if (m[b][c]==p[pi][pj]  ) {
                                    con1 = con1 + 1;
                                   
                                }
                                
                                pj = pj + 1;
                            }
                            pj=0;
                            pi = pi + 1;
                        }
                        pj=0;
                        pi=0;
                    }
                    if (con1 == 9) {
                        System.out.println("La Matriz P si esta contenida en M");
                        System.out.println("Y la matriz P, empieza en :");
                        System.out.println("Fila"+fil + ","+"columna" + col);
                    }

                }
            }
        }
    }
    
}
