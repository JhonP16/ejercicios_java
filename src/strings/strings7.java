// Leer un String desde teclado, crear otro string, del mismo tamaño del string leido, pero al revés,
//imprimir el string creado.
package strings;
import java.util.Scanner;
public class strings7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        System.out.println("Texto invertido: " + textoInvertido);

    }
}
