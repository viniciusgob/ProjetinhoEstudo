package ProjetinhoEstudo.introducao;

public class Aula06EstruturasCondicionas02 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil,
        //idade >= 15 && idade < 18 juvenil,
        //idade >= 18 adulto,
        int idade = 17;
        String categoria;

        //Operador Ternario como fazer tambem no lugar do if
        categoria = idade < 15 ? "Categoria infantil" : idade >= 15 && idade <18 ? "Categoria Juvenil" : "Categoria Adulto";

        if(idade < 15){
            categoria = ("Categoria infantil");
        } else if (idade >= 15 && idade <18) {
            categoria = ("Categoria Juvenil");
        } else {
            categoria = ("Categoria Adulto");
        }
        System.out.println(categoria);
    }
}
