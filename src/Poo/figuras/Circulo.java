package Poo.figuras;

public class Circulo extends Figura {
    // Atributos
    private double radio;

    // Constructores
    public Circulo(){

    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    //Methods
    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double resultado = 3.1416*(radio*radio);
        return resultado;
    }

}
