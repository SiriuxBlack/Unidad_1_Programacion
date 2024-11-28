import java.util.Scanner;

public class TallerHotel {

    // Variables para almacenar la información de las habitaciones
    static String[] clientes = new String[5]; // Nombres de los clientes
    static double[] preciosPorNoche = new double[5]; // Precios por noche
    static int[] nochesReservadas = new int[5]; // Noches reservadas por cada cliente
    static boolean[] habitacionesOcupadas = new boolean[5]; // Estado de las habitaciones

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TallerHotel hotel = new TallerHotel(); // Crear una instancia de la clase
        boolean continuar = true;

        while (continuar) {
            // Menú principal
            System.out.println("\n--- Sistema de Reservas de Hotel ---");
            System.out.println("1. Registrar Reserva");
            System.out.println("2. Cancelar Reserva");
            System.out.println("3. Mostrar Reporte");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();

            // Manejo de las opciones del menú
            switch (opcion) {
                case 1:
                    hotel.registrarReserva(scanner); // Llama al método de instancia
                    break;
                case 2:
                    hotel.cancelarReserva(scanner); // Llama al método de instancia
                    break;
                case 3:
                    hotel.mostrarReporte(); // Llama al método de instancia
                    break;
                case 4:
                    continuar = false; // Finaliza el programa
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
        scanner.close(); // Cierra el escáner al finalizar
    }

    // Método para registrar una reserva
    boolean registrarReserva(Scanner scanner) {
        System.out.print("Ingrese el número de habitación (0-4): ");
        int habitacion = scanner.nextInt(); // Pedimos habitaciones por teclado
        scanner.nextLine(); // Limpia el espacio del escáner

        // Verifica que el número de habitación sea válido
        if (habitacion < 0 || habitacion >= clientes.length) { // usamos un if
            System.out.println("Número de habitación no válido.");
            return false; // si la habitacion esta ocupada devuelve false para que esto no se lleve a cabo y lo almacena como false
        }

        // Si la habitación está ocupada no permite la reserva
        if (habitacionesOcupadas[habitacion]) {
            System.out.println("La habitación ya está ocupada.");
            return false; // si la habitacion esta ocupada devuelve false para que esto no se lleve a cabo y lo almacena como false
        } else {
            // Registro de datos de la reserva
            System.out.print("Ingrese el nombre del cliente: ");
            clientes[habitacion] = scanner.nextLine();
            System.out.print("Ingrese el número de noches reservadas: ");
            nochesReservadas[habitacion] = scanner.nextInt();
            System.out.print("Ingrese el precio por noche: ");
            preciosPorNoche[habitacion] = scanner.nextDouble();
            habitacionesOcupadas[habitacion] = true; // Marcar la habitación como ocupada
            System.out.println("Reserva registrada exitosamente.");
            return true;// devuelve verdadero lo que indica que la accion se lleva a cabo y lo almacena como true
        }
    }

    // Método para cancelar una reserva
    boolean cancelarReserva(Scanner scanner) {
        System.out.print("Ingrese el número de habitación (0-4): ");
        int habitacion = scanner.nextInt();

        // Verifica que el número de habitación sea válido
        if (habitacion < 0 || habitacion >= clientes.length) {
            System.out.println("Número de habitación no válido.");
            return false;// si la habitacion esta ocupada devuelve false para que esto no se lleve a cabo y lo almacena como false
        }

        // Cancela la reserva si la habitación está ocupada
        if (!habitacionesOcupadas[habitacion]) {
            System.out.println("La habitación ya está disponible.");
            return false;// si la habitacion esta ocupada devuelve false para que esto no se lleve a cabo y lo almacena como false
        } else {
            clientes[habitacion] = null; // Libera el nombre del cliente
            preciosPorNoche[habitacion] = 0;
            nochesReservadas[habitacion] = 0;
            habitacionesOcupadas[habitacion] = false; // Marcar la habitación como libre
            System.out.println("Reserva cancelada.");
            return true;// si la habitacion esta ocupada devuelve false para que esto no se lleve a cabo y lo almacena como false
        }
    }

    // Método para mostrar un reporte del estado de las habitaciones
    boolean mostrarReporte() {////Este método devuelve un valor booleano (true o false), lo que puede indicar el estado del reporte
        System.out.println("\n--- Reporte de Habitaciones ---");//Se imprime un encabezado para el reporte de habitaciones. El \n agrega una línea en blanco antes del texto
        System.out.println("Habitaciones ocupadas:");//Se indica que a continuación se listarán las habitaciones ocupadas
        boolean hayOcupadas = false;//Se inicializa una variable booleana hayOcupadas en false. Esta variable se utilizará para rastrear si hay alguna habitación ocupada
        for (int i = 0; i < clientes.length; i++) {//Se inicia un bucle que recorre todas las posiciones del arreglo clientes
            if (habitacionesOcupadas[i]) {//Para cada índice i, se verifica si la habitación está ocupada. habitacionesOcupadas[i] es un arreglo booleano que indica si la habitación está ocupada
                double total = preciosPorNoche[i] * nochesReservadas[i];//Si la habitación está ocupada, se calcula el total a pagar multiplicando el precio por noche (preciosPorNoche[i]) por el número de noches reservadas (nochesReservadas[i])
                System.out.println("Habitación " + i + " - Cliente: " + clientes[i] + " - Total a pagar: " + total);//Se imprime información sobre la habitación ocupada, incluyendo el número de habitación, el nombre del cliente y el total a pagar
                hayOcupadas = true;//Si se encontró al menos una habitación ocupada, se actualiza hayOcupadas a true
            }
        }

        if (!hayOcupadas) {//Después de recorrer todas las habitaciones, se verifica si hayOcupadas sigue siendo false
            System.out.println("No hay habitaciones ocupadas.");//Si no hay habitaciones ocupadas, se imprime un mensaje indicando que no hay habitaciones ocupadas
        }

        System.out.println("\nHabitaciones disponibles:");//Se imprime un encabezado para listar las habitaciones disponibles
        for (int i = 0; i < clientes.length; i++) {//Se inicia otro bucle que recorre todas las posiciones del arreglo clientes
            if (!habitacionesOcupadas[i]) {//Se verifica si la habitación no está ocupada. El símbolo ! significa "no", por lo que se comprueba si la habitación está libre
                System.out.println("Habitación " + i);//Si la habitación está disponible, se imprime su número
            }
        }
        return true;//Finalmente, el método devuelve true, indicando que el reporte se generó con éxito
    }
}