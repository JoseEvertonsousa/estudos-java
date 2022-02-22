import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite seu nome : ");
        String nome = imput.next() ;
        System.out.println("Digite a idade : ");
        int idade = imput.nextInt();
        System.out.println("Digite seu Sexo : ");
        String sexo = imput.next();
         if (idade >= 18 && sexo.equals("M"))
             System.out.println(nome + " Alistamento Obrigatorio! ");
         else if (idade < 18 && sexo.equals("M"))
             System.out.println(nome + " Alistamento não permitido! ");
         else if (idade >= 18 && sexo.equals("F"))
             System.out.println(nome + " Você deseja se alistar ?");
         else
            System.out.println(nome + " Alistamento não Permitido! ");

    }
}
