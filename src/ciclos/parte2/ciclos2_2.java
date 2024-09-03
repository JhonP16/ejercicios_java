// Dado un número entero positivo, determinar si es primo o no
package ciclos.parte2;
import java.util.Scanner;
public class ciclos2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        for(int i = 2; i<numero; i++){
            if(numero%i == 0){
                System.out.println("NO es primo");
            }else{
                System.out.println("ES primo");
            }
            break;
        }

    }
}
