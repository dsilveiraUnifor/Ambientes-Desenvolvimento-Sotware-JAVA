public class Somatorio {
    int soma = 0;
    public int somatorio(int[] num) {


        for (int i = 0; i < num.length; i++) {
            System.out.println("Chamou o laco " + soma);
            soma += num[i];
        }

        return soma;
    }
}
