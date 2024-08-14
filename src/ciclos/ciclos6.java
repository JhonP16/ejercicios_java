// Solo usando restas, hacer divisiones. NO USAR EL OPERADOR /. Solo usar enteros.
package ciclos;
import java.util.Scanner;
public class ciclos6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = sc.nextInt();
        int cociente = 0;
        int residuo = 0;

        while(dividendo >= divisor){
            dividendo = dividendo - divisor;
            cociente++;
        }
        residuo = dividendo;

        System.out.println("El cociente es: " + cociente + " y el residuo es: " + residuo);
    }
}
