import java.util.Scanner;

public class ArraysAula03 {
    public static void main(String[] args) {
        double [] notas = new double[4];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite as nota " + ( i + 1)+ " : ");
            notas[i] = teclado.nextDouble();

        }
        double media = 0 ;
        for (int i = 0 ; i < notas.length; i++){
            media = media + notas[i];
            System.out.println("Nota + "+ (i + 1) + " : " + notas[i] );

        }
        media = media / notas.length ;
        System.out.println( "Soma das notas : " + media);
    }
}
