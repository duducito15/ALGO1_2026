public class NumeroPrimo {
    public static void main(String[] args) {
        System.out.println("Inttroduce un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());

        boolean esPrimo = true;

        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                esPrimo = false;
            }
        }

        if (esPrimo == true) {
            System.out.println("El " + num + " es primo.");
        } else {
            System.out.println("El " + num + " No es primo.");
        }
    }
}
