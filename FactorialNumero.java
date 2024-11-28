import java.util.Scanner;
public class FactorialNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero al cual desea encontrar su factorial ");
        int numero =sc.nextInt();
        int i =1;
        int resultado = 1;
        while (i <= numero) {
            resultado =i*resultado;
            i++;
        }
        System.out.println("el factorial de "+numero+" es "+resultado);
        sc.close();

    }
}
