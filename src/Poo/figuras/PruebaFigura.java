package Poo.figuras;

public class PruebaFigura {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(1, 2, 5);
        System.out.println("El lado del cuadrado es: " +  cuadrado1.getLado());
        System.out.println("El área del cuadrado es: " + cuadrado1.calcularArea());

        System.out.println("------------------------------------------------------------");

        Circulo circulo1 = new Circulo(1, 2, 4);
        System.out.println("El radio del círculo es: " +  circulo1.getRadio());
        System.out.println("El área del círculo es: " + circulo1.calcularArea());
    }
}
