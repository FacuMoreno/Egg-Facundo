/*
 Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package Main;

import Entidad.Persona;
import java.util.Scanner;


public class Eje7 {

   
    public static void main(String[] args) {
        int imc=0;
        boolean mayoredad;
        
        Scanner entrada = new Scanner(System.in);
        Persona p1=new Persona();
        Persona p2=new Persona();
        Persona p3=new Persona();
        Persona p4=new Persona();
        p1.crearPersona();
        p2.crearPersona();
        p3.crearPersona();
        p4.crearPersona();
        p1.calcularIMC();
        p1.esMayorDeEdad();
        p2.calcularIMC();
        p2.esMayorDeEdad();
        p3.calcularIMC();
        p3.esMayorDeEdad();
        p4.calcularIMC();
        p4.esMayorDeEdad();
        
        
        
    }
    
}
