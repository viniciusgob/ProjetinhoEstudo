package ProjetinhoEstudo.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereco <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class TiposPrimitivosExercicio3 {
    public static void main(String[] args) {
        String nome = "Vinicius";
        String endereco = "Rua SM3 QD C LT 10";
        double salario = 50000;
        String dataRecebimento = "01/02/2023";

        System.out.println("Eu "+nome+", morando no endereco "+endereco+", confirmo que recebi o salario de R$ "+salario+", na data "+dataRecebimento);
    }
}
