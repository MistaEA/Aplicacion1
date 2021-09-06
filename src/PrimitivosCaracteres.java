public class PrimitivosCaracteres {

    static float numero;

    public static void main(String[] args) {
        char unicode = '\u0040';
        System.out.println("unicode = " + unicode);
        char decimal = 64;
        System.out.println("decimal = " + decimal);
        System.out.println("(decimal == unicode) = " + (decimal == unicode));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo == unicode && simbolo = " + (simbolo == unicode && simbolo == decimal) + '\n');

        char tabulador = '\t';
        char retroceso = '\b';
        char nuevaLinea = '\n';
        char carro = '\r';

        System.out.println("Byte de un char " + tabulador + System.getProperty("line.separator")+ Character.BYTES );
        System.out.println("Bites de un char " + Character.SIZE);
        System.out.println("Valor maximo de un char" + Character.MAX_VALUE);
        System.out.println("Valor minimo de un char" + Character.MIN_VALUE);
        System.out.println("numero = " + numero);
    }
}
