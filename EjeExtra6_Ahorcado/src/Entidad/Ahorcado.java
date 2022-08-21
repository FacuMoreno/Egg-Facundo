/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como 
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los 
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado*/

package Entidad;

/**
 *
 * @author facun
 */
public class Ahorcado {

    private String vector[];   
    private int cantEncontradas;
    private int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] vector, int cantEncontradas, int cantJugadas) {
        this.vector = vector;
        this.cantEncontradas = cantEncontradas;
        this.cantJugadas = cantJugadas;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getCantEncontradas() {
        return cantEncontradas;
    }

    public void setCantEncontradas(int cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    

    
   
   }
    
    
    
    

