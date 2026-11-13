import java.util.Scanner;

public class METODOS_PARAMETROS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0, a, b;

        System.out.println("INGRESA UNA OPCION \n 1) Suma \n 2) Resta \n 3) Multiplicacion \n 4) Division");
        op = scanner.nextInt();

        System.out.println("Ingresa el valor de A");
        a = scanner.nextInt();

        System.out.println("Ingresa el valor de B");
        b = scanner.nextInt();

        switch (op) {
            case 1:
                suma(a, b);
                break;
            case 2:
                resta(a, b);
                break;
            case 3:
                Multiplicacion(a, b);
                break;
            case 4:
                Division(a, b);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public static void suma(int a, int b) {
        System.out.println("Suma = " + (a + b));
    }

    public static void resta(int a, int b) {
        System.out.println("Resta = " + (a - b));
    }

    public static void Multiplicacion(int a, int b) {
        System.out.println("Multiplicacion = " + (a * b));
    }

    public static void Division(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre cero");
        } else {
            System.out.println("Division = " + (a / b));
        }
    }
}