/*
 *Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona
 */
package guia8_eje1;

import entidad.Perro;
import entidad.Persona;

/**
 *
 * @author facun
 */
public class Guia8_Eje1 {

   
    public static void main(String[] args) {
        Perro p1=new Perro("uma","bull",5,"chico");
         Perro p2=new Perro("simon","dogo",4,"mediano");
         
         Persona pe1=new Persona("Facundo","Moreno",45,25247910);
         Persona pe2=new Persona("Gaston","Moreno",44,27657910);
         
         pe1.setPerro(p1);
         pe2.setPerro(p2);
         
         System.out.println(pe1.toString());
         System.out.println(pe2.toString());
        
    }
    
}
