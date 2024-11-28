import java.util.Scanner;
public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el primer numero ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero ");
        int num2 = sc.nextInt();
        System.out.println("|--------------------------|");
        System.out.println("|Eliga la operacion deseada|");
        System.out.println("|--------------------------|");
        System.out.println("|1) sumar                  |");
        System.out.println("|--------------------------|");
        System.out.println("|2) restar                 |");
        System.out.println("|--------------------------|");
        System.out.println("|3) multiplicar            |");
        System.out.println("|--------------------------|");
        System.out.println("|4) dividir                |");
        System.out.println("|--------------------------|");
        System.out.println("|5) residuo                |");
        System.out.println("|--------------------------|");
        int operacion = sc.nextInt();
        switch (operacion) {
            case 1:
                System.out.println("la suma de "+num1+" y "+num2+" es "+(num1+num2));
                break;
            case 2:
                System.out.println("La resta de "+num1+" y "+num2+" es "+(num1-num2));
                break;
            case 3:
                System.out.println("La multiplicacion de "+num1+" y "+num2+" es "+(num1*num2));
                break;
            case 4:
                System.out.println("La division de "+num1+" y "+num2+" es "+(num1/num2));
                break;
            case 5:
                System.out.println("El  residuo de "+num1+" y "+num2+" es "+(num1%num2));
                break;
            default:
            System.out.println("ERROR");
                break;
        }
        sc.close();

    }
}
