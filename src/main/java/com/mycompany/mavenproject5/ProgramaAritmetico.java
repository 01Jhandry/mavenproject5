import java.util.Scanner;

public class ProgramaAritmetico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestorInteraccion gestorInteraccion = new GestorInteraccion();

        gestorInteraccion.mostrarMensaje("Elige el nivel de dificultad: ");
        int nivelDificultad = entrada.nextInt();

        gestorInteraccion.mostrarMensaje("Elige el tipo de problema aritmético (1: Suma, 2: Resta, 3: Multiplicación, 4: División, 5: Mezcla): ");
        int tipoProblema = entrada.nextInt();

        OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas(nivelDificultad, tipoProblema);

        int aciertos = 0;

        while (aciertos < 10) {
            int[] operandos = operacionesMatematicas.generarOperandos();
            int tipoPregunta = tipoProblema == 5 ? operacionesMatematicas.generarTipoAleatorio() : tipoProblema;
            String pregunta = operacionesMatematicas.generarPregunta(operandos[0], operandos[1], tipoPregunta);

            gestorInteraccion.mostrarMensaje(pregunta);

            int respuestaUsuario = entrada.nextInt();
            int respuestaCorrecta = operacionesMatematicas.calcularRespuesta(operandos[0], operandos[1], tipoPregunta);

            if (respuestaUsuario == respuestaCorrecta) {
                aciertos++;
                gestorInteraccion.mostrarMensaje("¡Muy bien!");
            } else {
                gestorInteraccion.mostrarMensaje("Incorrecto. Intenta una vez más.");
            }
        }

        entrada.close();
    }
}
