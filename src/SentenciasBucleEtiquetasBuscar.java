public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        /*String frase = "tres tristes tigres tragan trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;

        for (int i = 0; i < max; i++){
            if (frase.charAt(i) != 't'){
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado " + cantidad  + " veces.");*/

        String frase = "Tres tristes tigres tragando en un trigal";
        String[] separador = frase.split(" ");
        String palabra = "tigres";
        int i = separador.length;
        int incremento = 0;
        for (int k = 0; k < i; k++){
            if (separador[k].equals(palabra)){
                System.out.println("Se encontro dicha palabra");
            }

        }
    }
}
