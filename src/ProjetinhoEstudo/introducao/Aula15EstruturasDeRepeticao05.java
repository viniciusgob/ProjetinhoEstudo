package ProjetinhoEstudo.introducao;

public class Aula15EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTot = 50000;
        for (int parcela = (int) valorTot; parcela >= 1; parcela--) {
            double valorParcela = valorTot / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela: " + parcela + " R$" + valorParcela);
        }
    }
}
