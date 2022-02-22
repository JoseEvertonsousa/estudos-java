import java.util.Scanner;

public class WhileAula04 {
    public static void main(String[] args) {
        String login = "Everton";
        String senha = "everton123";

        Scanner imput = new Scanner(System.in);
        boolean digitadoNaTela = true;
        while (digitadoNaTela) {
            System.out.println("Login :");
            String loginDigitado = imput.nextLine();
            {
                System.out.println("Senha :");
            }
            String senhaDigitada = imput.nextLine();
            if (login.equals(loginDigitado) && senha.equals(senhaDigitada)){
                System.out.println("acesso Concedido.");}
            digitadoNaTela = false;
            break;
        }

        System.out.println("Acesso Negado");
    }

    {
        System.out.println("Fim Do Progama");
    }

}

