package Ejercicios6;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * Muestra 50 números enteros aleatorios entre 100 y 199
         * (ambos incluidos) separados por espacios.
         * Muestra también el máximo, el mínimo y la media de
         * esos números.
         */

        int maximo, minimo;
        double promedio;
        int numero, suma;

        maximo = 100;
        minimo = 199;
        suma = 0;

        for (int i = 1; i < 51; i++) {
            numero = (int) (Math.random() * 100) + 100;
            System.out.print(numero + " ");
            
            suma = suma + numero;

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }
        }

        System.out.println("\nMáximo: "+maximo);
        System.out.println("Mínimo: "+minimo);
        System.out.println("Promedio: " + (suma / 50));

    }
}
