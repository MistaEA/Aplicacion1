import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DAte {
    public static void main(String[] args) {

        Scanner c =  new Scanner(System.in);

        System.out.println("Inserta tu fecha de nacimiento con el formato: \"yyyy-MM-dd\"");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaHoy = new Date();
        try{
            Date fechaMy = sdf.parse(c.nextLine());

            sdf = new SimpleDateFormat("yyyy-MM-dd");

            String my0 = sdf.format(fechaMy);
            String hoy0 = sdf.format(fechaHoy);

            Integer my = Integer.parseInt(my0);
            Integer hoy = Integer.parseInt(hoy0);

            Integer anios = (hoy - my) / 10000;
            System.out.println("Tu tienes " + anios + " años");
        }catch(Exception e){
            System.err.println("Hubo un error en: " +  e.getMessage());
            System.err.println("El formato ingresado no es el correcto");

        }


    }
}
