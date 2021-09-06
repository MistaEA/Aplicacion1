public class ConversionDeTipos {
    public static void main(String[] args) {

        //convertir deString a primitivo
        String str = "125.25e-2";
        double is = Double.parseDouble(str);
        System.out.println("is = " + is);

        str = "1258";
        int n = Integer.parseInt(str);
        System.out.println("n = " + n);

        str = "125.25F";
        float ff = Float.parseFloat(str);
        System.out.println("ff = " + ff);


        //convertir a primitivos a string
        short ss = 1254;
        str = Short.toString(ss);
        System.out.println("str = " + str);

        int inte = 158975;
        str = String.valueOf(inte);
        System.out.println("inte = " + inte);

        //conversion de primitivos
        float f = 3.4028235E38F;
        int i = (int)f;
        System.out.println("i = "+ System.lineSeparator() + i);

        byte b = 127;
        long l = b;
        System.out.println("l = " + l);

        long lon = 1258984546L;
        int integerr = (int) lon;
        System.out.println("integerr = " + integerr);


        String strr = "125.02F";
        float fff = Float.parseFloat(strr);

        double ddb = 125.02e-2D;
        String str2 = Double.toString(ddb);
        System.out.println("str2 = " + str2);


        float number = 20;
        int ffff = (int) number;

        System.out.println("ffff = " + ffff);

    }
}
