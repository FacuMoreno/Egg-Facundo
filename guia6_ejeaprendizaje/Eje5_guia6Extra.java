/*
 5. Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
tratamientos. 
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje5_guia6Extra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el tipo de socio... A/B/C...:  ");
        String a = entrada.nextLine();
        a = a.toUpperCase();
        double b = 0;
        double c = 0;
        switch (a) {
            case "A":
                System.out.println("Ingrese el monto del tratamiento:");
                b = entrada.nextDouble();
                c = b - (b * 50 / 100);
                System.out.println("Socio tipo A");
                System.out.println("El costo del tratamiento es con 50% desc. : " + "$"+ c);
                break;
            case "B":
                System.out.println("Ingrese el monto del tratamiento:");
                b = entrada.nextDouble();
                System.out.println("Socio tipo B");
                c = b - (b * 35 / 100);
                System.out.println("El costo del tratamiento es con 35% desc. : " +"$"+ c);
                break;
            case "C":
                System.out.println("Ingrese el monto del tratamiento:");
                b = entrada.nextDouble();
                System.out.println("Socio tipo C");
                System.out.println("El costo del tratamiento es sin desc. : " +"$"+ c);
                break;
            default:
                System.out.println("OPCION INCORRECTA::");
        }

    }

}
