import java.util.Scanner;

public class Recadastramento {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Digite o Login");
        String nome = imput.next();

    if (nome.equalsIgnoreCase("") ||nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
        System.out.println("Usuario nao cadastrado ");
    }else
        System.out.println("Usuário cadastrado com sucesso! ");
    }
}