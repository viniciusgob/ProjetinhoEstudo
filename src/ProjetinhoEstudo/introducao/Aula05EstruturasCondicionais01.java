package ProjetinhoEstudo.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcolica TESTE 1");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcolica");
        }
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcolica TESTE 2");
        }
        else{
            System.out.println("Não autorizado a comprar bebida alcolica");
        }

    }
}
