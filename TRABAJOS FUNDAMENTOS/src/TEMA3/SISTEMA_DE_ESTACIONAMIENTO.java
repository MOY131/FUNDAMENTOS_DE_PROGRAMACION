package TEMA3;

import java.util.Scanner;

public class SISTEMA_DE_ESTACIONAMIENTO {
    static void main() {
                Scanner scanner = new Scanner(System.in);
                int opcion;
                int tipo;
                int horas;
                double totalPagar;
                double totalRecaudado = 0;
                int contAutos = 0;
                int contCamionetas = 0;
                int contMotos = 0;

                do {
                    System.out.println("--- MENU ---");
                    System.out.println("1. Registrar vehiculo");
                    System.out.println("2. Consultar resumen del dia");
                    System.out.println("3. Salir");
                    System.out.print("Selecciona una opcion: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Tipo de vehiculo:");
                            System.out.println("1. Automovil ($20/h)");
                            System.out.println("2. Camioneta ($30/h)");
                            System.out.println("3. Motocicleta ($10/h)");
                            System.out.print("Elige el tipo: ");
                            tipo = scanner.nextInt();

                            System.out.print("Ingresa la cantidad de horas: ");
                            horas = scanner.nextInt();

                            totalPagar = 0;

                            switch (tipo) {
                                case 1:
                                    totalPagar = horas * 20;
                                    contAutos++;
                                    System.out.println("Tipo de vehiculo: Automovil");
                                    break;
                                case 2:
                                    totalPagar = horas * 30;
                                    contCamionetas++;
                                    System.out.println("Tipo de vehiculo: Camioneta");
                                    break;
                                case 3:
                                    totalPagar = horas * 10;
                                    contMotos++;
                                    System.out.println("Tipo de vehiculo: Motocicleta");
                                    break;
                                default:
                                    System.out.println("Tipo incorrecto.");
                            }

                            if (tipo >= 1 && tipo <= 3) {
                                System.out.println("Horas: " + horas);
                                System.out.println("Total a pagar: $" + totalPagar);
                                totalRecaudado = totalRecaudado + totalPagar;
                            }
                            break;

                        case 2:
                            System.out.println("--- RESUMEN DEL DIA ---");
                            System.out.println("Automoviles registrados: " + contAutos);
                            System.out.println("Camionetas registradas: " + contCamionetas);
                            System.out.println("Motocicletas registradas: " + contMotos);
                            System.out.println("Total recaudado en el dia: $" + totalRecaudado);
                            break;

                        case 3:
                            System.out.println("Saliendo...");
                            break;

                        default:
                            System.out.println("Opcion no existe.");
                    }
                    System.out.println();
                } while (opcion != 3);
            }
        }