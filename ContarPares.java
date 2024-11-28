public class ContarPares {
    public static void main(String[] args) {
        final int CIEN =100;
        final int DOS = 2;
        int contador =0;

        for (int i = 0; i < CIEN; i++) {
            if (i%DOS == 0) {
                contador++;
            }
        }
        System.out.println("Del 0 al cien hay "+contador+" numeros pares");
    }
}
