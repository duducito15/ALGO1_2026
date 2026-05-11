package Ejercicios4;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.print("Ingresa las horas trabajadas: ");
        String line = System.console().readLine();
        double horasTrabajadas = Double.parseDouble(line);
        double salario = 0;

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 12;
            System.out.println("El pago semanal es: " + salario);
        } else {

            double horasExtras = horasTrabajadas - 40;
            salario = (horasTrabajadas * 12) + (horasExtras * 4);
            System.out.println("El pago semanal es: " + salario);
        }
    }
}
