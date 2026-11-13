package TEMA2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CALIFICACIONES {
    static void main() {
        try {
            Scanner scanner = new Scanner(System.in);
            double calificacion1, calificacion2, calificacion3,promedio;
            System.out.println("Dame la primer calificacion");
            calificacion1 = scanner.nextDouble();
            System.out.println("Dame la segunda calificacion");
            calificacion2 = scanner.nextDouble();
            System.out.println("Dame la tercer Calificacion");
            calificacion3 = scanner.nextDouble();
            promedio=(calificacion1+calificacion2+calificacion3)/3;
            System.out.println("el promedio es:" + promedio);
        }catch (InputMismatchException at){
            System.out.println("Ingresa una calificacion numerica");
        }
    }
}
