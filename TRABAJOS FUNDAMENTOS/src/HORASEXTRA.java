import java.util.Scanner;

public class HORASEXTRA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int LIMITE_HORAS = 40;

        int horasnormales = 0,horasextras = 0;


        System.out.println("Escribe el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Escribe el Numero de Horas trabajadas:");
        int horastrabajadas = scanner.nextInt();

        System.out.println("Ingrese el Pago Por Hora:");
        int pagoporhora = scanner.nextInt();


        if (horastrabajadas > LIMITE_HORAS) {
            horasnormales = LIMITE_HORAS;
            horasextras = horastrabajadas - LIMITE_HORAS;
        } else {
            horasnormales = horastrabajadas;
            horasextras = 0;
        }

        int salariototal = (horasnormales * pagoporhora) + (horasextras * (pagoporhora * 2));

        System.out.println("----RESULTADOS----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas trabajadas: " + horastrabajadas);
        System.out.println("Pago por hora: $" + pagoporhora);
        System.out.println("Horas normales: " + horasnormales);
        System.out.println("Horas extra: " + horasextras);
        System.out.println("Salario total: $" + salariototal);
    }
}