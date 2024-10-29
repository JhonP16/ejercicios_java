package Poo.cuenta_ahorros;

public class CuentaAhorros {
    private String titular;
    private int id;
    private double saldo;

    public CuentaAhorros(String titular, int id, double saldo){
        this.titular = titular;
        this.id = id;
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        this.saldo = this.saldo + cantidad;
    }

    public void retirar(double cantidad){
        if (this.saldo > cantidad){
            this.saldo = this.saldo-cantidad;
        }else{
            System.out.println("No se puede retirar más de lo que se tiene en el saldo!");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

}
