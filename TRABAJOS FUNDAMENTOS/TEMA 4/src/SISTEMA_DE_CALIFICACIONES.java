import java.util.Scanner;

public class SISTEMA_DE_CALIFICACIONES {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int cantidad;

        System.out.print("INGRESA LA CANTIDAD DE ESTUDIANTES: ");
        cantidad = scanner.nextInt();

        while (cantidad <= 0) {
            System.out.print("CANTIDAD NO VALIDA. Ingresa un número mayor a 0: ");
            cantidad = scanner.nextInt();
        }

        int[] calificaciones = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la calificación del estudiante " + (i + 1) + " (0 - 100): ");
            int cal = scanner.nextInt();

            while (!(cal >= 0 && cal <= 100)) {
                System.out.print("Calificación fuera de rango. Ingresa un valor entre 0 y 100: ");
                cal = scanner.nextInt();
            }

            calificaciones[i] = cal;
        }

        int suma = 0;
        int max = calificaciones[0];
        int min = calificaciones[0];
        int aprobados = 0;
        int reprobados = 0;

        System.out.println("\n--- LISTA DE CALIFICACIONES ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);

            suma += calificaciones[i];

            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }

            if (calificaciones[i] >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = (double) suma / cantidad;
        double porcentajeAprobacion = ((double) aprobados / cantidad) * 100;

        System.out.println("\n--- RESULTADOS DEL GRUPO ---");
        System.out.printf("Promedio general del grupo: %.2f\n", promedio);
        System.out.println("Calificación más alta: " + max);
        System.out.println("Calificación más baja: " + min);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);
        System.out.printf("Porcentaje de aprobación: %.2f%%\n", porcentajeAprobacion);
        }
    }

