// Hacer un programa que dado el número de una tabla, la muestre hasta el 10.
package ciclos;
import java.util.Scanner;
public class ciclos5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la tabla que desea ver: ");
        int tabla = sc.nextInt();
        int multiplicacion = 0;

        for(int i = 0; i<=10; i++){
            multiplicacion = tabla*i;
            System.out.println(tabla + " x " + i + " = "+ multiplicacion );
        }
    }
}
