// Leer un string. Imprimirlo al revés.
package strings;
import java.util.Scanner;
public class strings4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cadena: ");
        String str = sc.nextLine();

        System.out.println("Cadena invertida: ");
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
