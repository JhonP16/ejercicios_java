// Crear un array1 de tamaño n con números ingresados por el usuario.
// Luego, invertir ese array sin usar un arreglo 2. (Se pueden usar variables temporales)
package arreglos;
import java.util.Scanner;
public class arreglos9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int num;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese el número de la posición " +i);
            num = sc.nextInt();
            arr[i] = num;
        }
        impArray(arr);

        System.out.println("\nArray invertido: ");
        invertirArray(arr);
        impArray(arr);
    }

    static void invertirArray(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length-1-i] = temp;
        }
    }

    static void  impArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "|");
        }
    }
}
