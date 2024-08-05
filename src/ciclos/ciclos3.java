//Pares del 20 al 2 (Descendentemente)
package ciclos;
public class ciclos3 {
    public static void main(String[] args){
        int i = 20;

        System.out.println("--- CON WHILE ----");
        while(i>=2){
            System.out.println(i);
            i-=2;
        }

        System.out.println("--- CON FOR ----");
        for(i=20; i>=2; i-=2){
            System.out.println(i);
        }

    }
}
