package Functions;

public class OperationsBasics {
    public static int sumar(int a, int b){
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
        return resultado;
    }
    public static int restar(int a, int b){
        int resultado = a - b;
        System.out.println("La resta es: " + resultado);
        return resultado;
    }
    public static int multiplicar(int a, int b){
        int resultado = a * b;
        System.out.println("El producto es: " + resultado);
        return resultado;
    }
    public static int dividir(int a, int b){ //Alt + 124, para barra vertical
        int resultado = 0;
        try {
            resultado = a / b;
            System.out.println("El cociente es: " + resultado);
        }catch (Exception e){
            System.out.println("El valor es indeterminado");
        }
        return resultado;
    }
    public static int residuo(int a, int b){
        int resultado = a % b;
        System.out.println("El residuo es : " + resultado);
        return resultado;
    }
}
