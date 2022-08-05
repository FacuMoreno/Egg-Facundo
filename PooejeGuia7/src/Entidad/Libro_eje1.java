
package Entidad;

import java.util.Scanner;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas*/
public class Libro_eje1 {
    Scanner entrada = new Scanner(System.in);
    public int isbn;
    public String titulo;
    public String autor;
    public int numPag;

    public Libro_eje1(int isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public Libro_eje1() {
    }
    
    public void crearLibro() {
        System.out.println("Ingrese el isbn del libro:");
        isbn = entrada.nextInt();
        System.out.println("Ingrese el titulo del libro");
        titulo = entrada.next();
        System.out.println("Ingrese el autor del libro");
        autor = entrada.next();
        System.out.println("Ingrese cantidad de paginas");
        numPag = entrada.nextInt();

    }

    public void mostrarLibro() {
        System.out.println("El isbn es: " + isbn);
        System.out.println("El titulo es: " + titulo);
        System.out.println("El autor es: " + autor);
        System.out.println("Cantidad de paginas es: " + numPag);
    }
}
