package TEMA2;

import java.util.Scanner;

public class DOWHILEMALO {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        int a = 0, b = 0;
        do {
            System.out.println("--SELECCIONA UNA OPCION--)");
            System.out.println("1)Suma \n 2)Resta \n 3)Multiplicaion \n 4)division");
            op = scanner.nextInt();
            if (op != 5) {
                System.out.println("Dame el valor para a");
                a = scanner.nextInt();
                System.out.println("Dame el valor para b");
                b = scanner.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("Suma=" + (a + b));
                    break;

                case 2:
                    System.out.println("Resta=" + (a - b));
                    break;
                case 3:
                    System.out.println("Multiplicacion=" + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Division=" + (a / b));
                    } else {
                        System.out.println("No puedes dividir sobre cero");
                    }
                    break;
            }
        } while (op != 4);
        System.out.println("Hasta Luego");
    }}
