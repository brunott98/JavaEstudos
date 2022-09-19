package Estudos;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial, double precoInicial, double descontoInicial){  //Construtor


        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;

    }

    double getDesconto(){
        return preco * (1-desconto);
    }

}
