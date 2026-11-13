package TEMA3;

public class TernarioEjemplo {
    static void main() {
        int edad = 17;
        String resultado1 = edad>=18  ? "Mayor de edad" : "Menor de edad";
        // condicion ? valorSiesverdadero : valorSiesfalso

        int resultado = edad<=18 ? edad +10 : edad-10;
        System.out.println(resultado);
        System.out.println( edad>=18 ? edad + 10 : edad-10);
    }
}
// for: Repite un bloque de código un número exacto de veces porque cuenta con un inicio, un límite y un incremento automático.
// if-else: Toma decisiones lógicas: si se cumple la condición hace la primera instrucción, de lo contrario hace la segunda.