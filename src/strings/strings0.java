// Leer dos strings por teclado (str1 y str2) e imprimir si son iguales o diferentes
package strings;
import java.util.Scanner;
public class strings0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera cadena: ");
        String str1 = sc.nextLine();
        System.out.println("Ingrese la segunda cadena: ");
        String str2 = sc.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
    }
}
