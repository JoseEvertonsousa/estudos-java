import java.util.Scanner;

public class ArraysAula04 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Valor 1 , posiçao " + i + " : ");
            array1[i] = teclado.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Valor 1 , posiçao " + i + " : ");
            array2[i] = teclado.nextInt();
        }
        for (int i = 0; i < array3.length; i++) {
            array3 [i] = array1[i] * array2 [i];
            System.out.println(array3[i] + " ");
        }
    }

}
