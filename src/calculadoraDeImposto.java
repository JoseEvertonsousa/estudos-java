public class calculadoraDeImposto {
    public static void main(String[] args) {
    double salario = 5000.00 ;
    if (salario <= 1903.98 )
        System.out.println("ISENTO");
    else if (salario >= 1093.99 && salario <= 2826.65 )
        System.out.println(  "Você pagará 7,5% de Imposto = " + salario * 0.75 );
    else if (salario >= 2826.66 && salario <= 3751.05 )
        System.out.println(  "Você pagará 15%% de Imposto = " + salario * 0.15  );
    else if (salario >= 3751.06 && salario <= 4664.68)
        System.out.println( "Você pagará 22,5% de Imposto = " + salario * 0.225 );
    else
        System.out.println("Você pagará 27,5% de Imposto = " + salario * 0.275 );


    }




}
