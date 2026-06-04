package Ejercicios7;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Ejercicio 2
         * Escribe un programa que lea 10 números por teclado y
         * que luego los muestre en orden inverso, es decir,
         * el primero que se introduce es el último en mostrarse y viceversa.
         * 
         */

        int[] num = new int[10];

        System.out.println("Introduce 10 números enteros");

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("-----------------------------");
        System.out.println("los números introducidos al reves son: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
