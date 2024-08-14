//Leer tres números enteros positivos (a,b,c), determinar si la suma de a y b es igual a c.
//Si se cumple esta condición, escribir “Iguales”, en caso contrario, escribir “Diferentes”.
package condicionales;
import java.util.Scanner;
public class condicionales3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número a: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el número b: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el número c: ");
        int c = sc.nextInt();

        if((a+b)==c){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }
    }
}
