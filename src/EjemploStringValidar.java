public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        StringBuilder curso2 = null;
        if (esNulo){
            curso =  "Programacion Java";
             curso2 = new StringBuilder("Pepe");
        }
        System.out.println("Stringbuilder = " + curso2.append(" ").append(curso));
        System.out.println("curso = " + curso);

        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        if(esBlanco){
            System.out.println("curso.toUpperCase() = " + curso.toUpperCase());
            System.out.println("curso.concat(\" con \" + \"Pepe\") = " + curso.concat(" con " + "Pepe"));
            System.out.println("curso = " + curso2);
        }


    }
}