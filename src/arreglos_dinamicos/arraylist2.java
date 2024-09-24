// Crear un arraylist con nombres de estudiantes ingresados por usuario. Dejar de leer cuando se digite "terminar"
// Cuando termine de leer, imprimir todos los valores.
// Luego, solicitar un nombre a borrar. Crear una función para borrar nombre.
package arreglos_dinamicos;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        leerDatos(nombres);

        imprimirArreglo(nombres);

        System.out.println("¿Qué nombre desea borrar? ");
        String nombre = sc.nextLine();

        borrarNombre(nombres,nombre);

        imprimirArreglo(nombres);

    }

    public static void leerDatos(ArrayList<String> arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre_completo = sc.nextLine();
        while (!nombre_completo.equals("terminar")){
            arr.add(nombre_completo);
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre_completo = sc.nextLine();
        }
    }

    public static void imprimirArreglo(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+ "|");
        }
        System.out.println();
    }

    public static void borrarNombre(ArrayList<String> arr, String nombre){
        boolean resultado;
        resultado = arr.remove(nombre);
        if (resultado) {
            System.out.println(nombre+" borrado!");
        }else{
            System.out.println(nombre+" no encontrado, ni borrado!");
        }
    }
}
