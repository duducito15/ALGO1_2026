public class LeeNumeros {
    public static void main(String[] args) {
        int primerNumero, segundoNumero;
        double promedio;
        String linea ;

        System.out.println("Ingresa el primer número: ");
        linea = System.console().readLine();
        primerNumero = Integer.parseInt(linea);

        System.out.println("Ingresa el segundo número: ");
        linea = System.console().readLine();
        segundoNumero = Integer.parseInt(linea);

        int total;
        total = primerNumero + segundoNumero;
        promedio = ((double)primerNumero + (double)segundoNumero)/2;

        System.out.println("El resultado es: "+ total);
        System.out.println("El promedio es: "+ promedio);

     
    }
}
