// A partir del ejercicio matrices3.java, crear un array de tamaño m (unidimensional)
// con el valor de la sumatoria de cada fila en la matriz de mxn.
package matrices;
import java.util.Scanner;
public class matrices3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de filas de la matriz: ");
        int m = sc.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz: ");
        int n = sc.nextInt();
        int matriz[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        int [] arr = new int[m];
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum+matriz[i][j];
            }
            arr[i] = sum;
            sum = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("La sumatoria de la fila "+ i + " es: "+ arr[i]);
        }

    }
}
