public class EjemploClaseMath {
    public static void main(String[] args) {
        
        double valor = Math.exp(2);
        System.out.println("exp = " + valor);

        int valor1 = Math.abs(-12);
        System.out.println("absoluto = " + valor1);

        valor = Math.pow(2,4);
        System.out.println("exponente = " + valor);


        valor = Math.round(5.5);
        System.out.println("calificaciones = " + valor);
        valor = Math.round(5.4);
        System.out.println("calificaciones = " + valor);

        valor = Math.ceil(5.2);
        System.out.println("calificación = " + valor);
        valor = Math.floor(5.8);
        System.out.println("calificación = " + valor);
        
        valor = Math.log(1);
        System.out.println("logaritmo = " + valor);
        
        valor = Math.max(12,32);
        System.out.println("valor max = " + valor);

        valor = Math.min(12,32);
        System.out.println("valor min = " + valor);
        
        
        double aRadianes = Math.toRadians(90.00);
        System.out.println("aRadianes = " + aRadianes);
        
        double coseno = Math.cos(aRadianes*2);
        System.out.println("coseno = " + coseno);
        
        double seno = Math.sin(aRadianes);
        System.out.println("seno = " + seno);
        
        double tan = Math.tan(aRadianes);
        System.out.println("tan = " + tan);


        
    }
}
