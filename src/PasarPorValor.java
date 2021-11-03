public class PasarPorValor {
    public static void main(String[] args) {

        Double numero = Double.valueOf("123.2");
        System.out.println("Iniciamos el método main: " + numero);
        test(numero);
        System.out.println("Finalizamos el método main: " + numero);
    }
    public static void test(Double numero){
        System.out.println("Iniciamos el método test: " + numero);
        numero = 1232D;
        System.out.println("Finalizamos el método test: "+ numero);
    }
}
