package TEMA3;

import java.util.Scanner;

public class ESTADISTICAS_DE_UNA_SECUENCIA_NUMERICA {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int repetir;
        final int DIV_4 = 4;
        final int DIV_3 = 3;

        do {
            int n = -1;
            while (n <= 0) {
                System.out.print("Ingresa un numero entero positivo N: ");
                n = scanner.nextInt();
            }

            int sumaDiv4 = 0, cuentaMultiplos3 = 0, cuentaAmbos = 0;
            int pares = 0, impares = 0, multiplos5 = 0;

            for (int i = 1; i <= n; i++) {
                if (i % DIV_4 == 0) {
                    sumaDiv4 = sumaDiv4 + i;
                }
                if (i % DIV_3 == 0) {
                    cuentaMultiplos3++;
                }
                if (i % DIV_4 == 0 && i % DIV_3 == 0) {
                    cuentaAmbos++;
                }

                if (i % 2 == 0) pares++;
                else impares++;

                if (i % 5 == 0) multiplos5++;
            }

            System.out.println("Suma de divisibles entre 4: " + sumaDiv4);
            System.out.println("Cantidad de multiplos de 3: " + cuentaMultiplos3);
            System.out.println("Divisibles entre ambos: " + cuentaAmbos);

            System.out.println("\nQue estadistica extra deseas ver?");
            System.out.println("1. Pares\n2. Impares\n3. Multiplos de 5");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Total de numeros pares: " + pares);
                    break;
                case 2:
                    System.out.println("Total de numeros impares: " + impares);
                    break;
                case 3:
                    System.out.println("Total de multiplos de 5: " + multiplos5);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.print("\nDeseas analizar otro numero? \n 1) Si \n 2)No");
            repetir = scanner.nextInt();
        } while (repetir == 1);
    }
}
