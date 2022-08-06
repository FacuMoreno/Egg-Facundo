package ejercicio5poo.newpackage;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private String apellido;
    private double interes;
    private int NumeroCuenta;
    private long DNI;
    private double SaldoActual;
    private double ingreso;
    private double retiro;

    public Cuenta() {
    }

    public Cuenta(int NumeroCuenta, long DNI, double SaldoActual) {
        this.NumeroCuenta = NumeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    // Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario
    public void crearCuenta() {

        this.NumeroCuenta = (int) (Math.random() * 10);

        System.out.println("ingrese el DNI del cliente");
        this.DNI = leer.nextLong();
        System.out.println("ingrese su apellido");
        this.apellido = leer.next();
        System.out.println("ingrese su nombre");
        this.nombre = leer.next();
    }

    /* d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
           y se la sumara a saldo actual.*/
    public double ingresar(double SaldoActual) {
        System.out.println("escriba el valor a ingresar");

        this.ingreso = leer.nextDouble();
        return this.SaldoActual = SaldoActual + ingreso;
    }

    /*Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
    restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
    saldo actual en 0. */
    public double retiro(double SaldoActual) {
        System.out.println("escriba el valor de dinero que va a retirar");
        double retiro = leer.nextDouble();
        if (retiro > SaldoActual) {

            return this.SaldoActual = 0;
        }
        return this.SaldoActual = SaldoActual - retiro;
    }

    /*Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
     usuario no saque más del 20%.*/
    public double extraccionRapida(double SaldoActual) {
        System.out.println("escriba el valor de dinero para extraccion rapida");
        double extraccion = leer.nextDouble();
        while (extraccion < SaldoActual * 0.20) {
            return this.SaldoActual = SaldoActual - extraccion;
        }
        System.out.println("maximo valor a retirar por este medio" + SaldoActual * 0.20);
        return this.SaldoActual = SaldoActual - SaldoActual * 0.20;
    }

    @Override
    public String toString() {
        return "Cuenta{" + " nombre=" + nombre + ", apellido=" + apellido + ", interes=" + interes + ", NumeroCuenta=" + NumeroCuenta + ", DNI=" + DNI + ", SaldoActual=" + SaldoActual + ", ingreso=" + ingreso + ", retiro=" + retiro + '}';
    }

    public void consultarSaldo(double saldoActual) {
        System.out.println("el saldo actual es: " + saldoActual);
    }

    public void consultarDatos(int numeroCuenta, long dni) {
        System.out.println(toString());
    }

}
