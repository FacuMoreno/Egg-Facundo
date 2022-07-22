/*
10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 */
package guia6_ejeaprendizaje;
import java.util.Scanner;
public class Eje10_guia6 {

   
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese valor limite positivo:");
        int a=entrada.nextInt();
        int c=0;
       do{
           System.out.println("Ingrese valores");
           int b=entrada.nextInt();
           c=c+b;
           
       } while(c<=a);
        System.out.println("la suma de los numeros ingresados supero el limite "+c);
    }
    
}

