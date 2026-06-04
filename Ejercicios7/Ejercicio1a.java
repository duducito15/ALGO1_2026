package Ejercicios7;

public class Ejercicio1a {
    public static void main(String[] args) {
        char[] simbolo = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'X';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = '%';

        for (int i = 0; i < simbolo.length; i++) {
            System.out.println("simbolo["+ i +"]: "+simbolo[i]);
        }
    }
}
