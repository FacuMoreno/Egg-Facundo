
package Servicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Servicio {

    Scanner entrada = new Scanner(System.in);
    HashSet<String> paises = new HashSet<>();
    String op = "";
    String p="";
    
    public void cargarPais() {
        
        do {
            System.out.println("Ingrese un pais");
            p = entrada.next();
            paises.add(p);
            System.out.println("");
            System.out.println("Desea ingresar otro pais?-->(s/n");
            op = entrada.next();
            
        } while (op.equalsIgnoreCase("s"));
       
        
    }
    
    public void mostrarPais(){
        for (String aux : paises) {
            System.out.println(aux);
            
        }
    }
    
    public void ordenarAlfabeticamente(){
        
        ArrayList<String> paisLista = new ArrayList(paises);
        Collections.sort(paisLista);
        
    }
    
    public void buscarPais() {
        String opc = "";
        int con =0;
        System.out.println("Ingrese pais a buscar");
        opc = entrada.next();
        Iterator iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(opc)) {
                iterator.remove();
                con=con+1;
            } 
            
                
            
        }
        if(con==0){
        System.out.println("Pais ingresado no existe...");
        };

    }
}
