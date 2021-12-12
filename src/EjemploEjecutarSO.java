
public class EjemploEjecutarSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process p;
        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                p = rt.exec("notepad");
            }else if(System.getProperty("os.name").toLowerCase().startsWith("mac")){
                p = rt.exec("notebook");
            }else if(System.getProperty("os.name").toLowerCase().startsWith("nix") ||
                    System.getProperty("os.name").toLowerCase().startsWith("nux")){
                p = rt.exec("gedit");
            }else{
                p = rt.exec("gedit");
            }
            p.waitFor();
        }catch(Exception e){
            System.err.println("Hubo un error en :" + e.getMessage());

        }

    }
}


