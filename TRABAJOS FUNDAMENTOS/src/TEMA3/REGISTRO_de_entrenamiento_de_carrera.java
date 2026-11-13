package TEMA3;

import java.util.Scanner;

public class REGISTRO_de_entrenamiento_de_carrera {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int repetir;

        do {
            int dias = -1;

            while (!(dias > 0)) {
                System.out.print("Cuantos dias saliste a correr?: ");
                dias = scanner.nextInt();
            }

            int suave = 0, base = 0, exigente = 0;
            double distanciaTotal = 0;
            double mayorDistancia = -1;
            int diaMayor = 0;

            for (int i = 1; i <= dias; i++) {
                double km = -1;

                while (!(km >= 0)) {
                    System.out.print("Kilometros recorridos en el dia " + i + ": ");
                    km = scanner.nextDouble();
                }

                distanciaTotal += km;

                if (km < 3) {
                    suave++;
                } else if (km >= 3 && km <= 5) {
                    base++;
                } else {
                    exigente++;
                }

                if (km > mayorDistancia) {
                    mayorDistancia = km;
                    diaMayor = i;
                }
            }

            System.out.println("\nQue estadistica deseas ver?");
            System.out.println("1. Dia con mayor distancia");
            System.out.println("2. Desglose de categorias (Suave, Base, Exigente)");
            System.out.println("3. Distancia total y promedio");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El dia " + diaMayor + " fue el de mayor recorrido con " + mayorDistancia + " km.");
                    break;
                case 2:
                    System.out.println("Entrenamientos Suaves (< 3km): " + suave);
                    System.out.println("Entrenamientos Base (3 a 5km): " + base);
                    System.out.println("Entrenamientos Exigentes (> 5km): " + exigente);
                    break;
                case 3:
                    System.out.println("Distancia total: " + distanciaTotal + " km");
                    System.out.println("Promedio diario: " + (distanciaTotal / dias) + " km");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.print("\nRegistrar otra semana? (1 = Si, 0 = No): ");
            repetir = scanner.nextInt();
        } while (repetir == 1);
    }
}
