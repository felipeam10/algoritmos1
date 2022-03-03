package br.com.felipe.algoritmos;

public class TestaMenorPreco {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborghini", 1000000.0),
                new Produto("Jipe", 46000.0),
                new Produto("Brasilia", 6000.0),
                new Produto("Smart", 46000.0),
                new Produto("Fusca", 16000.0),
                new Produto("Bike", 200.0)
        };

        int maisBarato = buscaMenor(produtos, 0, 5);
        System.out.println("O produto encontra-se na posicao: " + maisBarato);
        System.out.println("O carro mais barato é o " + produtos[maisBarato].getNome() + " e custa: " + produtos[maisBarato].getPreco());
    }

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
        int maisBarato = inicio;
        for(int atual = inicio; atual <= termino; atual++){
            if(produtos[atual].getPreco() <= produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
}
