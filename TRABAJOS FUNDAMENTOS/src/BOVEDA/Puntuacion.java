package BOVEDA;

public class Puntuacion {

    private boolean[] desafiosResueltos;

    public Puntuacion() {
        desafiosResueltos = new boolean[6];
    }

    public void registrarAcierto(int numeroDesafio) {
        if (numeroDesafio >= 1 && numeroDesafio <= 5) {
            desafiosResueltos[numeroDesafio] = true;
        }
    }

    public int calcularPuntuacion() {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            if (desafiosResueltos[i]) {
                total++;
            }
        }
        return total;
    }

    public void mostrarResultados() {
        System.out.println("\n==================================");
        System.out.println("       RESUMEN DE RESULTADOS      ");
        System.out.println("==================================");
        for (int i = 1; i <= 5; i++) {
            String estado = desafiosResueltos[i] ? "RESUELTO (1 pt)" : "PENDIENTE / INCORRECTO (0 pts)";
            System.out.println("Desafío " + i + ": " + estado);
        }
        System.out.println("----------------------------------");
        System.out.println("Puntuación Total: " + calcularPuntuacion() + " / 5 puntos.");
        System.out.println("==================================\n");
    }
}