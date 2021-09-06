import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String Str = JOptionPane.showInputDialog(null, "Ingrese un valor");
        int numero = 0;
        try{
            numero = Integer.parseInt(Str);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, ingrese un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numero = " + numero);
        String mensajeBinario = "Numero Binario: " + Integer.toBinaryString(numero);
        System.out.println(mensajeBinario);
        String mensajeOctal = "Numero Octadecimal: " + Integer.toOctalString(numero);
        System.out.println(mensajeOctal);
        String mensajeHex = ("Numero hexadecimal: " + Integer.toHexString(numero));
        System.out.println(mensajeHex);
        String mensaje = mensajeBinario + '\n' + mensajeOctal + '\n' + mensajeHex;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
