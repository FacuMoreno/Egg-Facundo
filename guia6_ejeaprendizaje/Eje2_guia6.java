/*
 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla.
 */
package guia6_ejeaprendizaje;
import java.util.Scanner;
public class Eje2_guia6 {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String a=entrada.nextLine();
        System.out.println("tu nombre es: " + a);
        
    }
    
}
