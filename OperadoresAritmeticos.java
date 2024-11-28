import java.util.Scanner;
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero entero = ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero entero = ");
        int num2 = sc.nextInt();
        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
        int division = num1/num2;
        int modulo = num1%num2;
        System.out.println("El resultado de la suma es = "+suma);
        System.out.println("El resultado de la resta es = "+resta);
        System.out.println("El resultado de la multiplicacion es = "+multiplicacion);
        System.out.println("El resultado de la division es = "+division);
        System.out.println("El residuo es modulo es ="+modulo);
        sc.close();
    }
}
