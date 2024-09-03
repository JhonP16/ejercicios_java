// Realizar una función para sumar y una para restar dos enteros
package funciones;
import java.util.Scanner;
public class funciones1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = sc.nextInt();

        System.out.println("La suma de los números es: " + sumar(a,b));
        resta(a,b);
    }

    //Función con retorno
    static int sumar(int a, int b){
        return a+b;
    }

    // Función sin retorno
    static void resta(int a, int b){
        int restar = a-b;
        System.out.println("La resta de los números es: " + restar);
    }
}
