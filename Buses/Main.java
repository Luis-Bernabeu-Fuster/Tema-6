import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Elige la parada inicial: ");
        String p = sc.nextLine();
        Mapa.lineas();

        Metodos.inicio(p);
        System.out.println();
        Metodos.BusEnInici(p);

        System.out.print("Elige la parada final: ");
        p = sc.nextLine();
        Metodos.inicio(p);

    }
}
