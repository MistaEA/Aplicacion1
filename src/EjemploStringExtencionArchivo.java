public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "Alguna.Imagen.js";
        int i = archivo.lastIndexOf(".");
        System.out.println("extensión = " + archivo.substring(i + 1));
    }
}
