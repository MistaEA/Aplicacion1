public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }

        i = 0;
        Boolean prueba = false;

        prueba = true;
        i = 0;
        while (prueba){
            if (i == 5){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }
        prueba = true;
        i = 0;
        do {
            if (i == 25){
                prueba = false;
            }
            System.out.println(i);
            i++;
        }while (prueba);

    }
}
