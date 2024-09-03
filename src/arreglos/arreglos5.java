// Generar un array de 40 número enteros aleatorios entre 10 y 900.
// Crear un segundo arreglo con los número primos que se hallan del primer arreglo
// Imprimir ambos arrays.
package arreglos;
public class arreglos5 {
    public static void main(String[] args){
        int [] array_randoms = new int[40];
        System.out.println("NUMEROS RANDOMS: ");

        for(int i=0; i<array_randoms.length; i++){
            array_randoms[i] = (int) (Math.random()* (900-10+1)) +10;
            System.out.println(array_randoms[i]);
        }

        int[] array_primos =  new int[array_randoms.length];

        System.out.println("NUMEROS PRIMOS DEL ARRAY RANDOM: ");
        for (int i = 0; i < array_primos.length; i++) {
            if (esPrimo(array_randoms[i])) {
                System.out.println(array_randoms[i]);
            }
        }
    }

    static boolean esPrimo(int num){
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                return false;
            }
            break;
        }
        return true;
    }

}
