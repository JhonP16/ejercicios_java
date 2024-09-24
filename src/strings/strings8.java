//Leer un string1 por parte del usuario, crear una función que ingrese como parámetro string1 y retorne:
//si string1 es de longitud par, retorne otro nuevo string con el primer y último caracter.
//si string1 es de longitud impar, retorne otro nuevo string con el primero, la mitad y último caracter.
package strings;
import java.util.Scanner;
public class strings8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String string1 = sc.nextLine();


        String resultado = procesarString(string1);


        System.out.println("Resultado: " + resultado);
    }

    public static String procesarString(String string1) {
        int longitud = string1.length();

        if (longitud % 2 == 0) {
            return string1.charAt(0) + "" + string1.charAt(longitud - 1);
        }
        else {
            int mitad = longitud / 2;
            return string1.charAt(0) + "" + string1.charAt(mitad) + "" + string1.charAt(longitud - 1);
        }
    }
}
