package TEMA3;

import java.util.Scanner;

public class EXAMEN_MAQUINA_EXPENDEDORA {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int unidades;
        int totalUnidades = 0;
        double importe = 0;
        double totalAPagar = 0;

        do {
            System.out.println("\n--- MENU DE MAQUINA EXPENDEDORA ---");
            System.out.println(" 1. AGUA $15");
            System.out.println(" 2. JUGO $20");
            System.out.println(" 3. GALLETAS $18");
            System.out.println(" 4. SANDWICH $45");
            System.out.println(" 5. CONSULTAR TOTALES VENDIDOS");
            System.out.println(" 6. SALIR");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuantas aguas deseas? ");
                    unidades = scanner.nextInt();
                    while (unidades <= 0) {
                        System.out.print("Ingresa un numero positivo: ");
                        unidades = scanner.nextInt();
                    }
                    importe = unidades * 15;
                    totalAPagar = totalAPagar + importe;
                    totalUnidades = totalUnidades + unidades;

                    System.out.println("Importe de la compra: $" + importe);
                    if (importe < 50) {
                        System.out.println("Clasificacion: Pequena");
                    } else if (importe >= 50 && importe <= 100) {
                        System.out.println("Clasificacion: Mediana");
                    } else {
                        System.out.println("Clasificacion: Grande");
                    }
                    break;

                case 2:
                    System.out.print("¿Cuantos jugos deseas? ");
                    unidades = scanner.nextInt();
                    while (unidades <= 0) {
                        System.out.print("Ingresa un numero positivo: ");
                        unidades = scanner.nextInt();
                    }
                    importe = unidades * 20;
                    totalAPagar = totalAPagar + importe;
                    totalUnidades = totalUnidades + unidades;

                    System.out.println("Importe de la compra: $" + importe);
                    if (importe < 50) {
                        System.out.println("Clasificacion: Pequeña");
                    } else if (importe >= 50 && importe <= 100) {
                        System.out.println("Clasificacion: Mediana");
                    } else {
                        System.out.println("Clasificacion: Grande");
                    }
                    break;

                case 3:
                    System.out.print("¿Cuantos paquetes de galletas deseas? ");
                    unidades = scanner.nextInt();
                    while (unidades <= 0) {
                        System.out.print("Ingresa un numero positivo: ");
                        unidades = scanner.nextInt();
                    }
                    importe = unidades * 18;
                    totalAPagar = totalAPagar + importe;
                    totalUnidades = totalUnidades + unidades;

                    System.out.println("Importe de la compra: $" + importe);
                    if (importe < 50) {
                        System.out.println("Clasificacion: Pequena");
                    } else if (importe >= 50 && importe <= 100) {
                        System.out.println("Clasificacion: Mediana");
                    } else {
                        System.out.println("Clasificacion: Grande");
                    }
                    break;

                case 4:
                    System.out.print("¿Cuantos sandwiches deseas? ");
                    unidades = scanner.nextInt();
                    while (unidades <= 0) {
                        System.out.print("Ingresa un numero positivo: ");
                        unidades = scanner.nextInt();
                    }
                    importe = unidades * 45;
                    totalAPagar = totalAPagar + importe;
                    totalUnidades = totalUnidades + unidades;

                    System.out.println("Importe de la compra: $" + importe);
                    if (importe < 50) {
                        System.out.println("Clasificacion: Pequena");
                    } else if (importe >= 50 && importe <= 100) {
                        System.out.println("Clasificacion: Mediana");
                    } else {
                        System.out.println("Clasificacion: Grande");
                    }
                    break;

                case 5:
                    System.out.println("EL VALOR TOTAL RECAUDADO ES: $" + totalAPagar);
                    System.out.println("UNIDADES TOTALES VENDIDAS: " + totalUnidades);
                    break;

                case 6:
                    System.out.println("EL VALOR TOTAL RECAUDADO ES: $" + totalAPagar);
                    System.out.println("UNIDADES TOTALES VENDIDAS: " + totalUnidades);
                    System.out.println("SALIENDO DEL SISTEMA....... VUELVA PRONTO");
                    break;

                default:
                    System.out.println("OPCION INEXISTENTE. INTENTA DE NUEVO.");
            }
        } while (opcion != 6);
    }
}