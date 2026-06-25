public class NumeroPrimoConFuncion {
    public static void main(String[] args) {
         System.out.println("Introduce un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());

        if (esPrimo(num)) {
            System.out.println("El " + num + " es primo.");
        } else {
            System.out.println("El " + num + " No es primo.");
        }
    }

    public static boolean esPrimo(int x){
        
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;

    }


}
