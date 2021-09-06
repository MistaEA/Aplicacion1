import javax.swing.*;

public class Ej3NombreLargoDePersona {
    public static void main(String[] args) {

        int box = JOptionPane.showConfirmDialog(null,"Ingrese el nombre y apellido de 3 amigos o familiares");

        String[] personas = new String[3];

        personas[0] = JOptionPane.showInputDialog(null,"Ingrese el nombre de la primera persona");
        personas[1] = JOptionPane.showInputDialog(null,"Ingrese el nombre de la segunda persona");
        personas[2] = JOptionPane.showInputDialog(null,"Ingrese el nombre de la tercera persona");


        if (personas[0].length() > personas[1].length() &&
                personas[0].length() > personas[2].length()) {
            JOptionPane.showMessageDialog(null, personas[0].concat("\nEs el nombre mas largo"));

        }else if (personas[1].length() > personas[0].length() &&
                personas[1].length() > personas[2].length()) {
            JOptionPane.showMessageDialog(null, personas[1].concat("\nEs el nombre mas largo"));

        }else if(personas[2].length() > personas[0].length() &&
                personas[2].length() > personas[1].length()) {
            JOptionPane.showMessageDialog(null, personas[2].concat("\nEs el nombre mas largo"));
        }

    }
}
