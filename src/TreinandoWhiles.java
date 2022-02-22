import java.util.Scanner;

public class TreinandoWhiles {
    public static void main(String[] args) {
        int numeroDigitado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro de 0 a 100 : ");
        numeroDigitado = teclado.nextInt();
        while (numeroDigitado < 0 || numeroDigitado > 100) {
            System.out.println("Digite um numero inteiro de 0 a 100 : ");
            numeroDigitado = teclado.nextInt();
        }

        for (int i = numeroDigitado; i <= 100; i++) {
            if (i % 2 != 0 ) {
                if (i == 91 || i == 95) {
                    continue;
                }

                System.out.print(i + ",");
            }
        }
    }
}
