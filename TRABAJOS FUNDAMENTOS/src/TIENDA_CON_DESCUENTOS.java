import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TIENDA_CON_DESCUENTOS {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        final double CLIENTE_NORMAL=0.0;
        final double CLIENTE_FRECUENTE=0.10;
        final double CLIENTE_VIP=0.20;
        final double DES_EXTRA=0.05;
        System.out.println("Nombre del Cliente:");
       String Cliente= scanner.nextLine();
        System.out.println("¿Cual es el Monto de su Compra?");
        double Montocompra= scanner.nextDouble();
        System.out.println("Selecciona tu tipo de cliente: 1 Normal, 2 Frecuente, 3 VIP");
        int TIPO_DE_CLIENTE= scanner.nextInt();
        double DESCUENTO_INICIAL=0.0, DESCUENTO_ADICIONAL=0;
        if (TIPO_DE_CLIENTE==1){
            DESCUENTO_INICIAL=Montocompra*CLIENTE_NORMAL;
        }
        if (TIPO_DE_CLIENTE==2){

            DESCUENTO_INICIAL=Montocompra*CLIENTE_FRECUENTE;
        }
        if (TIPO_DE_CLIENTE==3){
            DESCUENTO_INICIAL=Montocompra*CLIENTE_VIP;
        }
        if (Montocompra>2000){
            DESCUENTO_ADICIONAL=Montocompra*DES_EXTRA;
        }
        double Total_Descuentos= DESCUENTO_INICIAL + DESCUENTO_ADICIONAL;
         double totalapagar= Montocompra-Total_Descuentos;
        System.out.println("----TICKET DE COMPRA----");
        System.out.println("Nombre del Cliente:"+ Cliente);
        System.out.println("Monto Original:"+ Montocompra);
        System.out.println("DESCUENTO POR TIPO DE CLIENTE:"+ DESCUENTO_INICIAL);
        System.out.println("DESCUENTOS POR COMPRAS MAYORES A $2000:"+ DESCUENTO_ADICIONAL);
        System.out.println("SU TOTAL A PAGAR ES DE:"+ totalapagar);
        System.out.println("----¡¡GRACIAS POR SU COMPRA VUELVA PRONTO!!----");
    }
}
