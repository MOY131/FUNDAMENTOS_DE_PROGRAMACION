package BOVEDA;

public class Boveda {

    public String generarClave(Desafios desafios) {
        int r1 = desafios.obtenerRespuestaCorrecta1();
        int r2 = desafios.obtenerRespuestaCorrecta2();
        int r3 = desafios.obtenerRespuestaCorrecta3();
        int r4 = desafios.obtenerRespuestaCorrecta4();
        int r5 = desafios.obtenerRespuestaCorrecta5();

        return r1 + "-" + r2 + "-" + r3 + "-" + r4 + "-" + r5;
    }

    public boolean verificarClave(String claveIngresada, String claveCorrecta) {
        return claveIngresada.equals(claveCorrecta);
    }
}