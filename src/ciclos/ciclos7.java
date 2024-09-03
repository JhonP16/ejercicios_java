// Hacer un algoritmo que calcule el factorial de un número
package ciclos;
import java.util.Scanner;
public class ciclos7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número del cual desea saber el factorial: ");
        int numero = sc.nextInt();

        int factorial = 1;

        for(int i = 1; i<=numero; i++){
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);


    }
}
