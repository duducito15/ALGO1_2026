public class Array5 {
    public static void main(String[] args) {
        double[] nota = new double[4];

        System.out.println("Para calcular el promedio necesito las notas");

        for (int i = 0; i < nota.length; i++) {
            System.out.print("Nota del examen n° "+(i+1)+": ");
            nota[i] = Double.parseDouble(System.console().readLine());
        }

        System.out.println("Tus notas son: ");

        double suma = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.print(nota[i]+ " ");
            suma += nota[i];
        }

        System.out.println("\n El promedio es: "+ suma / 4);
    }
}
