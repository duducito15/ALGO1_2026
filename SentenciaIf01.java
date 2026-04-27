public class SentenciaIf01 {
    public static void main(String[] args) {
        System.out.println("¿Cuál es la capital del Perú?");
        String respuesta = System.console().readLine();

        if(respuesta.equals("lima")){
            System.out.println("¡la respuesta es correcta!");

        }else{
            System.out.println("¡Vuelve a repasar geografía!");
        }
    }
}
