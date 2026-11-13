import java.util.Scanner;

public class CAJERO_AUTOMATICO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Cajero Automático");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su saldo disponible: $");
        double saldoDisponible = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de dinero que desea retirar (múltiplos de 50): $");
        double cantidadRetiro = scanner.nextDouble();

        procesarRetiro(nombre, saldoDisponible, cantidadRetiro);
    }

    public static void procesarRetiro(String nombre, double saldo, double retiro) {
        if (retiro > 0 && retiro <= saldo && retiro % 50 == 0) {
            saldo = saldo - retiro;

            System.out.println("\n==================================");
            System.out.println("      COMPROBANTE DE RETIRO       ");
            System.out.println("==================================");
            System.out.println("Cliente: " + nombre);
            System.out.println("Cantidad retirada: $" + retiro);
            System.out.println("Saldo restante: $" + saldo);
            System.out.println("==================================");
        } else {
            System.out.println("\nRECHAZO DE TRANSACCIÓN.");
            System.out.println("Error: Verifique que la cantidad sea mayor a cero, múltiplo de 50 y que cuente con saldo suficiente.");
        }
    }
}
