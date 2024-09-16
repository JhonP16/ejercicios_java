// Crear un array con un tamaño definido por el usuario
// Pedir al usuario tantos números como el tamaño del array creado.
// Asignarle el doble de cada uno de esos datos recibidos

package arreglos;
import java.util.Scanner;
public class arreglos5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo a crear: ");
        int n = sc.nextInt();
        int [] arr_int = new int[n];
        int num;

        for(int i = 0; i<arr_int.length; i++){
            System.out.println("Ingrese el número de la posición "+ i);
            num = sc.nextInt();
            arr_int[i] = num*2;
        }

        System.out.println("Arreglo resultante: ");
        for (int i = 0; i<arr_int.length; i++){
            System.out.print(arr_int[i] + "|");
        }

    }
}
