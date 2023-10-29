import java.util.Random;

public class OperacionesMatematicas {
    int nivelDificultad;
    int tipoProblema;
    Random generador;

    public OperacionesMatematicas(int nivelDificultad, int tipoProblema) {
        this.nivelDificultad = nivelDificultad;
        this.tipoProblema = tipoProblema;
        this.generador = new Random();
    }

    public int[] generarOperandos() {
        int limite = (int) Math.pow(10, nivelDificultad) - 1;
        int numero1 = generador.nextInt(limite) + 1;
        int numero2 = generador.nextInt(limite) + 1;
        return new int[]{numero1, numero2};
    }

    public int generarTipoAleatorio() {
        return generador.nextInt(4) + 1;
    }

    public String generarPregunta(int numero1, int numero2, int tipoPregunta) {
        String signo = "";
        if (tipoPregunta == 1) signo = " + ";
        else if (tipoPregunta == 2) signo = " - ";
        else if (tipoPregunta == 3) signo = " x ";
        else if (tipoPregunta == 4) signo = " / ";
        return "¿Cuánto es " + numero1 + signo + numero2 + "?";
    }

    public int calcularRespuesta(int numero1, int numero2, int tipoPregunta) {
        if (tipoPregunta == 1) return numero1 + numero2;
        else if (tipoPregunta == 2) return numero1 - numero2;
        else if (tipoPregunta == 3) return numero1 * numero2;
        else if (tipoPregunta == 4) return numero1 / numero2;
        else return 0;
    }
}

