package TEMA3;

import java.sql.SQLOutput;
import java.util.Locale;

public class Stringexample {
    static void main() {
        String texto= "Hola Mundo Java";
        System.out.println("Lenght() ->" + texto.length());
        System.out.println("toUpperCase ->" + texto.toUpperCase());
        System.out.println("toLowerCase ->" + texto.toLowerCase());
        System.out.println("contains () ->" + texto.contains("Mundo"));
        System.out.println("equals() ->" + texto.equals("Hola Mundo Java"));
        System.out.println("equalsIgnoreCase() ->" + texto.equalsIgnoreCase("HOLA MUNDO JAVA"));
        System.out.println("substring () ->" + texto.substring(0,4));
        System.out.println("charAt () ->" + texto.charAt(0));
        System.out.println("replace () ->" + texto.replace("Java", "Python"));
        String nombre= "             JUAN           ";
        System.out.println("trim () ->" + nombre.trim());
        String palabra = "";
        System.out.println("isEmpty () ->" + palabra.isEmpty());
    }
}
