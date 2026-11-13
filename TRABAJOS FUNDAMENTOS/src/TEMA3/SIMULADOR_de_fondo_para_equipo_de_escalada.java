package TEMA3;

import java.util.Scanner;

public class SIMULADOR_de_fondo_para_equipo_de_escalada {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int repetir;

        do {
            double precio = -1, ahorro = -1, fondo = -1;

            while (!(precio > 0 && ahorro > 0 && fondo >= 0)) {
                System.out.print("Ingresa el precio del equipo: ");
                precio = scanner.nextDouble();
                System.out.print("Ingresa tu ahorro mensual: ");
                ahorro = scanner.nextDouble();
                System.out.print("Ingresa tu fondo inicial: ");
                fondo = scanner.nextDouble();
            }

            System.out.println("Meses a simular (3, 6, 12): ");
            int plazo = scanner.nextInt();
            int meses = 0;

            switch (plazo) {
                case 3:
                    meses = 3;
                    break;
                case 6:
                    meses = 6;
                    break;
                case 12:
                    meses = 12;
                    break;
                default:
                    System.out.println("Plazo invalido, se usaran 6 meses.");
                    meses = 6;
            }

            double saldo = fondo;
            int mesCompra = 0;

            for (int i = 1; i <= meses && saldo < precio; i++) {
                saldo += ahorro;

                if (saldo >= precio) {
                    mesCompra = i;
                }
            }

            System.out.printf("\nSaldo final: $%.2f\n", saldo);

            if (mesCompra > 0) {
                System.out.println("Lograste comprar el equipo en el mes " + mesCompra);
            } else {
                System.out.println("El dinero no fue suficiente en el plazo establecido.");
            }

            System.out.print("\nRealizar otra simulacion? (1 = Si, 0 = No): ");
            repetir = scanner.nextInt();
        } while (repetir == 1);
    }
}
// switch: Evalúa una variable y salta a ejecutar únicamente el 'case' que coincida. Es la herramienta ideal para construir menús.
// break: Rompe o detiene inmediatamente la ejecución de un ciclo (for/while) o sirve para salir de un 'case' dentro del switch.