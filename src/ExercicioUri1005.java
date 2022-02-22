import java.util.Scanner;

public class ExercicioUri1005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble(); ;
        double b = teclado.nextDouble();
        double media = ((a * 3.5) + b * 7.5)/11;
        System.out.println(String.format("MEDIA = %.5f", media));

    }
}
