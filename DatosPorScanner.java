import java.util.Scanner;
public class DatosPorScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre : ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad = ");
        int edad = sc.nextInt();
        System.out.println("Ingrese su altura = ");
        double altura =sc.nextDouble();
        System.out.println("Su nombre es "+nombre);
        System.out.println("Su edad es "+edad);
        System.out.println("Su altura es "+altura+" M");
        sc.close();
    }
}
