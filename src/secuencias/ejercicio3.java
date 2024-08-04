//Calcular el promedio de tres números pedidos por teclado.
package secuencias;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args){
        float num1, num2, num3, promedio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextFloat();
        System.out.println("Ingrese el tercer número: ");
        num3 = sc.nextFloat();

        promedio = (num1+num2+num3)/3;

        System.out.println("El promedio de los números es: " + promedio);
    }
}
