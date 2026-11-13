package TEMA3;

import java.util.Scanner;

public class PRACTICA_22 {
    static void main() {
            Scanner scanner = new Scanner(System.in);
            final int VALOR_MINIMO = 1;
            int respuesta;

            do {
                System.out.print("Ingrese un número entero positivo mayor que 0: ");
                int n= scanner.nextInt();

                while (n < VALOR_MINIMO) {
                    System.out.print("Número inválido. Ingrese un número mayor que 0: ");
                    n = scanner.nextInt();
                }

                int sumaPares = 0;
                int sumaImpares = 0;
                int cantPares = 0;
                int cantImpares = 0;

                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        sumaPares += i;
                        cantPares++;
                    } else {
                        sumaImpares += i;
                        cantImpares++;
                    }
                }

                System.out.println("Cantidad de números pares: " + cantPares);
                System.out.println("Suma de números pares: " + sumaPares);
                System.out.println("Cantidad de números impares: " + cantImpares);
                System.out.println("Suma de números impares: " + sumaImpares);

                System.out.print("¿Desea realizar otro cálculo? \n (1: Sí  \n (2: No");
                respuesta = scanner.nextInt();

            } while (respuesta == 1);
        }
    }
