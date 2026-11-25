package BOVEDA;

import java.util.Scanner;

public class Menu {

    private Desafios desafios;
    private Validador validador;
    private Puntuacion puntuacion;
    private Boveda boveda;
    private Scanner scanner;

    public Menu() {
        desafios = new Desafios();
        validador = new Validador();
        puntuacion = new Puntuacion();
        boveda = new Boveda();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion = 0;

        do {
            System.out.println("==========================================");
            System.out.println("    PRÁCTICA: EL DESAFÍO DE LA BÓVEDA     ");
            System.out.println("==========================================");
            System.out.println("1. Resolver Desafío 1 (Secuencia numérica)");
            System.out.println("2. Resolver Desafío 2 (El número oculto)");
            System.out.println("3. Resolver Desafío 3 (Problema de edades)");
            System.out.println("4. Resolver Desafío 4 (El tablero lógico)");
            System.out.println("5. Resolver Desafío 5 (Problema de monedas)");
            System.out.println("6. Ver puntuación actual");
            System.out.println("7. Intentar abrir la Bóveda (Clave final)");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                procesarOpcion(opcion);
            } else {
                System.out.println("Por favor ingresa un número entero.");
                scanner.next();
            }

        } while (opcion != 8);
    }

    private void procesarOpcion(int opcion) {
        if (opcion >= 1 && opcion <= 5) {
            desafios.presentarDesafio(opcion, validador, puntuacion, scanner);
        } else if (opcion == 6) {
            puntuacion.mostrarResultados();
        } else if (opcion == 7) {
            abrirBoveda();
        } else if (opcion == 8) {
            System.out.println("¡Gracias por utilizar el programa!");
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private void abrirBoveda() {
        if (puntuacion.calcularPuntuacion() < 5) {
            System.out.println("\n[!] Aún no has completado correctamente los 5 desafíos.");
            System.out.println("Debes resolver los 5 desafíos para generar la clave de la bóveda.");
            return;
        }

        String claveCorrecta = boveda.generarClave(desafios);
        System.out.println("\n--- ACCESO A LA BÓVEDA ---");
        System.out.println("Puntuación requerida alcanzada (5/5).");
        System.out.print("Ingresa la clave de acceso (formato R1-R2-R3-R4-R5): ");
        String claveIngresada = scanner.next();

        if (boveda.verificarClave(claveIngresada, claveCorrecta)) {
            System.out.println("\n¡FELICIDADES! Has desbloqueado la bóveda exitosamente.");
        } else {
            System.out.println("\nClave incorrecta. La clave esperada era: " + claveCorrecta);
        }
    }

    public static void main(String[] args) {
        Menu programa = new Menu();
        programa.mostrarMenu();
    }
}