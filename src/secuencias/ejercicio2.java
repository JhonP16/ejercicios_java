// Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
package secuencias;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        float fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        fahrenheit = sc.nextFloat();

        celsius = (fahrenheit-32)*5/9;

        System.out.println(fahrenheit + " grados fahrenheit son " + celsius + "°celsius");
    }
}
