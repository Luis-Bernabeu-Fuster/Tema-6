package Ejercicio1;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static TelefonoMovil movil = new TelefonoMovil("123456789");
    public static void imprimirMenu() {
        System.out.println("1 - Para imprimir contactos");
        System.out.println("2 - Para añadir contacto");
        System.out.println("3 - Para actualizar contacto");
        System.out.println("4 - Para eliminar contacto");
        System.out.println("5 - Para buscar contacto por nombre");
        System.out.println("6 - Ordenar contactos");
        System.out.println("7 - Para buscar contacto por telefono");
        System.out.println("8 - Eliminar todos los contactos");
        System.out.println("9 - Cantidad de contactos");
        System.out.println("10 - Buscar contactos por caracteres");
        System.out.println("11 - Para salir\n");
        System.out.println("=============================================");
    }

    public static void main(String[] args) {

        boolean continuar = true;
        int opcion;
        String nombre;
        String numero;
        imprimirMenu();

        while (continuar) {
            opcion = Validaciones.opcionMenu();

            switch (opcion) {
                case 1:
                    movil.printContacto();
                    System.out.println("=============================================\n");
                    imprimirMenu(); //Imprimir el menu despues de cada opción
                    break;

                case 2:
                    System.out.println("\n------ Introducir nuevo contacto ------");

                    System.out.print("Introduzca el nombre: ");
                    nombre = scanner.next();
                    nombre = Validaciones.nombreValidado(nombre);

                    System.out.print("Introduzca el numero: ");
                    numero = scanner.next();
                    numero = Validaciones.numeroValidado(numero);
                    System.out.println(numero);
                    movil.addNewContact(Contacto.createContact(nombre,numero));
                    System.out.println("=============================================\n");
                    imprimirMenu(); //Imprimir el menu despues de cada opción
                    break;

                case 3:

                    System.out.println("\n--- Actualizar contacto ---");

                    System.out.println("Introduzca el nombre del contacto: ");
                    nombre = scanner.next();

                    if (movil.queryContact(nombre) == null){
                        System.out.println("Contacto inexistente");
                    } else {
                        Contacto anteupdate = movil.queryContact(nombre);

                        System.out.print("Introduzca la actualización en el nombre: ");
                        nombre = scanner.next();

                        System.out.print("\nIntroduzca la actualización en el numero: ");
                        numero = scanner.next();
                        Contacto nuevocontacto = new Contacto(nombre,numero);

                        movil.updateContact(anteupdate,nuevocontacto);
                    }

                    System.out.println("=============================================\n");
                    imprimirMenu(); //Imprimir el menu despues de cada opción
                    break;

                case 4:
                    System.out.println("\n--- Eliminar contacto ---");

                    System.out.print("Introduzca el nombre del contacto que desae eliminar: ");
                    nombre = scanner.next();

                    Contacto borra = movil.queryContact(nombre);

                    if (movil.removeContact(borra)){
                        System.out.println("Se elimino el contacto");
                    } else {
                        System.out.println("Error contacto no existente");
                    }

                    System.out.println("=============================================\n");
                    imprimirMenu(); //Imprimir el menu despues de cada opción
                    break;
                case 5:
                    System.out.println( "--- Buscar contacto por nombre ---" );
                    System.out.print("Nombre del contacto: ");
                    nombre = scanner.next();

                    if (!movil.findNombre(nombre)){
                        System.out.println("Contacto no existente");
                    }

                    System.out.println("=============================================\n");
                    imprimirMenu(); //Imprimir el menu despues de cada opción
                    break;
                case 6:
                    Collections.sort(movil.myContacts);
                    movil.printContacto();

                    System.out.println("=============================================\n");
                    imprimirMenu(); //Imprimir el menu despues de cada opción
                    break;
                case 7:
                    System.out.println( "--- Buscar contacto por numero ---" );
                    System.out.print("Numero del contacto: ");
                    numero = scanner.next();

                    if (!movil.findPhone(numero)){
                        System.out.println("Contacto no existente");
                    }

                    System.out.println("=============================================\n");
                    imprimirMenu(); //Imprimir el menu despues de cada opción
                    break;
                case 8:
                    System.out.println("\n--- Eliminar todos los contactos ---");
                    movil.myContacts.clear(); //Borra todos los contactos del array

                    System.out.println("=============================================\n");
                    imprimirMenu(); //Imprimir el menu despues de cada opción
                    break;
                case 9:
                    System.out.println("--- Total de contactos ---");
                    System.out.println(movil.myContacts.size()); //devuelve la cantidad de objetos del array

                    System.out.println("=============================================\n");
                    imprimirMenu(); //Imprimir el menu despues de cada opción
                    break;
                case 10:
                    System.out.println("\n --- Busar contactos por caracteres ---");
                    System.out.print("Introduzca caracter/es de busqueda: ");
                    nombre = scanner.next();

                    if (!movil.findClave(nombre)){
                        System.out.println("Caracter/es no coincidentes");
                    }

                    System.out.println("=============================================\n");
                    imprimirMenu(); //Imprimir el menu despues de cada opción
                    break;
                case 11:
                    System.out.println("Saliendo del programa");
                    continuar = false;
                    break;
            }
        }
    }
}