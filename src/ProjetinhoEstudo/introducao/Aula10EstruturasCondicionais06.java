package ProjetinhoEstudo.introducao;

public class Aula10EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se é dia util ou fds, considerando 1 como domingo.
        byte dia = 3;
        switch(dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção Invalida");
        }
    }
}
