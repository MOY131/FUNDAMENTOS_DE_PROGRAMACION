import java.util.Scanner;

public class SISTEMA_DE_CALIFICACIONES {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final double MINIMO_APROBATORIO = 70;
        final double MINIMO_UNIDAD = 60;
        double calificacion1, calificacion2, calificacion3, promedio;
        System.out.println("Dame tu primer calificacion");
        calificacion1 = scanner.nextDouble();
        System.out.println("Dame tu segunda calificacion");
        calificacion2 = scanner.nextDouble();
        System.out.println("Dame tu tercer calificacion");
        calificacion3 = scanner.nextDouble();
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        System.out.println("----RESULTADOS----");
        System.out.println("Calificacion 1:" + calificacion1);
        System.out.println("Calificacion 2:" + calificacion2);
        System.out.println("Calificacion 3:" + calificacion3);
        System.out.println("Tu Promedio es:" + promedio);
        System.out.println("Tu resultado final es:");
        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println("ALUMNO APROBADO");
        }else{
            System.out.println("ALUMNO REPROBADO");
        }
        if (calificacion1<MINIMO_UNIDAD){
            System.out.println("ALERTA:Deberas presentar recuperacion de la Unidad 1");
        }
        if (calificacion2<MINIMO_UNIDAD){
            System.out.println("ALERTA:Deberas presentar recuperacion de la Unidad 2");
        }
        if (calificacion3<MINIMO_UNIDAD){
            System.out.println("ALERTA:Deberas presentar recuperacion de la Unidad 3");
        }
    }
}
