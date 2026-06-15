public class ArrayBiEj5 {
    public static void main(String[] args) throws InterruptedException {

        int[][] num = new int[6][10];

        int f, c;

        int minimo = 1000;
        int maximo = 0;

        int fminimo = 0;
        int fmaximo = 0;
        int cmaximo = 0;
        int cminimo = 0;

        System.out.print("\n     ");
        for (c = 0; c < 10; c++) {
            System.out.print("   "+c+"  ");
        }
        System.out.println();
        
        System.out.print("    ┌");
        for (c = 0; c < 10; c++) {
            System.out.print("──────");
        }
        System.out.println("┐");

        for (f = 0; f < 6; f++) {
            System.out.print("  "+f+" |");
            for (c = 0; c < 10; c++) {
                num[f][c] = (int) (Math.random() * 900) + 100;
                System.out.printf("%5d ", num[f][c]);
                // Thread.sleep(500);

                if (num[f][c] < minimo) {
                    minimo = num[f][c];
                    fminimo = f;
                    cminimo = c;
                }

                if (num[f][c] > maximo) {
                    maximo = num[f][c];
                    fmaximo = f;
                    cmaximo = c;
                }
            }
            System.out.println("|");
        }
        System.out.print("    └");
        for (c = 0; c < 10; c++) {
            System.out.print("──────");
        }

        System.out.println("\nEl minimo: " + minimo + " y esta en [ " + fminimo + ";" + cminimo + " ]");
        System.out.println("El maximo: " + maximo + " y esta en [ " + fmaximo + ";" + cmaximo + " ]");

    }
}
