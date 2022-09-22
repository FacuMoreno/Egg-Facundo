/*1-
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList. e template in the editor.


 */
package guia7_eje1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Guia7_Eje1 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        String op="";
        List<String> perros =new ArrayList();
        do{
            System.out.println("Ingrese la raza del perro");
            perros.add(entrada.next());
            System.out.println("");
            System.out.println("Desea seguir cargando perros?--->s/n");
            op=entrada.next();
            
        
    }while(op.equals("s"));
        for (String var : perros) {
            System.out.println("Raza : "+var);
        }
       
    /*
     2-Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
     un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
     está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
     ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
     la lista ordenada.  
      */  
         int con=0;
        System.out.println("Ingrese la raza de un perro a buscar...");
        String p1=entrada.next();
        Iterator<String> it = perros.iterator();
       
        while(it.hasNext()){
            if(it.next().equalsIgnoreCase(p1)){
                it.remove();
                con=con+1;
      
            }else if (con==0){
                System.out.println("El perro no se encontro en la lista");
            }
        }
        
        for (String var : perros) {
            System.out.println(var);
            
        }
        
}
}
