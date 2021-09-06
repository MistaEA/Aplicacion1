import java.util.LongSummaryStatistics;

public class OperadorInstaceOf {
    public static void main(String[] args) {

        Object texto = new String("Creando un objeto de la clase String ... que tal!");

        Number num = 7;

        boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String: " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object: " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer:  " + b1);

        b1 = num instanceof Number;
        System.out.println("num1 es del tipo Long: " + b1);

    }
}
