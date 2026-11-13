package TEMA3;

import java.util.Scanner;

public class PRACTICA_2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo (N): ");
        int n = scanner.nextInt();
        int sumaPares = 0;
        int contadorDiv3 = 0;
        int sumaPrimos = 0;
        int contadorPrimos = 0;

        System.out.print("Números primos encontrados: ");
        for (int i = 1; i <= n; i++) {
            int divisores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.print(i + " ");
                sumaPrimos += i;
                contadorPrimos++;
            }

            if (i % 2 == 0) {
                sumaPares += i;
            }

            if (i % 3 == 0) {
                contadorDiv3++;
            }
        }
        System.out.println();

        double promedioPrimos = 0;
        if (contadorPrimos > 0) {
            promedioPrimos = (double) sumaPrimos / contadorPrimos;
        }

        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Cantidad de números divisibles entre 3: " + contadorDiv3);
        System.out.println("Promedio de números primos: " + promedioPrimos);
    }
}
