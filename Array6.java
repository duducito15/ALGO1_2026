public class Array6 {
    public static void main(String[] args) {
        String[] color = {"\u001B[31mrojo", "\u001B[33mamarillo", "\u001B[32mverde", "\u001B[37mblanco", "\u001B[34mazul", "\u001B[30mnegro"};

        System.out.println("Generador de banderas aleatorias");

        System.out.println("Ingresa la cantidad de franjas de tu bandera: ");
        int franjas = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < franjas; i++) {
            System.out.println(color[(int)(Math.random()*6)]);
        }
    }
}
