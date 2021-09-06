import java.util.Scanner;

public class Ej2EstanqueDeGasolina {
    public static void main(String[] args) {


        Scanner c = new Scanner(System.in);

        System.out.println("Ingrese la capacidad del tanque: ");
        double capacidad_lts = c.nextDouble();

        double lleno = 70.0;
        String capacidadTxt = "";
        boolean capacidad = false;

        if (capacidad_lts == lleno){
          capacidadTxt = "Estanque lleno";
        }else if (capacidad_lts >= 60 && capacidad_lts < lleno){
            capacidadTxt = "Estanque casi lleno";
        }else if (capacidad_lts >= 40 && capacidad_lts < 60){
            capacidadTxt = "Estanque  3/4";
        }else if (capacidad_lts >= 35 && capacidad_lts < 40){
            capacidadTxt = "Medio estanque";
        }else if (capacidad_lts >= 20 && capacidad_lts < 35){
            capacidadTxt = "Suficiente";
        }else if (capacidad_lts >= 1 && capacidad_lts < 20){
            capacidadTxt = "Insuficiente";
        }
        System.out.println(capacidadTxt);

    }
}
