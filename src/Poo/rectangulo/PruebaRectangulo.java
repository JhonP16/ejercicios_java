package Poo.rectangulo;
import  java.util.Scanner;
public class PruebaRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = sc.nextDouble();

        rectangulo.setBase(base);
        rectangulo.setAltura(altura);

        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());

        System.out.println("El área del rectángulo es: "+ rectangulo.getArea());
        System.out.println("El perímetro del rectángulo es: "+ rectangulo.getPerimetro());

    }
}
