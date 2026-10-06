import java.util.Scanner;

public class CAJERO_CON_COMISION_BANCARIA {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        final double COMISION=10;
        final double LIMITE_RETIRO=5000;
        System.out.println("¿Cual es tu saldo disponible?");
        double saldodisp= scanner.nextDouble();
        System.out.println("¿Cual es la Cantidad que Desea Retirar");
        double cantidad_a_retirar= scanner.nextDouble();
        if (cantidad_a_retirar>0){
            if (cantidad_a_retirar<=LIMITE_RETIRO){
                if (saldodisp>=(cantidad_a_retirar+COMISION)){
                    double SALDO_FINAL=saldodisp-cantidad_a_retirar-COMISION;
                    System.out.println("----RETIRO AUTORIZADO----");
                    System.out.println("EL MONTO RETIRADO ES:$"+cantidad_a_retirar);
                    System.out.println("Comision Bancaria de:$"+ COMISION);
                    System.out.println("Tu Saldo Final es de:$"+ SALDO_FINAL);
                }else{
                    System.out.println("ERROR:El saldo disponible no es suciente para cubrir el retiro y la comision.");
                }
            }else{
                System.out.println("ERROR:La cantidad a retirar supera el limite de retiro de $5000.{");
            }
        }else{
            System.out.println("ERROR:La cantidad a retirar tiene que ser mayor a cero.");
        }
    }
}
