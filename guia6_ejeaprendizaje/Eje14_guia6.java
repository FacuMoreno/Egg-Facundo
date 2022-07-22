/*
 *14. Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 he template in the editor.
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje14_guia6 {

    
    public static void main(String[] args) {
       
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros:");
        double a=entrada.nextDouble();
        System.out.println("Ingrese la moneda a convertir");
        String moneda=entrada.next();
        cambio(a,moneda);
        
    }
    public static void cambio(double a,String moneda){
      
        switch(moneda){
            case "libras":
                System.out.println("La cantidad de Libras es:"+ a*0.86);
                break;
            case "dolares":
                System.out.println("La cantidad de Dolares es:"+a*1.28);
                break;
            case "yenes":
                System.out.println("La cantidad de Yenes es:"+a*129.852);
                break;
            default:
                System.out.println("Ingreso Incorrecto");
            
        }

}
}
