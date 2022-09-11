/*
 3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
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
informa al usuario. Si no, se hace la división y se devuelve el resultado al main
 */
package eje3_guia7;

import Entidad.Operacion;
import ServicioOperacion.servicio;


public class Eje3_guia7 {

    
    public static void main(String[] args) {
        servicio s1 =new servicio();
        Operacion op1=s1.crearOperacion();
        System.out.println("La suma es: "+s1.sumar(op1));
        System.out.println("La resta es: "+s1.restar(op1));
        System.out.println("La multiplicacion es: "+s1.multiplicar(op1)); 
        System.out.println("La division es: "+s1.dividir(op1)); 
        
        
        
        
    }
    
}
