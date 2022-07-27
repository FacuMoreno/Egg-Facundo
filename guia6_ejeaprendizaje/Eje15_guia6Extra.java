/*
 15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje15_guia6Extra {

   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        double c = 0;
        System.out.println("Ingrese 2 numeros:");
            int a = entrada.nextInt();
            int b = entrada.nextInt();
        
        do {
            
            System.out.println("");
            System.out.println("1-suma");
            System.out.println("2-resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Division");
            System.out.println("5-salir");
            System.out.println("");
            System.out.println("Ingrese la opcion deseada...");
            opc = entrada.nextInt();
            if (opc == 1) {
                c = sumar(a, b);
                System.out.println("La suma es: "+c);
            } else if (opc == 2) {
                c = restar(a, b);
                System.out.println("La resta es: "+c);
            } else if (opc == 3) {
                c = multiplicar(a, b);
                System.out.println("La multiplicacion es: "+c);
            } else if (opc == 4) {
                c = dividir(a, b);
                System.out.println("La division es :"+c);
            }
            if (opc == 5) {
                opc = 5;
            }
        } while (opc != 5);
        System.out.println("Elijio salir...");
        
    }
    public static double sumar(int a,int b){
        double c=a+b;
        return(c);
    }
    public static double restar(int a,int b){
        double c=a-b;
        return(c);
    }
    public static double multiplicar(int a,int b){
        double c=a*b;
        return(c);
    }
    
    public static double dividir(int a,int b){
        double c=a/b;
        return(c);
    }
}
