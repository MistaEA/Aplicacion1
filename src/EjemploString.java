public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        boolean esigual = curso == curso2;
        System.out.println("curso == curso2 = " + esigual);

        esigual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esigual);

        String curso3 =  "Programación Java";
        esigual = curso == curso3;
        System.out.println("curso == curso3 = " + esigual);


    }
}
