import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Ubicacion> ubicaciones = new HashMap<>();

    public static void main(String[] args) {
        ubicaciones.put(0, new Ubicacion(0, "Estás sentado en la clase de programación"));
        ubicaciones.put(1, new Ubicacion(1, "Estás en la cima de una montaña"));
        ubicaciones.put(2, new Ubicacion(2, "Estás bañándote en la playa"));
        ubicaciones.put(3, new Ubicacion(3, "Estás dentro de un edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4, "Estás de pie en un puente"));
        ubicaciones.put(5, new Ubicacion(5, "Estás en un bosque"));

        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("O", 2);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("S", 4);
        ubicaciones.get(1).addExit("Q", 0);

        ubicaciones.get(2).addExit("N", 5);
        ubicaciones.get(2).addExit("E", 1);
        ubicaciones.get(2).addExit("Q", 0);

        ubicaciones.get(3).addExit("N", 3);
        ubicaciones.get(3).addExit("O", 1);
        ubicaciones.get(3).addExit("Q", 0);

        ubicaciones.get(4).addExit("N", 1);
        ubicaciones.get(4).addExit("O", 2);
        ubicaciones.get(5).addExit("Q", 0);

        ubicaciones.get(5).addExit("S", 1);
        ubicaciones.get(5).addExit("O", 2);
        ubicaciones.get(5).addExit("Q", 0);

        Scanner sc = new Scanner(System.in);
        boolean fin = false;
        String resp;
        int opc = 1;
        Validar.mapa(opc);
        System.out.println(ubicaciones.get(1).desc);
        for (String k : ubicaciones.get(1).exits.keySet()){
            System.out.print(k + " ");
        }
        System.out.println("\n");
        while (!fin) {
            System.out.println("Escoja la dirección: ");
            resp = Validar.sc.nextLine();
            resp = resp.toUpperCase();

                System.out.println(ubicaciones.get(ubicaciones.get(opc).exits.get(resp)).desc);
                opc = (ubicaciones.get(ubicaciones.get(opc).exits.get(resp)).id);
                if (opc == 0){
                    Validar.mapa(opc);
                    System.out.println("Saliendoo del programa");
                    fin = true;
                }else {
                    Validar.mapa(opc);
                    System.out.print("Posibles salidas: ");
                    for (String key : ubicaciones.get(opc).exits.keySet()) {
                        System.out.print(key + " ");
                    }
                    System.out.println("\n");
                }
        }
    }
}