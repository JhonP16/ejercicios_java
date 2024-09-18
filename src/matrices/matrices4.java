// Crear una matriz1 de n x n (n pedido al usuario y lleno con valores aleatorios de 0 al 99).
// Crear una matriz2 de n x n (mismo tamaño de matriz1) y realizar la transposición de la matriz1 en la matriz2.
// Imprimir la diagonal de la matriz2.
package matrices;
import java.util.Scanner;
public class matrices4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz de nxn: ");
        int n = sc.nextInt();
        int matriz1[][] = new int[n][n];
        int matriz2[][] = new int[n][n];

        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = (int) (Math.random() * 100);
                System.out.print(matriz1[i][j]+"|");
            }
            System.out.println();
        }

        System.out.println("Matriz 2: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz2[i][j] = matriz1[i][j];
                System.out.print(matriz2[i][j]+"|");
            }
            System.out.println();
        }

        System.out.println("Diagonal de la matriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                if(i == j){
                    System.out.print(matriz2[i][j]+" ");
                }
            }
        }

    }
}
