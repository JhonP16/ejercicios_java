// Crear un arreglo dinámico. Hacer métodos para: leer datos del usuario hasta que digite número menor que 0.
// , imprimir el arreglo, sumar el arreglo.
// Finalmente, sacar el promedio del array.
package arreglos_dinamicos;
import java.util.Scanner;
import java.util.ArrayList;
public class arraylist1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<>();
        int suma;
        float promedio;

        leerDatos(arr);

        imprimirArreglo(arr);

       suma =  sumarArreglo(arr);

       promedio = (float) suma /arr.size();

        System.out.println("Sumatoria del arreglo: "+ suma);
        System.out.println("Promedio del arreglo: "+ promedio);
    }

    public static void imprimirArreglo(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            System.out.println("indice: "+i+" = "+arr.get(i));
        }
        System.out.println(" ");
    }

    public static int sumarArreglo(ArrayList<Integer> arr){
        int acum = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            acum = acum+arr.get(i);
        }
        return acum;
    }

    public static void leerDatos(ArrayList<Integer> arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dato del arreglo: ");
        int num = sc.nextInt();
        while(num > 0){
            arr.add(num);
            System.out.println("Ingrese el dato del arreglo: ");
            num = sc.nextInt();
        }

    }

}
