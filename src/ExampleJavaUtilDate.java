import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleJavaUtilDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Ingresa la fecha de tu nacimiento: ");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fechahoy = new Date();
            Date miFecha = sdf.parse(sc.nextLine());

            sdf =  new SimpleDateFormat("yyyyMMdd");
            String fechah = sdf.format(fechahoy);
            String fecham = sdf.format(miFecha);
            Integer valor1 = Integer.parseInt(fechah);
            Integer valor2 = Integer.parseInt(fecham);

            Integer fecha_Actual = (valor1 - valor2) / 10000;
            System.out.println("Tu tienes " + fecha_Actual + " años");
        }catch(Exception e){
            System.err.println("Error en "  +  e.getMessage());
            System.err.println("Ingrese el formato \"yyyy-MM-dd\"");
            main(args);
        }
    }

}
