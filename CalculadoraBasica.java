public class CalculadoraBasica {
    public static void main(String[] args) {
        double n1, n2;
        System.out.println("Ingresa el primer número: ");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa el segundo número: ");
        n2 = Double.parseDouble(System.console().readLine());

        System.out.println("la Suma es: " + suma(n1, n2));
        System.out.println("la Resta es: " + resta(n1, n2));
        System.out.println("la Multiplicación es: " + multiplicacion(n1, n2));
        System.out.println("la Division es: " + division(n1, n2));
    }

    
}