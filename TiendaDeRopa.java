import java.util.Scanner;
public class TiendaDeRopa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PRECIOCAMISETA = 25;
        final int PRECIOPANTALON = 30;
        final double DESCUENTOGENERAL = 0.85;
        final double DESCUENTOCAMISETAS = 0.95;
        double valorCompra=0;
        System.out.println("Cuantas camisetas desea comprar = ");
        int cantCamiseta = sc.nextInt();
        System.out.println("Cuantos pantalones desea comprar = ");
        int cantPantalon = sc.nextInt();
       if (cantCamiseta>=2) {
        valorCompra = (((cantCamiseta*PRECIOCAMISETA)*DESCUENTOCAMISETAS)+(cantPantalon*PRECIOPANTALON))*DESCUENTOGENERAL;
       }else{
        valorCompra =((cantCamiseta*PRECIOCAMISETA)+(cantPantalon*PRECIOPANTALON))*DESCUENTOGENERAL;
       }
       System.out.println("El valor de su compra es de = "+valorCompra);
       sc.close();
    }
}

