import java.util.Scanner;

public class DiasDasSemana {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite o Dia : ");
        String dia = imput.next() ;
        if (dia.equals("1"))
            System.out.println("Segunda-Feira");
        else if (dia.equals("2"))
            System.out.println("Terça-Feira");
        else if (dia.equals("3"))
            System.out.println("Quarta-Feira");
        else if (dia.equals("4"))
            System.out.println("Quinta-Feira");
        else if (dia.equals("5"))
            System.out.println("Sexta-Feira");
        else if (dia.equals("6"))
            System.out.println("Sabado");
        else if (dia.equals("7"))
            System.out.println("Domingo");
        else
            System.out.println("Dia Invalido");

    }
}
