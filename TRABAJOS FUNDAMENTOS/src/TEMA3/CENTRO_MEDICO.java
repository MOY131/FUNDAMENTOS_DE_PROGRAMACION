package TEMA3;

import java.util.Scanner;

public class CENTRO_MEDICO {
    static void main() {
                int edad;
                int contmenor = 0;
                int contadolescente = 0;
                int contadulto = 0;
                int contadultomayor = 0;
                double costo;
                double totalPagar = 0;
                double totalRecaudado = 0;
                double Descuento = 0.15;
                double totalDescontado = 0;
                int res;
                Scanner scanner = new Scanner(System.in);

                do {
                    System.out.println("--- BIENVENIDO ---");
                    System.out.println("¿Cual es tu edad?");
                    edad = scanner.nextInt();

                    System.out.println("¿Cual es el costo de la consulta?");
                    costo = scanner.nextDouble();

                    if (edad <= 12) {
                        contmenor++;
                        System.out.println("Persona identificada como: Menor");
                        totalPagar = costo;
                        System.out.println("Su Total a pagar es de: $" + totalPagar);

                    } else if (edad >= 13 && edad <= 17) {
                        contadolescente++;
                        System.out.println("Persona identificada como: Adolescente");
                        totalPagar = costo;
                        System.out.println("Su Total a pagar es de: $" + totalPagar);

                    } else if (edad >= 18 && edad <= 59) {
                        contadulto++;
                        System.out.println("Persona identificada como: Adulto");
                        totalPagar = costo;
                        System.out.println("Su Total a pagar es de: $" + totalPagar);

                    } else if (edad >= 60) {
                        contadultomayor++;
                        System.out.println("Persona identificada como: Adulto Mayor");

                        double montoDescuento = costo * Descuento;
                        totalPagar = costo - montoDescuento;
                        totalDescontado = totalDescontado + montoDescuento;

                        System.out.println("Su Total a pagar es de: $" + totalPagar);
                    }

                    System.out.println("¿Hay mas pacientes por registrar? \n 1)Si \n 2)No");
                    res = scanner.nextInt();

                    totalRecaudado = totalRecaudado + totalPagar;

                } while (res == 1);

                System.out.println("---RESUMEN---");
                System.out.println("Total Recaudado: $" + totalRecaudado);
                System.out.println("Los descuentos aplicados ascienden a: $" + totalDescontado);

                int totalPacientes = contmenor + contadolescente + contadulto + contadultomayor;
                double promedio = totalRecaudado / totalPacientes;

                System.out.println("Promedio pagado por paciente: $" + promedio);
            }
        }