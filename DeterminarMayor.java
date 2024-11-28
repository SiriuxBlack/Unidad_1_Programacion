import java.util.Scanner;
public class DeterminarMayor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = sc.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println("El numero mayor es "+num1);
        }else if (num2>num1 && num2>num3 ) {
            System.out.println("El numero mayor es "+num2);
        }else if (num3>num1 && num3>num2) {
            System.out.println("El numero mayor es "+num3);
        }else{
            System.out.println("ERROR");
        }
        sc.close();
    }
}
