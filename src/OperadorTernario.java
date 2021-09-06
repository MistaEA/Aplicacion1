import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7 == 5? "si verdadero": "si es falso";
        System.out.println("variable = " + variable);

        Scanner consola = new Scanner(System.in);
        String estado = "";
        double promedio;

        System.out.print("Calificacion de Matematicas: ");
        double matematicas = consola.nextDouble();
        System.out.print("Calificacion de Ciencias: ");
        double ciencias = consola.nextDouble();
        System.out.print("Calificacion de Historia: ");
        double historia = consola.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        estado = promedio >= 5.99? "Aprovado": "Rechazado";
        System.out.println("Tu promedio es = " + (promedio) + " por tanto fuiste " + estado);

        /*estado = promedio >= 5.49? "Aprovado" : "Rechazado";
        System.out.println("estado = " + estado);*/


    }
}
