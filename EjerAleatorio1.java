public class EjerAleatorio1 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que muestre la tirada de un dado
         * 
         */

        int dado;
        int suma = 0;

        System.out.println("Simula el lanzamiento de 3 dados");

        for (int i = 1; i < 4; i++) {
            dado = (int) (Math.random() * 6 + 1);
            System.out.println("Dado " + i + ": " + dado);
            suma = suma + dado;
        }

        System.out.println("Suma: " + suma);

    }
}
