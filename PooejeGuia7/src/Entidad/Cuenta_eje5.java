/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
 */
package Entidad;

import java.util.Scanner;


public class Cuenta_eje5 {
    Scanner entrada = new Scanner(System.in);
    private int numeroCuenta;
    private int dni;
    private  int saldoActual;

    public Cuenta_eje5() {
    }

    public Cuenta_eje5(int numeroCuenta, int dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario
    
    public void cuenta(){
        System.out.println("Ingrese numero de cuenta");
        this.numeroCuenta=entrada.nextInt();
        System.out.println("Ingrese dni");
        this.dni=entrada.nextInt();
        System.out.println("Ingrese saldo actual");
        this.saldoActual=entrada.nextInt();
        
    }
    public  void  ingresardinero(){
        System.out.println("Ingresar dinero");
        this.saldoActual=saldoActual+entrada.nextInt();
    }
    public void retirarDinero(){
        int retiro=0;
        System.out.println("Ingrese el dinero a retirar");
        retiro=entrada.nextInt();
        this.saldoActual=saldoActual-retiro;
        System.out.println("saldo: "+saldoActual);
       
    }
    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
//usuario no saque más del 20%
    public void extraccionRapida(){
        System.out.println("Ingrese el saldo a retirar");
        int retiro=entrada.nextInt();
        if(retiro<(this.saldoActual*0.20)){
            this.saldoActual=saldoActual-retiro;
        }else{
            System.out.println("El retiro es mayor al 20%...no se permite");
        }
    }
    public void consultaSaldo(){
        System.out.println("Su saldo es: "+saldoActual);
    }
    public void consultarDatos(){
        System.out.println("Sus datos son: "+"dni "+ dni +"num de cuenta "+ numeroCuenta +"saldo actual "+ saldoActual);
    }
    //to string

    @Override
    public String toString() {
        return "Cuenta_eje5{" + "entrada=" + entrada + ", numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    
}
