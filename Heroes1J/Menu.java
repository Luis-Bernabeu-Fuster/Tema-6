import Clases.*;

public class Menu {
    public static void menu(Metodos metodos){
        metodos.iniciaArmas();
        boolean continuar = true;
        int opcion;
        while (continuar) {
            Metodos.OpcionesMenu();
            System.out.println("==================================================");
            opcion = Validar.valOpcMenu();
            System.out.println("\n================================================\n");

            switch (opcion) {
                case 1:
                    boolean t = false;
                    System.out.println("--- Añadir Heroe ---");
                    metodos.listaClases(); //Lista los tipos de clase

                    System.out.println("==========================================================\n");
                    int clase = Validar.valTipoClase(); //Elige la clase
                    String nombre = Validar.validNombre(); //El nombre del héroe
                    int nivel = Validar.validLvl(); // El nivel
                    int vida = Validar.validHp(); //La vida
                    int hab = Validar.valHab(); //Su nivel de habilidad
                    System.out.println("==========================================================\n");

                    System.out.println("Escoja alguna de las siguientes armas de su clase:");
                    metodos.imprimeArsenalConcreto(clase); //Lista las armas del arsenal dependiendo de la clase escogida
                    Arma arma = null;
                    while (!t) { //Mientras no se escoja un arma que exista no se define el arma
                        arma = metodos.armaelegida(clase, Validar.valseleccionArma()); //Metodo para escoger el arma
                        if (arma == null){
                            System.out.println(Validar.red + "Error: " + Validar.white+"Arma no registrada en el arsenal");
                        } else {
                            System.out.println("Arma seleccionada correctamente");
                            t = true;
                        }
                    }
                    System.out.println("==========================================================\n");

                    if(metodos.addHeroe(Guerrero.createGuerrero(nombre,nivel,vida,hab,arma), //Comprueba si existe un heroe con ese nombre y de no existir lo crea en su
                            Mago.createMago(nombre,nivel,vida,hab,arma),                     //clase correspondiente
                            Arquero.createHeroe(nombre,nivel,vida,hab,arma),
                            Asesino.createAsesino(nombre,nivel,vida,hab,arma),clase)){
                        System.out.println("\nHéroe agregado con exito\n" +
                                "==========================================================\n");
                    } else {
                        System.out.println("\nHéroe ya existente en el gremio\n" +
                                "==========================================================\n");
                    }
                    break;

                case 2:
                    System.out.println("--- Añadir arma ---");
                    metodos.listaClases();
                    System.out.println("==========================================================\n");
                    int ar = Validar.valTipoClaseAr();
                    int danio;
                    switch (ar){
                        case 1:
                            System.out.println("==========================================================\n");
                            System.out.println("Arsenal actual:");
                            metodos.listasArsenalG();               //Lista las armas de la clase guerrero
                            nombre = Validar.validNombreArma();     //Nombre para la nueva arma
                            danio = Validar.validDamage();          //Daño que inflinge

                            if (metodos.addArsenalG(Arma.createArma(nombre,danio))){ //Comprueba si existe mediante su nombre, si no existe se crea
                                System.out.println("El Arma se agrego al arsenal\n" +
                                        "==========================================================\n");
                            } else {
                                System.out.println("Arma ya existente en el arsenal\n"  +
                                        "==========================================================\n");
                            }
                            break;
                        case 2:
                            System.out.println("==========================================================\n");
                            System.out.println("Arsenal actual:");
                            metodos.listasArsenalM();               //Lista las armas de la clase mago
                            nombre = Validar.validNombreArma();     //Nombre para la nueva arma
                            danio = Validar.validDamage();          //Daño que inflinge

                            if (metodos.addArsenalM(Arma.createArma(nombre,danio))){ //Comprueba si existe mediante su nombre, si no existe se crea
                                System.out.println("El Arma se agrego al arsenal\n" +
                                        "==========================================================\n");
                            } else {
                                System.out.println("Arma ya existente en el arsenal\n" +
                                        "==========================================================\n");
                            }
                            break;
                        case 3:
                            System.out.println("==========================================================\n");
                            System.out.println("Arsenal actual:");
                            metodos.listasArsenalAr();             //Lista las armas de la clase arquero
                            nombre = Validar.validNombreArma();    //Nombre para la nueva arma
                            danio = Validar.validDamage();         //Daño que inflinge

                            if (metodos.addArsenalAr(Arma.createArma(nombre,danio))){ //Comprueba si existe mediante su nombre, si no existe se crea
                                System.out.println("El Arma se agrego al arsenal\n" +
                                        "==========================================================\n");
                            } else {
                                System.out.println("Arma ya existente en el arsenal\n" +
                                        "==========================================================\n");
                            }
                            break;
                        case 4:
                            System.out.println("==========================================================\n");
                            System.out.println("Arsenal actual:");
                            metodos.listasArsenalAs();             //Lista las armas de la clase asesino
                            nombre = Validar.validNombreArma();    //Nombre para la nueva arma
                            danio = Validar.validDamage();         //Daño que inflinge

                            if (metodos.addArsenalAs(Arma.createArma(nombre,danio))){ //Comprueba si existe mediante su nombre, si no existe se crea
                                System.out.println("El Arma se agrego al arsenal\n" +
                                        "==========================================================\n");
                            } else {
                                System.out.println("Arma ya existente en el arsenal\n" +
                                        "==========================================================\n");
                            }
                            break;
                    }

                    break;

                case 3:
                    System.out.println("--- Eliminar Héroe del Gremio ---");
                    nombre = Validar.validNombre();
                    Heroe borrar = metodos.queryHeroe(nombre);
                    metodos.removeHeroe(borrar);
                    System.out.println("\n==========================================================\n");
                    break;

                case 4:
                    System.out.println("--- Buscar Héroe ---");
                    nombre = Validar.validNombre();
                    if (metodos.queryHeroe(nombre) == null){
                        System.out.println("Heroe no registrado en las filas del gremio\n" +
                                            "\n==========================================================\n");
                    } else {
                        System.out.println("\n" + metodos.queryHeroe(nombre));
                        System.out.println("==========================================================\n");
                    }
                    break;

                case 5:
                    System.out.println("--- Lista de Héroes del Gremio --- \n");
                    metodos.printHeroes();
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    continuar = false;
                    break;
            }
        }
    }
}
