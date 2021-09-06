public class PrimitivosFloat {
       static float realPrimitivo1;

    public static void main(String[] args) {
        float realFloat = 2;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Byte de un Float = " + Float.BYTES);
        System.out.println("Bites de un Float = " + Float.SIZE);
        System.out.println("Valor maximo de un Float = " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un Float = " + Float.MIN_VALUE + "\n");

        double realDouble = 1.7976931348623157E308;
        System.out.println("realFloat = " + realDouble);
        System.out.println("Byte de un double = " + Double.BYTES);
        System.out.println("Bites de un double = " + Double.SIZE);
        System.out.println("Valor maximo de un double = " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double = " + Double.MIN_VALUE + "\n");

        System.out.println("RealPrimitivo1 = " + realPrimitivo1);
    }

}
