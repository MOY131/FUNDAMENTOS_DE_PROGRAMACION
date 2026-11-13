package TEMA3;

import java.util.Scanner;

public class AREAS_DE_FIGURAS {
    static void main() {
        int op,a,b,Radio = 0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ELIGE UNA DE LAS SIGUIENTES OPCIONES: 1)Cuadrado:Calcular el área a partir de la longitud de su lado \n 2)Rectángulo:Calcular el área a partir de su base y altura \n 3)Triángulo:Calcular el área a partir de su base y altura \n 4)Círculo:Calcular el área a partir de su radio");
        op= scanner.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingresa el valor para Longitud");
                a= scanner.nextInt();
                System.out.println("Área = "+ (a*a));

                break;
            case 2:
                System.out.println("Ingresa el valor para la Base");
                a= scanner.nextInt();
                System.out.println("Ingresa el valor para La Altura");
                b= scanner.nextInt();
                System.out.println("Área = "+ (a*b));

                break;
            case 3:
                System.out.println("Ingresa el valor para la Base");
                a= scanner.nextInt();
                System.out.println("Ingresa el valor para La Altura");
                b= scanner.nextInt();
                System.out.println("Área = "+ (a*b)/2);

                break;
            case 4:
                System.out.println("Ingresa el valor para Radio");
                Radio= scanner.nextInt();
                System.out.println("Área = "+ (Math.PI*Radio*Radio));
                break;
        }
    }
}
