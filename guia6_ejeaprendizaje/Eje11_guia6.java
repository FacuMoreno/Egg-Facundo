/*
 11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú
 */
package guia6_ejeaprendizaje;
import java.util.Scanner;

public class Eje11_guia6 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner ent = new  Scanner(System.in);
        int opc = 0;
        int bandera = 0;
        String c;
        System.out.println("Ingrese dos numeros..:");
        int a=entrada.nextInt();
        int b=entrada.nextInt();
        
               
        
        do {
            
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Elija la opcion: ");

            opc = entrada.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("La suma es: " + (a+b));
                    break;
                case 2:
                    System.out.println("La Rresta es: " + (a-b) );
                     break;
                case 3:
                    System.out.println("La Multiplicacion es: " + (a*b));
                     break;
                case 4:
                    System.out.println("La division es: "+(a/b));
                     break;
                case 5:
                    System.out.println("Esta seguro que desea salir..? Seleccione  S/N");
                    c=ent.nextLine();
                   c=c.toUpperCase();
                   boolean d=c.contains("S");
                   if(d==true){
                       bandera=1;
                   }
                    break;   
                   
                     
                   
                default:
                    System.out.println("OPCION INCORRECTA");
            }

        } while (bandera != 1);

        System.out.println("Gracias por utilizar nuestro Sistema");
        
        
        
        
    }
    
}
