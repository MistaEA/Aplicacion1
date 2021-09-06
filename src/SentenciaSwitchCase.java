import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner c = new Scanner (System.in);

        System.out.print("Ingrese un mes del año: ");
        String mes = c.next();

        switch (mes){
            case "Enero","1","enero" -> {
                for (int i = 0; i <= 50; i++){
                    System.out.println(i);
                }
            }
            case "Febrero","2","febrero" -> System.out.println("Febrero");
            case "Marzo","3","marzo" -> System.out.println("Marzo");
            case "Abril","4","abril" -> System.out.println("Abril");
            case "Mayo","5","mayo" -> System.out.println("Mayo");
            case "Junio","6","junio" -> System.out.println("Junio");
            case "Julio","7","julio" -> System.out.println("Julio");
            case "Agosto","8","agosto" -> System.out.println("Agosto");
            case "Septiembre","9","septiembre" -> System.out.println("Septiembre");
            case "Octubre","10","octubre" -> System.out.println("Octubre");
            case "Noviembre","11","noviembre" -> System.out.println("Noviembre");
            case "Diciembre","12","diciembre" -> System.out.println("Diciembre");
        }

    }
}
