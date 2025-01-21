import java.util.Scanner;

public class MainVehiculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String respuesta;
        int num;
        Vehiculo nuevoCoche = new Combustion("Pick Up", 120, "Ford", "Bronco", 4, 5);
        System.out.println(nuevoCoche.toString());

        System.out.println("Esta el coche en movimiento(S/N): ");
        respuesta = sc.nextLine();
        nuevoCoche.movimiento(respuesta);

        System.out.println("=============================================================================");

        Combustion nuevoCoche2 = new Combustion("Deportivo",220,"Ford","Mustang",4,5);
        System.out.println(nuevoCoche2.toString());

        System.out.println("A que marcha cambias (1-5)(6 = R): ");
        num = sc.nextInt();
        nuevoCoche2.CambioDeMarcha(num);

    }
}
