package ProjetinhoEstudo.introducao;

public class Aula07EstruturasCondicionas03 {
    public static void main(String[] args) {
        //video: youtube.com/watch?v=gU-qCpBC5jk&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=23
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
