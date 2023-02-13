package ProjetinhoEstudo.introducao;

public class Aula08EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        //$ 0 até 34,712 = 9.78%
        //$ 34,713 até 68,587 = 37.35%
        //$ 68,588 = 49.58%
        double salario = 70000;
        double tax1 = 9.70;
        double tax2 = 37.35;
        double tax3 = 49.50;
        double resultado;
        double resultado2;

        if (salario < 34713) {
            resultado = tax1;
            resultado2 = salario * tax1 / 100;
        } else if (salario >= 34713 && salario <= 68587) {
            resultado = tax2;
            resultado2 = salario * tax2 / 100;
        } else {
            resultado = tax3;
            resultado2 = salario * tax3 / 100;
        }
        System.out.println("Voce pagará " + resultado + "% de taxa, que dá R$" + resultado2);
    }
}
