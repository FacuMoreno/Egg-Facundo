/*
 6. Crear un programa que dado un numero determine si es par o impar.
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;
public class Eje6_guia6 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero :");
        int a = entrada.nextInt();
        int b = a % 2 ;
        if (b == 0) {
            System.out.println("el numero es par " );
        } else {
            System.out.println("El numero es impar ");
        }
    }

}
