// Crear un programa en java, que cree un arreglo dinámico de enteros de tamaño n (n leído
//por teclado) y de valores aleatorios entre 0 y 99. Una vez creado, convertir este arreglo
//dinámico en otro estático. Crear tres funciones que serán llamadas desde el main():
//ArrayList<Integer> crearArreglo(int n)
//int[] convertirArrDinamico(ArrayList<Integer> arr)
// void imprimirArrEst(int[] arr)

package arreglos_dinamicos;
import  java.util.ArrayList;
import  java.util.Scanner;

public class arraylist4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        ArrayList<Integer> arrDin = crearArreglo(n);
        int[] arrEst = convertirArrDinamico(arrDin);
        imprimirArrEst(arrEst);
    }

    public static ArrayList<Integer> crearArreglo(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add((int) (Math.random() * 100));
        }
        return arr;
    }

    public static int[] convertirArrDinamico(ArrayList<Integer> arr) {
        int[] arrEst = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arrEst[i] = arr.get(i);
        }
        return arrEst;
    }

    public static void imprimirArrEst(int[] arr) {
        System.out.println("El arreglo estático creado a partir del dinámico es: ");
        for (int i : arr) {
            System.out.print(i + "|");
        }
        System.out.println();
    }
}
