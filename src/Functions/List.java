package Functions;

import java.util.Arrays;

public class List {
    public static double listaSuma(){
        double contador = 0;
        int n;
        System.out.println("Ingrese la cantidad de datos con los que quiere trabajar: ");
        n = Input.lecturaComun();
        double list[] = new double[n];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Ingrese un numero: ");
            list[i] = Input.readCommon();
            contador += list[i];
        }
        // Uso la clase Arrays que contiene el metodo toString para imprimir todos los
        // datos de un arreglo
        System.out.println(Arrays.toString(list));
        System.out.println("La suma es: " + Math.round(contador));
        return n;
    }
}
