package ProjetinhoEstudo.introducao;

public class Aula07EstruturasCondicionas03 {
    public static void main(String[] args) {
        //Dizimar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Consigo dar o dizimo de 500";
        String mensagemNaoDoar = "Não consigo dar o dizimo";
        String resultado;
        if(salario > 6001){
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        //outra forma de fazer Operador Ternario
        double salario2 = 6000;
        String mensagemDoar2 = "Consigo dar o dizimo de 500";
        String mensagemNaoDoar2 = "Não consigo dar o dizimo";
        String resultado2 = salario2 > 5000 ? mensagemDoar2 : mensagemNaoDoar2;

        System.out.println(resultado2);
    }
}
