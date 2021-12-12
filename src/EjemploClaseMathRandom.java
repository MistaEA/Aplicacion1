import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"rojo","verde","morado","azul","amarillo","naranja","celeste"};

        double random = Math.random();
        random *= colores.length;
        System.out.println("random = " + random);
        double aleatorio = Math.floor(random);
        System.out.println("colores[(int)] = " + colores[(int)random]);

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(colores.length);
        System.out.println(colores[randomInt]);

    }
}
