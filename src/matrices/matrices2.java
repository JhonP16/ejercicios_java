// Crear una matriz de nxn con los números del 1 al nxn
package matrices;
import java.util.Scanner;
public class matrices2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz de nxn: ");
        int n = sc.nextInt();
        int matriz[][] = new int[n][n];
        int c = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = c++;
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println();
        }

    }
}

