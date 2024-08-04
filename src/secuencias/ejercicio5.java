//Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas,
// el vendedor desea saber cuánto dinero obtendrá por concepto de comisiones
// por las ventas que realiza en el mes y el total que recibirá en el mes
// tomando en cuenta su sueldo base y comisiones.
package secuencias;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args){
        int sueldo, val_ventas, total, val_comisiones;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su sueldo base: ");
        sueldo = sc.nextInt();
        System.out.println("Ingrese el valor de las ventas: ");
        val_ventas = sc.nextInt();

        val_comisiones = (int) (val_ventas*0.10);
        total = sueldo+val_comisiones;

        System.out.println("El dinero que obtuvo por comisiones fue: "+ val_comisiones);
        System.out.println("El dinero total que recibirá es: " + total);
    }
}
