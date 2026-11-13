package TEMA3;

import java.util.Scanner;

public class PAR_IMPAR_WHILE {
    /*
     * Instituto Tecnologico De Pachuca
     * Dundamentos De Programacion
     * Castillo Gallardo Luis Moises 26201043
     * 14-10-2026
     * programa que evalua en una serie de numeros si es par o impar
     */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int res;
        do {
            int n,contador = 1;
            System.out.println("ingrese un número");
            n = scanner.nextInt();
            while(contador<=n){
            if (n % 2 == 0) {//n dividido entre 2 tiene residuo 0?
                System.out.println("El numero:" + contador + "es Par");
            } else {
                System.out.println("El Numero:" + contador + "Es Impar");
            }
            contador++; //contador = contador + 1
        }
        System.out.println("¿Desea Ingresar Otro Número? 1)Si , 2)No");
            res= scanner.nextInt();
        } while (res ==1);
    }
}