import java.util.Scanner;

public class WhileAulaDu05 {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner imput = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1 : Digite um numero de 1 a 10 ");
            int numero1 = imput.nextInt();
            System.out.println("PLAYER 2 : Digite um numero de 1 a 10 ");
            int numero2 = imput.nextInt();
            System.out.println("Acertou. " + (numero2 == numero1));
            System.out.println("--------------------------------------------");
            System.out.println("Deseja continuar ? ");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            desejaContinuar = imput.nextInt();
        }while (desejaContinuar == 1);

    }
}
