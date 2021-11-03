public class WrapperBoolean {
    public static void main(String[] args) {
        Integer numero, numero2;
        numero = 1;
        numero2 = 2;

        boolean primBoolean = 1 > 2;
        Boolean ObjBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");

        System.out.println(primBoolean);
        System.out.println(ObjBoolean);
        System.out.println(objBoolean2);

        System.out.println("\nComparando dos objetos boolanos " + (primBoolean == ObjBoolean));
        System.out.println("\nComparando dos objetos boolanos " + (primBoolean == objBoolean2));
        System.out.println("\nComparando dos objetos boolanos " + (objBoolean2.equals(ObjBoolean)));

        boolean primBoolean2 = objBoolean2.booleanValue();

        Boolean objetoBoolean = Boolean.valueOf(primBoolean2);
    }
}
