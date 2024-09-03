package funciones;
import java.util.Scanner;
public class funciones2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String opcion = "S";

        while(opcion.equals("S") || opcion.equals("s")){
            System.out.println("Ingrese el primer factor: ");
            int a = sc.nextInt();
            System.out.println("Ingrese el segundo factor: ");
            int b = sc.nextInt();

            System.out.println("El resultado de la multiplicacion es: " + multiplicacion(a, b));

            System.out.println("Deseas continuar? (S/N)");
            opcion = sc.next();
        }

    }

    static long multiplicacion(int a, int b){
        long resultado = 0;
        int Bpositivo = b;
        if (b < 0){
            Bpositivo = -b;
        }
        for (int i = 1; i<=Bpositivo;i++  ){
            resultado+= a;
        }
        if (b < 0) {
            resultado = -resultado;
        }
        return resultado;
    }
}
