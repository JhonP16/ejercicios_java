//Crear un programa en java, que cree un arreglo estático de enteros de tamaño n (n leído por
//teclado) y de valores aleatorios entre 0 y 99. Una vez creado, convertir este arreglo estático
//en otro dinámico ArrayList. Crear tres funciones que serán llamadas desde el main():
//int[] crearArreglo(int n)
//ArrayList<Integer> convertirArrEstatico(int[] arr)
//void imprimirArrDin(ArrayList<Integer> arr)
package arreglos_dinamicos;
import java.util.ArrayList;
public class arraylist3 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = crearArreglo(n);
        ArrayList<Integer> arrDin = convertirArrEstatico(arr);
        imprimirArrDin(arrDin);
    }

    public static int[] crearArreglo(int n){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static ArrayList<Integer> convertirArrEstatico(int[] arr){
        ArrayList<Integer> arrDin = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrDin.add(arr[i]);
        }
        return arrDin;
    }

    public static void imprimirArrDin(ArrayList<Integer> arr){
        System.out.println("El arreglo dinámico creado a partir del estático es: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+ "|");
        }
        System.out.println();
    }

}
