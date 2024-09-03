// Realizar un Algoritmo que permita generar una serie de números múltiplos de m.
// La cantidad de números será n. Tanto m como n serán leídos por el teclado.
package ciclos;
import java.util.Scanner;
public class ciclos9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int m = sc.nextInt();
        System.out.println("Ingrese los múltiplos: ");
        int n = sc.nextInt();

        for (int i = m; i<=(m*n);i+=m){
            System.out.println(i);
        }
    }
}
