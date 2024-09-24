// Leer un string. Leer un caracter por teclado.
// Contar el número de veces que está en el String.
package strings;
import java.util.Scanner;
public class strings3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cádena: ");
        String cadena = sc.nextLine();
        System.out.println("Ingrese el caracter: ");
        char caracter = sc.next().charAt(0);
        int acumulador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter){
                acumulador++;
            }
        }
        System.out.println("El número de letras "+caracter+ " fueron: "+acumulador);
    }
}
