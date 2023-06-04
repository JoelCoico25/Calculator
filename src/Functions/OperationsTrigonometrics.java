package Functions;

public class OperationsTrigonometrics {
    public static double sen(double a){
        a = Math.toRadians(a);
        double resultado = Math.sin(a);
        System.out.println("El seno es: " + resultado);
        return resultado;
    }
    public static double cosen(double a){
        a = Math.toRadians(a);
        double resultado = Math.cos(a);
        System.out.println("El coseno es: " + resultado);
        return resultado;
    }
    public static double tang(double a){
        a = Math.toRadians(a);
        double resultado = Math.tan(a);
        System.out.println("La tangente es: " + resultado);
        return resultado;
    }
}
