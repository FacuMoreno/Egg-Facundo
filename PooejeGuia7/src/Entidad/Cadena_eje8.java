/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) 
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase 
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a 
través de los métodos set, se guardará la frase y la longitud de manera automática según 
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
 */
package Entidad;


public class Cadena_eje8 {
    private String frase;
    private int longitud;

    public Cadena_eje8() {
    }

    public Cadena_eje8(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    //a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
//ingresada.
    public void mostrarVocales() {
        String a;
        int con = 0;
        for (int i = 0; i < longitud; i++) {
            a = frase.substring(i, i + 1);

            if (a.equalsIgnoreCase("a") || a.equalsIgnoreCase("e") || a.equalsIgnoreCase("i") || a.equalsIgnoreCase("0") || a.equalsIgnoreCase("u")) {
                con = con + 1;
            }
        }
        System.out.println("La frase tiene " + con + " vocales");
    }
    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
    //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac"
    
    public void invertirFrase() {
        System.out.println("La frase invertida es: ");
        for (int i = longitud; i > 0; i--) {

            System.out.print(frase.substring(i - 1, i));

        }
    }
    //c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
   //contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
       
    public void vecesRepetido(String caracter) {
        int con = 0;
        String a;
        for (int i = 0; i < longitud; i++) {
            a = frase.substring(i, i + 1);
            if (a.equalsIgnoreCase(caracter) == true) {
                con = con + 1;
            }
        }
        System.out.println("el caracter :"+caracter+" se repite..." + con + " veces");
    }
    //e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
   //compone la clase con otra nueva frase ingresada por el usuario
    
    public boolean compararLongitud(int frase1){
        boolean a=false;
        if(frase1==longitud){
            a=true;
        }
        return a;
    }
    //f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
    //una nueva frase ingresada por el usuario y mostrar la frase resultante
    
    public void unirFrases(String frase1){
        System.out.println(frase+" "+frase1);
    }
    /*g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
    frase resultante*/
    public void reemplazar(String caracter){
        String a;
        for (int i = 0; i < longitud; i++) {
            a = frase.substring(i, i + 1);
            if (a.equalsIgnoreCase("a") == true) {
                a=caracter;
            }
            System.out.print(a);
            
        }
        System.out.println("");
    }
    
    /*h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no*/
    
    public boolean contiene(String caracter) {
        String a;
        boolean b = false;
        for (int i = 0; i < longitud; i++) {
            a = frase.substring(i, i + 1);
            if (a.equalsIgnoreCase(caracter) == true) {
                b = true;
            }
        }
        return b;
    }

}