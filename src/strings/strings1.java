// De una frase, contar la cantidad de palabras "a"
package strings;
import java.util.Scanner;
public class strings1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String cadena = sc.nextLine();

        int ca = 0;

        for (int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i)=='a'){
                ca++;
            }
        }
        System.out.println("la cantidad de letras a en la frase es: "+ ca);
    }
}
