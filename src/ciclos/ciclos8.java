// leer 2 enteros y dividirlos. Si el segundo es 0. Controlar la división por 0
// solicitandole al usuario un numero diferente. Hacerlo con Do while
package ciclos;
import java.util.Scanner;
public class ciclos8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = sc.nextInt();

        do {
            if(divisor == 0){
                System.out.println("El divisor no puede ser 0. Ingrese un número diferente: ");
                divisor = sc.nextInt();
            }
        } while(divisor == 0);

        float resul = (float) dividendo/divisor;

        System.out.println("El resultado de la división es: " + resul);
    }
}
