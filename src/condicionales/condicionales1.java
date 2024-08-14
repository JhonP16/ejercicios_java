// Leer un número entero positivo o negativo, e imprimir si es ‘par’ o ‘impar’, utilizar el
//operador ‘residuo’ (%).
package condicionales;
import java.util.Scanner;
public class condicionales1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("El número es PAR");
        }else{
            System.out.println("El número es IMPAR");
        }
    }
}
