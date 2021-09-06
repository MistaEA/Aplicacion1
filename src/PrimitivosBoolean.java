public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 989.23e-3; // 0.98923
        System.out.println("d = " + d);
        float f = 1.2345e2F;// 123.45
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico  = \n" + datoLogico );

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
