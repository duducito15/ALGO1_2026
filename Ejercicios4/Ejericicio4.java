package Ejercicios4;

public class Ejericicio4 {
    public static void main(String[] args) {
        System.out.println("Programa que indica tu signo");
        
        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mes = Integer.parseInt(System.console().readLine());

        System.out.print("Ahora el día de nacimiento (1-31): ");
        int dia = Integer.parseInt(System.console().readLine());

        String horoscopo = "";

        switch (mes) {
            case 1:
                if (dia < 20) {
                    horoscopo = "capricornio";
                } else {
                    horoscopo = "acuario";
                }
                break;
            case 2:
                if (dia < 18) {
                    horoscopo = "acuario";
                } else {
                    horoscopo = "piscis";
                }
                break;
            default:
                break;
        }



    }
}
