public class SentenciaIf03 {
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        double promedio;

        System.out.println("Ingrese la nota 1: ");
        nota1 = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la nota 2: ");
        nota2 = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la nota 3: ");
        nota3 = Integer.parseInt(System.console().readLine());

        promedio = ((double)nota1 + (double)nota2 + (double)nota3) / 3;

        if (promedio >= 10.5) {
            System.out.printf("%8.2f",promedio);
            System.out.println(", Felicidades has aprobado!!!");
        } else {
            System.out.printf("%8.2f",promedio);
            System.out.println(", Lo siento, pal otro año será!!!");
        }
    }
}
