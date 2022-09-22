/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o noen the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Servicio {
    Scanner entrada = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();

    public void inicializar() {

        crearAlumno();
        notaFinal();
    }

   

   

    private void crearAlumno() {

        boolean ejecutar = true;

        while (ejecutar) {

            ArrayList<Integer> listaAux = new ArrayList();

            System.out.println("Ingrese el nombre del Alumno: ");
            String nombre = entrada.next();
            System.out.println("Ingrese la primera nota: ");
            int nota1 = entrada.nextInt();

            System.out.println("Ingrese la segunda nota: ");
            int nota2 = entrada.nextInt();

            System.out.println("Ingrese la tercera nota: ");
            int nota3 = entrada.nextInt();

            System.out.println("Desea seguir agregando alumnos?. y/n");
            String op = entrada.next();

            listaAux.add(nota1);
            listaAux.add(nota2);
            listaAux.add(nota3);
           

            alumnos.add(new Alumno(nombre,listaAux));

            ejecutar = op.equalsIgnoreCase("y") ? true : false;

        }
        
    }

    private void notaFinal() {

        System.out.println("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombre = entrada.next();

        for (Alumno alumno : alumnos) {

            if (alumno.getNombre().equalsIgnoreCase(nombre)) {

                alumno.mostrarNombre();
                System.out.print("Promedio --> " + alumno.notaFinal());
            }

        }

    }

    
 

}
