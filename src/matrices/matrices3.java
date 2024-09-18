// Crear una matriz de m filas y n columnas (pedirlos al usuario) y llenarla con números aleatorios del 1 al 10.
package matrices;
import java.util.Scanner;
public class matrices3 {
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

    }
}
