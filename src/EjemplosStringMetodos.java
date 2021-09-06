public class EjemplosStringMetodos {
    public static void main(String[] args) {

        String nombre = "      PedroPicaPiedra";
        System.out.println("nombre.compareTo(\"PedroPicaPiedra\") = " + nombre.compareTo("PedroPicaPiedra"));
        System.out.println("nombre.indexOf(\"e\") = " + nombre.indexOf("e"));
        System.out.println("nombre.indexOf(\"e\") = " + nombre.lastIndexOf("e"));
        System.out.println("nombre.substring(0,5) = " + nombre.substring(0,5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toUpperCase());
        System.out.println("nombre.endsWith(\"dra\") = " + nombre.endsWith("dra"));
        System.out.println("nombre.endsWith(\"dra\") = " + nombre.startsWith("P"));
        System.out.println("nombre.equals(\"PedropicaPiedra\") = " + nombre.equals("PedropicaPiedra"));
        System.out.println("nombre.equals(\"PedropicaPiedra\") = " + nombre.equalsIgnoreCase("PedropicaPiedra"));
        System.out.println("nombre.replace(\"P\", \"A\") = " + nombre.replace("P", "A"));
        System.out.println("nombre.transform(n {) = " + nombre.transform(n -> {
            return n;
        }));
        System.out.println("nombre.trim() = " + nombre.trim());
        System.out.println("nombre = " + nombre);

    }
}
