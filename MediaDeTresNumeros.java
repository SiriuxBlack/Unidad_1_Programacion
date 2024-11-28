import java.util.Scanner;
public class MediaDeTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMERODEVARIABLES= 3;
        System.out.print("Ingrese el primer numero = ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero = ");
        int num2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero = ");
        int num3 = sc.nextInt();
        double media = (num1+num2+num3)/NUMERODEVARIABLES;
        System.out.print("La media de "+num1+" "+num2+" "+num3+" es = "+media);
        sc.close();


        
    }
}
