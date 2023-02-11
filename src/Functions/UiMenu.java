package Functions;

import java.util.Scanner;

public class UiMenu {
    public static void showMenu(){
        System.out.println("CALCULATOR");
        int request, num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Select a option");
        System.out.println("1: Adiciòn");
        System.out.println("2: Sustracciòn");
        System.out.println("3: Multiplicaciòn");
        System.out.println("4: Divisiòn");
        System.out.println("5: Residuo o Resto");
        System.out.println("0: Return");
        request = input.nextInt();
        switch (request) {
            case 1:
                num1 = OperationsBasics.leerDatos();
                num2 = OperationsBasics.leerDatos();
                OperationsBasics.sumar(num1, num2);
                showMenu();
                break;
            case 2:
                num1 = OperationsBasics.leerDatos();
                num2 = OperationsBasics.leerDatos();
                OperationsBasics.restar(num1, num2);
                showMenu();
                break;
            case 3:
                num1 = OperationsBasics.leerDatos();
                num2 = OperationsBasics.leerDatos();
                OperationsBasics.multiplicar(num1, num2);
                showMenu();
                break;
            case 4:
                num1 = OperationsBasics.leerDatos();
                num2 = OperationsBasics.leerDatos();
                OperationsBasics.dividir(num1, num2);
                showMenu();
                break;
            case 5:
                num1 = OperationsBasics.leerDatos();
                num2 = OperationsBasics.leerDatos();
                OperationsBasics.residuo(num1, num2);
                showMenu();
                break;
            case 0:
                System.out.println("Regresando al menu anterior");
                break;
            default:
                System.out.println("Seleccione una opcion correcta por favor");
                showMenu();
                break;
        }
    }
}
