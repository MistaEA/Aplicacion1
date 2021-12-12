import java.util.Scanner;
public class SACARAREA {
    public static void main(String[] args) {

        System.out.print("Ingrese su radio: ");
        Scanner c = new Scanner(System.in);
        double radio = c.nextDouble();
        double area = Math.PI*Math.pow(radio,2);
        System.out.print("el área de su círculo es: " + area);
    }
}
