import java.util.Random;

public class GestorInteraccion {
    Random random;

    public GestorInteraccion() {
        random = new Random();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMensajePositivo() {
        String[] mensajesPositivos = {
            "¡Muy bien!",
            "¡Excelente!",
            "¡Buen trabajo!",
            "¡Sigue así!"
        };

        int indiceAleatorio = random.nextInt(mensajesPositivos.length);
        System.out.println(mensajesPositivos[indiceAleatorio]);
    }

    public void mostrarMensajeNegativo() {
        String[] mensajesNegativos = {
            "Incorrecto. Intenta una vez más.",
            "Lo siento, sigue intentando.",
            "No te rindas, sigue intentándolo.",
            "No es correcto, inténtalo de nuevo."
        };

        int indiceAleatorio = random.nextInt(mensajesNegativos.length);
        System.out.println(mensajesNegativos[indiceAleatorio]);
    }
}

