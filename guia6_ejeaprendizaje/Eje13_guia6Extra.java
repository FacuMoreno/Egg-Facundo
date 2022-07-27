/*
 *13. Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
usuario al comenzar. Ejemplo: si se ingresa el número 3:
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje13_guia6Extra {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera:");
        int a=entrada.nextInt();
        int c=1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
                
            }
            c=c+1;
            System.out.println("");
        }
        
    }
    
}
