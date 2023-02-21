package ProjetinhoEstudo.introducao;

public class Aula17Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double = 0
        // char '\u0000' ' '
        // boolean false
        //string null

        String[] nomes = new String[4];
        nomes[0] = "Vinicius";
        nomes[1] = "Elaynne";
        nomes[2] = "Sebastiao";
        nomes[3] = "Abby";

        //for (int i = 0; i < 4; i++) uma forma de fazer
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
