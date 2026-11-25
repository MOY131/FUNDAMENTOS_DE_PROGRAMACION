package BOVEDA;

import java.util.Scanner;

public class Desafios {

    public void presentarDesafio(int numeroDesafio, Validador validador, Puntuacion puntuacion, Scanner scanner) {
        switch (numeroDesafio) {
            case 1:
                resolverDesafio1(validador, puntuacion, scanner);
                break;
            case 2:
                resolverDesafio2(validador, puntuacion, scanner);
                break;
            case 3:
                resolverDesafio3(validador, puntuacion, scanner);
                break;
            case 4:
                resolverDesafio4(validador, puntuacion, scanner);
                break;
            case 5:
                resolverDesafio5(validador, puntuacion, scanner);
                break;
            default:
                System.out.println("Opción de desafío no válida.");
        }
    }

    private void resolverDesafio1(Validador validador, Puntuacion puntuacion, Scanner scanner) {
        System.out.println("\n--- DESAFÍO 1: Secuencia numérica ---");
        System.out.println("Encuentra el siguiente número de la secuencia:");
        System.out.println("2, 6, 12, 20, 30, 42, ___");
        System.out.print("Tu respuesta: ");

        int respuestaUsuario = scanner.nextInt();
        int respuestaCorrecta = obtenerRespuestaCorrecta1();

        if (validador.validarRespuesta(1, respuestaUsuario, respuestaCorrecta)) {
            System.out.println("¡Correcto!");
            puntuacion.registrarAcierto(1);
        } else {
            System.out.println("Respuesta incorrecta. ¡Inténtalo de nuevo!");
        }
    }

    public int obtenerRespuestaCorrecta1() {
        return 56;
    }

    private void resolverDesafio2(Validador validador, Puntuacion puntuacion, Scanner scanner) {
        System.out.println("\n--- DESAFÍO 2: El número oculto ---");
        System.out.println("Encuentra el número entero que cumple las siguientes condiciones:");
        System.out.println(" • Es mayor que 20 y menor que 100.");
        System.out.println(" • Es divisible entre 2.");
        System.out.println(" • Al dividirlo entre 5 deja residuo 2.");
        System.out.println(" • La suma de sus dígitos es 8.");
        System.out.print("Tu respuesta: ");

        int respuestaUsuario = scanner.nextInt();
        int respuestaCorrecta = obtenerRespuestaCorrecta2();

        if (validador.validarRespuesta(2, respuestaUsuario, respuestaCorrecta)) {
            System.out.println("¡Correcto!");
            puntuacion.registrarAcierto(2);
        } else {
            System.out.println("Respuesta incorrecta. ¡Inténtalo de nuevo!");
        }
    }

    public int obtenerRespuestaCorrecta2() {
        return 62;
    }


    private void resolverDesafio3(Validador validador, Puntuacion puntuacion, Scanner scanner) {
        System.out.println("\n--- DESAFÍO 3: Problema de edades ---");
        System.out.println("Un padre tiene actualmente el triple de la edad de su hijo.");
        System.out.println("Dentro de 12 años, el padre tendrá el doble de la edad de su hijo.");
        System.out.print("Escribe la edad actual del HIJO: ");

        int respuestaUsuario = scanner.nextInt();
        int respuestaCorrecta = obtenerRespuestaCorrecta3();

        if (validador.validarRespuesta(3, respuestaUsuario, respuestaCorrecta)) {
            System.out.println("¡Correcto!");
            puntuacion.registrarAcierto(3);
        } else {
            System.out.println("Respuesta incorrecta. ¡Inténtalo de nuevo!");
        }
    }

    public int obtenerRespuestaCorrecta3() {
        return 12;
    }

    private void resolverDesafio4(Validador validador, Puntuacion puntuacion, Scanner scanner) {
        System.out.println("\n--- DESAFÍO 4: El tablero lógico ---");
        System.out.println("Encuentra un número de 3 cifras que cumpla:");
        System.out.println(" - La cifra de las centenas es el doble de la de las unidades.");
        System.out.println(" - La cifra de las decenas es 3 unidades mayor que la de las unidades.");
        System.out.println(" - La suma de las tres cifras es 15.");
        System.out.print("Escribe el número de tres cifras: ");

        int respuestaUsuario = scanner.nextInt();
        int respuestaCorrecta = obtenerRespuestaCorrecta4();

        if (validador.validarRespuesta(4, respuestaUsuario, respuestaCorrecta)) {
            System.out.println("¡Correcto!");
            puntuacion.registrarAcierto(4);
        } else {
            System.out.println("Respuesta incorrecta. ¡Inténtalo de nuevo!");
        }
    }

    public int obtenerRespuestaCorrecta4() {
        return 663;
    }

    private void resolverDesafio5(Validador validador, Puntuacion puntuacion, Scanner scanner) {
        System.out.println("\n--- DESAFÍO 5: El problema de las monedas ---");
        System.out.println("Una persona tiene 20 monedas, algunas de $5 y otras de $10. En total tiene $140.");
        System.out.print("¿Cuántas monedas de $10 tiene?: ");

        int respuestaUsuario = scanner.nextInt();
        int respuestaCorrecta = obtenerRespuestaCorrecta5();

        if (validador.validarRespuesta(5, respuestaUsuario, respuestaCorrecta)) {
            System.out.println("¡Correcto!");
            puntuacion.registrarAcierto(5);
        } else {
            System.out.println("Respuesta incorrecta. ¡Inténtalo de nuevo!");
        }
    }

    public int obtenerRespuestaCorrecta5() {
        return 8;
    }
}