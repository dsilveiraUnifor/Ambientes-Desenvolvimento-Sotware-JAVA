public class Fibonacci {
    public static int calcular(int posicao) {
        if (posicao <= 1) {
            return posicao;
        }

        int fibAnterior = 0;
        int fibAtual = 1;
        int fibProximo = 1;

        for (int i = 2; i <= posicao; i++) {
            fibProximo = fibAtual + fibAnterior;
            fibAnterior = fibAtual;
            fibAtual = fibProximo;
        }

        return fibAtual;
    }
}
