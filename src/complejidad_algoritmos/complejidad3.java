package complejidad_algoritmos;

import java.util.Scanner;

public class complejidad3 {
    static int num = 0;
    static int n = 1000;
    static int[] arreglo = new int[n];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            opcion = leerMenu(scanner);
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a adicionar: ");
                    int elementoAdicionar = scanner.nextInt();
                    int pasosAdicionar = adicionarElemento(arreglo, elementoAdicionar);
                    System.out.println("Número de pasos para adicionar: " + pasosAdicionar);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a borrar: ");
                    int elementoBorrar = scanner.nextInt();
                    int pasosBorrar = borrarElemento(arreglo, elementoBorrar);
                    System.out.println("Número de pasos para borrar: " + pasosBorrar);
                    break;
                case 3:
                    imprimirArreglo(arreglo, num);
                    break;
                case 4:
                    int tamano = tamanoArreglo(arreglo);
                    System.out.println("Tamaño del arreglo: " + tamano);
                    break;
                case 5:
                    System.out.print("Ingrese el elemento a buscar: ");
                    int elementoBuscar = scanner.nextInt();
                    int pasosBuscar = buscarArreglo(arreglo, elementoBuscar);
                    System.out.println("Número de pasos para buscar: " + pasosBuscar);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        scanner.close();
    }

    public static int leerMenu(Scanner scanner) {
        System.out.println("Menú:");
        System.out.println("1. Adicionar elemento");
        System.out.println("2. Borrar elemento");
        System.out.println("3. Imprimir arreglo");
        System.out.println("4. Tamaño del arreglo");
        System.out.println("5. Buscar elemento");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public static int adicionarElemento(int[] arreglo, int elemento) {
        int pasos = 0;
        if (num < n) {
            int i;
            for (i = num - 1; (i >= 0 && arreglo[i] > elemento); i--) {
                arreglo[i + 1] = arreglo[i];
                pasos++;
            }
            arreglo[i + 1] = elemento;
            num++;
            pasos++;
        }
        return pasos;
    }

    public static int borrarElemento(int[] arreglo, int elemento) {
        int pasos = 0;
        int index = -1;
        for (int i = 0; i < num; i++) {
            pasos++;
            if (arreglo[i] == elemento) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < num - 1; i++) {
                arreglo[i] = arreglo[i + 1];
                pasos++;
            }
            num--;
        }
        return pasos;
    }

    public static void imprimirArreglo(int[] arreglo, int tam) {
        System.out.print("Arreglo: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static int tamanoArreglo(int[] arreglo) {
        return num;
    }

    public static int buscarArreglo(int[] arreglo, int elemento) {
        int pasos = 0;
        for (int i = 0; i < num; i++) {
            pasos++;
            if (arreglo[i] == elemento) {
                System.out.println("La posición del elemento es: " + i);
                return pasos;
            }
        }
        System.out.println("Elemento no encontrado.");
        return pasos;
    }
}
