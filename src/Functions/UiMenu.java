package Functions;

import java.util.Scanner;

public class UiMenu {
    public static void showMenu(){
        int request;
        System.out.println("CALCULATOR");
        System.out.println("Select a option");
        System.out.println("1: Operacions Basics");
        System.out.println("2: Operacions Exponencials");
        System.out.println("3: Operacions Logaritmics");
        System.out.println("4: Operacions Trigonometrics");
        System.out.println("0: Exit");
        Scanner input = new Scanner(System.in);
        request = input.nextInt();
        switch (request){
            case 1:
                showOperationBasicsMenu();
                break;
            case 2:
                showOperationsExponencialsMenu();
                break;
            case 3:
                showOperationsLogaritmicsMenu();
                break;
            case 4:
                showOperationsTrigonometricsMenu();
                break;
            case 0:
                System.out.println("Cerrando el programa");
                break;
            default:
                System.out.println("Seleccione una opcion correcta");
                showMenu();
                break;
        }
    }
    public static void showOperationBasicsMenu(){
        int request, num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Operations Basics");
        System.out.println("Select a option");
        System.out.println("1: Adición");
        System.out.println("2: Sustracción");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        System.out.println("5: Residuo o Resto");
        System.out.println("0: Return");
        request = input.nextInt();
        switch (request) {
            case 1:
                num1 = Input.leerDatos();
                num2 = Input.leerDatos();
                OperationsBasics.sumar(num1, num2);
                showOperationBasicsMenu();
                break;
            case 2:
                num1 = Input.leerDatos();
                num2 = Input.leerDatos();
                OperationsBasics.restar(num1, num2);
                showOperationBasicsMenu();
                break;
            case 3:
                num1 = Input.leerDatos();
                num2 = Input.leerDatos();
                OperationsBasics.multiplicar(num1, num2);
                showOperationBasicsMenu();
                break;
            case 4:
                num1 = Input.leerDatos();
                num2 = Input.leerDatos();
                OperationsBasics.dividir(num1, num2);
                showOperationBasicsMenu();
                break;
            case 5:
                num1 = Input.leerDatos();
                num2 = Input.leerDatos();
                OperationsBasics.residuo(num1, num2);
                showOperationBasicsMenu();
                break;
            case 0:
                System.out.println("Regresando al menú anterior");
                showMenu();
                break;
            default:
                System.out.println("Seleccione una opcion correcta");
                showOperationBasicsMenu();
                break;
        }
    }
    public static void showOperationsExponencialsMenu(){
        int request, num1, num2;
        double numero1;
        System.out.println("Operations Exponencials");
        System.out.println("Select a option");
        System.out.println("1: Potencia");
        System.out.println("2: Raiz Cuadrada");
        System.out.println("3: Raiz Cualquiera");
        System.out.println("4: Notacion cientifica");
        System.out.println("0: Return");
        Scanner input = new Scanner(System.in);
        request = input.nextInt();
        switch (request){
            case 1:
                num1 = Input.leerDatos();
                num2 = Input.leerDatos();
                OperationsExponencials.potenciar(num1, num2);
                showOperationsExponencialsMenu();
                break;
            case 2:
                num1 = Input.leerDatos();
                OperationsExponencials.raizCuadrada(num1);
                showOperationsExponencialsMenu();
                break;
            case 3:
                System.out.println("Ingrese el numero: ");
                num1= Input.lecturaComun();
                System.out.println("Ingrese el indice: ");
                num2= Input.lecturaComun();
                OperationsExponencials.raizcualquiera(num1, num2);
                showOperationsExponencialsMenu();
                break;
            case 4:
                System.out.println("Ingrese el numero: ");
                numero1 = Input.readCommon();
                System.out.println("Ingrese el valor del exponente: ");
                num2 = Input.lecturaComun();
                OperationsExponencials.notacionCientifica(numero1, num2);
                showOperationsExponencialsMenu();
                break;
            case 0:
                System.out.println("Regresando al menú anterior");
                showMenu();
                break;
            default:
                System.out.println("Seleccione una opcion correcta");
                showOperationsExponencialsMenu();
                break;
        }
    }
    public static void showOperationsLogaritmicsMenu(){
        int request, base, numero;
        System.out.println("Operations Logaritmics");
        System.out.println("Select a option");
        System.out.println("1: Por definicion de un logaritmo");
        System.out.println("0: Return");
        Scanner input = new Scanner(System.in);
        request = input.nextInt();
        switch (request){
            case 1:
                System.out.println("Ingrese la base: ");
                base = input.nextInt();
                System.out.println("Ingrese el número: ");
                numero = input.nextInt();
                OperationsLogaritmics.definicionLogaritmo1(base, numero);
                showOperationsLogaritmicsMenu();
                break;
            case 2:
                break;
            case 0:
                System.out.println("Regresando al menú anterior");
                showMenu();
                break;
            default:
                System.out.println("Seleccione una opcion correcta");
                showOperationsLogaritmicsMenu();
                break;
        }
    }
    public static void showOperationsTrigonometricsMenu(){
        System.out.println("Operations Trigonometrics");
        int request, num1;
        System.out.println("Select a option");
        System.out.println("1: Seno");
        System.out.println("2: Coseno");
        System.out.println("3: Tangente");
        System.out.println("0: Return");
        request = Input.lecturaComun();
        switch (request){
            case 1:
                System.out.println("Ingrese el valor del angulo: ");
                num1 = Input.lecturaComun();
                OperationsTrigonometrics.sen(num1);
                showOperationsTrigonometricsMenu();
                break;
            case 2:
                System.out.println("Ingrese el valor del angulo: ");
                num1 = Input.lecturaComun();
                OperationsTrigonometrics.cosen(num1);
                showOperationsTrigonometricsMenu();
                break;
            case 3:
                System.out.println("Ingrese el valor del angulo: ");
                num1 = Input.lecturaComun();
                OperationsTrigonometrics.tang(num1);
                showOperationsTrigonometricsMenu();
                break;
            case 0:
                System.out.println("Regresando al menu anterior");
                showMenu();
                break;
            default:
                System.out.println("Seleccione una opcion correcta");
                showOperationsTrigonometricsMenu();
                break;
        }
    }
}
