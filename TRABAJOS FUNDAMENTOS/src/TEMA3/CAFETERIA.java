package TEMA3;

import java.util.Scanner;

public class CAFETERIA {
    static void main() {
                Scanner scanner = new Scanner(System.in);

                int clientes = 0;

                do {
                    System.out.print("¿Cuál es la cantidad de clientes que van a participar?: ");
                    clientes = scanner.nextInt();

                    if (clientes <= 0) {
                        System.out.println("INGRESE UN NÚMERO DE CLIENTES VÁLIDO (mayor a 0).");
                    }
                } while (clientes <= 0);

                double acumuladorCalificaciones = 0;
                int satisfechos = 0;
                int insatisfechos = 0;
                double calificacionMaxima = -1;

                for (int i = 1; i <= clientes; i++) {
                    System.out.print("Cliente " + i + " - Dame una calificación de satisfacción del 1 al 10: ");
                    double calificacion = scanner.nextDouble();

                    while (calificacion < 1 || calificacion > 10) {
                        System.out.print("Dame un valor válido del 1 al 10: ");
                        calificacion = scanner.nextDouble();
                    }

                    acumuladorCalificaciones += calificacion;

                    if (calificacion >= 7) {
                        satisfechos++;
                    } else {
                        insatisfechos++;
                    }

                    if (calificacion > calificacionMaxima) {
                        calificacionMaxima = calificacion;
                    }
                }

                double promedio = acumuladorCalificaciones / clientes;

                String evaluacionServicio = "";
                if (promedio >= 8) {
                    evaluacionServicio = "Excelente servicio";
                } else if (promedio >= 6) {
                    evaluacionServicio = "Servicio aceptable";
                } else {
                    evaluacionServicio = "Se requiere mejorar el servicio";
                }

                System.out.println("\n========== REPORTE DE SATISFACCIÓN ==========");
                System.out.println("Cantidad de clientes encuestados: " + clientes);
                System.out.println("Suma de las calificaciones: " + acumuladorCalificaciones);
                System.out.println("Promedio general: " + promedio);
                System.out.println("Clientes satisfechos (>= 7): " + satisfechos);
                System.out.println("Clientes insatisfechos (< 7): " + insatisfechos);
                System.out.println("Calificación más alta otorgada: " + calificacionMaxima);
                System.out.println("Evaluación general: " + evaluacionServicio);

            }
        }