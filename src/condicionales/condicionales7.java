//Una persona desea invertir su dinero lo mejor posible a través de la compra de dólares.
//Se sabe que durante el segundo trimestre del año el dólar baja un 5% respecto al
//primer trimestre y durante el cuarto trimestre aumenta un 10% respecto al tercer
//trimestre. El valor del dólar al principio del año será ingresado por el usuario. Calcule la
//cantidad de dólares que tiene un inversionista dada una cantidad en pesos y un mes
//específico del año. Deberá leer el mes del año (entre 1 y 12, y deberá validar que SI
//esta en este rango, de lo contrario debe Escribir un ‘error en el mes’) y la cantidad de
//dinero en pesos que desea invertir (la regla es que debe invertir múltiplos de 100.000
//pesos hasta 20 millones de pesos, sino cumple está regla, deberá Escribir ‘error en la
//cantidad a invertir’). Si la validación de datos de entrada está correcta, deberá Escribir
//la cantidad de dólares que tendrá para el mes específico.
package condicionales;
import java.util.Scanner;
public class condicionales7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del dólar al principio del año: ");
        double dolar = sc.nextDouble();
        System.out.println("Ingrese el mes del año: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese la cantidad de dinero en pesos que desea invertir: ");
        double pesos = sc.nextDouble();

        if (mes >= 1 && mes <= 12){
            if (pesos % 100000 == 0 && pesos <= 20000000){
                double dolares = 0;
                if (mes >= 1 && mes <= 3){
                    dolares = pesos / dolar;
                }else if (mes >= 4 && mes <= 6){
                    dolares = pesos / (dolar * 0.95);
                }else if (mes >= 7 && mes <= 9){
                    dolares = pesos / (dolar * 0.95);
                }else if (mes >= 10 && mes <= 12){
                    dolares = pesos / (dolar * 1.1);
                }
                System.out.println("La cantidad de dólares que tendrá para el mes " + mes + " es: " + dolares);
            }else{
                System.out.println("Error en la cantidad a invertir");
            }
        }else{
            System.out.println("Error en el mes");
        }
    }
}
