package TEMA3;

import java.util.Scanner;

public class SIMULADOR_DE_AHORRADOR_MENSUAL {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int repetir;
        final double TASA_INTERES = 0.01;

        do {
            double inicial = -1, meta = -1, ahorroMensual = -1;

            while (!(inicial >= 0 && meta > 0 && ahorroMensual > 0)) {
                System.out.print("Ingresa cantidad inicial: ");
                inicial = scanner.nextDouble();
                System.out.print("Ingresa tu meta de ahorro: ");
                meta = scanner.nextDouble();
                System.out.print("Ingresa tu ahorro mensual fijo: ");
                ahorroMensual = scanner.nextDouble();
            }

            System.out.println("Elige plazo de simulacion (6, 12, 24 meses): ");
            int plazo = scanner.nextInt();
            int mesesSimulacion = 0;

            switch (plazo) {
                case 6:
                    mesesSimulacion = 6;
                    break;
                case 12:
                    mesesSimulacion = 12;
                    break;
                case 24:
                    mesesSimulacion = 24;
                    break;
                default:
                    System.out.println("Plazo no valido, se usaran 12 meses por defecto.");
                    mesesSimulacion = 12;
            }

            double saldo = inicial;
            double interesesTotales = 0;
            int mesMetaAlcanzada = 0;

            for (int i = 1; i <= mesesSimulacion && saldo < meta; i++) {
                saldo = saldo + ahorroMensual;
                double interesMes = saldo * TASA_INTERES;
                interesesTotales = interesesTotales + interesMes;
                saldo = saldo + interesMes;

                if (saldo >= meta) {
                    mesMetaAlcanzada = i;
                }
            }

            System.out.println("\n--- RESULTADOS ---");
            System.out.printf("Saldo final: $%.2f\n", saldo);
            System.out.printf("Intereses generados: $%.2f\n", interesesTotales);

            if (mesMetaAlcanzada > 0) {
                System.out.println("Meta alcanzada en el mes " + mesMetaAlcanzada);
            } else {
                System.out.println("No se alcanzo la meta en el plazo seleccionado.");
            }

            System.out.print("\nRealizar otra simulacion? \n1)Si \n 2)No");
            repetir = scanner.nextInt();
        } while (repetir == 1);
    }
}