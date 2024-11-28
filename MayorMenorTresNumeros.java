import java.util.Scanner;
public class MayorMenorTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero = ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero = ");
        int num2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero = ");
        int num3 = sc.nextInt();
        if ((num1>num2) && (num1<num3)) {
            System.out.println("el primero es mayor que el segundo y menor que el tercero.");
            
        }else{
            System.out.println("el primero  no es mayor que el segundo y menor que el tercero.");
        }
        sc.close();
    }
}
