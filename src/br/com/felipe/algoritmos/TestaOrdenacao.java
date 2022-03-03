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

        for (int atual = 0; atual < produtos.length - 1; atual++){
            int menor = buscaMenor(produtos, atual, produtos.length - 1);
            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];
            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }

        for (Produto item: produtos) {
            System.out.println(item.getNome() + ", custa: " + item.getPreco());
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
