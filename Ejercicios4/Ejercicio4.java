package Ejercicios4;

public class Ejercicio4 {
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
            case 3:
                if (dia < 21) {
                    horoscopo = "piscis";
                } else {
                    horoscopo = "aries";
                }
                break;
            case 4:
                if (dia < 20) {
                    horoscopo = "aries";
                } else {
                    horoscopo = "tauro";
                }
                break;
            case 5:
                if (dia < 20) {
                    horoscopo = "tauro";
                } else {
                    horoscopo = "géminis";
                }
                break;
            case 6:
                if (dia < 21) {
                    horoscopo = "géminis";
                } else {
                    horoscopo = "cancer";
                }
                break;
            case 7:
                if (dia < 23) {
                    horoscopo = "cancer";
                } else {
                    horoscopo = "leo";
                }
                break;
            case 8:
                if (dia < 24) {
                    horoscopo = "leo";
                } else {
                    horoscopo = "virgo";
                }
                break;
            case 9:
                if (dia < 23) {
                    horoscopo = "virgo";
                } else {
                    horoscopo = "libra";
                }
                break;
            case 10:
                if (dia < 23) {
                    horoscopo = "libra";
                } else {
                    horoscopo = "escorpio";
                }
                break;
            case 11:
                if (dia < 23) {
                    horoscopo = "escorpio";
                } else {
                    horoscopo = "sagitario";
                }
                break;
            case 12:
                if (dia < 21) {
                    horoscopo = "sagitario";
                } else {
                    horoscopo = "capricorpnio";
                }
                break;
            default:
                break;
        }
        System.out.println("Tu signo del zodiaco es: " + horoscopo);
    }
}
