/*
 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
crear otra Pelicula o nothe template in the editor.
 */
package Servicio;

import Entidad.pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class servicio {
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    ArrayList<pelicula> peli =new ArrayList();
    
    
    
    public void crearPelicula(){
        String op="";
        do{
        
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo=entrada.next();
        System.out.println("Ingrese el director de la pelicula");
        String director=entrada.next();
        System.out.println("Ingrese la duracion de la pelicula");
        double duracion=entrada.nextDouble();
        
        peli.add(new pelicula(titulo,director,duracion));
            System.out.println("Desea ingresar otra pelicula?--s/n");
            op=entrada.next();
        
        }while(op.equalsIgnoreCase("s"));
        
    }
    
    //• Mostrar en pantalla todas las películas
    public void mostrarPelicula(){
        for (pelicula var : peli) {
            System.out.println(var.toString());
            
        }
    }
    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora
    
    public void mayorDuracion(){
        System.out.println("peliculas con duracion mayor a 1 hora de reproduccion");
        
        for (pelicula var : peli) {
            if(var.getDuracion()>1){
                System.out.println(var.toString());
            }
        }
    }
    //• Ordenar las películas de acuerdo a su duración ascendente y mostrarlo en pantalla

    
    public void ordenarDuracionAscendente(){
        System.out.println("Ordenar peliculas por Duracion Ascendente");
        Collections.sort(peli, CompararduracionAscendente);
        mostrarPelicula();
    }
    
    //• Ordenar las películas de acuerdo a su duración descendente y mostrarlo en pantalla
    
     public void ordenarDuracionDescendente(){
        System.out.println("Ordenar peliculas por Duracion Descendente");
        Collections.sort(peli, CompararduracionDescendente);
        mostrarPelicula();
    }
     //• Ordenar las películas de acuerdo a su titulo y mostrarlo en pantalla
    
      public void ordenarPorTitulo(){
        System.out.println("Ordenar peliculas por Titulo");
        Collections.sort(peli, compararPorTitulo);
        mostrarPelicula();
    }
      
      //• Ordenar las películas de acuerdo a su director y mostrarlo en pantalla
       public void ordenarPorDirector(){
        System.out.println("Ordenar peliculas por Director");
        Collections.sort(peli, compararPorDirector);
        mostrarPelicula();
    }
    
    
    private static Comparator<pelicula>CompararduracionDescendente=new Comparator<pelicula>(){
        @Override
        public int compare(pelicula t, pelicula t1) {
            double aux= t1.getDuracion()-t.getDuracion();
            if(aux>1){
                return 1;
            }
            if(aux<1){
                return -1;
            }
            return 0;
        }
            
        };
    
    private static Comparator<pelicula>CompararduracionAscendente=new Comparator<pelicula>(){
        @Override
        public int compare(pelicula t, pelicula t1) {
            double aux= t.getDuracion()-t1.getDuracion();
            if(aux>1){
                return 1;
            }
            if(aux<1){
                return -1;
            }
            return 0;
        }
            
        };
   
     private static Comparator<pelicula> compararPorTitulo=new Comparator<pelicula>(){
        @Override
        public int compare(pelicula t, pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
        
    };
    private static Comparator<pelicula> compararPorDirector=new Comparator<pelicula>(){
        @Override
        public int compare(pelicula t, pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
        
    };
    
}
