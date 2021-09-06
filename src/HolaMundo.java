public class HolaMundo {
    public static void main(String[] args){
    String saludar = "Hola mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toLowerCase() = " + saludar.toLowerCase());
        int numero = 11;
        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
        }
        System.out.println("numero2 = " + numero2);
        String nombre;
        nombre = "Andres";
        if(numero > 10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);
    }
}
