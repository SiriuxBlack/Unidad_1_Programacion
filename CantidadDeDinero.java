public class CantidadDeDinero {

    public static void main(String[] args) {
        final int CANTINICIAL =1000;
        final double SEMANAS = 4.34524;
        final int RETIRO = 200;
        double retiroMensual = SEMANAS*RETIRO;
        double cantidadFinal = CANTINICIAL-retiroMensual;
        System.out.println("A final de mes le quedara = "+cantidadFinal);

    }
}