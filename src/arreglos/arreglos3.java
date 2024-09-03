// Hacer un arreglo y calcular el promedio de los números del arreglo.
package arreglos;
public class arreglos3 {
    public static void main(String[] args){
        int [] vector = {5,8,9,10,14,-2,-81};
        int acumulador = 0;

        for(int i = 0; i<vector.length; i++){
            System.out.print(vector[i] + "|");
            acumulador = acumulador+vector[i];
        }

        float promedio = (float) acumulador/vector.length;

        System.out.println();
        System.out.println("El promedio de los números del arreglo es: "+ promedio);
    }
}
