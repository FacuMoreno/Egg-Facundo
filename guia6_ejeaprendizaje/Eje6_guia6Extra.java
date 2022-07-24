/*
 6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
debajo de 1.60 mts. y el promedio de estaturas en general
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;

public class Eje6_guia6Extra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a=0;
       // Scanner entrada1 = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de mediciones");
        int b = entrada.nextInt();
        double vector[] = new double[b];
        System.out.println("Ingrese las alturas:");
        for (int i = 0; i < b-1; i++) {
             a = entrada.nextDouble();
            vector[i]=a;
        }
        calculoAltura(vector, b);

    }

    public static void calculoAltura(double vector[], int b) {
        double alt = 0, alt1 = 0, alt2 = 0, alt3 = 0;
        for (int i = 0; i < b; i++) {
            if (vector[i] < 1.60) {
                alt = alt + 1;
                alt1 = alt1 + vector[i];
            } else {
                alt2 = alt2 + 1;
                alt3 = alt3 + vector[i];
            }

        }
        System.out.println("El promedio de altura menor a 1.60  es :"+alt1/alt);
         System.out.println("El promedio de altura   es :"+(alt1+alt2)/b );
    }

}
