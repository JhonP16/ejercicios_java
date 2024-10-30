package Poo.figuras;

public class Cuadrado extends Figura {
    // Atributos
    private double lado;

    // Constructores
    public Cuadrado() {
    }

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    // Methods

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado*lado;
        return resultado;
    }
}