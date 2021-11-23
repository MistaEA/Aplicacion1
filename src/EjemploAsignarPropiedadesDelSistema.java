import java.util.Map;
import java.util.Properties;
import java.io.FileInputStream;
import java.util.Map;
public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args)  {

        Map<String, String> varEnv = System.getenv();
        for (String var : varEnv.keySet()){

            System.out.println(var + " = " + System.getenv(var));
        }

        /*try{
            FileInputStream fis = new FileInputStream("src/myproperties.properties");
            Properties p = new Properties(System.getProperties());
            p.getProperty("my.nombre.es","1209238947875896");
            p.load(fis);
            System.setProperties(p);
            Properties ps = System.getProperties();

            System.out.println(ps.getProperty("config.my.SO"));
            System.out.println(System.getProperty("config.my.name.is"));
            System.out.println(System.getProperty("config.my.SO"));
            System.out.println(System.getProperty("config.mememememe"));

        }catch(Exception e){
            System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }
*/

    }
}
