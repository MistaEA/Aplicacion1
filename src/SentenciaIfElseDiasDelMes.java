import java.util.Scanner;

public class SentenciaIfElseDiasDelMes {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese algun mes cualquiera: ");
        int mes = consola.nextInt();
        System.out.println("Ingrese el año (YYYY): ");
        int anio = consola.nextInt();

        int numeroDias = 0;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){
            numeroDias  =31;
        }else if (mes == 4|| mes == 6|| mes == 9|| mes == 11 ){
            numeroDias = 30;
        }else if (mes == 2){
            if (anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)){
                numeroDias = 29;
            }else
                numeroDias = 28;
        }
        System.out.printf("%s%s" ,"Numero de dias ",numeroDias);
    }
}
