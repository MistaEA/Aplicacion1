import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {

        int i = 5,j = 4, suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("suma = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i- j) = " + (i- j));

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("i * j = " + i * j);

        double dd = (double) 20 / 60;
        System.out.println("dd = " + dd);

        int a,b;
        a = 20;
        b = 80;
        double div3 = (double) a / b;
        System.out.println("div3 = " + div3);


        int divi = i / j;
        float div2 = (float) i / j;
        System.out.println("divi = " + divi);
        System.out.println("div2 = " + div2);

        int moduloOResto = i % j;
        System.out.println("modulo = " + moduloOResto);

        moduloOResto = 8 % 5;
        System.out.println("moduloOResto = " + moduloOResto);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0){
            JOptionPane.showMessageDialog(null  ,"Numero par");
        }else {
            JOptionPane.showMessageDialog(null, "Numero impar");
        }
    }
}
