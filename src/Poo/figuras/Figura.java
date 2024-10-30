package Poo.figuras;

public abstract class Figura {
    // Atributos
    protected double x; // Posición en x
    protected double y; // Posición en y

    // Constructores
    public Figura(){

    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Methods
    public abstract double calcularArea();

}
