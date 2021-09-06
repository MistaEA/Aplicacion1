public class PrimitivosEnteros {

    public static void main(String[] args) {
        byte enteroByte = 127;
        System.out.println("EnteroByte = " + enteroByte);
        System.out.println("Byte de un byte = " + Byte.BYTES);
        System.out.println("Bites de un byte = " + Byte.SIZE);
        System.out.println("Valor maximo de un byte = " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte = " + Byte.MIN_VALUE + "\n");

        short enteroShort = 32767;
        System.out.println("EnteroShort = " + enteroShort);
        System.out.println("Byte de un short = " + Short.BYTES);
        System.out.println("Bites de un short = " + Short.SIZE);
        System.out.println("Valor maximo de un short = " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short = " + Short.MIN_VALUE + "\n");
        
        int enteroInt = 2147483647;
        System.out.println("enteroInt = " + enteroInt);
        System.out.println("Byte de un Int = " + Integer.BYTES);
        System.out.println("Bites de un Int = " + Integer.SIZE);
        System.out.println("Valor maximo de un Int = " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un Int = " + Integer.MIN_VALUE + "\n");

        long enteroLong = 9223372036854775807L;
        System.out.println("enteroLong = " + enteroLong);
        System.out.println("Byte de un Long = " + Long.BYTES);
        System.out.println("Bites de un Long = " + Long.SIZE);
        System.out.println("Valor maximo de un Long = " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un Long = " + Long.MIN_VALUE);
    }
}
