public class SentenciaIf02 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        int numero = Integer.parseInt(System.console().readLine());

        if (numero > 0) {
            System.out.println("El número ingresado es POSITIVO");
        } else {
            System.out.println("El número ingresado es NEGATIVO");
        }
    }
}
