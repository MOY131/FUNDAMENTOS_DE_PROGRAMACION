import java.util.Scanner;
public class SISTEMA_DE_COBRO_DE_ESTACIONAMIENTO {
    static void main() {
        Scanner scanner=new Scanner(System.in);
            final double TARIFA_MOTO = 10;
            final double TARIFA_AUTO = 20;
            final double TARIFA_CAMIONETA = 30;
            final double DESC_CINCO_HORAS = 0.10;
            final double DESC_DIEZ_HORAS = 0.20;

            System.out.println("Ingresa el tipo de vehiculo (1: Motocicleta, 2: Automovil, 3: Camioneta):");
            int tipoVehiculo = scanner.nextInt();

            System.out.println("Ingresa el numero de horas que permanecio estacionado:");
            double horas = scanner.nextDouble();

            if (horas <= 0) {
                System.out.println("Error: La cantidad de horas no es valida.");
            } else {
                double tarifaAplicada = 0;
                String nombreVehiculo = "";

                if (tipoVehiculo == 1) {
                    tarifaAplicada = TARIFA_MOTO;
                    nombreVehiculo = "Motocicleta";
                }
                if (tipoVehiculo == 2) {
                    tarifaAplicada = TARIFA_AUTO;
                    nombreVehiculo = "Automovil";
                }
                if (tipoVehiculo == 3) {
                    tarifaAplicada = TARIFA_CAMIONETA;
                    nombreVehiculo = "Camioneta";
                }

                double subtotal = horas * tarifaAplicada;
                double descuento = 0;

                if (horas > 10) {
                    descuento = subtotal * DESC_DIEZ_HORAS;
                } else {
                    if (horas > 5) {
                        descuento = subtotal * DESC_CINCO_HORAS;
                    }
                }

                double totalAPagar = subtotal - descuento;

                System.out.println("--- TICKET DE ESTACIONAMIENTO ---");
                System.out.println("Tipo de vehiculo: " + nombreVehiculo);
                System.out.println("Horas de estancia: " + horas);
                System.out.println("Tarifa por hora: $" + tarifaAplicada);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento aplicado: $" + descuento);
                System.out.println("Total a pagar: $" + totalAPagar);
            }
        }
    }