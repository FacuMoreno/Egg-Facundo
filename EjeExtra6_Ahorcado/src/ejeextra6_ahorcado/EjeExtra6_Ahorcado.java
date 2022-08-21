/*Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra o 
se quede sin intentos. Este método se llamará en el main*/

package ejeextra6_ahorcado;

import Servicio.Servicio;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class EjeExtra6_Ahorcado {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Servicio s1 = new Servicio();
       s1.juego();
        
        
    }
    
}
