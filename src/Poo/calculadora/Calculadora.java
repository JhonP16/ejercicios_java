package Poo.calculadora;

public class Calculadora {
    // Atributos
    private double memoria;

    // Constructor
    public Calculadora(){

    }

    // Métodos
    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public void iniciarMemoria(){
        this.memoria = 0;
    }

    public double sumar(double a,double b){
        double suma = a+b;
        this.memoria = this.memoria+suma;
        return suma;
    }

    public double restar(double a,double b){
        double resta = a-b;
        this.memoria = this.memoria+resta;
        return resta;
    }

    public double multiplicar(double a,double b){
        double multiplicacion = a*b;
        this.memoria = this.memoria+multiplicacion;
        return multiplicacion;
    }

    public double dividir(double a,double b){
        double division = a+b;
        this.memoria = this.memoria+division;
        return division;
    }
}
