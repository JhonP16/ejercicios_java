// Hacer un algoritmo cualquiera que permita Repasar los algoritmos de ordenamiento de arreglos
// por los métodos SELECTIONSORT, BUBBLESORT.
//Repasar los algoritmos de búsqueda LINEAL y BINARIA.
//REVISAR E IMPRIMIR EN CADA UNO DE ELLOS EL NRO DE PASOS QUE EJECUTA Y
//ENTENDER LA COMPLEJIDAD ALGORITMICA.

package complejidad_algoritmos;

public class complejidad2 {
    public static void main(String[] args) {

        System.out.println("---------- ALGORITMOS DE ORDENAMIENTO ----------");
        int[] arr = {5, 2, 3, 1, 4};
        int[] arrCopy = arr.clone();

        selectionSort(arr);
        printArray(arr);
        bubbleSort(arrCopy);
        printArray(arrCopy);

        System.out.println("------------ ALGORITMOS DE BÚSQUEDA ------------");

        int[] searchArr = {1, 2, 3, 4, 5};
        int index = linearSearch(searchArr, 3);
        System.out.println("Elemento encontrado en el índice: " + index);

        index = binarySearch(searchArr, 3);
        System.out.println("Elemento encontrado en el índice: " + index);
    }

    public static void selectionSort(int[] arr) {
        int pasos = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                pasos++;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Número de pasos en SelectionSort: " + pasos);
    }

    public static void bubbleSort(int[] arr) {
        int pasos = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                pasos++;
            }
        }
        System.out.println("Número de pasos en BubbleSort: " + pasos);
    }

    public static int linearSearch(int[] arr, int x) {
        int pasos = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Número de pasos en LinearSearch: " + pasos);
                return i;
            }
            pasos++;
        }
        System.out.println("Número de pasos en LinearSearch: " + pasos);
        return -1;
    }

    public static int binarySearch(int[] arr, int x) {
        int pasos = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                System.out.println("Número de pasos en BinarySearch: " + pasos);
                return mid;
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            pasos++;
        }
        System.out.println("Número de pasos en BinarySearch: " + pasos);
        return -1;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}