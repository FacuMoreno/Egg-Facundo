
package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class servicio {

    HashMap< String,Integer> productos = new HashMap();
    Scanner entrada = new Scanner(System.in);

    public void menu() {
        boolean aux = true;
        do {
           System.out.println("Selecciones la operacion a realizar: \n1) Crear producto \n2) Modificar producto \n3) Eliminar producto \n4) Listar productos \n5) Salir");
            int opc=entrada.nextInt();
            switch (opc){
                case 1: 
                    crearProducto();
                    break;
                case 2:
                    modificarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    listarProducto();
                    break;
                case 5:
                    aux=false;
                    break;
                
            }
        } while (aux);
        System.out.println(" Elegiste opcion SALIR ");
    }
    
    public void crearProducto(){
        System.out.println("Ingrese un producto");
        String prod=entrada.next();
        System.out.println("Ingrese el precio");
        int pre=entrada.nextInt();
        productos.put( prod,pre);
        
    }
    public void modificarProducto(){
        System.out.println("Ingrese el producto a modificar");
        String prod=entrada.next();
        System.out.println("Ingrese el nuevo producto");
        String nuevoProducto=entrada.next();
        System.out.println("Ingrese el precio del nuevo producto");
        int precionuevo=entrada.nextInt();
        productos.remove(prod);
        productos.put(nuevoProducto, precionuevo);
        
    }
    public void eliminarProducto(){
        System.out.println("Ingrese el producto a eliminar");
        String prod=entrada.next();
        productos.remove(prod);
        
    }
    public void listarProducto(){
        for(Map.Entry<String,Integer>entry : productos.entrySet()){
            System.out.println("///--producto---> " + entry.getKey()+ " ///--precio---> " + entry.getValue());
        }
        
    }

}
       
   
    

