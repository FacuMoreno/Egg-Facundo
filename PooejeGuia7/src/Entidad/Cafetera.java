/*
 *Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual 
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada
 */
package Entidad;

import java.util.Scanner;


public class Cafetera {
    Scanner entrada = new Scanner(System.in);
    private double capacidadmaxima=1000;
    private double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public double getCapacidadmaxima() {
        return capacidadmaxima;
    }

    public void setCapacidadmaxima(double capacidadmaxima) {
        this.capacidadmaxima = capacidadmaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

   
    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    
    public void llenarCafetera(){
        double cargaCafe=0,carga=0;
       cargaCafe=capacidadmaxima-cantidadActual;
       System.out.println("Ingrese la siguiente cantidad de cafe..." +cargaCafe+" cm.. para llenar la  cafetera");
        carga=entrada.nextDouble();
        cantidadActual=cantidadActual+carga;
        System.out.println("La cantidad de cafe disponible es: "+cantidadActual);
 
    }
    /*Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.*/
    
    public double servirTaza(double tamanioTaza){
       if(cantidadActual<tamanioTaza){
           tamanioTaza=cantidadActual;
           System.out.println("no alcanza para llenar la taza, se sirve lo que quede.."+ tamanioTaza+" cm");
       }else{
           cantidadActual=cantidadActual-tamanioTaza;
           System.out.println("Se sirvio una taza de cafe...el cafe restante es..."+ cantidadActual);
       }
       return cantidadActual;
    }
    //• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(){
        cantidadActual=0;
        System.out.println("La cafetera se vacio..."+ cantidadActual);
    }
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
//recibe y se añade a la cafetera la cantidad de café indicada
    public void agregarCafe(){
        System.out.println("Ingresar cafe...la cargamaxima es.."+capacidadmaxima+" la cantidad actual de cafes es..."+cantidadActual);
        double cargacafe=entrada.nextDouble();
        cantidadActual=cargacafe+cantidadActual;
        if(cantidadActual==capacidadmaxima){
            System.out.println("Cafetera completa");
        }else{
            System.out.println("La cafetera contiene..."+cantidadActual);
            
        }
    }
}