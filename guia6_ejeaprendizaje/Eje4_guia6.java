/*
 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia6_ejeaprendizaje;
import java.util.Scanner;

public class Eje4_guia6 {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados :");
        double a=entrada.nextDouble();
        double f=32+(9* a/5);
        System.out.println("La temperatura en grados Fahrenheit es: " + f);
        
    }
    
}
