import Funciones.Matematicas;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        System.out.println("CALCULADORA GEOMÉTRICA");
        System.out.println("*********** **********");

        System.out.println("MENÚ PRINCIPAL");
        System.out.println("1. Área del cuadrado");
        System.out.println("2. Área del rectángulo");
        System.out.println("3. Área del triángulo");
        System.out.println("4. Área de la circunferencia");
        System.out.println("Seleccione una opción del 1 al 4");

        int op = Integer.parseInt(System.console().readLine());

        switch (op) {
            case 1:
                int lado;
                System.out.println("Ingrese el valor del lado del cuadrado: ");
                lado = Integer.parseInt(System.console().readLine());
                System.out.println("El área del cuadrado es: " + Matematicas.multiplicacion(lado, lado));
                break;
            case 2:
                int base, altura;
                System.out.println("Ingrese el valor de la base del rectángulo: ");
                base = Integer.parseInt(System.console().readLine());
                System.out.println("Ingrese el valor de la altura del rectángulo: ");
                altura = Integer.parseInt(System.console().readLine());
                System.out.println("El área del rectángulo es: " + Matematicas.multiplicacion(base, altura));
                break;
            case 3:
                int baseT, alturaT;
                System.out.println("Ingrese el valor de la base del triángulo: ");
                baseT = Integer.parseInt(System.console().readLine());
                System.out.println("Ingrese el valor de la altura del triángulo: ");
                alturaT = Integer.parseInt(System.console().readLine());
                System.out.println("El área del triángulo es: " + Matematicas.division(Matematicas.multiplicacion(baseT, alturaT), 2));
                break;
            case 4:

                break;

            default:
                break;
        }

    }
}
