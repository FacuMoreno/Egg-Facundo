/*
 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����)

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Circunferencia_eje2 {
    Scanner entrada = new Scanner(System.in);
    private double radio;

    public Circunferencia_eje2(double radio) {
        this.radio = radio;
    }

   /* public Circunferencia_eje2() {
    }*/
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearcircunferencia(){
        System.out.println("Ingrese el radio");
        this.radio=entrada.nextInt();
        
    }
    public void area(){
        double area=0;
        area=(Math.PI*radio);
        System.out.println("El area es: "+area);
    }
    public void perimetro(){
        double per=0;
        per=2*(Math.PI)*radio;
        System.out.println("El perimetro es: "+per);
    }
}
