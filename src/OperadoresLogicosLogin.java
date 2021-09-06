import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usuario = {"Hector", "Ivan"};
        String[] password ={"12345","125"};


        Scanner con = new Scanner (System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String u = con.next();
        System.out.print("Ingrese su contrasenia de usuario: ");
        String p = con.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usuario.length; i++){
            esAutenticado = (usuario[i].equals(u) && password[i].equals(p)) ? true : esAutenticado;
//            boolean ifU =  (u.equals(usuario[i]) && p.equals(password[i])) ? esAutenticado = true : esAutenticado;
//            if (u.equals(usuario[i]) && p.equals(password[i])){
//            esAutenticado = true;
//            break;
//            }
        }

            String mensaje = esAutenticado ? "Bienvenido ".concat(u).concat("!!!!"):
                    "Ingrese los datos correctos\nLo sentimos requiere Autenticación";

        System.out.println(mensaje);
//        if (esAutenticado){
//            System.out.println("Bienvenido ".concat(u).concat("!!!!"));
//        }else

    }
}
