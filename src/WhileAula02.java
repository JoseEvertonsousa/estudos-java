import java.util.Scanner;

public class WhileAula02 {
    public static void main(String[] args) {
        Scanner contador = new Scanner(System.in);
        System.out.println("Digite o Numero : ");
        int inicio = 0;
        int numero = contador.nextInt();
        while (inicio <= numero) {
            if (inicio % 2 != 0) {
                System.out.println("numeros impares: " + inicio);

        }
           // inicio = inicio +1;//
            inicio ++;
    }
}
}