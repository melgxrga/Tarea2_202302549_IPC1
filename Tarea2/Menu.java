
import java.util.Scanner;
import java.io.*;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public boolean validacion(String numero) {
        int num;
        try {
            num = Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void setCalculadora() {
        String entrada;
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
            entrada = scanner.nextLine();
            if (validacion(entrada)) {
                opcion = Integer.parseInt(entrada);
                int numero1 = 0;
                int numero2 = 0;
                int resultado = 0;
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el primer número:");
                        entrada = scanner.nextLine();
                        if (validacion(entrada)) {
                            numero1 = Integer.parseInt(entrada);
                            System.out.println("Ingrese el segundo número:");
                            entrada = scanner.nextLine();
                            if (validacion(entrada)) {
                                numero2 = Integer.parseInt(entrada);
                                resultado = numero1 + numero2;
                                System.out.println("El resultado de la suma es: " + resultado);
                            } else {
                                System.out.println("Entrada inválida. Por favor ingrese un número.");
                            }
                        } else {
                            System.out.println("Entrada inválida. Por favor ingrese un número.");
                        }
                        break;
                    case 2:
                        System.out.println("----------------------------------------");
                        System.out.println("BIENVENIDO A LA RESTA");
                        System.out.println("INGRESE NUMERO 1");
                        entrada = scanner.nextLine();
                        if (validacion(entrada)) {
                            numero1 = Integer.parseInt(entrada);
                            System.out.println("INGRESE NUMERO 2");
                            entrada = scanner.nextLine();
                            if (validacion(entrada)) {
                                numero2 = Integer.parseInt(entrada);
                                resultado = numero1 - numero2;
                                System.out.println("EL RESULTADO DE LA OPERACION RESTA ES" + " " + resultado);
                            } else {
                                System.out.println("Entrada inválida. Por favor ingrese un número.");
                            }
                        } else {
                            System.out.println("Entrada inválida. Por favor ingrese un número.");
                        }
                        break;
                    case 3:
                        System.out.println("----------------------------------------");
                        System.out.println("BIENVENIDO A LA MULTIPLICACION");
                        System.out.println("INGRESE NUMERO 1");
                        entrada = scanner.nextLine();
                        if (validacion(entrada)) {
                            numero1 = Integer.parseInt(entrada);
                            System.out.println("INGRESE NUMERO 2");
                            entrada = scanner.nextLine();
                            if (validacion(entrada)) {
                                numero2 = Integer.parseInt(entrada);
                                resultado = numero1 * numero2;
                                System.out.println("EL RESULTADO DE LA OPERACION MULTIPLICACION ES" + " " + resultado);
                            } else {
                                System.out.println("Entrada inválida. Por favor ingrese un número.");
                            }
                        } else {
                            System.out.println("Entrada inválida. Por favor ingrese un número.");
                        }
                        break;
                    case 4:
                        System.out.println("----------------------------------------");
                        System.out.println("BIENVENIDO A LA DIVISION");
                        System.out.println("INGRESE NUMERO 1");
                        entrada = scanner.nextLine();
                        if (validacion(entrada)) {
                            numero1 = Integer.parseInt(entrada);
                            System.out.println("INGRESE NUMERO 2");
                            entrada = scanner.nextLine();
                            if (validacion(entrada)) {
                                numero2 = Integer.parseInt(entrada);
                                if (numero2 != 0) {
                                    resultado = numero1 / numero2;
                                    System.out.println("EL RESULTADO DE LA OPERACION DIVISION ES" + " " + resultado);
                                } else {
                                    System.out.println("No se puede dividir por cero.");
                                }
                            } else {
                                System.out.println("Entrada inválida. Por favor ingrese un número.");
                            }
                        } else {
                            System.out.println("Entrada inválida. Por favor ingrese un número.");
                        }
                        break;
                }
            } else {
                System.out.println("Entrada inválida. Por favor ingrese un número.");
            }
        } while (opcion != 5);
    }
}
