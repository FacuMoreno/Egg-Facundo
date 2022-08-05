/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en 
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si 
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
package Entidad;

import java.util.Scanner;


public class Operacion_eje3 {
    Scanner entrada = new Scanner(System.in);
    private int numero1;
    private int numero2;

    public Operacion_eje3(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion_eje3() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void crearOperacion(){
        System.out.println("Ingrese primer numero");
        this.numero1=entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        this.numero2=entrada.nextInt();
    }
  // e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
    public int sumar(int numero1,int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    public int restar(int n1,int n2){
        int resta=n1-n2;
        return resta;
    }
    public double multiplicar(int n1,int n2){
        double mult=0;
        if(n1!=0 && n2!=0){
         mult=n1*n2;
        
        }else{
            System.out.println("Error..ingrese.numero distinto de cero");
        }
        return mult;
    }
    public double dividir(int n1,int n2){
        double dividir=0;
        if(n1!=0 && n2!=0){
         dividir=n1/n2;
        
        }else{
            System.out.println("Error...ingrese numero distinto cero");
        }
        return dividir;
    }
}
