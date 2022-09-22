
package guia7_eje4;

import Servicio.servicio;

/**
 *
 * @author facun
 */
public class Main {

   
    public static void main(String[] args) {
        
        servicio s1=new servicio();
        s1.crearPelicula();
        System.out.println("-------------");
        System.out.println("Listar peliculas ingresadas..");
        s1.mostrarPelicula();
        System.out.println("-------------");
        s1.mayorDuracion();
        System.out.println("--------------");
        s1.ordenarDuracionAscendente();
        System.out.println("-------------");
        s1.ordenarDuracionDescendente();
        System.out.println("-------------");
        s1.ordenarPorDirector();
        System.out.println("-------------");
        s1.ordenarPorTitulo();
                
        
    }
    
}
