
package Main;

import Entidad.Cadena_eje8;
import java.util.Scanner;


public class Eje8 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cadena_eje8 c1 = new Cadena_eje8();
        System.out.println("Ingrese una frase..");
        c1.setFrase(entrada.nextLine());
        c1.setLongitud(c1.getFrase().length());
        c1.mostrarVocales();
        c1.invertirFrase();
        System.out.println("");
        System.out.println("Ingrese un caracter..");
        c1.vecesRepetido(entrada.nextLine());

        System.out.println("Ingrese una frase a comparar...");
        if (c1.compararLongitud(entrada.nextLine().length()) == true) {
            System.out.println("Las frases tienen la misma longitud " + c1.getLongitud());
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }
        System.out.println("Ingrese una frase a unir...");
        c1.unirFrases(entrada.nextLine());
        System.out.println("Ingrese un caracter para remplazo de a");

        c1.reemplazar(entrada.next());
        System.out.println("Ingrese un caracter a controlar en la cadena");
        if (c1.contiene(entrada.next()) == true) {
            System.out.println("el caracter esta contenido en la cadena");
        } else {
            System.out.println("el caracter NO esta contenido en la cadena");
        }

    }

}
