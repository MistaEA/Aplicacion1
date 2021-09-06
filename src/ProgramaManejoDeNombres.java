import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese nombres de 3 integrantes de tu familia o amigos: ");
        String persona1 = consola.nextLine();
        String persona2 = consola.nextLine();
        String persona3 = consola.nextLine();

        System.out.println((persona1.toUpperCase().charAt(1) + "." +persona1.substring(persona1.length()-2)).concat(("_" + persona2.toUpperCase().charAt(1) + "."
        + persona2.substring(persona2.length()-2).concat(("_" + persona3.toUpperCase().charAt(1) + "." + persona3.substring(persona3.length()-2))))));
    }
}

