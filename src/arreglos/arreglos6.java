// Crear un array1 de tamaño n con una serie numérica cualquiera.
// Luego, crear un array2 que invierta el array1.
package arreglos;
import java.util.Scanner;
public class arreglos6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de datos del array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] arr2 = new int[n];

        System.out.println("Array normal: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*3;
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
