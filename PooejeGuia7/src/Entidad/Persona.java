/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
 */
package Entidad;

import java.util.Scanner;


public class Persona {
    Scanner entrada = new Scanner(System.in);
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /*• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaj
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    */
    public void crearPersona(){
        System.out.println("Ingrese el nombre: ");
        this.nombre=entrada.nextLine();
        System.out.println("Ingrese la edad");
        this.edad=entrada.nextInt();
        System.out.println("Ingrese el peso");
        this.peso=entrada.nextDouble();
        System.out.println("Ingrese la altura");
        this.altura=entrada.nextDouble();
        System.out.println("Ingrese el sexo...M(masc)/F(feme)/O(otro)");
        String a=entrada.next();
     
      
        
        while(a.equalsIgnoreCase("m")!=true && a.equalsIgnoreCase("f")!=true && a.equalsIgnoreCase("o")!=true){
            System.out.println("");
            System.out.println("Ingreso incorrecto...vuelva a intentarlo");
            System.out.println("");
            System.out.println("Ingrese el sexo...M(masc)/F(feme)/O(otro)");
            a=entrada.next();
        }
        this.sexo=a;
        
    }
    /*• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. */
    
    public int calcularIMC(){
        double resu=peso/(altura*altura);
        int imc=0;
        
        if(resu<20){
            imc=-1;
             System.out.println("la persona "+ getNombre()+" esta por debajo de su peso normal");
        }else if(resu>20&&resu<=25){
            imc=0;
            System.out.println("la persona "+ getNombre()+" esta en su peso normal");
        }else{
            imc=1;
            System.out.println("la persona "+ getNombre()+" esta por encima de su peso normal");
        }
        return imc;
    }
    
  //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
//un booleano  
    public int esMayorDeEdad(){
        int a=0;
        if(edad>18){
            a=edad;   
            System.out.println("La persona " +getNombre()+" es mayor de edad ");
        }else{
            System.out.println("La persona " +getNombre()+" es menor de edad ");
            a=edad;
        }
        return a;
    }
    
    
    
    
    
    
    
    
}
