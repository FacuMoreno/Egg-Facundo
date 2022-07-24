/*
 11. Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
de división. Nota: recordar que las variables de tipo entero truncan los números 
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje11_guia6Extra {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a=0,b=0,c=0;
        System.out.println("Ingrese un numero:");
        a=entrada.nextInt();
        do{

        b=a/10;
        a=b;
        c=c+1;
        
        }while(b>10);  
        System.out.println("Cantidad de digitos: "+c);
        
    }
    
}
