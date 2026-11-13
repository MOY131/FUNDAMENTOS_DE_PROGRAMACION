package TEMA3;

import java.util.Scanner;

public class VENTAS_DIAS_FOR {
    static void main() {
        int numeroDias, ventaDia,acumuladorVentas = 0, contadorDiasbuenos= 0, respuesta;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("ingresa el numero de dias");
            numeroDias = scanner.nextInt();
            for (int i = 0; i <= numeroDias; i++) {//inicio for
                System.out.println("Ingresa la Venta del dia");
                ventaDia = scanner.nextInt();
                acumuladorVentas += ventaDia;// acumuladorventas= acumuladorventas + venta dias
                System.out.println("acumuladorVentas=" + acumuladorVentas);
                if (ventaDia >= 1000) {
                    contadorDiasbuenos++;
                }
                if (ventaDia<=5000){
                    break;
                }
            }//fin for
            System.out.println("Dias Buenos =" + contadorDiasbuenos);
            System.out.println("acumulador ventas =" + acumuladorVentas);
            System.out.println("Deseas repetir la operacion \n 1) \n 2)");
            respuesta= scanner.nextInt();
        }while (respuesta == 1);
    }
}
// do-while: Ejecuta el código al menos una vez y lo repite si la condición final se cumple. Ideal para reiniciar el programa completo.
// while: Repite el código mientras la condición sea cierta. Se utiliza mucho para atrapar errores o validar que los datos sean correctos.