package Functions;

import java.util.Scanner;
import java.util.Stack;

public class Input {
    public static int leerDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();
        return num;
    }
    public static int lecturaComun(){
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        return num;
    }
    public static double readCommon(){
        Scanner leer = new Scanner(System.in);
        double num = leer.nextDouble();
        return num;
    }
}


