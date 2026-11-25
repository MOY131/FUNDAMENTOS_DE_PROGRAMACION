package BOVEDA;

public class Validador {

    public boolean validarRespuesta(int numeroDesafio, int respuestaUsuario, int respuestaCorrecta) {
        return respuestaUsuario == respuestaCorrecta;
    }
}