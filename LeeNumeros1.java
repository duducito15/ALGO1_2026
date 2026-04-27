import java.util.Scanner;

public class LeeNumeros1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = s.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = s.nextInt();

        System.out.println("Tu nombres es: "+nombre+" y tu edad es: "+edad);
    }
}
