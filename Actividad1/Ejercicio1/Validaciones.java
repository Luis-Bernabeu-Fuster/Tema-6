package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validaciones {
    private static Scanner scanner = new Scanner(System.in);

    public static int opcionMenu(){
        boolean fin = false;
        int opc = 0;
        while (!fin){
            System.out.print("Elige una opción: ");
            try {
                opc = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Escoja una opcion valida (1 - 11)");
                System.out.println("=============================================\n");
                scanner.nextLine();
                break;
            }
            if (opc <= 0 || opc > 11){
                System.out.println("Opción no valida (1 - 11)");
                System.out.println("=============================================\n");
                scanner.nextLine();
            } else {
                fin = true;
            }
        }
        return opc;
    }

    public static String nombreValidado(String nombre){
        char P;
        boolean fin = false;
        while (!fin) {
            P = nombre.charAt(0);
            if (Character.isDigit(P)) {
                System.out.println("El nombre no puede empezar por un numero");
                System.out.print("Introduzca un nuevo nombre: ");
                nombre = scanner.next();

            } else {
                fin = true;
            }
        }
        return nombre;
    }

    public static String numeroValidado(String numero){
        boolean fin = false;
        char caracter;
        int lon;
        while (!fin){

             lon = numero.length();
            if (lon > 9) {
                System.out.println("El numero no puede contener más de 9 digitos");
                System.out.print("Introduzca el numero de nuevo: ");
                numero = scanner.next();
                scanner.nextLine();

            } else if (lon < 9) {
                System.out.println("El numero no puede contener menos de 9 digitos");
                System.out.print("Introduzca el numero de nuevo: ");
                numero = scanner.next();
                scanner.nextLine();

            } else {
                for (int i = 0; i < lon ; i++) {
                    caracter = numero.charAt(i);
                    if (Character.isLetter(caracter)) {
                        System.out.println("El numero no puede contener letras");
                        System.out.print("Ingrese de nuevo el numero: ");
                        numero = scanner.next();
                        break;
                    } else {
                        fin = true;

                    }
                }
            }
        }
        return numero;
    }
}
