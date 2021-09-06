public class EjemplosStringMetodosArreglo {
    public static void main(String[] args) {
        /* String variable = "trabal enguas";
        char[] arreglo = variable.toCharArray();
        int largo = arreglo.length;
        for (int i = 0; i < largo; i++){
            System.out.println(arreglo[i]);
        }*/

        /*String variable2 = "Pedro Pica Piedra";
        String[] arreglo2 = variable2.split(" ");
        int l = arreglo2.length;
        for (int o = 0; o < l; o++){
            System.out.println(arreglo2[o]);
        }
        System.out.println(arreglo2[2]);*/

        /*String extension = "Imagen.png";
        String [] arreglo3 = extension.split("[.]");
        int i = arreglo3.length;
        System.out.println("i = " + i + "\n");
        for (int q = 0; q < i; q++){ // 0 1
            System.out.println(arreglo3[i-1]);
        }*/

        //EXTRAES EL NOMBRE DE UN LINK
        /*String link = "https://www.google.es/";
        String[] arreg = link.split("[.]");
        System.out.println("arreg = " + arreg  + "\n");
        int i = arreg.length;
        System.out.println("i = " + i + "\n");//3 - 2 = 1
        for (int g = 0; g < i; g++){ //0 1 2
            System.out.println("arreg[i] = " + arreg[g]);
        }
        System.out.println("nombre de la pagina: " + arreg[1]);*/

        //EXTRAER LA TERCERA PALABRA DEL SIGUIENTE TEXTO
        String palabra = "Quieres aprender Android profesional de forma gratuita";
        String[] argl = palabra.split(" ");
        int i = argl.length;
        System.out.println("i = " + i); // 7
        for (int ere = 0; ere < i; ere++  ){ // 0 1 2 3 4 5 6
            System.out.println(argl[ere] );
        }
        System.out.println("\n");

        //OBTENER EXTENSION DE ARCHIVOS
        String extension = "MetaDatos.plre.sql";
        argl = extension.split("[.]");
         i = argl.length;
        System.out.println("i = " + i); // 3
        for (int d = 0; d < i; d++){//0 1 2
            System.out.println(argl[d]);
        }
        System.out.println("extension = " + argl[i-1]);
    }
}
