// Hacer un arreglo y hallar el mayor y el menor.
package arreglos;
public class arreglos2 {
    public static void main(String[] args){
        int [] vector = {5,8,9,10,14,-2,-81};
        int mayor, menor;

        mayor=menor=vector[0]; // Inicialización con el primer elemento del array

        for(int i = 0; i<vector.length; i++){
            System.out.print(vector[i] + "|");
            if (vector[i] > mayor){
                mayor = vector[i];
            }else if(vector[i]< menor){
                menor = vector[i];
            }
        }

        System.out.println();
        System.out.println("El # de elementos del vector es:" + vector.length );
        System.out.println("El elemento mayor del array " + mayor);
        System.out.println("El elemento menor del array es " + menor);
    }
}
