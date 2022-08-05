/*
 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con 
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidad;

import java.util.Scanner;


public class Rectangulo_eje4 {
    Scanner entrada = new Scanner(System.in);
    private int base;
    private int altura;

    public Rectangulo_eje4() {
    }

    public Rectangulo_eje4(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        System.out.println("Ingrese la base");
        this.base=entrada.nextInt();
        System.out.println("Ingrese altura");
        this.altura=entrada.nextInt();
        
    }
    public int calculosuperficie(){
        int sup=0;
        sup=this.base*this.altura;
        return sup;
        
    }
    public int calculoPerimetro(){
        int per=0;
        per=(2*base)+(2*altura);
        return per;
    }
   public void dibujar(int base,int altura){
       for (int i = 0; i < base; i++) {
           for (int j = 0; j < altura; j++) {
               System.out.print("*");
               
           }
           System.out.println("");
           
       }
   }
}
