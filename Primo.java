public class Primo {
    int num;

    public void checaPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                System.out.println("O numero nao eh primo");
                return;
            }
        }
        System.out.println("O numero eh primo");
    }
}
