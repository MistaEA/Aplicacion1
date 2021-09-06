import java.util.Scanner;

public class SentenciaSwitchCaseObtenerdiasdeunMes {
    public static void main(String[] args) {


        //obtener los dias de cualquier mes
        Scanner c = new Scanner (System.in);

        System.out.print("Ingresa el mes del 1 - 12: ");
        String mes = c.next();
        int EMMJAOD = 31; // 1enero, 3marzo,5mayo, 7julio, 8agosto, 10octubre, 12diciembre
        int AJSN = 30; // 4abril, 6junio, 9septiembre, 11noviembre
        int dia = 0;

        switch(mes){
            case "Enero","1","enero" -> System.out.println("Enero tiene " + EMMJAOD);
            case "Febrero","2","febrero" -> {
                System.out.print("Ingresa el año: ");
                int anio = c.nextInt();
                if (anio % 400 == 0 || anio % 4 == 0 && !(anio % 100 == 0) ){
                    System.out.println("El mes tiene " +  29 + ". Por lo tanto es bisiesto!");
                }else{
                    System.out.println("El mes tiene " + 28 + ". Por lo tanto no es bisiesto!");
                }
            }
            case "Marzo","3","marzo" -> System.out.println("Tiene "+ EMMJAOD);
            case "Abril","4","abril" -> System.out.println("Abril tiene" + AJSN);
            case "Mayo","5","mayo" -> System.out.println("Mayo tiene" + EMMJAOD);
            case "Junio","6","junio" -> System.out.println("Junio tiene" + AJSN);
            case "Julio","7","julio" -> System.out.println("Julio tiene" + EMMJAOD);
            case "Agosto","8","agosto" -> System.out.println("Agosto tiene" + EMMJAOD);
            case "Septiembre", "9","septiembre" -> System.out.println("Septiembre tiene " + AJSN);
            case "Octubre", "10","octubre" -> System.out.println("Octubre tiene " + EMMJAOD);
            case "Noviembre", "11","noviembre" -> System.out.println("Noviembre tiene " + AJSN);
            case "Diciembre", "12","diciembre" -> System.out.println("Diciembre tiene " + EMMJAOD);
            default -> System.out.println("Ingrese los datos correctos");
        }

        //forma simple
        /*int EMMJAOD = 31;
        int AJSN = 30;

        System.out.print("Ingresa un mes del año: ");

        int mes = c.nextInt();
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(EMMJAOD);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(AJSN);
                break;
            case 2:
                System.out.print("Ingresa el año: ");
                int anio = c.nextInt();
                if (anio % 400 == 0 || anio % 4 == 0 && !(anio % 100 == 0)){
                    System.out.println("El mes tiene " +  29 + ". Por lo tanto es bisiesto!");
                }else{
                    System.out.println("El mes tiene " + 28 + ". Por lo tanto no es bisiesto!");
                }
                break;
            default:
                System.out.println("Mes desconocido");
        }*/
    }
}

