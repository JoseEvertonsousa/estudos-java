import java.util.Scanner;

public class TipoDeConta {
    public static void main(String[] args) {
        Scanner tipo = new Scanner(System.in);
        System.out.println("1 - Conta Poupança");
        System.out.println("2 - Conta Corrente");
        System.out.println("3 - Conta Investimento");
        System.out.println(" Digite o tipo da Conta : ");
        int conta = tipo.nextInt();
        switch (conta){
            case 1:
                System.out.println("Conta Poupança 0.05%. ");
                break;
            case 2:
                System.out.println("Conta Corrente 0.02%. ");
                break;
            case 3:
                System.out.println("Conta investimento 0.1%. ");
                break;
            default:
                System.out.println("Conta Invalida");

        }
    }
}
