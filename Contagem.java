public class Contagem {
    public static int contar(int[] dados, int n) {
        int contador = 0;
        
        for (int i = 0; i < dados.length; i++) {
            if (dados[i] >= dados[0] && dados[i] <= n) {
                contador++;
            }
        }
        
        return contador;
    }
}