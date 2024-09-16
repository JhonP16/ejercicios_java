// Hacer una matriz de NxN y mostar su diagonal principal y su diagonal secundaria.
//  Llenarlas con valores. De modo que: La diagonal principal se llene de 1 hasta un n
//  Y luego la diagonal secundaria desde n+1 hasta m.
// Además, sumar los números de la diagonal principal y los números de la diagonal secundaria.
package matrices;
import  java.util.Scanner;
public class matrices1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz de NxN: ");
        int n = sc.nextInt();

        int matriz [][] = new int[n][n];

        int c = 1;
        int d = n+1;
        int acumprinc = 0, acumsec = 0;

        for (int i = 0; i<n; i++){
            for (int j =0; j<n; j++){
                if(i== j){
                    matriz[i][j] = c++;
                    acumprinc+=matriz[i][j];
                }
                if(i+j == n-1){
                    matriz[i][j] = d++;
                    acumsec += matriz[i][j];
                }
            }
        }
        printMatriz(n, matriz);
        System.out.println("La sumatoria de la diagonal principal es: "+ acumprinc);
        System.out.println("La sumatoria de la diagonal secundaria es: "+  acumsec);
    }

    static void printMatriz(int n, int matriz[][]){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <n; j++){
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
    }

}
