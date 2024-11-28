import java.util.Scanner;
public class PromedioNumerosArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Numeros = new int [5];
        int suma =0;
        double promedio =0;
        for (int i = 0; i < Numeros.length; i++) {
            System.out.println("ingrese el valor del espacio "+i+" del array");
            Numeros[i]=sc.nextInt();
            suma = Numeros[i]+suma;
        }
        promedio = suma/Numeros.length;
        System.out.println("El promedio del array es "+promedio);
        sc.close();
        
    }
}
