import java.util.Scanner;
import java.util.Random;

public class GENERADOR_DE_CURP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido paterno: ");
        String paterno = scanner.nextLine();

        System.out.print("Apellido materno: ");
        String materno = scanner.nextLine();

        System.out.print("Fecha de nacimiento (DD/MM/YYYY): ");
        String fecha = scanner.nextLine();

        System.out.print("Sexo (H/M): ");
        String sexo = scanner.nextLine();

        System.out.print("Entidad federativa: ");
        String estado = scanner.nextLine();

        String curp = generarCURP(nombre, paterno, materno, fecha, sexo, estado);
        System.out.println("CURP: " + curp);

        scanner.close();
    }

    public static char obtenerPrimeraLetra(String palabra) {
        palabra = palabra.toUpperCase().trim();
        return palabra.charAt(0);
    }

    public static char obtenerPrimeraVocal(String palabra) {
        palabra = palabra.toUpperCase().trim();
        for (int i = 1; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                return c;
            }
        }
        return 'X';
    }

    public static char obtenerPrimeraConsonante(String palabra) {
        palabra = palabra.toUpperCase().trim();
        for (int i = 1; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                    return c;
                }
            }
        }
        return 'X';
    }

    public static String obtenerFecha(String fecha) {
        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(3, 5);
        String anio = fecha.substring(8, 10);
        return anio + mes + dia;
    }

    public static String obtenerClaveEstado(String estado) {
        estado = estado.toUpperCase().trim();
        switch (estado) {
            case "AGUASCALIENTES": return "AS";
            case "BAJA CALIFORNIA": return "BC";
            case "BAJA CALIFORNIA SUR": return "BS";
            case "CAMPECHE": return "CC";
            case "COAHUILA": return "CL";
            case "COLIMA": return "CM";
            case "CHIAPAS": return "CS";
            case "CHIHUAHUA": return "CH";
            case "CIUDAD DE MEXICO":
            case "DISTRITO FEDERAL": return "DF";
            case "DURANGO": return "DG";
            case "GUANAJUATO": return "GT";
            case "GUERRERO": return "GR";
            case "HIDALGO": return "HG";
            case "JALISCO": return "JC";
            case "MEXICO": return "MC";
            case "MICHOACAN": return "MN";
            case "MORELOS": return "MS";
            case "NAYARIT": return "NT";
            case "NUEVO LEON": return "NL";
            case "OAXACA": return "OC";
            case "PUEBLA": return "PL";
            case "QUERETARO": return "QT";
            case "QUINTANA ROO": return "QR";
            case "SAN LUIS POTOSI": return "SP";
            case "SINALOA": return "SL";
            case "SONORA": return "SR";
            case "TABASCO": return "TC";
            case "TAMAULIPAS": return "TS";
            case "TLAXCALA": return "TL";
            case "VERACRUZ": return "VZ";
            case "YUCATAN": return "YN";
            case "ZACATECAS": return "ZS";
            default: return "NE";
        }
    }

    public static String generarCURP(String nombre, String paterno, String materno, String fecha, String sexo, String estado) {
        char c1 = obtenerPrimeraLetra(paterno);
        char c2 = obtenerPrimeraVocal(paterno);
        char c3 = obtenerPrimeraLetra(materno);
        char c4 = obtenerPrimeraLetra(nombre);
        String c5_10 = obtenerFecha(fecha);
        char c11 = sexo.toUpperCase().trim().charAt(0);
        String c12_13 = obtenerClaveEstado(estado);
        char c14 = obtenerPrimeraConsonante(paterno);
        char c15 = obtenerPrimeraConsonante(materno);
        char c16 = obtenerPrimeraConsonante(nombre);

        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        String c17_18 = "" + num1 + num2;

        return "" + c1 + c2 + c3 + c4 + c5_10 + c11 + c12_13 + c14 + c15 + c16 + c17_18;
    }
}