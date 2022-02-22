import java.util.Scanner;

public class Uri1007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        int diferença = (a * b ) - (c * d);
        System.out.println("DIFERENÇA = " + diferença);
    }
}
