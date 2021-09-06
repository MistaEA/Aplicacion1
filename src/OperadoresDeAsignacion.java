public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        i += 2; // i = i + 2;
        System.out.println("i = " + i);

        i += 5; // i = i + 5;
        System.out.println("i = " + i);

        j -= 4; // j = 5 + 4 - 4;
        System.out.println("aritmeticos = " + j);

        j *=  3; //j = 5 * 3;
        System.out.println("multiplicacion = " + j);

        String sqlString = "Select * from CLINTES as c";
        sqlString  += " where c.nombre = 'Andres' ";
        sqlString += " and c.activo = 1";
        System.out.println("sqlString = " + sqlString);

        String sqlServer = "Mi nombre es Hector Enrique";
        sqlServer += " Lorem ipsum ";
        sqlServer += "un libro tiene edicion.";
        System.out.println("sqlServer = " + sqlServer);
    }
}
