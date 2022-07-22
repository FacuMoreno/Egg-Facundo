/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje12_guia6 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String a = "";
        int con = 0, con1 = 0;
        boolean g = false;

        while (g == false) {
            System.out.println("Ingrese una frase:");
            a = entrada.nextLine();
            int b = a.length();
            String c = a.substring(0, 1);
            String d = a.substring(b - 1, b);

            boolean e = c.equals("x");
            boolean f = d.equals("o");
            g = a.equals("&&&&&");

            if ((b <= 5) && (e == true) && (f == true)) {
                System.out.println("FRASE CORRECTA");
                con = con + 1;

            } else if (g == true) {
                break;
            } else {

                System.out.println("FRASE INCORRECTA");
                con1 = con1 + 1;
            }

        }

        System.out.println("Lecturas correctas:" + con);
        System.out.println("Lecturas Incorrectas:" + con1);

    }

}
