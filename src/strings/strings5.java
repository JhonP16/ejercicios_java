// Leer dos strings (str1 y str2). Determinar si Str2 es substring de Str1.
// El tamaño de str1 debe ser mayor al de str2.
package strings;
import java.util.Scanner;
public class strings5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el String1: ");
        String str1 = sc.nextLine();
        System.out.println("Ingrese el String2: ");
        String str2 = sc.nextLine();
        boolean esSubstring = false;

        if (str2.length() <= str1.length()) {
            for (int i = 0; i <= str1.length() - str2.length(); i++) {
                // Comprobar si la subcadena de String1 es igual a String2
                if (str1.substring(i, i + str2.length()).equals(str2)) {
                    esSubstring = true;
                    break;
                }
            }
        }

        System.out.println(str1.length());

        if (esSubstring) {
            System.out.println("El String2 es un substring de String1.");
        } else {
            System.out.println("El String2 NO es un substring de String1.");
        }

    }
}
