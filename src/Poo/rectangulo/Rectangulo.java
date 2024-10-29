package Poo.rectangulo;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(){

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
        return this.base* this.altura;
    }
    public double getPerimetro(){
        return (this.base*2)+(this.altura*2);
    }
}
