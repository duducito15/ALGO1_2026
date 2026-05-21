package Ejercicios5;

public class Ejercicio7 {
    public static void main(String[] args) {
        /**
         * Ejercicio 7
            Realiza el control de acceso a una caja fuerte. 
            La combinación será un número de 4 cifras. 
            El programa nos pedirá la combinación para abrirla. 
            Si no acertamos, se nos mostrará el mensaje “Lo siento, 
            esa no es la combinación” y si acertamos se nos dirá 
            “La caja fuerte se ha abierto satisfactoriamente”. 
            Tendremos cuatro oportunidades para abrir la caja fuerte.

         */
        final int COMBINACION = 1234;
        
        int intentos = 4;
        int numeroIntroducido;
        boolean acertado = false;

        do{
            System.out.print("Introduce la clave secreta de la caja fuerte: ");
            numeroIntroducido = Integer.parseInt(System.console().readLine());

            if (numeroIntroducido == COMBINACION) {
                acertado = true;             
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
            intentos--;

        }while((intentos > 0) && (!acertado));

        if (acertado == true) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        } else {
            System.out.println("Lo siento, has agotado las 4 oportunidades");
        }

    }
}
