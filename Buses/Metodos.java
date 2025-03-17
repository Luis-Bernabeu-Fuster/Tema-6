import java.util.Scanner;

public class Metodos {

    public static Scanner sc = new Scanner(System.in);

    public static void inicio (String p){
        if (Mapa.A.containsKey(p)){
            System.out.println("Has elegido: " + Mapa.A.get(p) + "\n");
        } else if (Mapa.I.containsKey(p)) {
            System.out.println("Has elegido: " + Mapa.I.get(p) + "\n");
        } else if (Mapa.J.containsKey(p)) {
            System.out.println("Has elegido: " + Mapa.J.get(p) + "\n");
        } else if (Mapa.F.containsKey(p)) {
            System.out.println("Has elegido: " + Mapa.F.get(p) + "\n");
        } else {
            System.out.println("No existe esa parada" + "\n");
        }
    }

    public static void BusEnInici(String p){
        boolean fin = true;
        String bus = "";
        while (fin) {
            System.out.println("Escoja la linea del bus en la que va a iniciar (A - F - J - I): ");
            bus = sc.nextLine();
            if (bus.equalsIgnoreCase("A")) {
                if (!Mapa.A.containsKey(p)) {
                    System.out.println("Ese bus no puede iniciar en esa parada\n");
                } else {
                    fin = false;
                }
            } else if (bus.equalsIgnoreCase("I")) {
                if (!Mapa.I.containsKey(p)) {
                    System.out.println("Ese bus no puede iniciar en esa parada\n");
                }else {
                    fin = false;
                }
            } else if (bus.equalsIgnoreCase("F")) {
                if (!Mapa.F.containsKey(p)) {
                    System.out.println("Ese bus no puede iniciar en esa parada\n");
                }else {
                    fin = false;
                }
            } else if (bus.equalsIgnoreCase("J")) {
                if (!Mapa.J.containsKey(p)) {
                    System.out.println("Ese bus no puede iniciar en esa parada\n");
                }else {
                    fin = false;
                }
            }
        }
    }



}
