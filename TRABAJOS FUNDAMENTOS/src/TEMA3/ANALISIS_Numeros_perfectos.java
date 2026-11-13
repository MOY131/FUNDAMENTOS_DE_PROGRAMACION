package TEMA3;

import java.util.Scanner;

public class ANALISIS_Numeros_perfectos {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int repetir;

        do {
            int n = -1;

            while (!(n > 0)) {
                System.out.print("Ingresa un numero entero positivo: ");
                n = scanner.nextInt();
            }

            int sumaDivisores = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sumaDivisores += i;
                }
            }

            int estado = 0;

            if (sumaDivisores == n) {
                estado = 1;
            } else if (sumaDivisores < n) {
                estado = 2;
            } else {
                estado = 3;
            }

            System.out.println("\nQue deseas ver?");
            System.out.println("1. Solo clasificacion");
            System.out.println("2. Clasificacion y suma de divisores");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (estado == 1) System.out.println("Es un numero Perfecto.");
                    else if (estado == 2) System.out.println("Es un numero Deficiente.");
                    else System.out.println("Es un numero Abundante.");
                    break;
                case 2:
                    System.out.println("La suma de sus divisores es: " + sumaDivisores);
                    if (estado == 1) System.out.println("Por lo tanto, es Perfecto.");
                    else if (estado == 2) System.out.println("Por lo tanto, es Deficiente.");
                    else System.out.println("Por lo tanto, es Abundante.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.print("\nAnalizar otro numero? (1 = Si, 0 = No): ");
            repetir = scanner.nextInt();
        } while (repetir == 1);
    }
}
// && (AND): Operador lógico que obliga a que todas las condiciones unidas se tengan que cumplir al mismo tiempo.
// ! (NOT): Operador lógico que invierte la condición (le dice al ciclo: repite MIENTRAS NO se cumpla esto).