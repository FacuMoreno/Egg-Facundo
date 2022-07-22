/*
9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que 
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
la función Substring y equals() de Java.

 */
package guia6_ejeaprendizaje;

import java.util.Scanner;
public class Eje9_guia6 {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String a=entrada.nextLine();
        String b=a.substring(0,1);
       boolean c=b.equals("A");
       if(c==true){
           System.out.println("CORRECTO");
       }else{
           System.out.println("INCORRECTO");
       }
       
       
        
    }
    
}
