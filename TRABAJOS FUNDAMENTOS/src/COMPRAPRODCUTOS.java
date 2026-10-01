import java.util.Scanner;

public class COMPRAPRODCUTOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double COSTO_ENVIO_FIJO = 80;

        System.out.print("Precio del producto: ");
        double preciodelproducto = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        double sub = preciodelproducto * cantidad;
        double des = 0;

        if (sub >= 1000) {
            des = sub * 0.10;
        } else {
            des = 0;
        }

        double totalcondes = sub - des;
        double envio;

        if (totalcondes >= 1500) {
            envio = 0;
        } else {
            envio = COSTO_ENVIO_FIJO;
        }

        double totalfinal = totalcondes + envio;

        System.out.println("Subtotal: $" + sub);
        System.out.println("Descuento: $" + des);
        System.out.println("Total con descuento: $" + totalcondes);
        System.out.println("Envío: $" + envio);
        System.out.println("Total final: $" + totalfinal);
    }
}