/*
 14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje14_guia6Extra {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias:");
        int flia=entrada.nextInt();
        int vector[]=new int[flia];
        cargaFlia(vector,flia);
        mostrar(vector,flia);
        calculoMedia(vector,flia);
        
    }
    public static void cargaFlia(int vector [],int flia){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de hijos por familia:");
        int hijos=0;
        for(int i=0;i<flia;i++){
            hijos=entrada.nextInt();
            vector[i]=hijos;
            
        }
    }
    public static void mostrar(int vector [],int flia){
        for(int i=0;i<flia;i++){
            System.out.print("["+i+"]");
           
        }
         System.out.println("");
    }
    public static void calculoMedia(int vector[],int flia){
        int cont=0,acum=0;
        for(int i=0;i<flia;i++){
            cont=cont+1;
            acum=acum+vector[i];
        }
        System.out.println("La media/ cant hijos x flia es: "+acum/cont);
    }
    
}
