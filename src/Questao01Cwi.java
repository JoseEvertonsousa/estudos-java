public class Questao01Cwi {
    public static void main(String[] args) {
        char [][] matriz = new char [3][3];

        String palavra = "";

        matriz[0][0]= 'C';
        matriz[0][1]= 'O';
        matriz[0][2]= 'R';

        matriz[1][0]= 'W';
        matriz[1][1]= 'W';
        matriz[1][2]= 'W';

        matriz[2][0]= 'L';
        matriz[2][1]= 'E';
        matriz[2][2]= 'I';

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i==j) {
                    palavra = palavra + matriz[i][j];
                }
            }
        }

        System.out.println(palavra);
    }
}
