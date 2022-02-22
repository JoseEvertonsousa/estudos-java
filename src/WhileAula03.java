import java.util.Scanner;

public class WhileAula03 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("1 - Caucular Imposto");
        System.out.println("2 - Depositar salario ");
        System.out.println("3 - Sair ");
        System.out.println("Digite sua opçao : ");
        int numero = 0;
        double saldo = 0;
        int opcao = imput.nextInt();
        while (opcao != 3) {
            if (opcao == 1) {
                System.out.println("Digite o valor");
                double valor = imput.nextDouble();
                System.out.println("voce tem que pagar : " + 0.3 * valor);
            }if (opcao == 2)
            {System.out.println("Digite o valor ");
            double deposito = imput.nextDouble();
            saldo = saldo + deposito;
            System.out.println("O valor depositado foi : " + deposito + " e o seu saldo agora é : " + saldo );

            }
            System.out.println("1 - Caucular Imposto");
            System.out.println("2 - Depositar salario ");
            System.out.println("3 - Sair ");
            System.out.println("Digite sua opçao : ");
            opcao = imput.nextInt();
        }
    }
}
