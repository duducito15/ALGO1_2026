public class Aleatorio2 {
    public static void main(String[] args) {
        System.out.println("Programa: Genera 10 numeros aleatorios");
        System.out.println("sin llegar a 10 (con decimales)");

        for (int i = 1; i < 11; i++) {
            System.out.println(Math.random()*10);
        }
    }
}
