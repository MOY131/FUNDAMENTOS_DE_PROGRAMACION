package TEMA3;

import java.util.Scanner;

public class ANALISIS_DE_NUMERO_AMIGOS {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int repetir;

        do {
            int num1 = -1, num2 = -1;
            while (num1 <= 0 || num2 <= 0) {
                System.out.print("Ingresa el primer numero positivo: ");
                num1 = scanner.nextInt();
                System.out.print("Ingresa el segundo numero positivo: ");
                num2 = scanner.nextInt();
            }

            int sumaDiv1 = 0;
            int sumaDiv2 = 0;

            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    sumaDiv1 += i;
                }
            }

            for (int i = 1; i < num2; i++) {
                if (num2 % i == 0) {
                    sumaDiv2 += i;
                }
            }

            boolean sonAmigos = false;
            if (sumaDiv1 == num2 && sumaDiv2 == num1) {
                sonAmigos = true;
            }

            System.out.println("\nQue deseas mostrar?");
            System.out.println("1. Solo el resultado");
            System.out.println("2. Resultado y suma de divisores");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (sonAmigos) System.out.println("Son numeros amigos.");
                    else System.out.println("No son numeros amigos.");
                    break;
                case 2:
                    System.out.println("Suma divisores de " + num1 + " = " + sumaDiv1);
                    System.out.println("Suma divisores de " + num2 + " = " + sumaDiv2);
                    if (sonAmigos) System.out.println("Por lo tanto, SON amigos.");
                    else System.out.println("Por lo tanto, NO son amigos.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.print("\nAnalizar otra pareja? \n1)Si\n2)No");
            repetir = scanner.nextInt();
        } while (repetir == 1);
    }
}
