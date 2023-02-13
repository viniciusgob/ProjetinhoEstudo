package ProjetinhoEstudo.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int num01 = 10;
        double num02 = 20;
        double result = num01 / num02;
        //Valores inteiros o resultado também é inteiro

        //%
        int resto = 21 % 2;

        //Operadores logicos < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && (and) || (or)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        //bonus = bonus + 1000;
        bonus += 1000;
        //bonus = bonus - 1000;
        bonus -= 1000;
        //bonus = bonus * 1000;
        bonus *= 1000;
        //bonus = bonus / 1000;
        bonus /= 1000;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;//sinal depois, vai incrementar e depois executar
        ++contador;
        --contador;//sinal antes, vai incrementar depois executar
        System.out.println(contador);

    }
}
