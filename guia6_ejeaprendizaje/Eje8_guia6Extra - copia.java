/*
 *8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break
 */
package guia6_ejeaprendizaje;

import java.util.Scanner;


public class Eje8_guia6Extra {

    public static void main(String[] args) {
        int par = 0, impar = 0, num = 0;

        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero: ");
            int a = entrada.nextInt();
            if(a<0){
               break; 
            }
            if (a % 2 == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }
            num = num + a;
        } while (num % 5 != 0);
        System.out.println("Numeros pares ingresados: "+par);
        System.out.println("Numeros impares ingresados: "+impar);
    }
}
