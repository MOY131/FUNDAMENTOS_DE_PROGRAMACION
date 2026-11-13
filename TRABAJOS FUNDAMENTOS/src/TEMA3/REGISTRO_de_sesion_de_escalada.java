package TEMA3;

import java.util.Scanner;

public class REGISTRO_de_sesion_de_escalada {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int repetir;

        do {
            int cantidadRutas = -1;

            while (!(cantidadRutas > 0)) {
                System.out.print("Cantidad de rutas escaladas: ");
                cantidadRutas = scanner.nextInt();
            }

            int aVista = 0, trabajada = 0, proyecto = 0;
            int maxIntentos = -1;
            int rutaMasDificil = 0;
            int totalIntentos = 0;

            for (int i = 1; i <= cantidadRutas; i++) {
                int intentos = -1;

                while (!(intentos > 0)) {
                    System.out.print("Intentos para la ruta " + i + ": ");
                    intentos = scanner.nextInt();
                }

                totalIntentos += intentos;

                if (intentos == 1) {
                    aVista++;
                } else if (intentos >= 2 && intentos <= 4) {
                    trabajada++;
                } else {
                    proyecto++;
                }

                if (intentos > maxIntentos) {
                    maxIntentos = intentos;
                    rutaMasDificil = i;
                }
            }

            System.out.println("\nQue estadistica deseas consultar?");
            System.out.println("1. Ruta que costo mas trabajo");
            System.out.println("2. Conteo por tipo de encadene");
            System.out.println("3. Promedio de intentos por ruta");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La ruta mas dificil fue la " + rutaMasDificil + " con " + maxIntentos + " intentos.");
                    break;
                case 2:
                    System.out.println("Rutas a vista (1 intento): " + aVista);
                    System.out.println("Rutas trabajadas (2-4 intentos): " + trabajada);
                    System.out.println("Rutas proyecto (5 o mas intentos): " + proyecto);
                    break;
                case 3:
                    double promedio = (double) totalIntentos / cantidadRutas;
                    System.out.printf("Promedio de intentos: %.2f\n", promedio);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.print("\nRegistrar otra sesion? (1 = Si, 0 = No): ");
            repetir = scanner.nextInt();
        } while (repetir == 1);
    }
}
