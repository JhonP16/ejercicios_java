//Generar los primeros ‘n’ números de la secuencia de Fibonacci (1, 1, 2, 3, 5, 8, …)?
package ciclos.parte2;
import java.util.Scanner;
public class ciclos1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1= 0 , num2 = 1, num3 = 0;

        System.out.println("Ingrese los numeros que quiere ver de fibonacci: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            num1 = num3;
            System.out.print(num3 + ", ");
            num3 = num1+num2;
            num2 = num1;
        }
    }
}
