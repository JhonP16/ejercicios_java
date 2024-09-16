package strings;
public class strings2 {
    public static void main(String[] args){
        String cadena = "El perro me mordió";
        for (int i = 0; i<cadena.length(); i++){
            System.out.print(cadena.charAt(i)+ "|"); // charAt--> Método de los strings que me muestra un carácter en específico de una posición
        }
    }
}
