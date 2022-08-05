
package Main;

import Entidad.Cafetera;
import java.util.Scanner;


public class Eje6 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double tamanioTaza=100;
      
        Cafetera c1=new Cafetera();
        
        c1.llenarCafetera();
        c1.servirTaza(tamanioTaza);
        c1.agregarCafe();
        c1.servirTaza(tamanioTaza);
        c1.servirTaza(tamanioTaza);
        c1.vaciarCafetera();
        c1.agregarCafe();
        c1.servirTaza(tamanioTaza);
        c1.servirTaza(tamanioTaza);
        c1.agregarCafe();
        
    }
    
}
