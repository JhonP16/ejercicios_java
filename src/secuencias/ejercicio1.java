// mostrar la suma, resta, división y multiplicación de dos números ingresados.
package secuencias;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        float num1, num2, suma, resta, multiplicacion, division;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número 1: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el número 2: ");
        num2 = sc.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
