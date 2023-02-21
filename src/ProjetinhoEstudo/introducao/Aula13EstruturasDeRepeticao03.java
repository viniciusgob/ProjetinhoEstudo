package ProjetinhoEstudo.introducao;

public class Aula13EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //IMPRIMA OS PRIMEIROS 25 NUMEROS DE UM DADO VALOR. POR EXEMPLO 50
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
