//Se tiene una matriz de 4 x n, donde hay 4 filas fijas y n estudiantes (pedir n al usuario).
//Por cada estudiante se tiene: id, edad, año_nacimiento, nro_materias.
//Hacer las siguientes funciones:
//Realizar una función 0, a modo de Menú, que permita elegir ejecutar cualquier función entre 1 y 6
//Función 1: Leer los datos de un estudiante y almacenarlos en la posición i (i está entre 0 y n1). Debe leer del usuario: i y los atributos de un estudiante. i es la columna que va a llenar.
//Función 2: Pedir al usuario un id de estudiante e imprimir todos los datos del estudiante.
//Función 3: Imprimir el número de estudiantes que hay entre un rango de edad (edad_min, edad_max)
//Función 4: Imprimir todos los estudiantes
//Función 5: Imprimir los estudiantes de un año determinado. Leer el año.
//Función 6: Imprimir el número promedio de materias de toda la matriz
package matrices;
import java.util.Scanner;
public class matrices5 {

    static int[][] matriz;
    static int n;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de estudiantes: ");
        int n = sc.nextInt();
        matriz = new int[4][n];

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Leer los datos de un estudiante.");
            System.out.println("2. Buscar e imprimir los datos de un estudiante por ID.");
            System.out.println("3. Imprimir número de estudiantes entre un rango de edad.");
            System.out.println("4. Imprimir todos los estudiantes.");
            System.out.println("5. Imprimir estudiantes de un año determinado.");
            System.out.println("6. Imprimir el número promedio de materias.");
            System.out.println("0. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    leerEstudiante();
                    break;
                case 2:
                    buscarEstudiantePorId();
                    break;
                case 3:
                    imprimirEstudiantesPorRangoEdad();
                    break;
                case 4:
                    imprimirTodosLosEstudiantes();
                    break;
                case 5:
                    imprimirEstudiantesPorAnio();
                    break;
                case 6:
                    imprimirPromedioMaterias();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }

    // Función 1: Leer los datos de un estudiante y almacenarlos en la posición i
    public static void leerEstudiante() {
        System.out.print("Ingrese la posición del estudiante (0 a " + (n - 1) + "): ");
        int i = sc.nextInt();
        if (i >= 0 && i < n) {
            System.out.print("Ingrese ID del estudiante: ");
            matriz[0][i] = sc.nextInt();
            System.out.print("Ingrese edad del estudiante: ");
            matriz[1][i] = sc.nextInt();
            System.out.print("Ingrese año de nacimiento del estudiante: ");
            matriz[2][i] = sc.nextInt();
            System.out.print("Ingrese número de materias del estudiante: ");
            matriz[3][i] = sc.nextInt();
        } else {
            System.out.println("Posición no válida.");
        }
    }

    // Función 2: Buscar e imprimir los datos de un estudiante por ID
    public static void buscarEstudiantePorId() {
        System.out.print("Ingrese el ID del estudiante a buscar: ");
        int id = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (matriz[0][i] == id) {
                System.out.println("Estudiante encontrado:");
                System.out.println("ID: " + matriz[0][i]);
                System.out.println("Edad: " + matriz[1][i]);
                System.out.println("Año de nacimiento: " + matriz[2][i]);
                System.out.println("Número de materias: " + matriz[3][i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante con ID " + id + " no encontrado.");
        }
    }

    // Función 3: Imprimir número de estudiantes entre un rango de edad
    public static void imprimirEstudiantesPorRangoEdad() {
        System.out.print("Ingrese la edad mínima: ");
        int edadMin = sc.nextInt();
        System.out.print("Ingrese la edad máxima: ");
        int edadMax = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (matriz[1][i] >= edadMin && matriz[1][i] <= edadMax) {
                contador++;
            }
        }
        System.out.println("Número de estudiantes entre " + edadMin + " y " + edadMax + " años: " + contador);
    }

    // Función 4: Imprimir todos los estudiantes
    public static void imprimirTodosLosEstudiantes() {
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("ID: " + matriz[0][i]);
            System.out.println("Edad: " + matriz[1][i]);
            System.out.println("Año de nacimiento: " + matriz[2][i]);
            System.out.println("Número de materias: " + matriz[3][i]);
        }
    }

    // Función 5: Imprimir estudiantes de un año determinado
    public static void imprimirEstudiantesPorAnio() {
        System.out.print("Ingrese el año de nacimiento: ");
        int anio = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (matriz[2][i] == anio) {
                System.out.println("Estudiante " + (i + 1) + ":");
                System.out.println("ID: " + matriz[0][i]);
                System.out.println("Edad: " + matriz[1][i]);
                System.out.println("Año de nacimiento: " + matriz[2][i]);
                System.out.println("Número de materias: " + matriz[3][i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron estudiantes nacidos en el año " + anio);
        }
    }

    // Función 6: Imprimir el número promedio de materias de toda la matriz
    public static void imprimirPromedioMaterias() {
        int totalMaterias = 0;
        for (int i = 0; i < n; i++) {
            totalMaterias += matriz[3][i];
        }
        double promedio = (double) totalMaterias / n;
        System.out.println("El número promedio de materias es: " + promedio);
    }

}
