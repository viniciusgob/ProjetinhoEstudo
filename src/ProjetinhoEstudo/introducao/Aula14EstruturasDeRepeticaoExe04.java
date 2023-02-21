package ProjetinhoEstudo.introducao;

public class Aula14EstruturasDeRepeticaoExe04 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    //condição é que o valor da parcela >= 1000
    public static void main(String[] args) {
        double valorTot = 50000;
        for (int parcela = 1; parcela <= valorTot; parcela++) {
            double valorParcela = valorTot / parcela;
            if(valorParcela < 1000){
                break;
            }System.out.println("Parcela: "+parcela+" R$"+valorParcela);
        }
    }
}
