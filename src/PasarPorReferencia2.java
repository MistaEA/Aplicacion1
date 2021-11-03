class Persona {
    public String nombre;
    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona personas = new Persona();
        personas.modificarNombre("Pedro");
        System.out.println("Iniciamos el método main");
        System.out.println(personas.leerNombre());
        System.out.println("Antes el método test");
        distinto(personas);
        System.out.println(personas.leerNombre());
        System.out.println("Finaliza el método test");
        System.out.println("Finaliza el método main con los datos de la persona modificados");
    }

    public static void distinto(Persona peronsa) {
        System.out.println("Inicia el método \"distinto\"");
        peronsa.modificarNombre("Pepe");
    }
}
