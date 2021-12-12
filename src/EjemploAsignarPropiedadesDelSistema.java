import java.util.Map;
import java.util.Properties;
import java.io.FileInputStream;
public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args) {


        try {
            FileInputStream fis = new FileInputStream("src/myproperties2.properties");
            Properties p = new Properties(System.getProperties());
            p.load(fis);
            p.setProperty("hola","M KJDSKLAFJLKDSJFLKDSKLFJDSLKAFKL");

            System.setProperties(p);
            Properties ps = System.getProperties();
            p.list(System.out);

            System.out.println(System.getProperty("hola"));
            System.out.println(System.lineSeparator() + "hola juancho");


        }catch (Exception e){
            System.err.println("Error en:" + e);
        }





    }
}
