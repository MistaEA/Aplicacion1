import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String oracion = System.lineSeparator();
        System.out.println(oracion.concat("pEEPEPE"));

        String version = System.getProperty("os.version");
        System.out.println(version);

        String windows = System.getProperty("os.name");
        System.out.println(windows);

        String os = System.getProperty("os.arch");
        System.out.println(os);

        Properties p = System.getProperties();
        p.list(System.out);

    }
}
