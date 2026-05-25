public class Aleatorio3 {
    public static void main(String[] args) {
        System.out.println("Programa: Genera 10 numeros aleatorios");
        System.out.println("entre 0 y 9 (sin decimales)");

        for (int i = 1; i < 11; i++) {
            System.out.println( (int)(Math.random()*10));
        }
    }
}
