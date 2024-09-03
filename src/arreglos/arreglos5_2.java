package arreglos;
public class arreglos5_2 {
    public static void main(String[] args) {
        int[] array = new int[40];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (900 + 10));
        }//fin del llenado dle vector
        printVector(array);
        System.out.println();
        arrayPrimes(array);
    }
    static  void arrayPrimes(int [] vector){
        String salida="";
        for (int i = 0; i < vector.length; i++) {
            if(isPrime(vector[i])){
                salida+=vector[i]+" ";
            }
        }
        System.out.println(salida);
    }
    static void printVector(int[] vector) {
        for (int e : vector) {
            System.out.print(e + "|");
        }//endfor
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
