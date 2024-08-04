//Realiza un programa que reciba una cantidad de minutos y muestre por pantalla
// a cuantas horas y minutos corresponde.
package secuencias;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args){
        int minutos, horas, n_minutos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos a transformar: ");
        minutos = sc.nextInt();

        horas = minutos/60;
        n_minutos = minutos%60;

        System.out.println(minutos + " Minutos equivalen a: " + horas + " hora y " + n_minutos + " minutos");
    }
}
