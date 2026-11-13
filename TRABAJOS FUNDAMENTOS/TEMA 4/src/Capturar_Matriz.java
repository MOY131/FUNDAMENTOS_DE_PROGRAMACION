import java.util.Scanner;

public class Capturar_Matriz {
    static void main() {
        Scanner entrada= new Scanner(System.in);
        int[][] numeros= new int[2][3];
        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j <numeros[i].length ; j++) {
                System.out.println("INGRESA EL VALOR DE LA FILA" + i +"y columna" + j);
                numeros[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Mostrar Contenido De La Matriz");
        for (int i = 0; i < numeros[i].length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
        }
        System.out.println();
        }
    }
