package TEMA3;

import java.util.Scanner;

public class RegistroGasolinera {
        static void main() {
            Scanner scanner=new Scanner(System.in);
            int cargasTotales = 0;
            int cargasConDescuento = 0;
            double litrosVendidosTotales = 0;
            double importeAntesDescuento = 0;
            double totalCobrado = 0;
            int opcion = 0;

            do {
                System.out.println("\n--- SISTEMA DE GASOLINERA ---");
                System.out.println("1) Registrar una carga de combustible");
                System.out.println("2) Finalizar y mostrar resumen");
                System.out.print("Elige una opcion: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        double litros = 0;
                        double precio = 0;

                        do {
                            System.out.print("Ingresa los litros cargados (mayor a 0): ");
                            litros = scanner.nextDouble();
                            if (litros <= 0) {
                                System.out.println("Error: Los litros deben ser mayores que cero.");
                            }
                        } while (litros <= 0);


                        do {
                            System.out.print("Ingresa el precio por litro (mayor a 0): $");
                            precio = scanner.nextDouble();
                            if (precio <= 0) {
                                System.out.println("Error: El precio debe ser mayor que cero.");
                            }
                        } while (precio <= 0);


                        double importe = litros * precio;


                        importeAntesDescuento = importeAntesDescuento + importe;

                        if (litros >= 40) {
                            double descuento = importe * 0.05;
                            importe = importe - descuento;
                            cargasConDescuento++;
                            System.out.println("¡Felicidades! Se aplico un 5% de descuento.");
                        }


                        totalCobrado = totalCobrado + importe;
                        litrosVendidosTotales = litrosVendidosTotales + litros;
                        cargasTotales++;

                        System.out.println("El total a cobrar por esta carga es: $" + importe);
                        break;

                    case 2:
                        System.out.println("Cerrando caja...");
                        break;

                    default:
                        System.out.println("Opcion no valida. Intenta de nuevo.");
                        break;
                }

            } while (opcion != 2);

            System.out.println("\n--- RESUMEN DEL DIA ---");
            if (cargasTotales > 0) {
                System.out.println("Numero de cargas registradas: " + cargasTotales);
                System.out.println("Total de litros vendidos: " + litrosVendidosTotales);
                System.out.println("Importe total antes de descuentos: $" + importeAntesDescuento);
                System.out.println("Total cobrado final: $" + totalCobrado);
                System.out.println("Cargas que recibieron descuento: " + cargasConDescuento);

                double promedio = totalCobrado / cargasTotales;
                System.out.println("Importe promedio por carga: $" + promedio);
            } else{
                System.out.println("No se registraron cargas de combustible hoy.");
            }
        }
    }
