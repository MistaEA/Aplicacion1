public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] numero = {9,12,13};
        System.out.println("Iniciamos el método main");
        for (int n : numero){
            System.out.println("Es n: "+ n);
        }
        System.out.println("Antes el método test");
        distinto(numero);
        System.out.println("Finaliza el método test");
        for( int l = 0; l < numero.length; l++){
            System.out.println(numero[l]);
        }
        System.out.println("Finaliza el método main");
    }
    public static void distinto(int[] number){
        System.out.println("Inicia el método \"distinto\"");
        for (int i = 0; i < number.length; i++){
            number[i] = number[i] + 20;
        }
    }
}
