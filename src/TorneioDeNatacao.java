public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Deyvison";
        int idade = 20 ;
        if (idade <= 10) {
            System.out.println(nome + " : Participará da categoria infantil");
        } else if  (idade >= 11 && idade <= 15 ) {
            System.out.println(nome + " : Participará da categoria Juvinil ");
        } else if (idade >= 16 && idade <= 19 ){
            System.out.println(nome + " : Participará da categoria Pré-Adulto");
        } else{
            System.out.println(nome + " : Participará da categoria adulto");
        }
    }
}
