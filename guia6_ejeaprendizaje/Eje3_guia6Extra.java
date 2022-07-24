/*
 *3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje3_guia6Extra {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        String a=entrada.nextLine();
        a=a.toLowerCase();
        if(a.equals("a")==true||a.equals("e")==true||a.equals("i")==true||a.equals("o")==true||a.equals("u")==true){
            System.out.println("Es vocal");
        }else{
            System.out.println("No es vocal");
        }
    }
    
}
