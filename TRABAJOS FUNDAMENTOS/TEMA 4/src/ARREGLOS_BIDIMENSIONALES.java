public class ARREGLOS_BIDIMENSIONALES {
    static void main() {
        int [] edades =new int [5];
        int [] edades2 = {1,2,3,4,5};
        String[] nombres= {"JUAN","JESUS","MAURICIO"};
        float [] decimales= {1,1f,2,2f,4,5f};
        System.out.println(nombres[0]);

        int [][] numeros;
        int[][] numeros2= new int[3][4];
        int[][] numeros3={
                {1,2,3}, // y=0
                {4,5,6},// y=1
                {7,8,9} // y=2
        };
        System.out.println(numeros3[0][0]);
        System.out.println(numeros3[1][1]);
    }
}
