import java.util.Scanner;

public class CONTROL_DE_VENTAS {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        double[][] ventas = new double[3][5];

        System.out.println("=== REGISTRO DE VENTAS ===");

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Ingresa las ventas de la Sucursal " + (i + 1) + " ---");
            for (int j = 0; j < 5; j++) {
                System.out.print("Venta del Día " + (j + 1) + ": $");
                ventas[i][j] = entrada.nextDouble();
            }
        }
        System.out.println("\n=== TABLA DE VENTAS ===");
        System.out.println("Sucursal\tDía 1\tDía 2\tDía 3\tDía 4\tDía 5");
        for (int i = 0; i < 3; i++) {
            System.out.print("Sucursal " + (i + 1) + "\t");
            for (int j = 0; j < 5; j++) {
                System.out.print("$" + ventas[i][j] + "\t");
            }
            System.out.println();
        }

        double totalEmpresa = 0;
        double mayorVenta = -1;
        int mejorSucursal = -1;

        System.out.println("\n=== TOTALES POR SUCURSAL ===");
        for (int i = 0; i < 3; i++) {
            double totalSucursal = 0;
            for (int j = 0; j < 5; j++) {
                totalSucursal += ventas[i][j];
            }
            System.out.println("Sucursal " + (i + 1) + ": $" + totalSucursal);

            totalEmpresa += totalSucursal;

            if (totalSucursal > mayorVenta) {
                mayorVenta = totalSucursal;
                mejorSucursal = (i + 1);
            }
        }


        System.out.println("\nVentas totales de la empresa: $" + totalEmpresa);

        System.out.println("La sucursal con mayores ventas fue la Sucursal " + mejorSucursal + " con un total de $" + mayorVenta);

        System.out.println("\n=== PROMEDIO DE VENTAS POR DÍA ===");
        for (int j = 0; j < 5; j++) {
            double sumaDia = 0;
            for (int i = 0; i < 3; i++) {
                sumaDia += ventas[i][j];
            }
            double promedioDia = sumaDia / 3;
            System.out.println("Día " + (j + 1) + ": $" + promedioDia);
            System.out.println("");
        }
    }
}
