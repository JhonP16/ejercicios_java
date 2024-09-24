// Dados los siguientes dos strings:
//str1: “Esta es una prueba de string, que verifica donde esta un string”
//imprimir en que posición de str1 están todos los siguientes substrings:
//str2: “esta”
//str3: “string”
//(ignorar mayúsculas y minúsculas).
package strings;
public class strings6 {
    public static void main(String[] args) {
        // Definir los strings
        String str1 = "Esta es una prueba de string, que verifica donde esta un string";
        String str2 = "esta";
        String str3 = "string";

        String str1Lower = str1.toLowerCase();
        String str2Lower = str2.toLowerCase();
        String str3Lower = str3.toLowerCase();

        System.out.println("Posiciones de '" + str2 + "' en str1:");
        encontrarSubstrings(str1Lower, str2Lower);

        System.out.println("\nPosiciones de '" + str3 + "' en str1:");
        encontrarSubstrings(str1Lower, str3Lower);
    }

    public static void encontrarSubstrings(String str1, String subStr) {
        int index = str1.indexOf(subStr);  // Buscar la primera ocurrencia del substring
        while (index != -1) {
            System.out.println("Encontrado en la posición: " + index);
            // Continuar buscando desde la posición siguiente
            index = str1.indexOf(subStr, index + 1);
        }
    }
}
