
package Main;

import Entidad.Rectangulo_eje4;


public class Eje4 {

    
    public static void main(String[] args) {
        Rectangulo_eje4 r1=new Rectangulo_eje4();
        r1.crearRectangulo();
        System.out.println("La superficie es:"+r1.calculosuperficie());
        System.out.println("El perimetro es: "+r1.calculoPerimetro());
        r1.dibujar(r1.getBase(), r1.getAltura());
    }
    
}
