package Ejercicios4;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * Ejercicio 3
         * Realiza un programa que calcule la media de tres notas y que
         * indique si la nota del boletín (insuficiente nota del 01 al 10,
         * suficiente 11 al 12, bien 13 al 15 , notable o sobresaliente 16 al 20).
         */
        System.out.println("Programa que calcual el promedio de tres notas");

        System.out.println("Introduce la primera nota: ");
        Double nota1 = Double.parseDouble(System.console().readLine());

        System.out.println("Introduce la segunda nota: ");
        Double nota2 = Double.parseDouble(System.console().readLine());

        System.out.println("Introduce la tercera nota: ");
        Double nota3 = Double.parseDouble(System.console().readLine());

        Double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio < 11) {
            System.out.println("Promedio: "+promedio);
            System.out.println("Insuficiente");
        }

        if (promedio >= 10 && promedio < 13) {
            System.out.println("Promedio: "+promedio);
            System.out.println("Suficiente");
        }

        if (promedio >= 13 && promedio < 16) {
            System.out.println("Promedio: "+promedio);
            System.out.println("Bien");
        }

        if (promedio >= 16 && promedio < 21) {
            System.out.println("Promedio: "+promedio);
            System.out.println("Notable");
        }

    }
}
