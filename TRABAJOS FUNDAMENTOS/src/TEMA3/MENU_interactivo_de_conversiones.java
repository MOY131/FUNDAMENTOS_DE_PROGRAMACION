package TEMA3;

import java.util.Scanner;

public class MENU_interactivo_de_conversiones {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU DE CONVERSIONES ---");
            System.out.println("1. Convertir Kilometros a Metros");
            System.out.println("2. Determinar si un anio es bisiesto");
            System.out.println("3. Calcular el cubo de la suma de dos numeros");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa los kilometros: ");
                    double km = scanner.nextDouble();
                    if (km >= 0) {
                        System.out.println(km + " km equivalen a " + (km * 1000) + " metros.");
                    } else {
                        System.out.println("Error: La distancia debe ser positiva.");
                    }
                    break;
                case 2:
                    System.out.print("Ingresa un anio: ");
                    int anio = scanner.nextInt();
                    if (anio > 0) {
                        if (anio % 4 == 0) {
                            System.out.println("El anio " + anio + " SI es bisiesto.");
                        } else {
                            System.out.println("El anio " + anio + " NO es bisiesto.");
                        }
                    } else {
                        System.out.println("Error: El anio debe ser positivo.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el primer numero: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingresa el segundo numero: ");
                    double num2 = scanner.nextDouble();
                    double suma = num1 + num2;
                    System.out.println("El cubo de la suma (" + suma + ") es: " + (suma * suma * suma));
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error: Opcion no valida, intenta nuevamente.");
            }
        } while (opcion != 4);
    }
}
