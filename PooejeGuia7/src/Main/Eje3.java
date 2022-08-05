
package Main;

import Entidad.Operacion_eje3;


public class Eje3 {

   
    public static void main(String[] args) {
        Operacion_eje3 op1 = new Operacion_eje3();
        op1.crearOperacion();
        System.out.println("la suma es. "+op1.sumar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("La resta es: "+ op1.restar(op1.getNumero1(),op1.getNumero2()));
        System.out.println("la multi es"+op1.multiplicar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("La division es: "+op1.dividir(op1.getNumero1(), op1.getNumero2()));
        
    }
    
}
