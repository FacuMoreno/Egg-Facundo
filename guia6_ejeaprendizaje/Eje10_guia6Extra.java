/*
 10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java.
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje10_guia6Extra {

    
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Adivine la multiplicacion");
            
            a = (int) (Math.random() * 10);
            b = (int) (Math.random() * 10);
            c = a * b;
            System.out.println("a="+a+"  b="+b);
            d=entrada.nextInt();
           
        } while (c != d );

    }

}
