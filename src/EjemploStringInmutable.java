public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = new String("Andres Guzman");

        String resultado = curso + " con " + profesor;
        System.out.println("resultado = " + resultado);
        String resultado2 = curso.concat( " con ".concat(profesor));
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = curso.transform(c -> {
           return curso.concat(" con ".concat(c));
        });
        System.out.println("resultado3 = " + resultado3);

        String replaces = (curso.concat(" con " + profesor)).replace("a", "A");
        System.out.println("replaces = " + replaces);

        String numero ="125";
        String num = numero.transform(n ->{
            return n.concat(" ".concat(" "+ Integer.parseInt(numero)));
        });
        System.out.println("num = " + num);

    }
}
