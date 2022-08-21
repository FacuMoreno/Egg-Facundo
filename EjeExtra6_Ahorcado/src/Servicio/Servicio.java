/*• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con 
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la 
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el 
valor que ingresó el usuario y encontradas en 0.*/

package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Servicio {
    Scanner entrada = new Scanner(System.in);
     Ahorcado a1=new Ahorcado();
     int con=0;
     
    public void crearJuego() {

        System.out.println("Ingrese la frase..");
        String pal = entrada.next();
        System.out.println("Ingrese la cantidad de jugadas maximas..");
        a1.setCantJugadas(entrada.nextInt());
        a1.setCantEncontradas(0);

        String vector1[] = new String[pal.length()];
        for (int i = 0; i < pal.length(); i++) {
            vector1[i] = pal.substring(i, i + 1);
        }
        a1.setVector(vector1);

    }

    
    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
   //buscar como se usa el vector.length.
   public void longitud(){
       System.out.println("La longitud de la palabra es: "+a1.getVector().length );
   }


    //Método buscar(letra): este método recibe una letra dada por el usuario y busca sila 
    //letra ingresada es parte de la palabra o no. También informará si la letra estaba o no

   public boolean buscar( String letra){
       con=0;
       for (int i = 0; i < a1.getVector().length; i++) {
           if(letra.equals(a1.getVector()[i])){
               con=con+1;   
           }      
       }
       if (con>0){
           con=a1.getCantEncontradas()+con;
           a1.setCantEncontradas(con);
           System.out.println("La letra pertenece a la palabra");
       }else{
           System.out.println("La letra no pertenece a la palabra");
       }
       
      return con>0;
   }
  
    /*Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
busque una letra que no esté, se le restará uno a sus oportunidades*/
    
   public boolean encontradas(String letra){
       
       if(buscar(letra)){
           return true;
       }else{
           intentos();
           return false;
       }
   }
   
    //Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public void intentos(){
        int oport = a1.getCantJugadas()-1;
           a1.setCantJugadas(oport);
    }
    
    public void juego() {

        crearJuego();
        longitud();

        do {

            System.out.println("-----------------------------------------");
            System.out.print("Ingrese una letra ---> ");
            String letra = entrada.next();

            if (encontradas(letra)) {

                msjCantidadLetra();

            } else {
                msjCantidadLetra();
            }

        } while (a1.getCantJugadas()> 0 && a1.getVector().length != a1.getCantEncontradas());

        if (a1.getCantJugadas()== 0) {

            System.out.println("--------------------------------------");
            System.out.println("Lo sentimos, no hay mas oportunidad");
            System.out.println("--------------------------------------");

        } else if (a1.getCantEncontradas()== a1.getVector().length) {

            System.out.println("---------------------------------------");
            System.out.println("FELICIDADES HAS ENCONTRADO LA PALABRA");
            System.out.println("----------------------------------------");
        }

    }

    public void msjCantidadLetra() {

        System.out.println(
                "\nNumero de letras --> (encontradas, faltantes) : ( " + a1.getCantEncontradas()+ " , "
                + (a1.getVector().length - a1.getCantEncontradas()) + ")");

        System.out.println("\nEl numero de oportunidades restantes --> " + a1.getCantJugadas());
    }

    
}  
    
    

