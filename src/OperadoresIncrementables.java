public class OperadoresIncrementables {
    public static void main(String[] args) {
        //PRE-INCREMENTO
        int i = 1;
        int j = ++i;// j = 2 & i = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //POST-INCREMENTO
        i = 2;
        System.out.println("i = " + i);//2
        j = i++; // j = 2 & i = 3
        System.out.println("i = " + i); // 3
        System.out.println("j = " + j + "\n"); //2

        //PRE-DECREMENTO
        i = 3;
        System.out.println("i = " + i);
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //POST-DECREMENTO
        i = 4;
        j = i--;
        System.out.println("j = " + j); //4
        System.out.println("i = " + i); // 3
        
        System.out.println("j = " + ++j);//5
        System.out.println("j++ = " + j++); //5
        System.out.println("j = " + j); // 6
    }
}
