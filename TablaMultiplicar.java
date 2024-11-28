import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero al cual se le hallara su tabla de multiplicar");
        int num = sc.nextInt();
        int contador = 1;
        int resultado = 1;
        for (int i = 1; i <= 10 ; i++) {
            resultado = num*i ;
            System.out.println(num+"x"+contador+"="+resultado);
            contador++;
        }
        sc.close();
    }
}
