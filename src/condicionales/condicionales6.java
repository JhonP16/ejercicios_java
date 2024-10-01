// Leer tres números a, b, c y determinar si entre ellos están ordenados de menor a
//mayor. Escribir “ordenados” o Escribir “no ordenados”
package condicionales;
import java.util.Scanner;
public class condicionales6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número a: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el número b: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el número c: ");
        int c = sc.nextInt();

        if (a < b && b < c){
            System.out.println("Los números están ordenados de menor a mayor");
        }else{
            System.out.println("Los números NO están ordenados de menor a mayor");
        }
    }
}
