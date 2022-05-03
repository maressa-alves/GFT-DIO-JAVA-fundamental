package pratica.variaveis;

//atividade pratica para criação de variáveis em boas práticas

public class Main {

    public static void main(String[] args) {

        int i;
        //int i; nao devem haver variaveis com mesmo nome
        int I; //case sensitive - entende como variavel diferente
        //int 1i; nao se deve iniciar nome de variavel com numeros
        //int $aa; nao é boa pratica inicar nome de variavel com caractere especial

        i = 5;
        I = 10;

        final int j = 10;
        //j = 15; nao se altera o valor de uma variavel final
        int abc123;
        //int abcd 123; nao se usa espaço no nome de variaveis
        //int abc%123; #%()@ sao proibidos em nome de variaveis

        abc123 = 100;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; nao segue a regra de camelCase
        final int NUMER0_TENTATIVAS = 5; //forma correta de escrever variavel final
        int QUANTIDADE_OPCOES = 25; //nao segue boas praticas porem nao gera erro
        int qtdProd = 13; //falta expressividade no nome

        System.out.println(i);
        System.out.println(I);
        System.out.println(j);
        System.out.println(abc123);
        System.out.println(quantidadeProduto);
        System.out.println(NUMER0_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
        System.out.println(qtdProd);
    }
}
