
package Main;

import Entidad.Libro_eje1;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas*/

public class Eje1 {

    
    public static void main(String[] args) {
        Libro_eje1  l1=new Libro_eje1();
        l1.crearLibro();
        l1.mostrarLibro();
        
    }
    
}
