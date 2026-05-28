package Ejercicios6;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        Muestra 20 números enteros aleatorios entre 0 y 10 
        (ambos incluidos) separados por espacios.
        */
       for (int i = 1; i < 21; i++) {
            System.out.print((int)(Math.random()*11)+ " ");        
       }

    }
}
