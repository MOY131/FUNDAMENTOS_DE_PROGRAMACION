package TEMA3;

import java.util.Scanner;

public class MENU_DE_OPERACIONES_MATEMATICAS_EN_JAVA {
    static void main() {
                Scanner scanner = new Scanner(System.in);
                int opcion;

                do {
                    System.out.println("\n--- MENU MATEMATICO ---");
                    System.out.println("1. Calcular el cuadrado de un numero");
                    System.out.println("2. Calcular el cubo de un numero");
                    System.out.println("3. Determinar si un numero es par o impar");
                    System.out.println("4. Suma de numeros del 1 hasta N");
                    System.out.println("5. Salir");
                    System.out.print("Selecciona una opcion: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingresa un numero: ");
                            double n1 = scanner.nextDouble();
                            System.out.println("El cuadrado es: " + (n1 * n1));
                            break;
                        case 2:
                            System.out.print("Ingresa un numero: ");
                            double n2 = scanner.nextDouble();
                            System.out.println("El cubo es: " + (n2 * n2 * n2));
                            break;
                        case 3:
                            System.out.print("Ingresa un numero positivo: ");
                            int n3 = scanner.nextInt();
                            if (n3 > 0) {
                                if (n3 % 2 == 0) {
                                    System.out.println("El numero es par.");
                                } else {
                                    System.out.println("El numero es impar.");
                                }
                            } else {
                                System.out.println("Error: El numero debe ser positivo.");
                            }
                            break;
                        case 4:
                            System.out.print("Ingresa un limite positivo (N): ");
                            int n4 = scanner.nextInt();
                            if (n4 > 0) {
                                int suma = 0;
                                for (int i = 1; i <= n4; i++) {
                                    suma += i;
                                }
                                System.out.println("La suma de 1 hasta " + n4 + " es: " + suma);
                            } else {
                                System.out.println("Error: El limite debe ser positivo.");
                            }
                            break;
                        case 5:
                            System.out.println("Saliendo del programa... !Hasta luego!");
                            break;
                        default:
                            System.out.println("Error: Opcion no valida, intenta de nuevo.");
                    }
                } while (opcion != 5);
            }
        }
