// Crear un array1 de tamaño n con números ingresados por el usuario.
// Luego, crear un array2 que invierta el array1.
package arreglos;
import java.util.Scanner;
public class arreglos7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de datos del array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        int [] arr2 = new int[n];
        int num;

        System.out.println("Array normal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese el número de la posición " +i);
            num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "|");
        }

        System.out.println(" ");
        System.out.println("Array invertido: ");
        invertirArray(arr , arr2);

    }

    static void invertirArray(int[] arr, int[] arr2){
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
            System.out.print(arr2[i] + "|");
        }
    }
}

