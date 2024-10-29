package Poo.calculadora;
public class PruebaCalc {
    public static void main(String[] args) {
        double a = 10.3;
        double b = 5.4;
        double c = 7;
        double d = 6.3;
        double r = 0;

        Calculadora calc = new Calculadora();
        System.out.println("Memoria inicial calculadora: "+ calc.getMemoria());
        System.out.println();

        r = calc.sumar(a,b);
        System.out.println("Suma de a+b: "+r);
        System.out.println("Nueva memoria: "+calc.getMemoria());
        System.out.println();

        r = calc.restar(c,d);
        System.out.println("Resta de c-d: "+r);
        System.out.println("Nueva memoria: "+calc.getMemoria());
        System.out.println();

        System.out.println("---- REINICIO DE MEMORIA -----");
        calc.iniciarMemoria();
        System.out.println("Nueva memoria: " + calc.getMemoria());
        System.out.println();

        r = calc.multiplicar(c,d);
        System.out.println("Multiplicacion de c*d: "+r);
        System.out.println("Nueva memoria: "+calc.getMemoria());
        System.out.println();

        r = calc.dividir(a,b);
        System.out.println("División de a/b: "+r);
        System.out.println("Nueva memoria: "+calc.getMemoria());


    }
}
