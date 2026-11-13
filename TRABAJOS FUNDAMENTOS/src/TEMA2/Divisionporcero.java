package TEMA2;

import java.util.Scanner;

public class Divisionporcero {
    static void main() {
        try {
            Scanner scanner = new Scanner(System.in);
            int a, b, c; // c=a/b
            System.out.println("Dame el valor para A");
            a = scanner.nextInt();
            System.out.println("Dame el valor de B");
            b = scanner.nextInt();
            c = a / b;
            System.out.println("c = " + c);
        }catch (ArithmeticException ae) {
            System.out.println("No puedes dividir por cero");
        }
    }
}
