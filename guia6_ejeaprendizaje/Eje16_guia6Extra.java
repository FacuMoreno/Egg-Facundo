/*
 16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje16_guia6Extra {

    public static void main(String[] args) {
        String a;
        boolean b=false;
        Scanner entrada = new Scanner(System.in);
         while (b==false){
             cargarNombreEdad();
            System.out.println("Desea cargar datos?:....SI/NO.");
            a = entrada.nextLine();
            a=a.toLowerCase();
           b=a.equals("no");
           
            
        }
        System.out.println("Gracias...");

    }
    public static void cargarNombreEdad(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingrese nombre ");
        nombre=entrada.nextLine();
        System.out.println("Ingrese edad:");
        edad=entrada.nextInt();
        if(edad>18){
            System.out.println("Nombre: "+nombre+ "  Edad: "+edad);
            System.out.println("Mayor de Edad");
        }else{
            System.out.println("Nombre: "+nombre+ "   Edad: "+edad);
            System.out.println("Menor de Edad");
        }
    }
}
