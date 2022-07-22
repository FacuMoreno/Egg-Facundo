/*
 7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;
public class Eje7_guia6 {

    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String a=entrada.nextLine();
        boolean b=a.equals("eureka");
        if(b==true){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
    
}
