package TEMA3;

import java.util.Scanner;

public class SIMULADOR_DE_UNA_COMPETENCIA_DE_RESISTENCIA {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int repetir;
        final int RONDAS = 5;

        do {
            System.out.print("Cantidad de participantes: ");
            int numParticipantes = scanner.nextInt();

            int totalRondasBajo = 0, totalRondasMedio = 0, totalRondasAlto = 0;
            double distanciaMayor = -1;
            int ganadorId = 0;
            double sumaDistanciaTotal = 0;

            for (int i = 1; i <= numParticipantes; i++) {
                System.out.println("\n--- Participante " + i + " ---");
                double distanciaParticipante = 0;

                for (int j = 1; j <= RONDAS; j++) {
                    double distancia = -1;
                    while (distancia < 0) {
                        System.out.print("Distancia recorrida en ronda " + j + " (km): ");
                        distancia = scanner.nextDouble();
                    }

                    distanciaParticipante += distancia;
                    sumaDistanciaTotal += distancia;

                    if (distancia < 2) {
                        totalRondasBajo++;
                    } else if (distancia >= 2 && distancia <= 4) {
                        totalRondasMedio++;
                    } else {
                        totalRondasAlto++;
                    }
                }

                System.out.println("Total participante " + i + ": " + distanciaParticipante + " km");
                System.out.println("Promedio participante " + i + ": " + (distanciaParticipante / RONDAS) + " km");

                if (distanciaParticipante > distanciaMayor) {
                    distanciaMayor = distanciaParticipante;
                    ganadorId = i;
                }
            }

            System.out.println("\nQue estadistica general deseas ver?");
            System.out.println("1. Ganador (Mayor distancia)");
            System.out.println("2. Conteo global de categorias (Bajo, Medio, Alto)");
            System.out.println("3. Distancia promedio de la competencia");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ganador: Participante " + ganadorId + " con " + distanciaMayor + " km");
                    break;
                case 2:
                    System.out.println("Rondas nivel Bajo: " + totalRondasBajo);
                    System.out.println("Rondas nivel Medio: " + totalRondasMedio);
                    System.out.println("Rondas nivel Alto: " + totalRondasAlto);
                    break;
                case 3:
                    double promedioGlobal = sumaDistanciaTotal / (numParticipantes * RONDAS);
                    System.out.println("Promedio global por ronda: " + promedioGlobal + " km");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.print("\nRegistrar otra competencia? (1 = Si, 0 = No): ");
            repetir = scanner.nextInt();
        } while (repetir == 1);
    }
}
