// Leer dos números a y b, y determinar si entre ellos son múltiplos enteros. Escribir “a es
//divisor entero de b” o Escribir “a no es divisor entero de b”.
package condicionales;
import java.util.Scanner;
public class condicionales5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número a: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el número b: ");
        int b = sc.nextInt();

        if (b % a == 0){
            System.out.println("a es divisor entero de b");
        }else{
            System.out.println("a NO es divisor entero de b");
        }
    }
}
