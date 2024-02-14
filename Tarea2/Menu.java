
import java.util.Scanner;
import java.io.*;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void setCaclculadora() {

        int opcion = 0;
        do {
            System.out.println("-----BIENVENIDO AL MENU----");
            System.out.println("1.Para realizar una suma");
            System.out.println("2.Para realizar una resta");
            System.out.println("3.Para realizar una multiplicacion");
            System.out.println("4.Para realizar una division");
            System.out.println("5.Salir del programa");
            System.out.println("----------------------------------------");
            System.out.println("POR FAVOR INGRESE UNA OPCION");
            opcion = scanner.nextInt();
            int numero1 = 0;
            int numero2 = 0;
            int resultado = 0;
            switch (opcion) {
                case 1:

                    System.out.println("----------------------------------------");
                    System.out.println("BIENVENIDO A LA SUMA");
                    System.out.println("INGRESE NUMERO 1");
                    numero1 = scanner.nextInt();
                    System.out.println("INGRESE NUMERO 2");
                    numero2 = scanner.nextInt();

                    resultado = numero1 + numero2;
                    System.out.println("EL RESULTADO DE LA OPERACION SUMA ES" + " " + resultado);

                    break;
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("BIENVENIDO A LA RESTA");
                    System.out.println("INGRESE NUMERO 1");
                    numero1 = scanner.nextInt();
                    System.out.println("INGRESE NUMERO 2");
                    numero2 = scanner.nextInt();
                    resultado = numero1 - numero2;
                    System.out.println("EL RESULTADO DE LA OPERACION RESTA ES" + " " + resultado);
                    break;
                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("BIENVENIDO A LA MULTIPLICACION");
                    System.out.println("INGRESE NUMERO 1");
                    numero1 = scanner.nextInt();
                    System.out.println("INGRESE NUMERO 2");
                    numero2 = scanner.nextInt();
                    resultado = numero1 * numero2;
                    System.out.println("EL RESULTADO DE LA OPERACION MULTIPLICACION ES" + " " + resultado);
                    break;
                case 4:
                    System.out.println("----------------------------------------");
                    System.out.println("BIENVENIDO A LA DIVISION");
                    System.out.println("INGRESE NUMERO 1");
                    numero1 = scanner.nextInt();
                    System.out.println("INGRESE NUMERO 2");
                    numero2 = scanner.nextInt();
                    if (numero2 > 0) {
                        resultado = numero1 / numero2;
                        System.out.println("EL RESULTADO DE LA OPERACION DIVISION ES" + " " + resultado);
                    } else {
                        System.out.println("EL DENOMINADOR NO PUEDE SER 0");
                        break;
                    }

                case 5:
                    break;
                default:
                    System.out.println("---OPCION INCORRECTA----");
            }
        } while (opcion != 5);
    }

}
