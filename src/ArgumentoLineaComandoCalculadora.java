public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {

        if(args.length != 3){
            System.err.println("Debe contener tres argumentos (suma, resta, multi o divi) y dos enteros");
            System.exit(-1);
        }

        String operation = args[0];
        Integer a = 0;
        Integer b = 0;

        try{
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);

        }catch(NumberFormatException  e){
            System.err.println("Lo siénto, los parámetros ingresados no son los correctos");
            System.exit(-1);
        }
        double resultado = 0;

        switch(operation){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplication":
                resultado = a.doubleValue() * b.doubleValue();
                break;
            case "div":
                if (b == 0 ){
                    System.err.println("No se puede dividir entre cero (0)");
                }
                resultado = a.doubleValue() / b.doubleValue();
                break;
            default:
                resultado = a + b;
                break;
        }


        System.out.println("El resultado de la seleccionada es: " + resultado);
    }
}
