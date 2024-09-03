// Hacer un arreglo y recorrerlo. Mostrar cuántos elementos tiene:
package arreglos;
public class arreglos1 {
    public static void main(String[] args){
        int [] vector = {5,8,9,10,14,-2,-81};

        for(int i = 0; i<vector.length; i++){
            System.out.print(vector[i] + "|");
        }

        System.out.println("El # de elementos del vector es:" + vector.length );
    }
}
