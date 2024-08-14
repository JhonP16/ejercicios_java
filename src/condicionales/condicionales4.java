//Variante del Ejercicio 3: Leer tres números enteros positivos (a,b,c), determinar si la
//suma de cualquier pareja de ellos es igual al otro. Si se cumple esta condición, escribir
//“Igual”, en caso contrario, escribir “Diferentes”. Debe escribir cuales son los que
//cumple
package condicionales;
import java.util.Scanner;
public class condicionales4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número a: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el número b: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el número c: ");
        int c = sc.nextInt();

        if ((a+b) == c){
            System.out.println("c es IGUAL a a+b");
        } else if ((a+c) == b) {
            System.out.println("b es IGUAL a a+c");
        } else if ((b+c) == a) {
            System.out.println("a es IGUAL a b+c");
        }else{
            System.out.println("DIFERENTES");
        }
    }
}
