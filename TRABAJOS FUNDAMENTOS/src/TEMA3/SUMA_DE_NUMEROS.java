package TEMA3;

import java.util.Scanner;

public class SUMA_DE_NUMEROS {
    static void main() {
        Scanner scanner= new Scanner(System.in);
        int contador=0;
        int acumulador=0;
        int x= 0;
        int respuesta=0;
        do{
            System.out.println("Ingrese un numero para sumar");
            x = scanner.nextInt();
            acumulador= acumulador+x;
            //contador=contador+1; contador++
            contador ++;
            System.out.println("¿Desea Ingresar Otro Número? \n 1) si \n 2) No");
            respuesta= scanner.nextInt();
        }
        while(respuesta==1);
        System.out.println("Respuesta="+ acumulador);
        System.out.println("Se sumaron="+ contador+"numeros");

    }
}
