/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas.
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author facun
 */
public class Alumno {
    private String nombre;
    private  ArrayList<Integer>notas=new ArrayList();

    public Alumno(String nombre,ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas=notas;
    }

    public Alumno() {
    }
    

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarNombre(){
    
        System.out.println("  Nombre --> " + nombre);
    }
    
     public double notaFinal(){
    
        double promedio = 0;
        double suma = 0;
        for (Integer nota : notas) {
            
            suma = suma + nota;
        }
        promedio = suma / 3;
        return promedio;
    }

   

    
    
    
    
}
