package Functions;

public class OperationsLogaritmics {
    public static int definicionLogaritmo1(int b, int a){
        int resultado = (int) (Math.log10(a) / Math.log10(b));
        System.out.println("El logaritmo en base " + b + " de " + a + " es: " + resultado);
        return resultado;
    }
}
