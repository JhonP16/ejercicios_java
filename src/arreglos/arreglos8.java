// Crear un arreglo a partir de otro
// El primer arreglo debe ser de tamaño par. El segundo debe ser la mitad de este (n/2).
// Cada valor del segundo array en la posición j, será el promedio de dos consecutivos del arreglo 1.
package arreglos;
import java.util.Scanner;
public class arreglos8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo a crear (debe ser par): ");
        int n = sc.nextInt();
        int [] arr1 = new int[n];

        System.out.println("Arreglo 1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i*2;
            System.out.print(arr1[i]+ "|");
        }

        float [] arr2 = new float[n/2];

        System.out.println(" ");
        System.out.println("Arreglo 2: ");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = (float) (arr1[j * 2] + arr1[(j * 2) + 1]) /2;
            System.out.print(arr2[j]+ "|");
        }
    }
}
