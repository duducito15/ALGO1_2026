package Ejercicios5;

public class Ejericicio1 {
    /*
     * Ejercicio 1
     * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
     */
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
