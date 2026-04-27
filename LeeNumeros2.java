import java.util.Scanner;

public class LeeNumeros2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa tu nombre, edad. peso y talla (separados por un espacio): ");
        String nombre = s.next();
        int edad = s.nextInt();
        double peso = s.nextDouble();
        double talla = s.nextDouble();

        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
        System.out.println("Tu peso es " + peso + " y tu talla es " + talla);

    }
}
