
    /*
    Un arreglo es una estructura de datos que permite almacenar varios elementos del mismo tipo dentro de una sola variable
     */
    public class ARREGLO {
    static void main() {
        int[] calificaciones = new int[5];//arreglo de variables
        int[] numeros = {10, 20, 30, 40, 50};//arreglo de constantes
        System.out.println(numeros[0]);
        System.out.println(numeros[2]);

        numeros[1] = 100;
        System.out.println(numeros[1]);
        System.out.println(numeros[4]);
        System.out.println("Recorrido de arreglo con for");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("Recorrido de arreglo con foreach");
        for (int n : numeros)
        {
            System.out.println(n);
        }
        System.out.println("Suma de un arreglo");
        int suma =0;
        for (int i = 0; i < numeros.length ; i++) {
            suma+= numeros[1];// suma = suma + numeros[1];
        }
        System.out.println(suma);
    }
    }

