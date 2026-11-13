package TEMA2;

import java.util.Scanner;

public class SISTEMA_DE_CALIFICACIONES_DE_EQUIPAJE {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        double PESO_MAXIMO=30;
        double CARGO_LIGERO=150;
        double CARGO_MEDIO=300;
        double CARGO_PESADO=500;
        System.out.println("Nombre del pasajero:");
        String nombredelpasajero= scanner.nextLine();
        System.out.println("¿Cual es el peso de tu equipaje?");
        double Peso= scanner.nextDouble();
        if (Peso>=0 && Peso<=15) {
            System.out.println("SU MALETA NO PRESENTARA CARGO EXTRA");
        }
            if (Peso>=16 && Peso<=20){
                System.out.println("SU CARGO EXTRA SERÁ DE:$" + CARGO_LIGERO);
            }
                if (Peso>=20 && Peso<=30) {
                    System.out.println("SU CARGO EXTRA SERÁ DE:$" + CARGO_MEDIO);
                }
                    if (Peso>30) {
                        System.out.println("SU CARGO EXTRA SERÁ DE:$" + CARGO_PESADO);
                        System.out.println("SU EQUIPAJE EXCEDE EL PESO PERMITIDO");
                    }
    }
}