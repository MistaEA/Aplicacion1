import javax.swing.*;

public class SenetenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Hector","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};
        int elementos = nombres.length;

        for (int i = 0; i < elementos; i++){
            if (nombres[i].toLowerCase().equals("HECTOR".toLowerCase()) || nombres[i].toLowerCase().equals("PEPa".toLowerCase())) {
                continue;
            }
            System.out.println(i + ".-" +nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
        System.out.println(buscar);

        boolean encontrado = false;

        for (int i = 0; i < elementos; i++){
            if (nombres[i].equals(buscar)){
                encontrado = true;
                break;
            }
            System.out.println(nombres[i]);
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar.concat(" fue encontrado.") );
        }else {
            JOptionPane.showMessageDialog(null,"No existe en el sistema" );
        }

    }
}
