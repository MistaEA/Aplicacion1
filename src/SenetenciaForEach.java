public class SenetenciaForEach {
    public static void main(String[] args) {

        //for
        String caracteres = "Vega Edits";
        char[] arreglo =  caracteres.toCharArray();
        int incremento = arreglo.length;
        for (int i = 0; i < incremento; i++){
            System.out.println(arreglo[i]);
        }

        System.out.println("\n");

        //forEach
        caracteres = "Mista Zew";
        arreglo = caracteres.toCharArray();
        for (char caracter: arreglo){
            System.out.println(caracter);
        }

    }
}
