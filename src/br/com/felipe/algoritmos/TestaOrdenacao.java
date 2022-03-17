package br.com.felipe.algoritmos;

public class TestaOrdenacao {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborghini", 1000000.0),
                new Produto("Jipe", 46000.0),
                new Produto("Brasilia", 6000.0),
                new Produto("Smart", 46000.0),
                new Produto("Fusca", 16000.0),
                new Produto("Bike", 200.0),
                new Produto("Patins Usado", 60.0)
        };

        ordena(produtos, produtos.length);

        for (Produto item: produtos) {
            System.out.println(item.getNome() + ", custa: " + item.getPreco());
        }


    }

    private static void ordena(Produto[] produtos, int qtdElementos) {
        for (int atual = 0; atual < qtdElementos - 1; atual++){
            System.out.println("Estou na posicao " + atual);

            int menor = buscaMenor(produtos, atual, qtdElementos - 1);
            System.out.println("Trocando " + atual + " com o " + menor);

            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];
            System.out.println("Trocando " + produtoAtual.getNome() + " " + produtoMenor.getNome());
            System.out.println("  ");

            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }
    }

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
        int maisBarato = inicio;

        for(int atual = inicio; atual <= termino; atual++){
            if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
}
