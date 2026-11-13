import java.util.Scanner;

public class METODOS_RETORNO {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int op, op1;
        do {
            System.out.println("Selecciona una opcion \n 1) cuadrado \n 2) triangulo \n 3) Circulo \n 4) Rectangulo\n 5) salir");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Area = " + cuadrado());
                    break;
                case 2:
                    System.out.println("Area = " + triangulo());
                    break;
                case 3:
                    System.out.println("Area = " + circulo());
                    break;
                case 4:
                    System.out.println("Area = " + rectangulo());
                    break;
                case 5:
                    break;
            }

            System.out.println("Desea Realizar Otra Operacion? \n 1) si \n 2) no");
            op1 = scanner.nextInt();

        } while (op1 == 1); // Se cambió 'op' por 'op1'

        System.out.println("Gracias");
    } // Aquí se cierra el método main

    // Los demás métodos van afuera del main, pero dentro de la clase
    public static double cuadrado () {
        double l = 0;
        System.out.println("Ingresa el valor de un lado");
        l = scanner.nextDouble();
        return (l * l);
    }

    public static double triangulo () {
        double b = 0, h = 0;
        System.out.println("Ingresa el valor de la base");
        b = scanner.nextDouble();
        System.out.println("Ingresa el valor de la altura");
        h = scanner.nextDouble();
        return ((b * h) / 2);
    }

    public static double circulo () {
        double r = 0;
        System.out.println("Ingresa el valor del radio");
        r = scanner.nextDouble();
        return (3.1416 * (r * r)); // Se agregó el operador *
    }

    public static double rectangulo () {
        double b = 0, h = 0;
        System.out.println("Ingresa el valor de la base");
        b = scanner.nextDouble();
        System.out.println("Ingresa el valor de la altura");
        h = scanner.nextDouble();
        return (b * h);
    }
}