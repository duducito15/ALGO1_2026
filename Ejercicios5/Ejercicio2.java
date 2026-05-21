package Ejercicios5;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Ejercicio 2
         * Muestra los números múltiplos de 5 de 0 a 100 utilizando
         * un bucle while.
         */
        int i = 0;
        while (i < 101) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
