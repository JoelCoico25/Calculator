package Functions;

import java.util.Scanner;

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
    public static int dividir(int a, int b){
        int resultado = a / b;
        System.out.println("El cociente es: " + resultado);
        return resultado;
    }
    public static int residuo(int a, int b){
        int resultado = a % b;
        System.out.println("El residuo es : " + resultado);
        return resultado;
    }
    public static int leerDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();
        return num;
    }
}
