// Programa de búscar palabras en una sopa de letras así:
//Dada una matriz de tramaño n x m, de caracteres de letras del idioma español. Buscar cada
//una de las palabras almacenadas en un arreglo de Strings. String[] palabras = {“hola”, “papa”,
//“eafit”, etc} la mayoría de palabras existen en la sopa de letras, pero algunas no.
//Por cada palabra encontrada, imprimir la posición inicial (xi, yi) y la posición final (xf,yf) donde
//se hallo la palabra.
//La palabra puede existir en horizontal directa, o invertida; en vertical directa o invertida; en
//diagonal directa o invertida.
//Al final del programa, deberá imprimir el número de pasos total que ejecutó el programa

package complejidad_algoritmos;

public class complejidad1 {
    public static void main(String[] args) {
        char[][] sopa = {
                {'h', 'o', 'l', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'p', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'p', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'e', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'f', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'}
        };
        String[] palabras = {"hola", "papa", "eafit"};
        int[] pasos = {0}; // Usamos un array para contar los pasos
        for (String palabra : palabras) {
            int[] pos = buscarPalabra(sopa, palabra, pasos);
            if (pos != null) {
                System.out.println("Palabra encontrada: " + palabra + " en la posición inicial (" + pos[0] + ", " + pos[1] + ") y posición final (" + pos[2] + ", " + pos[3] + ")");
            }
        }
        System.out.println("Número de pasos total: " + pasos[0]);
    }

    public static int[] buscarPalabra(char[][] sopa, String palabra, int[] pasos) {
        int[] pos = new int[4];
        int n = sopa.length;
        int m = sopa[0].length;
        int len = palabra.length();

        // Buscar horizontal directa
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - len + 1; j++) {
                int k = 0;
                while (k < len && sopa[i][j + k] == palabra.charAt(k)) {
                    k++;
                    pasos[0]++;
                }
                if (k == len) {
                    pos[0] = i;
                    pos[1] = j;
                    pos[2] = i;
                    pos[3] = j + len - 1;
                    return pos;
                }
            }
        }

        // Buscar horizontal inversa
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= len - 1; j--) {
                int k = 0;
                while (k < len && sopa[i][j - k] == palabra.charAt(k)) {
                    k++;
                    pasos[0]++;
                }
                if (k == len) {
                    pos[0] = i;
                    pos[1] = j;
                    pos[2] = i;
                    pos[3] = j - len + 1;
                    return pos;
                }
            }
        }

        // Buscar vertical directa
        for (int i = 0; i < n - len + 1; i++) {
            for (int j = 0; j < m; j++) {
                int k = 0;
                while (k < len && sopa[i + k][j] == palabra.charAt(k)) {
                    k++;
                    pasos[0]++;
                }
                if (k == len) {
                    pos[0] = i;
                    pos[1] = j;
                    pos[2] = i + len - 1;
                    pos[3] = j;
                    return pos;
                }
            }
        }

        // Buscar vertical inversa
        for (int i = n - 1; i >= len - 1; i--) {
            for (int j = 0; j < m; j++) {
                int k = 0;
                while (k < len && sopa[i - k][j] == palabra.charAt(k)) {
                    k++;
                    pasos[0]++;
                }
                if (k == len) {
                    pos[0] = i;
                    pos[1] = j;
                    pos[2] = i - len + 1;
                    pos[3] = j;
                    return pos;
                }
            }
        }

        // Buscar diagonal directa
        for (int i = 0; i < n - len + 1; i++) {
            for (int j = 0; j < m - len + 1; j++) {
                int k = 0;
                while (k < len && sopa[i + k][j + k] == palabra.charAt(k)) {
                    k++;
                    pasos[0]++;
                }
                if (k == len) {
                    pos[0] = i;
                    pos[1] = j;
                    pos[2] = i + len - 1;
                    pos[3] = j + len - 1;
                    return pos;
                }
            }
        }

        // Buscar diagonal inversa
        for (int i = n - 1; i >= len - 1; i--) {
            for (int j = 0; j < m - len + 1; j++) {
                int k = 0;
                while (k < len && sopa[i - k][j + k] == palabra.charAt(k)) {
                    k++;
                    pasos[0]++;
                }
                if (k == len) {
                    pos[0] = i;
                    pos[1] = j;
                    pos[2] = i - len + 1;
                    pos[3] = j + len - 1;
                    return pos;
                }
            }
        }
        return null;
    }
}