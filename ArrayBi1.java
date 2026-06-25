import java.lang.reflect.Field;

public class ArrayBi1 {
    public static void main(String[] args) {

        int[][] num = new int[3][2]; // Array bidimencional de 3 filas por 2 columnas

        num[0][0] = 20;
        num[1][0] = 67;
        num[1][1] = 33;
        num[2][1] = 7;

        int fila, columna;

        for (fila = 0; fila < 3; fila++) {
            System.out.print("Fila: " + fila);
            for (columna = 0; columna < 2; columna++) {
                System.out.printf("%10d", num[fila][columna]);
            }
            System.out.println();
        }
    }
}
