/*
  Método para crearOperacion(): que le pide al usuario los dos números y los guarda en 
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
package ServicioOperacion;

import Entidad.Operacion;
import java.util.Scanner;


public class servicio {
    Scanner entrada = new Scanner(System.in);
    
    public Operacion crearOperacion() {
        System.out.println("Ingrese un numero: ");
        Operacion n = new Operacion();
        n.setNumero1(entrada.nextInt());
        System.out.println("Ingrese el segundo numero");
        n.setNumero2(entrada.nextInt());

        return n;

    }
    public int sumar(Operacion n){
        int suma=n.getNumero1()+n.getNumero2();
        return suma;
    }
    
     public int restar(Operacion n){
        int resta=n.getNumero1()-n.getNumero2();
        return resta;
    }
      public int multiplicar(Operacion n){
          int multi=0;
          if(n.getNumero1()!=0 && n.getNumero2()!=0){
         multi=n.getNumero1()*n.getNumero2();
          }else{
              System.out.println("Error,numero ingresado cero");
          }
        return multi;
    }
       public int dividir(Operacion n){
           int division =0;
           if(n.getNumero1()!=0 && n.getNumero2()!=0){
         division=n.getNumero1()/n.getNumero2();
           }else{
              System.out.println("Error,numero ingresado cero");
           }
        return division;
    }
}
