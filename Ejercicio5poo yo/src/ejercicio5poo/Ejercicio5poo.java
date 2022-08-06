package ejercicio5poo;

import ejercicio5poo.newpackage.Cuenta;
import java.util.Scanner;

public class Ejercicio5poo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cuenta usu1 = new Cuenta();
        usu1.crearCuenta();
        System.out.println(" ingrese su saldo");
        usu1.ingresar(leer.nextDouble());

        usu1.retiro(usu1.getSaldoActual());

        usu1.extraccionRapida(usu1.getSaldoActual());

        usu1.consultarSaldo(usu1.getSaldoActual());
        usu1.consultarDatos(usu1.getNumeroCuenta(), usu1.getDNI());

    }

}
