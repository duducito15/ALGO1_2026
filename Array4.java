public class Array4 {
    public static void main(String[] args) {
        char[] caracter = new char[5];

        caracter[0] = '%';
        caracter[1] = 'á';
        caracter[2] = '+';
        caracter[3] = 'A';
        caracter[4] = '2';

        System.out.println("El array caracter tiene los siguientes elementos:");
        for (int i = 0; i < 5; i++) {
            System.out.println("caracter[" + i + "] = " + caracter[i]);
        }
    }
}
