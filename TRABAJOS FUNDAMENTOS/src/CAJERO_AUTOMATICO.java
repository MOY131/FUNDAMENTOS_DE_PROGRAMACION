import java.util.Scanner;

public class CAJERO_AUTOMATICO {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        final double LIMITE_RETIRO=5000;
        System.out.println("¿Cual es tu saldo disponible?");
        double saldodisponible= scanner.nextDouble();
        System.out.println("Que cantidad deseas retirar");
        double cantidad_a_retirar= scanner.nextDouble();
        if (cantidad_a_retirar >0 && cantidad_a_retirar <=LIMITE_RETIRO && cantidad_a_retirar<=saldodisponible){
            double Nuevo_Saldo=saldodisponible-cantidad_a_retirar;
            System.out.println("Retiro Autorizado");
            System.out.println("Cantidad retirada:" + cantidad_a_retirar);
            System.out.println("Nuevo Saldo:" + Nuevo_Saldo);
        if (Nuevo_Saldo<500) {
            System.out.println("ADVERTENCIA: Tu saldo es menor a 500 pesos");
        }
        }else {
            System.out.println("OPERACION INVALIDA: Verifica que el monto sea mayor a 0, no exceda a los $5000 y tengas saldo suficiente");
        }
    }
}
