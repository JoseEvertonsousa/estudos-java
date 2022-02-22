import java.util.Scanner;

public class DesafioCrescer {
    public static void main(String[] args) {
        Scanner arquivo = new Scanner(System.in);
        System.out.println("Digite o Tamanho do Arquivo");
        double tamanho = arquivo.nextDouble();
        double retorno = 1;
        if ((tamanho / Math.pow(1024, 8)) >= 1) {
            retorno = tamanho / Math.pow(1024, 8) ;
            System.out.println(String.format("%.2f", retorno) + " YB");
        }  else if ((tamanho / Math.pow(1024, 7) >= 1)) {
            retorno = tamanho / Math.pow(1024, 7) ;
            System.out.println(String.format("%.2f",retorno) + " ZB ");
        } else if ((tamanho / Math.pow(1024, 6) >= 1)) {
            retorno = tamanho / Math.pow(1024, 6) ;
            System.out.println(String.format("%.2f", retorno ) + " EB ");
        } else if ((tamanho / Math.pow(1024, 5) >= 1)) {
            retorno = tamanho / Math.pow(1024, 5) ;
            System.out.println(String.format("%.2f", retorno ) + " PB ");
        } else if ((tamanho / Math.pow(1024, 4) >= 1)) {
            retorno = tamanho / Math.pow(1024, 4) ;
            System.out.println(String.format("%.2f", retorno ) + " TB ");
        } else if ((tamanho / Math.pow(1024, 3) >= 1)) {
            retorno = tamanho / Math.pow(1024, 3) ;
            System.out.println(String.format("%.2f",retorno ) + " GB ");
        } else if ((tamanho / Math.pow(1024, 2) >= 1)) {
            retorno = tamanho / Math.pow(1024, 2) ;
            System.out.println(String.format("%.2f",retorno) + " MB ");
        } else if (tamanho / 1024 >= 1) {
            retorno = tamanho / 1024 ;
            System.out.println(String.format("%.2f",retorno) + " KB");
        }
          else {
            System.out.println(String.format("%.2f", tamanho ) + " B");
        }
    }
}
