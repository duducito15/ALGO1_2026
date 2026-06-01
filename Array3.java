public class Array3 {
  public static void main(String[] args) {
    int[] num = new int[10]; //declara el array num y dandole la longitud

    num[0] = 8;
    num[1] = 23;
    num[2] = 300;
    num[3] = 150;
    num[4] = 255;
    num[5] = num[2] + 5;
    num[6] = num[3] / 2;
    num[7] = num[0] + num[1] +num[2];
    num[8] = num[5] + num[6];
    num[9] = 15;

    System.out.println("El array num tiene los siguientes elementos:");
    for (int i = 0; i < 10; i++) {
        System.out.println("num["+i+"] = "+num[i]);
    }
  }  
}
