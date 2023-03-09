public class Quicksort {
    public static void ordernar(int[] numeros, int inicio, int fim) {
        if (inicio < fim) {
            int idPivo = particionar(numeros, inicio, fim);

            ordernar(numeros, inicio, idPivo - 1);
            ordernar(numeros, idPivo + 1, fim);
        }
    }

    public static int particionar(int[] numeros, int inicio, int fim) {
        int pivo = numeros[inicio];
        int i = inicio + 1;

        for (int j = i; j <= fim; j++) {
            if (numeros[j] < pivo) {
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
                i++;
            }
        }

        int temp = numeros[inicio];
        numeros[inicio] = numeros[i - 1];
        numeros[i-1] = temp;

        return i-1;
    }


}
