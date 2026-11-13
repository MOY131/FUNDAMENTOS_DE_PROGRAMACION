public class Metodos {
    static int CONSTANTE = 10;
static int acumulador= 0;


    static void main() {
        System.out.println("Hola Mundo");
        float a = 5.0f;
        float b = 10.5f;
        suma();
        float c = a + b +CONSTANTE;
        acumulador +=c;
        System.out.println("c = " + c);
        resta();
        System.out.println(acumulador);
    }

    public static void suma() {
        float a = 6.0f;
        float b = 15.0f;
        System.out.println("Respuesta = " + (a + b + CONSTANTE));
        acumulador += (a+b+CONSTANTE);
    }

    static void resta() {
        float a = 6.0f;
        float b = 15.0f;
        System.out.println("Respuesta = " + (a - b+ CONSTANTE));
        acumulador += (a-b+CONSTANTE);
    }
}
