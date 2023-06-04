package Functions;

public class OperationsExponencials {
    public static int potenciar(int a, int b){
        int resultado = (int) Math.pow(a, b);
        System.out.println(a + "elevado a " + b + " es: " + resultado);
        return resultado;
    }
    public static int raizCuadrada(int a){
        int resultado = (int) Math.sqrt(a);
        System.out.println("La raiz cuadrada de " + a + " es " + resultado);
        return resultado;
    }
    public static int raizcualquiera(int a, int b){
        int resultado = (int) Math.pow(a, (1.0/b));
        System.out.println("La raiz " + b + " de " + a + " es: " + resultado);
        return resultado;
    }
    public static double notacionCientifica(double a, double b){
        double resultado = a*(Math.pow(10.0, b));
        System.out.println("La notacion cientifica es: " + resultado);
        return resultado;
    }
}
