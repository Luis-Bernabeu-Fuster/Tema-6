import java.util.InputMismatchException;
import java.util.Scanner;

public class Validar {
    public static final Scanner sc = new Scanner(System.in);
    public static final String red = "\033[31m";
    public static final String white = "\033[0m";
    Metodos metodos = new Metodos();

    public static int soloNum(){
        int id = -1;
        boolean fin = false;

            while (!fin) {
                try {
                    id = sc.nextInt();
                    fin = true;
                } catch (InputMismatchException e) {
                    System.out.println(red + "Solo se permiten digitos");
                    System.out.print(white + "Introduzca un valor valido: ");
                    sc.nextLine();
                }
            }
        return id;
    }

    public static String validNombre(){
        sc.nextLine();
        boolean fin = false;
        String name = "";
        char c1;
        System.out.print("Introduzca el nombre del Héroe: ");
        while (!fin){
            name = sc.nextLine();
            c1 = name.charAt(0);

            if (Character.isDigit(c1)){
                System.out.println(( red + "Error:" )  + white + " Los nombres no puede iniciar con digitos");
                System.out.print("Introduzca el nombre de nuevo: ");


            } else if (name.length() > 32) {
                System.out.println((red + "Error:" )  + white +" Los nombres no puede contener más de 32 caracteres");
                System.out.print("Introduzca el nombre de nuevo: ");


            }else {
                fin = true;
            }
        }
        return name;
    }
    public static int validLvl(){
        System.out.print("Introduzca el nivel de su Héro: ");
        boolean fin = false;
        int lvl = 0;
        while (!fin){
            lvl = soloNum();

            if (lvl < 0){
                System.out.println((red + "Error:" ) + white +" El nivel no puede ser negativo");
                sc.nextLine();
                System.out.print("Introduzca el nivel de nuevo: ");
            } else{
                fin = true;
            }
        }
        return lvl;
    }
    public static int validHp(){
        System.out.print("Introduzca puntos de vidade su Héro: ");
        boolean fin = false;
        int hp = 0;
        while (!fin){
            hp = soloNum();


            if (hp < 0){
                System.out.println((red + "Error:" ) + white + " Los puntos de vida no puede ser negativo");
                sc.nextLine();
                System.out.print("Introduzca el nivel de nuevo: ");
            } else{
                fin = true;
            }
        }
        return hp;
    }
    public static int valHab(){
        System.out.print("Introduzca nivel de habilidad su Héroe: ");
        boolean fin = false;
        int hab = 0;
        while (!fin){
            hab = soloNum();


            if (hab < 0){
                System.out.println((red + "Error:" ) + white + " Los puntos de habilidad no pueden ser negativo");
                sc.nextLine();
                System.out.print("Introduzca los puntos de nuevo: ");
            } else{
                fin = true;
            }
        }
        return hab;
    }
    public static String validNombreArma(){
        sc.nextLine();
        boolean fin = false;
        String arma = "";
        char c1;
        System.out.print("Introduzca el nombre del Arma: ");
        while (!fin){
            arma = sc.nextLine();
            c1 = arma.charAt(0);

            if (Character.isDigit(c1)){
                System.out.println(( red + "Error:" )  + white + " Los nombres no puede iniciar con digitos");
                System.out.print("Introduzca el nombre de nuevo: ");


            } else if (arma.length() > 32) {
                System.out.println((red + "Error:" )  + white +" Los nombres no puede contener más de 32 caracteres");
                System.out.print("Introduzca el nombre de nuevo: ");


            }else {
                fin = true;
            }
        }
        return arma;
    }
    public static int validDamage(){
        System.out.print("Daño del arma: ");
        boolean fin = false;
        int dmg = 0;
        while (!fin){
            dmg = soloNum();


            if (dmg < 0){
                System.out.println((red + "Error:" ) + white + " El daño del arma no puede ser negativo");
                sc.nextLine();
                System.out.print("Introduzca el daño de nuevo: ");
            } else{
                fin = true;
            }
        }
        return dmg;
    }
    public static int valOpcMenu(){
        System.out.print("Elija una opción: ");
        boolean fin = false;
        int opc = 0;
        while (!fin){
            opc = soloNum();


            if (opc <= 0){
                System.out.println((red + "Error:" ) + white + " Opciones validas (1 - 6)");
                sc.nextLine();
                System.out.print("Introduzca la opción de nuevo: ");
            } else{
                fin = true;
            }
        }
        return opc;
    }
    public static int valTipoClase(){
        System.out.print("Seleccióne la clase de su Héroe: ");
        boolean fin = false;
        int clas = 0;
        while (!fin){
            clas = soloNum();


            if (clas <= 0 || clas > 4){
                System.out.println((red + "Error:" ) + white + " Seleccione una clase (1-4)");
                sc.nextLine();
                System.out.print("Introduzca la clase de nuevo: ");
            } else if (clas == 1) {
                System.out.println("Ha seleccionado la clase Guerrero");
                fin = true;
            } else if (clas == 2) {
                System.out.println("Ha seleccionado la clase Mago");
                fin = true;
            } else if (clas == 3) {
                System.out.println("Ha seleccionado la clase Arquero");
                fin = true;
            } else if (clas == 4) {
                System.out.println("Ha selecionado la clase Asesino");
                fin = true;
            }
        }
        return clas;
    }
    public static int valTipoClaseAr(){
        System.out.print("Seleccióne la clase de Arma: ");
        boolean fin = false;
        int clas = 0;
        while (!fin){
            clas = soloNum();


            if (clas <= 0){
                System.out.println((red + "Error:" ) + white + " Seleccione una clase (1-4)");
                sc.nextLine();
                System.out.print("Introduzca la clase de nuevo: ");

            } else if (clas == 1) {
                System.out.println("Ha seleccionado la clase Guerrero");
                fin = true;
            } else if (clas == 2) {
                System.out.println("Ha seleccionado la clase Mago");
                fin = true;
            } else if (clas == 3) {
                System.out.println("Ha seleccionado la clase Arquero");
                fin = true;
            } else if (clas == 4) {
                System.out.println("Ha seleccionado la clase Asesino");
                fin = true;
            }else {
                fin = true;
            }
        }
        return clas;
    }
    public static int valseleccionArma(){
        System.out.print("Escoja un arma: ");
        boolean fin = false;
        int ar = 0;
        while (!fin){
            ar = soloNum();


            if (ar < 0){
                System.out.println((red + "Error:" ) + white + " No puede ser negativo");
                sc.nextLine();
                System.out.print("Introduzca los puntos de nuevo: ");
            }
            else{
                fin = true;
            }
        }
        return ar;
    }
}
