package ProjetinhoEstudo.introducao;

public class Aula08EstruturasCondicionais04 {
    public static void main(String[] args) {
        //$ 0 até 34,712 = 9.70%
        //$ 34,713 até 68,587 = 37.35%
        //$ 68,588 = 49.50%
        double salario = 70000;
        double tax1 = 9.70;
        double tax2 = 37.35;
        double tax3 = 49.50;
        double taxa;
        double pagar;

        if (salario < 34713) {
            taxa = tax1;
            pagar = salario * tax1 / 100;
        } else if (salario >= 34713 && salario <= 68587) {
            taxa = tax2;
            pagar = salario * tax2 / 100;
        } else {
            taxa = tax3;
            pagar = salario * tax3 / 100;
        }
        System.out.println("Voce pagará " + taxa + "% de taxa, que dá R$" + pagar);
    }
}
