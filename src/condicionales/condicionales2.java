// Leer por teclado una nota de un estudiante en una materia, la nota estará entre 0.0 y
//5.0, e imprimir un mensaje según un rango de notas.
package condicionales;
import java.util.Scanner;
public class condicionales2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota: ");
        float nota = sc.nextFloat();

        if(nota >= 0 && nota < 1.5){
            System.out.println("Muy mal");
        } else if (nota >=1.5 && nota <3){
            System.out.println("Mal");
        } else if (nota >=3 && nota<4) {
            System.out.println("Regular");
        } else if (nota >=4 && nota <4.5) {
            System.out.println("Bien");
        } else if (nota >=4.5 && nota <5) {
            System.out.println("Muy bien");
        } else if (nota == 5) {
            System.out.println("Excelente");
        }else{
            System.out.println("Nota inválida");
        }
    }
}
