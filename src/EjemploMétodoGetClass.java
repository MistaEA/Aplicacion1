import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EjemploMétodoGetClass  {
    public static void main(String[] args) throws InterruptedException {

        String texto = "Hola, que tal";

        Class str = texto.getClass();

        System.out.println("str.getSimpleName() = " + str.getSimpleName());
        System.out.println("str.getSimpleName() = " + str.getName());
        System.out.println("str.getSimpleName() = " + str.getPackageName());
        System.out.println("str.getSimpleName() = " + str.getAnnotatedSuperclass());
        System.out.println("str.getSimpleName() = " + str.getPackage().getName());

        Class objeto = str.getClass();

        for (Method metodos : str.getMethods()){
            System.out.println(metodos.getName());
        }


        Integer num1 = 12;
        Class integer = num1.getClass();

        System.out.println("integer = " + integer.getName());
        System.out.println("integer = " + integer.getSuperclass().getSuperclass());
        System.out.println("integer = " + integer.getPackageName());
        System.out.println("integer = " + integer.getSimpleName());
        System.out.println("integer.getMethods() = " + integer.getMethods());

        for (Method n : integer.getMethods()){
            System.out.println(n.getName());
        }
        System.out.println("\n");
        Double precisionDoble = 12.23D;
        Class dob = precisionDoble.getClass();

        System.out.println(dob.getName());
        System.out.println(dob.getSimpleName());
        System.out.println(dob.getPackageName());
        iteracionDeMetodos : for (Method metodos : dob.getMethods()){
            System.out.println("metodos.getName() = " + metodos.getName());
        }
        System.out.println("\n");
        for (Field me : dob.getFields()){
            System.out.println("me.getName() = " + me.getName());
        }
    }
}
