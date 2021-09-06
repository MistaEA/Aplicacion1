import java.util.Scanner;

public class SistemasNumericos_Console {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero = ");
        var Consola = new Scanner(System.in);
        int numero = 0;
        try{
            numero = Consola.nextInt();
        }catch(Exception e){
            System.out.println("Error, ingrese un valor entero");
            main(args);
            System.exit(0);
        }
        System.out.println("Binario = " + Integer.toBinaryString(numero));
        System.out.println("\nOctal = " + Integer.toOctalString(numero));
        System.out.println("\nHexal = " + Integer.toHexString(numero));
    }
}
