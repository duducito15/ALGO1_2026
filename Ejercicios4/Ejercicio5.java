package Ejercicios4;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        Ejercicio 5
        Realiza un minicuestionario con 10 preguntas tipo test 
        sobre las asignaturas que se imparten en el curso. 
        Cada pregunta acertada sumará un punto. 
        El programa mostrará al final la calificación obtenida. 
        Pásale el minicuestionario a tus compañeros y pídeles 
        que lo hagan para ver qué tal andan de conocimientos en las 
        diferentes asignaturas del curso.
         */
        String rpt;
        int puntos = 0;

        System.out.println("CUESTIONARIO PROGRAMACIÓN 1");

        System.out.println("1. ¿Cúal de los siguientes tipos de dato de java es entero?");
        System.out.println("a) int \nb) double\nc) float");
        rpt = System.console().readLine();
        if (rpt.equals("a")) {
            puntos++;
        }

        System.out.println("2. ¿Cúal de los siguientes es la estructura condicional en java?");
        System.out.println("a) for \nb) if\nc) while");
        rpt = System.console().readLine();
        if (rpt.equals("b")) {
            puntos++;
        }

        System.out.println("Tu puntaje es "+ puntos );



        
    }
}
