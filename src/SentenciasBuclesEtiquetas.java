public class SentenciasBuclesEtiquetas {
    public static void main(String[] args) {


        //Una persona trabaja cada día durante 8 hrs menos los sábados y domingos
        //Una persona trabaja cada día durante 8 hrs. menos los sábados y domingos
        int dias = 7;
        int hrs = 8;
        dias:
        for (int i = 0; i <= dias; i++) {
            System.out.println("\n");

            iteración:
            for (int k = 0; k <= hrs; k++) {
                if (i == 6 || i == 7) {
                    System.out.print("Dias de descanso " + i + ". No se trabaja!!");
                    continue dias;
                }

                System.out.println("Dia(s) " + i + ", Trabajando en las horas " + k);
            }
        }

        System.out.println("\n===============================================================================");


        int l = 5;
        iteracion1:
        for (int i = 0; i < l; i++) {
            System.out.println();

            int k = 0;
            while (k < l) {
                if (i == 2) {
                    continue iteracion1;
                }
                System.out.print("[" + "i = " + i + ", k = " + k + "], ");
                k++;
            }
        }

        System.out.println("\n===============================================================================");

        l = 5;
        etiqueta:
        for (int i = 0; i < l; i++) {
            System.out.println();
            iteracion3:
            for (int k = 0; k < l; k++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[" + "i = " + i + ", k = " + k + "], ");
            }
        }
    }
}