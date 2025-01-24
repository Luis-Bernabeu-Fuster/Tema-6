import java.util.ArrayList;

public class MainPolimorfismo {
    public static void main(String[] args) {
        ArrayList<Coche> coches=new ArrayList<>();

        coches.add(new Combustion("Ford Mustang",10));
        coches.add(new Electrico("Kia Electric",0));
        coches.add(new Hibrido("Ford Kuga",8));

        Arranque(coches);
    }

    public static void Arranque(ArrayList<Coche> coches) {
        for (Coche coche:coches) {
            coche.arrancar();
        }
    }
}

