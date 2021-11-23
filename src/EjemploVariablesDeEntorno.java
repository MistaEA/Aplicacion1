import java.util.Map;
public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();

        System.out.println("--------- Variables de entorno del sistema ---------");

        for (String keys : varEnv.keySet()){
            System.out.println(keys.concat(" => ").concat(varEnv.get(keys)));
        }
        
        String familia = varEnv.get("FAMILIA");
        System.out.println("familia = " + familia);

        String sd = System.getenv("SystemDrive");
        System.out.println("sd = " + sd);

        String jh = varEnv.get("JAVA_HOME");
        System.out.println(jh);

        String os = System.getenv("OS");
        System.out.println(os);

        String nop = System.getenv("NUMBER_OF_PROCESSORS");
        System.out.println(nop);
        
        nop = varEnv.get("NUMBER_OF_PROCESSORS");
        System.out.println("nop = " + nop);
        
    }
}
