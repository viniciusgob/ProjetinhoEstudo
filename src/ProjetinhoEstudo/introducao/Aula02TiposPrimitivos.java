package ProjetinhoEstudo.introducao;

public class TiposPrimitivos2 {
    //int, double, float, char, byte, short, long, booleanv
    public static void main(String[] args) {
        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float)2500.0D;//usa o cast
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; //unicode e tabela ascii

        //Não é um tipo primitivo
        String nome = "Vinicius";

        // Se passar aspas duplas no println ele imprimi a palavra em vez da variavel
        System.out.println("Idade é "+idade);
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
        System.out.println(salarioFloat);
        System.out.println("O nome mais lindo do mundo é "+nome);

    }
}
