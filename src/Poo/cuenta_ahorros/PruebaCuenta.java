package Poo.cuenta_ahorros;

public class PruebaCuenta {
    public static void main(String[] args) {
        CuentaAhorros ca = new CuentaAhorros("Juan", 10, 0);

        ca.depositar(15000);
        System.out.println("Nuevo saldo: " + ca.getSaldo());
        System.out.println();

        ca.depositar(20000);
        System.out.println("Nuevo saldo: " + ca.getSaldo());
        System.out.println();

        ca.retirar(10000);
        System.out.println("Nuevo saldo: " + ca.getSaldo());
        System.out.println();

        ca.depositar(50000);
        System.out.println("Nuevo saldo: " + ca.getSaldo());
        System.out.println();

        ca.retirar(200000);
        System.out.println("Nuevo saldo: " + ca.getSaldo());

    }
}
