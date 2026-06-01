public class Array1 {
    public static void main(String[] args) {
        int[] numeros; // array de numeros enteros
        double[] promedios; //array de numeros con decimal

        numeros = new int[5];// se reserva 5 espacios en la memoria
        promedios = new double[10];

        numeros[0] = 15;
        numeros[1] = 5;
        numeros[2] = 1;
        numeros[3] = 8;
        numeros[4] = 21;

        System.out.println("Los valores del array numeros son:");
        System.out.print(numeros[0]+", "+numeros[1]+", "+numeros[2]+", "+numeros[3]+", "+numeros[4]);

        int suma = numeros[1] + numeros[3];
        System.out.println("\n"+suma);

    }
}
